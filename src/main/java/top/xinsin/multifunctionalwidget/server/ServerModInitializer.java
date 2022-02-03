package top.xinsin.multifunctionalwidget.server;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import top.xinsin.multifunctionalwidget.command.CalculateCommand;

/**
 * @Author wzpMC
 * @Date 2022/2/3 16:41
 * @Version 1.0
 */

@Environment(EnvType.SERVER)
public class ServerModInitializer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        //指令注册器
        CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
            CalculateCommand.register(dispatcher);
        });
    }
}
