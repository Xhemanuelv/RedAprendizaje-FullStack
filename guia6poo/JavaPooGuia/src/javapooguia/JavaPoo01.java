package javapooguia;

import javapooguia.entities.Libro;
import javapooguia.services.LibroServices;

/**
 *
 * @author xhemanuelv
 */
public class JavaPoo01 {

    public static void main(String[] args) {
        //Libro
        LibroServices ls = new LibroServices();
        Libro book1 = ls.ingresoLibro();
        System.out.println(book1);
    }

}
