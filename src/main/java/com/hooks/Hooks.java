package com.hooks;

import com.driver.Driver;
import com.enums.ConfigProperties;
import com.exceptions.BrowserInvocationFailedException;
import com.utils.PropertiesUtil;
import com.utils.ScreenshotUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;


public final class Hooks {

    Logger log = Logger.getLogger(Hooks.class);

    @Before
    public void setUp(Scenario scenario) {
        try {
            Driver.init(PropertiesUtil.getValue(ConfigProperties.BROWSER));
        } catch (Exception e) {
            throw new BrowserInvocationFailedException("Exception while launching browser");
        }

        log.info("******************************BeforeTest**********************************");
        log.info("******************************" + scenario.getName() + "**********************************");
    }

    @After(order = 1)
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replace(" ", "_");
            scenario.attach(ScreenshotUtil.getBase64Image(), "image/png", screenshotName);
        }
    }

    @After(order = 0)
    public void tearDown(Scenario scenario) {
        Driver.quitDriver();
        log.info("******************************AfterTest**********************************");
        log.info("******************************" + scenario.getName() + "**********************************");
    }

}
