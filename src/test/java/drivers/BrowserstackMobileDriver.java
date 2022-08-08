package drivers;

/* Appium версия для этого кода нужна - appiumVersion = "8.1.1", */

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class BrowserstackMobileDriver implements WebDriverProvider {

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);
        // Set your access credentials
        mutableCapabilities.setCapability("browserstack.user", "elenailikaeva_2A08zc");
        mutableCapabilities.setCapability("browserstack.key", "ukqWNTigZAGsfBYTmp5q");

        // Set URL of the application under test
       mutableCapabilities.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
      //  mutableCapabilities.setCapability("app", "bs://0df192360300279371bd80e7d53ed9794aff9ae4");

        // Specify device and os_version for testing
        mutableCapabilities.setCapability("device", "Google Pixel 3");
        mutableCapabilities.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        mutableCapabilities.setCapability("project", "First Java Project");
        mutableCapabilities.setCapability("build", "browserstack-build-1");
        mutableCapabilities.setCapability("name", "first_test");

        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }

    public static URL getBrowserstackUrl() {
        try {
            return new URL("http://hub.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
