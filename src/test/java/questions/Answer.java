package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.CheckoutPage;

public class Answer implements Question<Boolean>{

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean Result;
        String bagged_product = Text.of(CheckoutPage.ITEM_AMOUNT).asString().answeredBy(actor);
        
        if(question.equals(bagged_product)){
            Result = true;
        }else{
            Result = false;
        }

        return Result;
    }
}
