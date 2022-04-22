package com.planit.step_definitions;

import com.planit.pages.ContactPage;
import com.planit.utils.ConfigurationReader;
import com.planit.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactPageStepDefinitions {
    ContactPage contactPage = new ContactPage();
    String foreNameErr = "forename";
    String emailErr = "email";
    String messageErr = "message";

    @Given("User is in the home page")
    public void user_is_in_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user navigate to {string}")
    public void user_navigate_to(String string) {
        contactPage.navigateTo(string);
    }
    @When("user clicks submit")
    public void user_clicks_submit() {
        contactPage.clickOnSubmitBtn();
    }
    @Then("validate the error messages")
    public void validate_the_error_messages() throws InterruptedException {
        Assert.assertTrue(contactPage.verifyErrorMessage(foreNameErr));
        Assert.assertTrue(contactPage.verifyErrorMessage(emailErr));
        Assert.assertTrue(contactPage.verifyErrorMessage(messageErr));

        Thread.sleep(3000);
    }
    @Then("fill the mandatory fields")
    public void fill_the_mandatory_fields() {
        contactPage.enterInfo();
    }
    @Then("validate errors are gone")
    public void validate_errors_are_gone() {
        Assert.assertTrue(contactPage.validErrorMessage(foreNameErr));
        Assert.assertTrue(contactPage.validErrorMessage(emailErr));
        Assert.assertTrue(contactPage.validErrorMessage(messageErr));

    }

    @Then("user validate successful submission message")
    public void user_validate_successful_submission_message() {
        contactPage.verifySuccessMessage();
    }

    @When("Populate mandatory fields with invalid data")
    public void populate_mandatory_fields_with_invalid_data() {
        contactPage.enterInvalidInfo();
    }

    @Then("validate the displayed error messages")
    public void validate_the_displayed_error_messages() {
        Assert.assertTrue(contactPage.verifyErrorMessage(emailErr));
    }

}
