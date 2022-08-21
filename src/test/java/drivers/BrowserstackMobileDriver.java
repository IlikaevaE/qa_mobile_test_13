package drivers;


import com.codeborne.selenide.WebDriverProvider;
import config.CredentialsConfig;
import config.DeviceConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class BrowserstackMobileDriver implements WebDriverProvider {
    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class, System.getProperties());
    static  final DeviceConfig deviceConfig = ConfigFactory.create(DeviceConfig.class, System.getProperties());

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);
        mutableCapabilities.setCapability("browserstack.user", config.login());
        mutableCapabilities.setCapability("browserstack.key", config.password());
        mutableCapabilities.setCapability("app", config.app());
        mutableCapabilities.setCapability("device", deviceConfig.deviceName());
        mutableCapabilities.setCapability("os_version", deviceConfig.platformVersion());
        mutableCapabilities.setCapability("project", "Wikipedia");
        mutableCapabilities.setCapability("build", "browserstack-build-1");
        mutableCapabilities.setCapability("name", "wikipedia_test");
        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }

    public static URL getBrowserstackUrl() {
        try {
            return new URL(deviceConfig.baseURL());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
