package preguntas;

import iu.FormularioCarrito;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class PrecioQuestion {
    public static Question<String> PRECIO(){
        return actor -> TextContent.of(FormularioCarrito.LBL_PRECIO)
                .viewedBy(actor).asString();
    }
}
