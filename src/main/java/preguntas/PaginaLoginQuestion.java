package preguntas;

import iu.FormularioLogin;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class PaginaLoginQuestion {

    public static Question<String> MensajeAlerta(){
        return actor -> TextContent.of(FormularioLogin.LBL_MESSAGE_ERROR)
                .viewedBy(actor).asString();
    }
}
