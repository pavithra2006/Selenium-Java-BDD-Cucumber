package com.pages;

import com.enums.WaitStrategy;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DashboardPage extends BasePage {

    private static final By linkSignIn = By.xpath("//div[@class='layoutToolbarPadding']/a[contains(@href, 'signin')]");

    private static final By inputboxSearch = By.xpath("//input[@placeholder='Search Amazon.in']");

    public static void clickSignInLink(String elmName) {
        click(linkSignIn, WaitStrategy.CLICKABLE, elmName);
    }

    public static String getTitle() {
        return getPageTitle();
    }

    public static void navigateToDashboard(String url) {
        navigateTo(url);
    }

    public static void setValueInSearchBar(String valueToBeEntered, String elmName) {
        sendKeys(inputboxSearch, WaitStrategy.VISIBLE, valueToBeEntered, elmName);
    }

    public static String getCurrentPgTitle() {
        return getPageURL();
    }
}
