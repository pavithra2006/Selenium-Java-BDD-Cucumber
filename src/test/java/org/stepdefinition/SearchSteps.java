package org.stepdefinition;

import io.cucumber.java.en.*;

public class SearchSteps {
    @Given("I have a search text box field on Amazon page")
    public void i_have_a_search_text_box_field_on_amazon_page() {
        System.out.println("Given");
    }

    @When("I search for product {string} and price {int}")
    public void i_search_for_product_and_price(String productName, Integer price) {
        System.out.println("when " + productName + price);
    }

    @Then("verify that {string} products displayed")
    public void verify_that_products_displayed(String productName) {
        System.out.println("then " + productName);
    }
}