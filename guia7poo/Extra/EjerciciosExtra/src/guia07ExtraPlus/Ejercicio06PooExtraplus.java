package guia07ExtraPlus;

import guia07ExtraPlus.entities.SopaDeLetras;
import guia07ExtraPlus.services.SopaDeLetraServices;

/**
 *
 * @author Xhemanuelv
 */
public class Ejercicio06PooExtraplus {

    public static void main(String[] args) {
        // TODO code application logic here
        SopaDeLetraServices sDLServ = new SopaDeLetraServices();
        SopaDeLetras juego;
        juego = sDLServ.cargarPalabras();
        sDLServ.buscarPalabras(juego);
        
    }

}
