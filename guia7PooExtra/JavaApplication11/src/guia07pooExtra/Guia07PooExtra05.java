package guia07pooExtra;

import guia07pooExtra.entidades.Adivinames;
import guia07pooExtra.servicios.AdivinamesServicios;

/**
 * @author xhemanuelv
 */
public class Guia07PooExtra05 {

    public static void main(String[] args) {

        Adivinames a1 = new Adivinames();
        AdivinamesServicios as = new AdivinamesServicios();
        as.adivinanza(a1);
    }

}
