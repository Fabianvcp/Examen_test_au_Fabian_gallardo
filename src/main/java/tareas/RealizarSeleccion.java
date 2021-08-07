package tareas;

import iu.FormularioPaginaPrincipal;
import iu.FormularioResultados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarSeleccion implements Task {

    private String tipoMascota;

    public RealizarSeleccion(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public static RealizarSeleccion con(String tipoMascota){
        return instrumented(RealizarSeleccion.class, tipoMascota);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(this.tipoMascota).into(FormularioPaginaPrincipal.TXT_KEYWORD),
                Click.on(FormularioPaginaPrincipal.BTN_SEARCH),
                Click.on(FormularioResultados.BTN_PET)
        );

    }
}
