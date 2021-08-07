package tareas;

import iu.FormularioCatalago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarMascotaTask implements Task {

    public SeleccionarMascotaTask() {

    }
    public static SeleccionarMascotaTask con(){
        return instrumented(SeleccionarMascotaTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(FormularioCatalago.BTN_EST_21),
            Click.on(FormularioCatalago.ADD_CART)
        );
    }
}
