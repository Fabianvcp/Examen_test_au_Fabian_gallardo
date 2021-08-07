package preguntas;


import iu.FormularioCarrito;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class CarritoEstadoQuestion {

    public static Question<String> MensajeAlerta(){
        return actor -> TextContent.of(FormularioCarrito.LBL_MESSAGE_ESTADO)
                .viewedBy(actor).asString();
    }
}
