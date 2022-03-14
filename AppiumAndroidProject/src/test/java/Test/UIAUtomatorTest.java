package Test;

import TestBase.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class UIAUtomatorTest extends Base {

    public static Base base = new Base();
    public static void main(String [] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = base.capabilities();

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
    }

}
