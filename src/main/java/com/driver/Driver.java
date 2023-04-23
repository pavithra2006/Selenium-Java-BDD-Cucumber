package com.driver;

import com.constants.FrameworkConstants;
import com.enums.ConfigProperties;
import com.factories.DriverFactory;
import com.utils.PropertiesUtil;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Driver {
    public static void init(String browserName) throws InterruptedException {
        if (Objects.isNull(DriverManager.getDriver())) {

            DriverManager.setDriver(DriverFactory.getDriver(browserName));

            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(FrameworkConstants.getFrameworkwait()));
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }

}
