package com.hooks;

import com.driver.Driver;
import com.enums.ConfigProperties;
import com.utils.PropertiesUtil;
import com.utils.ScreenshotUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setUp() {
        try {
            Driver.init(PropertiesUtil.getValue(ConfigProperties.BROWSER));
        } catch (InterruptedException e) {
            throw new RuntimeException("Exception while launching browser");
        }
    }

    @After(order = 1)
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replace(" ", "_");
            scenario.attach(ScreenshotUtil.getBase64Image(), "image/png", screenshotName);
        }
    }

    @After(order = 0)
    public void tearDown() {
        Driver.quitDriver();
    }
}
