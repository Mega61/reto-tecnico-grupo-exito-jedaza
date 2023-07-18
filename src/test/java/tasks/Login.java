package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ExitoHomePage;
import userinterface.LoginSection;

public class Login implements Task {

    public static Login onTheWebsite() {
        return Tasks.instrumented(Login.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ExitoHomePage.MY_ACCOUNT_BUTTON),
                Click.on(LoginSection.LOGIN_EMAIL_PASS_OPT),
                Enter.theValue("jedazap@hotmail.com").into(LoginSection.EMAIL_INPUT),
                Enter.theValue("superMega6169").into(LoginSection.PASSWORD_INPUT),
                Click.on(LoginSection.LOGIN_BUTTON));
    }

}
