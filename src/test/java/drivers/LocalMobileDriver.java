package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.DeviceConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class LocalMobileDriver implements WebDriverProvider {
    static final DeviceConfig deviceConfig = ConfigFactory.create(DeviceConfig.class, System.getProperties());

    public static URL getAppiumServerUrl() {
        try {
            return new URL(deviceConfig.appiumURL());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        File app = getApp();
        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setPlatformName(deviceConfig.platformName());
        //    options.setDeviceName("RFCR90ZMNQP");
        options.setDeviceName(deviceConfig.deviceName());
        //      options.setPlatformVersion("12.0");
        options.setPlatformVersion(deviceConfig.platformVersion());
        options.setApp(app.getAbsolutePath());
        options.setAppPackage(deviceConfig.appPackageName());
        options.setAppActivity(deviceConfig.appActivity());

        return new AndroidDriver(getAppiumServerUrl(), options);
    }

    private File getApp() {

        String appUrl = deviceConfig.appURL();
        String appPath = deviceConfig.appPath();

        File app = new File(appPath);
        if (!app.exists()) {
            try (InputStream in = new URL(appUrl).openStream()) {
                copyInputStreamToFile(in, app);
            } catch (IOException e) {
                throw new AssertionError("Failed to download application", e);
            }
        }
        return app;
    }
}
