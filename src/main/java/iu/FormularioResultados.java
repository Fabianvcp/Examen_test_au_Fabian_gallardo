package iu;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioResultados {


    public static final Target Table = Target.the("Tabla con los resultados")
            .locatedBy("//div[@id='Catalog']//table");
    public static final Target BTN_PET = Target.the("Enlace para seleccionar tipo de mascota")
            .locatedBy("//a[normalize-space()='Fresh Water fish from China']");
}
