package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/addItemToShoppingCart.feature",
    tags = "@stories",
    glue = "stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class RunnerTags {

}
