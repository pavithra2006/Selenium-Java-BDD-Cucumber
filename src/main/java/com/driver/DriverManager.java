package com.driver;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DriverManager {
    public static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    static void setDriver(WebDriver driverReference) {
        if (Objects.nonNull(driverReference))
            driverThreadLocal.set(driverReference);
    }

    static void unload() {
        driverThreadLocal.remove();
    }
}
