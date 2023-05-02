package com.pages;

import com.driver.DriverManager;
import com.enums.WaitStrategy;
import com.factories.WaitFactory;
import com.utils.LoggerUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected static void click(By by, WaitStrategy waitStrategy, String elmName) {
        WebElement elm = WaitFactory.performExplicitWait(by, waitStrategy);
        elm.click();
        LoggerUtil.info("Clicked on button: " + elmName);
    }

    protected static String getPageTitle() {
        String getCurrentPgTitle = DriverManager.getDriver().getTitle();
        LoggerUtil.info("Page title: " + getCurrentPgTitle);
        return getCurrentPgTitle;
    }

    protected static void navigateTo(String url) {
        DriverManager.getDriver().get(url);
        LoggerUtil.info("Successfully navigated to page: " + url);
    }

    protected static boolean isDisplayed(By by, WaitStrategy waitStrategy, String elmName) {
        boolean isElmDisplayed;
        WebElement elm = WaitFactory.performExplicitWait(by, waitStrategy);
        isElmDisplayed = elm.isDisplayed();
        LoggerUtil.info(elmName + " element is displayed");
        return isElmDisplayed;
    }

    protected static void sendKeys(By by, WaitStrategy waitStrategy, String textToBeEntered, String elmName) {
        WebElement elm = WaitFactory.performExplicitWait(by, waitStrategy);
        elm.sendKeys(textToBeEntered);
        LoggerUtil.info("Value '" + textToBeEntered + "' is set on field " + elmName);
    }

    protected static String getPageURL() {
        String getCurrentPgTitle = DriverManager.getDriver().getCurrentUrl();
        LoggerUtil.info("Current page url: " + getCurrentPgTitle);
        return getCurrentPgTitle;
    }

}
