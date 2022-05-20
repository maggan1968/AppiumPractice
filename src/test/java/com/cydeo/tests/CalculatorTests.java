package com.cydeo.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTests {

    @Test
    public void calculatorAddTest() throws MalformedURLException {
        AppiumDriver driver = null;
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "Pixel_3");
                desiredCapabilities.setCapability("platform", "Android");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("app", "https://cybertek-appium.s3.amazonaws.com/calculator.apk");
        desiredCapabilities.setCapability("adbExecTimeout", "20000");
        try {
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
