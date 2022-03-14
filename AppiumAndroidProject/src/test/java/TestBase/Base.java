package TestBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    public AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Jaydeep");
        cap.setCapability(MobileCapabilityType.APP, "/Users/jhansalia/Downloads/AppiumAndroidProject/ApiDemos-debug.apk");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
    }
}
