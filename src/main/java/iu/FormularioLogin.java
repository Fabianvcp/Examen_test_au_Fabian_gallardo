package iu;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioLogin {
    public static final Target TXT_USERNAME = Target.the("Caja de texto para ingresar el usuario")
            .locatedBy("//input[@name='username']");

    public static final Target TXT_PASSWORD = Target.the("Caja de texto para ingresar contraseña")
            .locatedBy("//input[@name='password']");

    public static final Target LBL_MESSAGE_ERROR = Target.the("Mensaje de error")
            .locatedBy("//li[contains(text(),'Invalid username or password.')]");

    public static final Target BTN_LOGIN = Target.the("Boton de iniciar sesion")
            .locatedBy("//input[@name='signon']");
}
