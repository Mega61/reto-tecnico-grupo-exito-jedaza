package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

public class AddItemToCartStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("That the user is able to login to its own account")
    public void thatTheUserIsAbleToLoginToItsOwnAccount() {
        OnStage.theActorCalled("Buyer").wasAbleTo(OpenUp.thePage(), (Login.onTheWebsite()));
    }

    @When("^He searches for an (.*) in the search bar$")
    public void heSearchesForAnItemInTheSearchBar(String item) {
        System.out.println(item);
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(item));
    }

    @Then("^He is able to add the item (.*) to the shopping cart$")
    public void heIsAbleToAddTheItemToTheShoppingCart(String question) {
        System.out.println(question);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
