package Libreria.Persistencia;

import Libreria.Entidades.Autor;
import Libreria.Entidades.Editorial;
import Libreria.Entidades.Libro;
import Libreria.Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {

    AutorJpaController autorJPA = new AutorJpaController();
    EditorialJpaController editorialJPA = new EditorialJpaController();
    LibroJpaController libroJPA = new LibroJpaController();

    public void createAuthor(Autor autor) {
        autorJPA.create(autor);
    }

    public void deleteAuthor(Integer id) {
        try {
            autorJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editAuthor(Autor autor) {
        try {
            autorJPA.edit(autor);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Autor llamarAutorNombre(String nombre){
        return autorJPA.buscarNombre(nombre);
    }

    public void createEditorial(Editorial editorial) {
        editorialJPA.create(editorial);
    }

    public void createBook(Libro libro) {
        libroJPA.create(libro);
    }

    public Autor getAuthor(Integer id) {
        return autorJPA.findAutor(id);
    }

    public ArrayList<Autor> getAuthorList() {
        List<Autor> listAux = autorJPA.findAutorEntities();
        ArrayList<Autor> listAutores = new ArrayList(listAux);
        return listAutores;
    }

    public void deleteEditorial(Integer id) {
        try {
            editorialJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editEditorial(Editorial editorial) {
        try {
            editorialJPA.edit(editorial);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteBook(Long bn) {
        try {
            libroJPA.destroy(bn);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editBook(Libro libro) {
        try {
            libroJPA.edit(libro);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Editorial> getEditoriales() {
        
        List<Editorial> aux=editorialJPA.findEditorialEntities();
        ArrayList<Editorial> listaEditoriales = new ArrayList(aux);
        return listaEditoriales;
    }

    public Editorial findEditorial(Integer id) {
        return editorialJPA.findEditorial(id);
    }

    public Editorial searchEditorial(String nombre) {
       return editorialJPA.searchEditorialName(nombre);
    }

  

   

}
