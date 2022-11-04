package colecciones.utlilities;

import entities.Pais;
import java.util.Comparator;

/**
 *
 * @author Xhemanuelv
 */
public class ComparadorPais {

    public static Comparator<Pais> ordenarAlfabeticamente = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getPais().compareTo(t1.getPais());
        }
    };

}
