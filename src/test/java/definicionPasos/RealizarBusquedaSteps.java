package definicionPasos;

import io.cucumber.java.es.*;
import navegacion.NavegateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.IsEqual;
import preguntas.EsVisibleLaTabla;
import tareas.RealizarBusquedaTask;

public class RealizarBusquedaSteps {
    private String nombre_actor = "Fabian";


    @Dado("en la pagina principal")
    public void en_la_pagina_principal() {
       OnStage.setTheStage(new OnlineCast());

       OnStage.theActorCalled(this.nombre_actor).attemptsTo(
                NavegateTo.paginaPrincipal()
      );
    }


    @Cuando("busca el valor {string}")
    public void buscaElValorFish(String tipoMascota) {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                RealizarBusquedaTask.con(tipoMascota)
        );
    }

    @Entonces("Se visualiza una tabla con los resultados.")
    public void se_visualiza_una_tabla_con_los_resultados() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("La tabla es visible",
                        new EsVisibleLaTabla(),
                        IsEqual.equalTo(Boolean.TRUE))
        );
    }


}
