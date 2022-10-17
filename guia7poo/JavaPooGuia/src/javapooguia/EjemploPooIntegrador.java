
package javapooguia;

import javapooguia.entities.Vendedor;
import javapooguia.services.VendedorServicio;

/**
 *
 * @author xhemanuelv
 */
public class EjemploPooIntegrador {

    public static void main(String[] args) {
        // Ejercicio integrador v
        VendedorServicio vs = new VendedorServicio();
//        Vendedor v1 = vs.altaVendedor();
        Vendedor v1=new Vendedor();
        vs.altaVendedor(v1);
        vs.SueldoMensual(v1);
        vs.Vacaciones(v1);
        System.out.println(v1);
    }

}