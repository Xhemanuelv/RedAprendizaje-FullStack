package colecciones.utlilities;

import entities.Perros;
import java.util.Comparator;

/**
 *
 * @author Xhemanuelv
 */
public class ComparadoresPerros {

    public static Comparator<Perros> ordenarNombreDescendente = new Comparator<Perros>() {
        @Override
        public int compare(Perros t, Perros t1) {
            return t1.getRazaPerro().compareTo(t.getRazaPerro());
        }
    };

    public static Comparator<Perros> ordenarNumbreAscendente = new Comparator<Perros>() {
        @Override
        public int compare(Perros t, Perros t1) {
            return t.getRazaPerro().compareTo(t1.getRazaPerro());
        }
    };

}
