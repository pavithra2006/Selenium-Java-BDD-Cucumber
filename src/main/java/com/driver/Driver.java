package com.driver;

import com.constants.FrameworkConstants;
import com.factories.DriverFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Driver {
    public static void init(String browserName) {
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
