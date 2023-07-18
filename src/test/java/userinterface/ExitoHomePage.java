package userinterface;

import java.time.Duration;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.exito.com")
public class ExitoHomePage extends PageObject {

    public static final Target MY_ACCOUNT_BUTTON = Target
            .the("Section that displays the login options if not logged in already")
            .located(By.xpath("//div[contains(text(), 'Mi cuenta')]"));

    public static final Target GROCERIES_CATEGORY_BUTTON = Target.the("Groceries category button")
            .located(By.xpath("//span[text()='Mercado']")).waitingForNoMoreThan(Duration.ofSeconds(10));

    public static final Target SEARCH_BAR = Target.the("General Search Bar")
            .located(By.xpath("//input[@placeholder='Buscar en exito.com']"))
            .waitingForNoMoreThan(Duration.ofSeconds(10));

    public static final Target SEARCH_BUTTON = Target.the("Search Button")
            .located(By.xpath(
                    "/html/body/div[2]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div/div/div/div[4]/div/div/div/div/div[1]/div/div/div/div/div[1]/div/label/div/span/div/button"));
}
