package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ItemVisualization extends PageObject{

    public static final Target ADD_TO_CART_BTN = Target.the("Button that add the item into the shopping cart")
            .located(By.xpath("//button[.//span[text()='Agregar']]"));
    
}
