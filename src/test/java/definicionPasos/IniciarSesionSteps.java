package definicionPasos;

import io.cucumber.java.es.*;
import navegacion.NavegateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.StringContains;
import preguntas.PaginaLoginQuestion;
import tareas.IniciarSesionTask;

public class IniciarSesionSteps {

    private String nombre_actor = "Fabian";


    @Dado("en la pagina principal al ingresar")
    public void enLaPaginaPrincipalAlIngresar() {
        OnStage.setTheStage(new OnlineCast());

        OnStage.theActorCalled(this.nombre_actor).attemptsTo(
                NavegateTo.paginaPrincipal()
        );
    }

    @Cuando("inicio sesion con los valores {string} y {string}")
    public void inicio_sesion_con_los_valores_y(String usuario, String password) {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                IniciarSesionTask.con(usuario, password)

        );
    }


    @Entonces("no ingrese correctamente mi usuario {string}")
    public void noIngreseCorrectamenteMiUsuario(String message) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El mensaje informando de un error",
                        PaginaLoginQuestion.MensajeAlerta(),
                        StringContains.containsString(message)
                )
        );
    }

}
