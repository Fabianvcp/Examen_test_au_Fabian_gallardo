package preguntas;

import iu.FormularioResultados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;


public class EsVisibleLaTabla implements Question<Boolean>{

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(FormularioResultados.Table)
                .viewedBy(actor)
                .resolve();
    }
}
