package acciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDrownDropListValue implements Interaction {
    private final Target target;
    private final String value;

    public SelectDrownDropListValue(Target target, String value) {
        this.target = target;
        this.value = value;
    }

    public static Performable valueTarget(Target target, String value) {
        return instrumented(SelectDrownDropListValue.class, target, value);
    }

    @Step("{0} seleciona #value en #target")
    public <T extends Actor> void performAs(T theUser) {
        this.target.resolveFor(theUser).selectByValue(this.value);
    }
}
