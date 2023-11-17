package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

    private BaseUtils baseUtils;

    public LoginTest(BaseUtils baseUtils) {
        this.baseUtils = baseUtils;
    }

    @Given("Constructing the login api with user's {string} and {string}.")
    public void constructing_the_login_api_with_user_s_and(String strArg1, String strArg2) throws Throwable {
        System.out.println("given statement has parameters : " + strArg1 + " and " + strArg2);
    }

    @When("firing the login api.")
    public void firing_the_login_api() {
        System.out.println(baseUtils.stepInfo);
        System.out.println("when statement");
    }



    @And("we have the header also.")
    public void we_have_the_header_also() {
        System.out.println(" And under Given");
    }

    @And("Validate that response has an api_key.")
    public void validate_that_response_has_an_api_key() {
        System.out.println(" And under When");
    }

}
