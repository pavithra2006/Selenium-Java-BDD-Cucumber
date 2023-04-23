package com.stepdefinitions;

import com.google.common.util.concurrent.Uninterruptibles;
import com.pages.DashboardPage;
import com.pages.SignInPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class SignInSteps {
    String pageTitle;

    @When("User redirects to Sign in page")
    public void user_redirects_to_sign_in_page() {
        pageTitle = DashboardPage.getTitle();
    }

    @Then("Verify following fields present")
    public void verify_following_fields_present(DataTable dataTable) throws InterruptedException {
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));

        List<Map<String, String>> map = dataTable.asMaps();

        Assertions.assertThat(SignInPage.isHelpTextPresent(map.get(0).get("Help text") + " " + "Help text"))
                .isTrue();
        Assertions.assertThat(SignInPage.isInputBoxPresent(map.get(0).get("Input box") + " " + "Input box"))
                .isTrue();
        Assertions.assertThat(SignInPage.isButtonPresent(map.get(0).get("Button") + " " + "Button"))
                .isTrue();

    }
}
