package colecciones.utlilities;

import entities.Peliculas;
import java.util.Comparator;

/**
 *
 * @author Xhemanuelv
 */
public class ComparadorPeliculas {

    public static Comparator<Peliculas> ordenarDuracionDescendente = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }

    };

    public static Comparator<Peliculas> ordenarDuracionAscendente = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }

    };

    public static Comparator<Peliculas> ordenarTituloAlfabetico = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }

    };

    public static Comparator<Peliculas> ordenarDirectorAlfabetico = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }

    };
}
