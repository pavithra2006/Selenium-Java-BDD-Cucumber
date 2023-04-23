package com.pages;

import com.driver.DriverManager;
import com.enums.WaitStrategy;
import com.factories.WaitFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    static Logger log = Logger.getLogger(BasePage.class);

    protected static void click(By by, WaitStrategy waitStrategy, String elmName) {
        WebElement elm = WaitFactory.performExplicitWait(by, waitStrategy);
        elm.click();
        log.info("Clicked on Element " + elmName);
    }

    protected static String getPageTitle() {
        System.out.println("Page title: " + DriverManager.getDriver().getTitle());
        return DriverManager.getDriver().getTitle();
    }

    protected static void navigateTo(String url) {
        DriverManager.getDriver().get(url);
        log.info("Navigated to: " + url);
    }

    protected static boolean isDisplayed(By by, WaitStrategy waitStrategy, String elmName) {
        WebElement elm = WaitFactory.performExplicitWait(by, waitStrategy);
        log.info(elmName + "  element is displayed");
        return elm.isDisplayed();
    }

    protected static void sendKeys(By by, WaitStrategy waitStrategy, String textToBeEntered, String elmName) {
        WebElement elm = WaitFactory.performExplicitWait(by, waitStrategy);
        elm.sendKeys(textToBeEntered);
        log.info(textToBeEntered + " Value is entered in input box " + elmName);
    }

    protected static String getPageURL() {
        log.info(DriverManager.getDriver().getCurrentUrl());
        return DriverManager.getDriver().getCurrentUrl();
    }

}
