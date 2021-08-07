package tareas;

import acciones.SelectDrownDropListValue;
import iu.FormularioCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class RealizarCompraTask implements Task {
    private String card;
    private String number;

    public RealizarCompraTask(String card, String number) {
        this.card = card;
        this.number = number;
    }

    public static RealizarCompraTask con(String card, String number){
        return instrumented(RealizarCompraTask.class, card, number);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormularioCarrito.BTN_COMPRAR),
                SelectDrownDropListValue.valueTarget(FormularioCarrito.CARD_NAME, this.card ),
                Enter.theValue(this.number).into(FormularioCarrito.CARD_NUMBER),
                Click.on(FormularioCarrito.BTN_FINALIZAR)
        );
    }
}
