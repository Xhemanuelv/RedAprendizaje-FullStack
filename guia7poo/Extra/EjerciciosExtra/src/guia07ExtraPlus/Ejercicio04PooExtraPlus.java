
package guia07ExtraPlus;

import guia07ExtraPlus.entities.Fecha;
import guia07ExtraPlus.services.FechaService;

/**
 *
 * @author Xhemanuelv
 */
public class Ejercicio04PooExtraPlus {

    
    public static void main(String[] args) {
        // Clase fecha sin usar date
        
        Fecha diaActual=new Fecha();
        FechaService fs=new FechaService();
        fs.ingresarFecha(diaActual);
        fs.mostrarDiaAnterior(diaActual);
        fs.mostrarDiaPosterior(diaActual);
    }

}
