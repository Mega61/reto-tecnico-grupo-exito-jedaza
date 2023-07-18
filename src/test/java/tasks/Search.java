package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.ExitoHomePage;
import userinterface.ItemVisualization;
import userinterface.PopUpDelivery;
import userinterface.SearchedPage;

public class Search implements Task {

    public static Search the(String item) {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                waitForSeconds(8),
                Open.url("https://www.exito.com/home-mercado"),
                // Click.on(ExitoHomePage.GROCERIES_CATEGORY_BUTTON),
                Enter.theValue("Lechuga").into(ExitoHomePage.SEARCH_BAR),
                Click.on(ExitoHomePage.SEARCH_BUTTON),
                waitForSeconds(5),
                Click.on(PopUpDelivery.HOME_DELIVERY_OPT),
                waitForSeconds(5),
                Click.on(PopUpDelivery.CONFIRM_DELIVERY_BUTTON),
                Click.on(SearchedPage.FILTER_BY_BTN),
                Click.on(SearchedPage.CHEAPER_FIRST),
                waitForSeconds(5),
                Click.on(SearchedPage.ITEMS),
                waitForSeconds(5),
                Click.on(ItemVisualization.ADD_TO_CART_BTN),
                waitForSeconds(5),
                Click.on(SearchedPage.SHOPPING_CART),
                waitForSeconds(5));

    }

    private static Performable waitForSeconds(long seconds) {
        return Task.where("{0} waits for " + seconds + " seconds",
                actor -> {
                    try {
                        Thread.sleep(seconds * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
    }

}
