package iu;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioCompra {

    public static final Target LBL_MESSAGE_COMPRA= Target.the("Mensaje Confirmacion de la compra")
            .locatedBy("//div[@id='Catalog']");

    public static final Target BTN_COMPRA= Target.the("Boton continue para comprar")
            .locatedBy("//a[normalize-space()='Confirm']");
}
