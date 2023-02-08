package Libreria.Servicios;

import Libreria.Entidades.Autor;
import Libreria.Persistencia.PersistenceController;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Xhemanuelv
 */
public class AutorService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    PersistenceController persistenceController = new PersistenceController();

    public void crearAutor(Autor autor) {
        persistenceController.createAuthor(autor);
    }

    public Autor consultaAutor(Integer id) {
        return persistenceController.getAuthor(id);
    }

    public ArrayList<Autor> listaAutores() {
        return persistenceController.getAuthorList();
    }

    public void modificarAutor(Autor autor) {
        persistenceController.editAuthor(autor);
    }

    public void eliminarAutor(Integer id) {
        Autor bajaAutor = persistenceController.getAuthor(id);
        bajaAutor.setAlta(false);
        persistenceController.editAuthor(bajaAutor);
        //persistenceController.deleteAuthor(id);
    }
    
    public Autor buscarAutorPorNombre(String nombre){
        return persistenceController.llamarAutorNombre(nombre);
    }

    public Autor datosAutor() {
        ArrayList<Autor> aux = listaAutores();
        Set<Autor> noRepetirAutor = new HashSet(aux);
        Autor agregar = new Autor();
        agregar.setAlta(true);
        do {
            System.out.println("Ingrese el nombre del autor");
            agregar.setNombre(leer.next());
            if (noRepetirAutor.contains(agregar)) {
                System.out.println("Autor ya ingresado ingrese");
            }
        } while (noRepetirAutor.contains(agregar));

        return new Autor();
    }
}
