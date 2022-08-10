package config;

import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
        "classpath:config/${deviceHost}.properties"
})
public interface DeviceConfig extends Config {

    @Key("platform_name")
    String platformName();

    @Key("device_name")
    String deviceName();

    @Key("platform_version")
    String platformVersion();

    @Key("appPackageName")
    String appPackageName();

    @Key("app_Activity")
    String appActivity();

    @Key("app_URL")
    String appURL();

    @Key("app_path")
    String appPath();

    @Key("appium_URL")
    String appiumURL();

    @Key("device_value")
    String deviceValue();

    @Key("os_version")
    String osVersion();

    @Key("project_name")
    String projectName();

    @Key("build_value")
    String buildValue();

    @Key("name_value")
    String nameValue();

    @Key("bs_URL")
    String bs_URL();

}
