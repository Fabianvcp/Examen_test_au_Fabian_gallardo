package preguntas;

import iu.FormularioLogin;
import iu.FormularioPaginaPrincipal;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class BienvenidoQuestion {
    public static Question<String> MensajeAlerta(){
        return actor -> TextContent.of(FormularioPaginaPrincipal.LBL_USERNAME)
                .viewedBy(actor).asString();
    }
}
