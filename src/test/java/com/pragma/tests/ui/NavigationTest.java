package com.pragma.tests.ui;

import com.pragma.tests.TestRunner;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class NavigationTest {
    private AppiumDriver<MobileElement> driver;

    public NavigationTest(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    @Test
    public void execute() {
        // Simulate navigation process
        MobileElement homeButton = driver.findElementById("com.example.app:id/home");
        MobileElement settingsButton = driver.findElementById("com.example.app:id/settings");

        homeButton.click();
        settingsButton.click();
    }
}