package definicionPasos;

import io.cucumber.java.es.*;
import navegacion.NavegateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.StringContains;
import preguntas.*;
import tareas.*;

import javax.swing.text.StringContent;

public class CompraTarjetaSteps {

    private String nombre_actor = "Fabian";


    @Dado("en el logeo")
    public void en_el_logeo() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(this.nombre_actor).attemptsTo(
                NavegateTo.SignIn()
        );

    }

    @Cuando("iniciar sesion con los datos {string} y {string}")
    public void iniciar_sesion_con_los_datos_y(String usuario, String password) {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                IniciarSesionTask.con(usuario, password)

        );
    }

    @Cuando("Entonces ingrese correctamente mi usuario {string}")
    public void entonces_ingrese_correctamente_mi_usuario(String message) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El mensaje informando de la Bienvenida",
                        BienvenidoQuestion.MensajeAlerta(),
                        StringContains.containsString(message)
                )
        );
    }

    @Cuando("Ir al carrito")
    public void ir_al_carrito() {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                VerificarCarritoTask.con()
        );
    }

    @Cuando("Verificamos si el carro esta vacio {string}")
    public void verificamos_si_el_carro_esta_vacio(String estado) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El mensaje informando de un error",
                        CarritoEstadoQuestion.MensajeAlerta(),
                        StringContains.containsString(estado)
                )
        );
    }

    @Cuando("en el buscador el valor {string}")
    public void en_el_buscador_el_valor(String tipoMascota) {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                RealizarSeleccion.con(tipoMascota)
        );
    }

    @Cuando("seleccionar mascota para la compra")
    public void seleccionar_mascota_para_la_compra(){
        OnStage.theActor(this.nombre_actor).attemptsTo(
                SeleccionarMascotaTask.con()
        );

    }

    @Cuando("Verificamos si el precio es de {string}")
    public void verificamos_si_el_precio_es_de(String precio) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El mensaje informando de un error",
                        PrecioQuestion.PRECIO(),
                        StringContains.containsString(precio)
                )
        );
    }

    @Cuando("llenamos el formulario de compra {string}, {string}")
    public void llenamos_el_formulario_de_compra(String card, String number) {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                RealizarCompraTask.con(card,number)
        );
    }


    @Cuando("Se visualiza el mensaje {string}.")
    public void se_visualiza_el_mensaje(String confirmacion) {
        OnStage.theActorInTheSpotlight().should(
//                GivenWhenThen.seeThat("El mensaje informando de un error",
//                        ConfirmacionCompraQuestion.Compra(),
//                        StringContains.containsString(confirmacion)
//                )
                GivenWhenThen.seeThat("El mensaje de error es visible",
                        new ConfirmacionCompraQuestion(),
                        IsEqual.equalTo(Boolean.TRUE)
                )
        );

    }

    @Entonces("hacemos click en continue")
    public void hacemos_click_en_continue() {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                CompraConfirmacionTask.con()
        );
    }
}
