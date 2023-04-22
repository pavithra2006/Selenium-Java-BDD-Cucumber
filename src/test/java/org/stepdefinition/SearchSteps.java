package org.stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.it.Ma;

import java.util.List;
import java.util.Map;

public class SearchSteps {
    @When("I have a search text box field on Amazon page")
    public void i_have_a_search_text_box_field_on_amazon_page() {
        System.out.println("Given");
    }

    @And("^I search for product \"([^\"]*)\" and price (\\d+)$")
    public void i_search_for_product_and_price(String productName, Integer price) {
        System.out.println("when " + productName + price);
    }

    @Then("Verify that {string} products displayed")
    public void verify_that_products_displayed(String productName) {
        System.out.println("then " + productName);
    }

    @Given("Navigate to Amazon dashboard page")
    public void navigate_the_amazon_dashboard_page() {
        System.out.println("Amazon dashboard page");
    }

    @When("User enters following details")
    public void user_enters_following_details(DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> s : list)
            System.out.println(s);

        System.out.println(list.get(0).get("Name"));
    }

    @Then("Verify registration success")
    public void verify_registration_success() {
        System.out.println("Success");
    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String username, String pswd) {
        System.out.println(username + " " + pswd);
    }

    @Then("verify data entered")
    public void verify_data_entered() {
        System.out.println("Verify");
    }
}