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
    }

    protected static String getPageTitle() {
        System.out.println("Page title: " + DriverManager.getDriver().getTitle());
        return DriverManager.getDriver().getTitle();
    }

    protected static void navigateTo(String url) {
        DriverManager.getDriver().get(url);
    }

    protected static boolean isDisplayed(By by, WaitStrategy waitStrategy, String elmName) {
        WebElement elm = WaitFactory.performExplicitWait(by, waitStrategy);
        return elm.isDisplayed();
    }

    protected static void sendKeys(By by, WaitStrategy waitStrategy, String textToBeEntered, String elmName) {
        WebElement elm = WaitFactory.performExplicitWait(by, waitStrategy);
        elm.sendKeys(textToBeEntered);
    }

    protected static String getPageURL() {
        return DriverManager.getDriver().getCurrentUrl();
    }

}
