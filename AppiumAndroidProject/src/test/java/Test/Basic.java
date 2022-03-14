package Test;

import TestBase.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class Basic extends Base {
    public static Base base = new Base();

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = base.capabilities();

        driver.findElementByXPath("//android.widget.TextView[@content-desc='Preference']").click();
        driver.findElementByAccessibilityId("3. Preference dependencies").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.ListView/android.widget.LinearLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
        driver.findElementsByClassName("android.widget.Button").get(1).click();
    }
}
