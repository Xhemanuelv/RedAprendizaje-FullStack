package colecciones.utlilities;

import entities.Producto;
import java.util.Comparator;

/**
 *
 * @author Xhemanuelv
 */
public class ComparadorProductos {

    /**
     * Ordena los productos en una lista de manera alfabetica A~Z
     */
    public static Comparator<Producto> ordenAlfabeticoProductos = new Comparator<Producto>() {
        @Override
        public int compare(Producto t, Producto t1) {
            return t.getProduct().compareToIgnoreCase(t1.getProduct());
        }
    };

}
