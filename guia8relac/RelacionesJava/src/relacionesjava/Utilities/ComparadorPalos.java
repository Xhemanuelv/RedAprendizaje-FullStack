package relacionesjava.Utilities;

import java.util.Comparator;
import relacionesjava.Entities.Naipe;

/**
 *
 * @author Xhemanuelv
 *
 */
public class ComparadorPalos {

    public static Comparator<Naipe> separarPalos=new Comparator<Naipe>() {
        @Override
        public int compare(Naipe o1, Naipe o2) {
            return o1.getPalo().compareTo(o2.getPalo());
        }
    };
}
