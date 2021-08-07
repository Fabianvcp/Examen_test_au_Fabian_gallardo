package iu;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioCarrito {

    public static final Target LBL_MESSAGE_ESTADO = Target.the("Mensaje de estado del carrito")
            .locatedBy("//b[normalize-space()='Your cart is empty.']");
    public static final Target LBL_PRECIO = Target.the("Mensaje de estado del carrito")
            .locatedBy("//td[normalize-space()='Sub Total: $5.29']");

    //realizar la compra
    public static final Target BTN_COMPRAR = Target.the("Boton para ir a la vista de pago")
            .locatedBy("//a[normalize-space()='Proceed to Checkout']");


    public static final Target CARD_NAME = Target.the("Select para seleccionar tipo tarjeta de credito")
            .locatedBy("//select[@name='order.cardType']");


    public static final Target CARD_NUMBER = Target.the("Numero de tarjeta de credito")
            .locatedBy("//input[@name='order.creditCard']");


    public static final Target BTN_FINALIZAR = Target.the("Boton para abonar")
            .locatedBy("//input[@name='newOrder']");


}
