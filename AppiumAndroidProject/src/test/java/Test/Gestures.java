package Test;

import TestBase.Base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;

public class Gestures extends Base {
    public static Base base = new Base();
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = base.capabilities();
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        WebElement element = driver.findElementByAccessibilityId("Expandable Lists");

        TouchAction t = new TouchAction(driver);
        t.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
    }
}
