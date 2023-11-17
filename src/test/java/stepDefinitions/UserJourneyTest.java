package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserJourneyTest {

    private BaseUtils baseUtils;

    public UserJourneyTest(BaseUtils baseUtils) { this.baseUtils = baseUtils; }

    @Given("User has logged in.")
    public void user_has_logged_in() throws Throwable {
    }

    @Given("User has been authenticated")
    public void user_has_been_authenticated() throws Throwable {
        System.out.println("User has been authenticated");
    }

    @When("User clicks on Sunglasses tab")
    public void user_clicks_on_sunglasses_tab() throws Throwable {
        baseUtils.stepInfo = "This is a test statement.";
        System.out.println("User clicks on Sunglasses tab");
    }

    @Then("Validate that sunglasses list shows up")
    public void validate_that_sunglasses_list_shows_up() throws Throwable {
        System.out.println("Validate that sunglasses list shows up");
    }

    @Then("Validate that Books list shows up")
    public void validate_that_books_list_shows_up() throws Throwable {
        System.out.println("Validate that Books list shows up");
    }

    @When("user clicks on a specific one.")
    public void user_clicks_on_a_specific_one() throws Throwable {
        System.out.println("user clicks on a specific one.");
    }

    @Then("make sure api response is {int} OK.")
    public void make_sure_api_response_is_ok(Integer int1) throws Throwable {
        System.out.println("make sure api response is 200 OK.");
    }

    @Then("Make sure user is routed to details page.")
    public void make_sure_user_is_routed_to_details_page() throws Throwable {
        System.out.println("Make sure user is routed to details page.");
    }

}
