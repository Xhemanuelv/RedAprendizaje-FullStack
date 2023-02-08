package Libreria.Servicios;

import Libreria.Entidades.Editorial;
import Libreria.Persistencia.PersistenceController;
import java.util.ArrayList;

/**
 *
 * @author Xhemanuelv
 */
public class EditorialService {

    PersistenceController persistenceController = new PersistenceController();

    public void crearEditorial(Editorial editorial) {
        persistenceController.createEditorial(editorial);
    }

    public Editorial consultaEditorial(Integer id) {
        return persistenceController.findEditorial(id);
    }
    
    public ArrayList<Editorial> editoriales(){
        return persistenceController.getEditoriales();
    }

    public void modificarEditorial(Editorial editorial) {
        persistenceController.editEditorial(editorial);
    }
    
    public Editorial llamarEditorial(String nombre){
       return persistenceController.searchEditorial(nombre);
    }

    public void eliminarEditorial(Integer id) {
        
        //persistenceController.deleteEditorial(id);
    }
}

/**
 *    PersistenceController persistenceController = new PersistenceController();

    public void crearAutor(Autor autor) {
        persistenceController.createAuthor(autor);
    }

    public Autor consultaAutor(Integer id) {
       return persistenceController.getAuthor(id);
    }
    
    public ArrayList<Autor> listaAutores(){
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
 */
