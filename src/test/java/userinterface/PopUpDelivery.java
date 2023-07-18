package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PopUpDelivery extends PageObject {

    public static final Target HOME_DELIVERY_OPT = Target.the("Button that allows the user to select home delivery")
            .located(By.xpath("//button[.//div[text()='Envío a Domicilio']]"));

    public static final Target CONFIRM_DELIVERY_BUTTON = Target.the("Button that allows the user to confirm the delivery type")
            .located(By.xpath("//button[text()='Confirmar']"));

}
