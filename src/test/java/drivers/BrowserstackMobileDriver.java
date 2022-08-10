package drivers;

/* Appium версия для этого кода нужна - appiumVersion = "8.1.1", */

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
        mutableCapabilities.setCapability("device", deviceConfig.deviceValue());
        mutableCapabilities.setCapability("os_version", deviceConfig.osVersion());
        mutableCapabilities.setCapability("project", deviceConfig.projectName());
        mutableCapabilities.setCapability("build", deviceConfig.buildValue());
        mutableCapabilities.setCapability("name", deviceConfig.nameValue());

        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }

    public static URL getBrowserstackUrl() {
        try {
            return new URL(deviceConfig.bs_URL());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
