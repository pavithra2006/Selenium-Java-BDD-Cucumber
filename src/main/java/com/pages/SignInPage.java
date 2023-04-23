package com.pages;

import com.enums.WaitStrategy;
import org.openqa.selenium.By;

public class SignInPage extends BasePage {

    private final static By textSignIn = By.xpath("//h1[contains(text(),'Sign in')]");
    private final static By inputboxEmail = By.xpath("//input[@name='email']");

    private final static By btnContinue = By.xpath("//input[@id='continue']");

    public static boolean isHelpTextPresent(String elmName) {
        return isDisplayed(textSignIn, WaitStrategy.VISIBLE, elmName);
    }

    public static boolean isInputBoxPresent(String elmName) {
        return isDisplayed(inputboxEmail, WaitStrategy.VISIBLE, elmName);
    }

    public static boolean isButtonPresent(String elmName) {
        return isDisplayed(btnContinue, WaitStrategy.VISIBLE, elmName);
    }
}
