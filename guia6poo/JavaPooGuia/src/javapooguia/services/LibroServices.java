package javapooguia.services;

import java.util.Scanner;
import javapooguia.entities.Libro;

/**
 *
 * @author xhemanuelv
 */
public class LibroServices {

    public Libro ingresoLibro() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Registro de nuevo libro");
        System.out.println("Introducir ISBN");
        String isbn = leer.nextLine();
        System.out.println("Ingrese el titulo del libro");
        String title = leer.nextLine();
        System.out.println("Ingrese autor del libro");
        String author = leer.nextLine();
        System.out.println("Ingrese numero de paginas");
        int pages = leer.nextInt();
        return new Libro(isbn, title, author, pages);
    }

    public void cargarLibro(Libro book) {
        book.getIsbn();
        book.getTitulo();
        book.getAutor();
        book.getNumeroPaginas();
    }

}
