package config;

import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
        "classpath:config/${deviceHost}.properties"
})
public interface DeviceConfig extends Config {

    @Key("device_name")
    String deviceName();

    @Key("platform_version")
    String platformVersion();

    @Key("appium_URL")
    String appiumURL();

    @Key("device_value")
    String deviceValue();

    @Key("os_version")
    String osVersion();

    @Key("bs_URL")
    String bs_URL();

}
