package top.xinsin.multifunctionalwidget.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;

import static net.fabricmc.api.EnvType.CLIENT;

/**
 * @Author xinxin
 * @Date 2022/2/2 16:52
 * @Version 1.0
 */
@Environment(CLIENT)
public class MultifunctionalWidgetClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Server mod don't loaded!");
    }
}
