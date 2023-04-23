package com.factories;

import com.constants.FrameworkConstants;
import com.driver.DriverManager;
import com.enums.WaitStrategy;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class WaitFactory {

    public static WebElement performExplicitWait(By by, WaitStrategy waitStrategy) {
        WebElement elm = null;
        switch (waitStrategy) {
            case VISIBLE:
                elm = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getFrameworkwait())).until(ExpectedConditions.visibilityOfElementLocated(by));
                break;
            case PRESCENCE:
                elm = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getFrameworkwait())).until(ExpectedConditions.presenceOfElementLocated(by));
                break;
            case CLICKABLE:
                elm = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getFrameworkwait())).until(ExpectedConditions.elementToBeClickable(by));
                break;
            case NONE:
                elm = DriverManager.getDriver().findElement(by);
                break;
        }
        return elm;
    }
}
