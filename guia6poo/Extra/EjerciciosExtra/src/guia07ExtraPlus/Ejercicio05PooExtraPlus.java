package guia07ExtraPlus;

import guia07ExtraPlus.entities.Triangulos;
import guia07ExtraPlus.services.TrianguloService;

/**
 *
 * @author Xhemanuelv
 */
public class Ejercicio05PooExtraPlus {

    public static void main(String[] args) {
        // array 4 triangulos
        Triangulos isoceles[] = new Triangulos[4];
        TrianguloService triServ = new TrianguloService();
        //llenar triangulos
        for (int i = 0; i < 4; i++) {
            isoceles[i] = triServ.crearTriangulos();
        }

        //calcular altura
        for (int i = 0; i < 4; i++) {
            triServ.calculaAltTriang(isoceles[i]);
        }

        //calcular area
        for (int i = 0; i < 4; i++) {
            triServ.obtenerArea(isoceles[i]);
        }

        //calcular perimetro
        for (int i = 0; i < 4; i++) {
            triServ.obtenerPerimetro(isoceles[i]);
        }
        triServ.mostrarTrianguloMayor(isoceles);

    }

}
