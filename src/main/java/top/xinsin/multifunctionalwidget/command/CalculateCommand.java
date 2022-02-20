package top.xinsin.multifunctionalwidget.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.argument.MessageArgumentType;
import net.minecraft.entity.Entity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import parsii.tokenizer.ParseException;
import top.xinsin.multifunctionalwidget.util.calculate;

import static net.minecraft.server.command.CommandManager.literal;


/**
 * @Author xinxin
 * @Date 2022/2/2 19:04
 * @Version 1.0
 */
public class CalculateCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher){
        //注册计算命令
        LiteralArgumentBuilder<ServerCommandSource> calculate = literal("calc")
                .then(CommandManager.argument("msg", MessageArgumentType.message())
                .executes(context -> { return calculate_(context.getSource(),MessageArgumentType.getMessage(context,
                        "msg"));
                }));
        dispatcher.register(calculate);
    }
    private static int calculate_(ServerCommandSource serverCommandSource, Text msg){
        Entity entity = serverCommandSource.getEntity();
        if (entity instanceof ServerPlayerEntity){
            ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)entity;
            try {
                serverPlayerEntity.sendSystemMessage(new LiteralText(String.valueOf(calculate.calc(msg.asString()))),serverCommandSource.getEntity().getUuid());
            } catch (ParseException e) {
                serverPlayerEntity.sendSystemMessage(new LiteralText("出现错误,请节哀!"),serverCommandSource.getEntity().getUuid());
            }
        }
        return 1;
    }
}
