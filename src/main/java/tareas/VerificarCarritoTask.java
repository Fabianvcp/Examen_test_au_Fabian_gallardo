package tareas;

import iu.FormularioPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerificarCarritoTask implements Task {

    public VerificarCarritoTask() {
    }

    public static VerificarCarritoTask con(){
        return instrumented(VerificarCarritoTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(FormularioPaginaPrincipal.LBL_CART)
        );

    }
}
