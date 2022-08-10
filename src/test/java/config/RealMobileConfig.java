package config;

import org.aeonbits.owner.Config;

public interface RealMobileConfig extends Config {
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
}
