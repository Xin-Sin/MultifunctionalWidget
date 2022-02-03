package top.xinsin.multifunctionalwidget;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import top.xinsin.multifunctionalwidget.command.CalculateCommand;

import static net.minecraft.server.command.CommandManager.literal;

/**
 * @Author xinxin
 * @Date 2022/2/2 16:52
 * @Version 1.0
 */
public class MultifunctionalWidget implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("ModInitializer!");
    }
}
