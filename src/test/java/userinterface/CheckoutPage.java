package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage extends PageObject {
    public static final Target ITEM_AMOUNT = Target
            .the("Text that displays the amount of products in the shopping cart")
            .located(By.xpath("//div[text()='Producto']"));

}
