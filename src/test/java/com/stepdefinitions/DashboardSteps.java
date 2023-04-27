package com.stepdefinitions;

import com.pages.DashboardPage;
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
        Assertions.assertThat(DashboardPage.getCurrentPgTitle())
                .contains(searchProduct);
    }

    @Then("Verify {word}")
    public void verify(String string) {
        System.out.println(string);
    }


    @Then("Alternative text abc/cde")
    public void alternative_text_abc_cde() {
        System.out.println("alternative");
    }

    @Then("optional test example(s)")
    public void optional_test_example_s() {
        System.out.println("optional");
    }


}
