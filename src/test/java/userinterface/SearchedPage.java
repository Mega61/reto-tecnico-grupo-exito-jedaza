package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchedPage extends PageObject {

    public static final Target FILTER_BY_BTN = Target.the("Filter By button")
            .located(By.xpath("//button[.//span[text()='Ordenar por:']]"));

    public static final Target CHEAPER_FIRST = Target.the("Cheaper option first")
            .located(By.xpath("//button[text()='Menor precio primero']"));

    public static final Target ITEMS = Target.the("Actual cheaper option")
            .located(By.xpath("//div[@id='gallery-layout-container']//div[contains(@style, 'flex-basis: 25%; max-width: 25%;')]"));

    public static final Target SHOPPING_CART = Target.the("Shopping cart button")
            .located(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[4]/div"));
}
