package com.stepdefinitions;

import com.enums.ConfigProperties;
import com.pages.DashboardPage;
import com.utils.PropertiesUtil;
import io.cucumber.java.en.Given;

public class BackgroundSteps {
    @Given("Navigate to Amazon home page")
    public void navigate_to_amazon_home_page() {
        DashboardPage.navigateToDashboard(PropertiesUtil.getValue(ConfigProperties.URL));
    }

}
