
package guia07ExtraPlus;

import guia07ExtraPlus.entities.Auto;
import guia07ExtraPlus.services.AutoService;

/**
 *
 * @author Xhemanuelv
 */
public class Ejercicio07PooExtraPlus {

    
    public static void main(String[] args) {
        // Auto
        AutoService AutServ=new AutoService();
        Auto feo=AutServ.cargarAuto();
        AutServ.titularidad(feo);
        AutServ.vamosDePaseo(feo);
        AutServ.autoReqService(feo);
        if (AutServ.autoReqService(feo)) {
            System.out.println("El auto feo de papa necesita un service");
            System.out.println("El motor tiene :"+feo.getKmMotor());
        }else   {
            System.out.println("El auto feo de papa no necesita un service");
            System.out.println("Podemos salir de paseo de nuevo");
        }
        
    }

}
