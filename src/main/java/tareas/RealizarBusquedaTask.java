package tareas;

import iu.FormularioPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarBusquedaTask implements Task {

    private String tipoMascota;

    public RealizarBusquedaTask(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public static RealizarBusquedaTask con(String tipoMascota){
        return instrumented(RealizarBusquedaTask.class, tipoMascota);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(this.tipoMascota).into(FormularioPaginaPrincipal.TXT_KEYWORD),
                Click.on(FormularioPaginaPrincipal.BTN_SEARCH)
        );

    }
}
