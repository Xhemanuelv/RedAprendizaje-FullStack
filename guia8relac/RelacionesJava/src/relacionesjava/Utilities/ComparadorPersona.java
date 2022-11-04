package relacionesjava.Utilities;

import java.util.Comparator;
import relacionesjava.Entities.Persona;

public class ComparadorPersona {

    public static Comparator<Persona> compararNombres = new Comparator<Persona>() {
        @Override
        public int compare(Persona o1, Persona o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
    
    public static Comparator<Persona> compararApellido = new Comparator<Persona>() {
        @Override
        public int compare(Persona o1, Persona o2) {
            return o1.getApellido().compareTo(o2.getApellido());
        }
    };
}
