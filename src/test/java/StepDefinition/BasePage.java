package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.HomePage.*;

public class BasePage {
    @Given("^User navigates to the Login page$")
    public void user_navigates_to_the_login_page() throws Throwable{
        click_hamburger_menu();
        click_signIn_link();
    }
    @When("User succesfully enters the log in details")
    public void user_succesfully_enters_the_log_in_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
