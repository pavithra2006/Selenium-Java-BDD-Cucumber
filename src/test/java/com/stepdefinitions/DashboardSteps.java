package com.stepdefinitions;

import com.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class DashboardSteps {
    @When("I click on {string}")
    public void i_click_on(String elmName) {
        DashboardPage.clickSignInLink(elmName);
    }

    @When("I enter {string}")
    public void i_enter(String searchProduct) {
        DashboardPage.setValueInSearchBar(searchProduct, "Search bar");

    }

    @Then("Verify user redirected to {string} page")
    public void verify_user_redirected_to_page(String searchProduct) throws InterruptedException {
        Thread.sleep(10000);
        Assertions.assertThat(DashboardPage.getCurrentPgTitle())
                .contains(searchProduct);
    }
}
