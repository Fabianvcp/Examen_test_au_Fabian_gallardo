package preguntas;

import iu.FormularioCarrito;
import iu.FormularioCompra;
import iu.FormularioLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.Visibility;

public class ConfirmacionCompraQuestion implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(FormularioCompra.LBL_MESSAGE_COMPRA)
                //visto por el actor
                .viewedBy(actor)
                //resultado
                .resolve();
    }
}
