package iu;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioCatalago {

    public static final Target BTN_EST_21 = Target.the("Enlace para agregar un pez")
            .locatedBy("//a[normalize-space()='EST-21']");

    public static final Target ADD_CART = Target.the("Enlace para agregar al carrito")
            .locatedBy("//a[normalize-space()='Add to Cart']");


}
