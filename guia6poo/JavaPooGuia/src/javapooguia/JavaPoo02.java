package javapooguia;

import javapooguia.entities.Circunferencia;
import javapooguia.services.CircunferenciaServices;

/**
 *
 * @author xhemanuelv
 */
public class JavaPoo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Circunferencia
        CircunferenciaServices cs = new CircunferenciaServices();
        Circunferencia redondo = cs.crearCircunferencia();
        System.out.println(redondo);
        cs.area(redondo);
        cs.perimetro(redondo);
        System.out.println(redondo);
    }

}
