package Libreria.Servicios;

import Libreria.Entidades.Libro;
import Libreria.Persistencia.PersistenceController;

/**
 *
 * @author Xhemanuelv
 */
public class LibroService {

    PersistenceController persistenceController = new PersistenceController();

    public void crearLibro(Libro libro) {
        persistenceController.createBook(libro);
    }

    public void consultaLibro() {

    }

    public void modificarLibro(Libro libro) {
        persistenceController.editBook(libro);
    }

    public void eliminarLibro(Long isbn) {

        persistenceController.deleteBook(isbn);
    }
}
