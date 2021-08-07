package iu;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioPaginaPrincipal {

    public static final Target TXT_KEYWORD = Target.the("Cuadra de texto para ingresar que buscamos")
            .locatedBy("//input[@name='keyword']");

    public static final Target BTN_SIGN_IN = Target.the("Boton para ir al Formulario inicar sesion")
            .locatedBy("//a[normalize-space()='Sign In']");

    public static final Target BTN_SEARCH = Target.the("Boton para ir a la tabla con los resultado")
            .locatedBy("//input[@name='searchProducts']");

    public static final Target LBL_USERNAME = Target.the("Label de bienvenida")
            .locatedBy("#WelcomeContent");

    public static final Target LBL_CART =Target.the("Carrito")
            .locatedBy("//img[@name='img_cart']");
}
