
package guia07pooExtra.servicios;

import guia07pooExtra.entidades.Adivinames;
import java.util.Scanner;

/**
 *
 * @author xhemanuelv
 */
public class AdivinamesServicios {

    public void adivinanza(Adivinames enigma) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Intente adivinar el mes secreto del año");
        String ingreso;
        boolean adivino;
        do {
            ingreso = leer.nextLine();
            adivino = ingreso.equalsIgnoreCase(enigma.getMesSecreto());
            if (!adivino) {
                System.out.println("Mes incorrecto, intente nuevamente");
            } else {
                System.out.println("CORRECTO!!!");
            }
        } while (!adivino);

    }

}
