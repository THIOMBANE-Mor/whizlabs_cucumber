package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditingTest {

    @When("Fire the passwordUpdate Api")
    public void fire_the_password_update_api() throws Throwable {
        System.out.println("Fire the passwordUpdate Api");
    }

    @Then("Validate that response has a response code as {int}.")
    public void validate_that_response_has_a_response_code_as(Integer int1) throws Throwable {
        System.out.println("Validate that response has a response code as 200.");
    }

    @Then("Validate that new password is updated.")
    public void validate_that_new_password_is_updated() throws Throwable {
        System.out.println("Validate that new password is updated.");
    }

    @When("Fire the profileUpdate api with {string}")
    public void fire_the_profile_update_api_with(String profileOptions) throws Throwable {
        System.out.println("parameterized method with data: " + profileOptions);
    }

    @Then("Validate that new information is reflecting in the profile.")
    public void validate_that_new_information_is_reflecting_in_the_profile() throws Throwable {
        System.out.println("Validate that new information is reflecting in the profile.");
    }
}
