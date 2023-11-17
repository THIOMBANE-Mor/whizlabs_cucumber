package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class SignUpTest {

    @Given("User is able to fill the form with following details")
    public void user_is_able_to_fill_the_form_with_following_details(DataTable dataTable) {
        List<List<String>> formdataList = dataTable.asLists(String.class);
        for (List<String> e:formdataList) {
            System.out.println(e.get(0));
            System.out.println(e.get(1));
            System.out.println(e.get(2));
            System.out.println(e.get(3));
        }
    }

    @When("User is able to fire SignUp api")
    public void user_is_able_to_fire_sign_up_api() throws Throwable {
        System.out.println("User is able to fire SignUp api");
    }

    @Then("User's data is created in database.")
    public void user_s_data_is_created_in_database() throws Throwable {
        System.out.println("User's data is created in database.");
    }

}
