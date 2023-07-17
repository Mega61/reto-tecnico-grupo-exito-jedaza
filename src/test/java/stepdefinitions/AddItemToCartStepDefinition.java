package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddItemToCartStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("That the user is able to login to its own account")
    public void thatTheUserIsAbleToLoginToItsOwnAccount() {
    }

    @When("He searches for an item in the search bar")
    public void heSearchesForAnItemInTheSearchBar() {
    }

    @Then("He is able to add the item to the shopping cart")
    public void heIsAbleToAddTheItemToTheShoppingCart() {
    }
}
