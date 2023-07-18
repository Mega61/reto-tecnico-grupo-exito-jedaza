package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginSection extends PageObject {

    public static final Target LOGIN_EMAIL_PASS_OPT = Target.the("Button that allows the login with email and password")
            .located(By.xpath("//span[contains(string(), 'Ingresa con email y contraseña')]"));
    public static final Target EMAIL_INPUT = Target.the("Email input field")
            .located(By.xpath("//input[@placeholder='Ingresa tu email']"));
    public static final Target PASSWORD_INPUT = Target.the("Password input field")
            .located(By.xpath("//input[@placeholder='Ingresa tu contraseña']"));
    public static final Target LOGIN_BUTTON = Target.the("Login Button")
            .located(By.xpath("//button[.//span[text()='Entrar']]"));

}
