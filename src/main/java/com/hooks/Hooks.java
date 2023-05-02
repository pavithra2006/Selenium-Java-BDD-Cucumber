package com.hooks;

import com.driver.Driver;
import com.enums.ConfigProperties;
import com.exceptions.BrowserInvocationFailedException;
import com.utils.LoggerUtil;
import com.utils.PropertiesUtil;
import com.utils.ScreenshotUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public final class Hooks {

    @Before(order = 0)
    public void setUpLogs(Scenario scenario) {
        LoggerUtil.info("<------------------------------------------------------------------------------------------------->");
        LoggerUtil.info("<---------------------------TESTCASE START : " + scenario.getName() + "--------------------------->");
        LoggerUtil.info("<------------------------------------------------------------------------------------------------->");
    }

    @Before(order = 1)
    public void setUp(Scenario scenario) {
        try {
            Driver.init(PropertiesUtil.getValue(ConfigProperties.BROWSER));
        } catch (Exception e) {
            throw new BrowserInvocationFailedException("Exception while launching browser");
        }
    }

    @After(order = 2)
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replace(" ", "_");
            scenario.attach(ScreenshotUtil.getBase64Image(), "image/png", screenshotName);
        }
    }

    @After(order = 1)
    public void tearDown(Scenario scenario) {
        Driver.quitDriver();
    }

    @Before(order = 0)
    public void tearDownLogs(Scenario scenario) {
        LoggerUtil.info("<------------------------------------------------------------------------------------------------->");
        LoggerUtil.info("<---------------------------TESTCASE END : " + scenario.getName() + "--------------------------->");
        LoggerUtil.info("<------------------------------------------------------------------------------------------------->");
    }
}
