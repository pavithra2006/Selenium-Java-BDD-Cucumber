package com.stepdefinitions;

import com.driver.Driver;
import com.driver.DriverManager;
import com.enums.ConfigProperties;
import com.pages.Dashboard;
import com.utils.PropertiesUtil;
import io.cucumber.java.en.Given;

public class BackgroundSteps {
    @Given("Navigate to Amazon home page")
    public void navigate_to_amazon_home_page() throws InterruptedException {
        Dashboard.getTitle();
    }
}
