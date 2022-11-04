
package guia07ExtraPlus;

import guia07ExtraPlus.entities.Tiempo;
import guia07ExtraPlus.services.TiempoServices;

/**
 *
 * @author Xhemanuelv
 */
public class Ejercicio02PooExtraPlus {

    
    public static void main(String[] args) {
        // Tiempo
        TiempoServices tiempoServ=new TiempoServices();
        Tiempo horaActual=tiempoServ.ingresarHora();
        tiempoServ.imprimirHoraCompleta(horaActual);
        
    }

}
