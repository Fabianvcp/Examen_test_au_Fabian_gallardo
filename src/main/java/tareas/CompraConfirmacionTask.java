package tareas;

import iu.FormularioCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompraConfirmacionTask  implements Task {
    public CompraConfirmacionTask() {

    }
    public static CompraConfirmacionTask con(){
        return instrumented(CompraConfirmacionTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormularioCompra.BTN_COMPRA)
        );
    }
}
