
package javapooguia;

import javapooguia.entities.Vendedor;
import javapooguia.services.VendedorServicio;

/**
 *
 * @author xhemanuelv
 */
public class EjemploPooIntegrador {

    public static void main(String[] args) {
        // TODO code application logic here
        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.altaVendedor();
        vs.SueldoMensual(v1);
        vs.Vacaciones(v1);
        System.out.println(v1);
    }

}