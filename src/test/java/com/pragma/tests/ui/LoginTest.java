package com.pragma.tests.ui;

import com.pragma.tests.TestRunner;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class LoginTest {
    private AppiumDriver<MobileElement> driver;

    public LoginTest(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    @Test
    public void execute() {
        // Simulate login process
        MobileElement usernameField = driver.findElementById("com.example.app:id/username");
        MobileElement passwordField = driver.findElementById("com.example.app:id/password");
        MobileElement loginButton = driver.findElementById("com.example.app:id/login");

        usernameField.sendKeys("testuser");
        passwordField.sendKeys("testpass");
        loginButton.click();
    }
}