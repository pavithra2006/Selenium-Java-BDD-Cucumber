package com.pages;

import com.enums.WaitStrategy;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Dashboard extends BasePage {

    private static final By linkSignIn = By.xpath("//div[@class='layoutToolbarPadding']/a[contains(@href, 'signin')]");

    public static void clickSignInLink() {
        click(linkSignIn, WaitStrategy.CLICKABLE, "SignIn Link");
    }

    public static void getTitle() {
        getPageTitle();
    }
}
