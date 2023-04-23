package com.stepdefinitions;

import com.pages.DashboardPage;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;

public class CommonSteps {

    @Then("Verify page title is {string}")
    public void verify_page_title_is(String expectedPageTitle) {
        Assertions.assertThat(DashboardPage.getTitle())
                .contains(expectedPageTitle);
    }
}
