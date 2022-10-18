package guia07ExtraPlus;

import guia07ExtraPlus.entities.Fraction;
import guia07ExtraPlus.services.FractionServices;

/**
 *
 * @author Xhemanuelv
 */
public class Ejercicio01PooExtraPlus {

    public static void main(String[] args) {
        // Fracción
        FractionServices frServ=new FractionServices();
        Fraction irracionales=frServ.createFraction();
        frServ.operacionesFraccion(irracionales);
    }

}
