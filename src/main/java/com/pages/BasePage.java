package com.pages;

import com.driver.DriverManager;
import com.enums.WaitStrategy;
import com.factories.WaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected static void click(By by, WaitStrategy waitStrategy, String elmName) {
        WebElement elm = WaitFactory.performExplicitWait(by, waitStrategy);
        elm.click();
        System.out.println("Clicked on Element " + elmName);
    }

    protected static String getPageTitle() {
        System.out.println("Page title: " + DriverManager.getDriver().getTitle());
        return DriverManager.getDriver().getTitle();
    }
}
