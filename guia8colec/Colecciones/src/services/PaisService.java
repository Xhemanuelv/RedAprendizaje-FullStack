package services;

import colecciones.utlilities.ComparadorPais;
import entities.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Xhemanuelv
 */
public class PaisService {

    private Set<Pais> conjuntoPaises = new HashSet<>();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Pais crearPais() {
        System.out.println("Ingrese un pais");
        String pais = leer.next();
        return new Pais(pais);
    }

    /**
     * Crea una lista de objetos pais y lo muestra
     */
    //Si no se declara un hashCode() equals() en el objeto, no sabra diferenciar
    public void addCountry() {
        String seguir = "s";
        do {

            if (seguir.equalsIgnoreCase("S") || seguir.equalsIgnoreCase("n")) {

                conjuntoPaises.add(crearPais());

            } else {
                System.out.println("Ingreso invalido");
            }
            System.out.println("Desea agregar otro pais S/N");
            seguir = leer.next().substring(0);
        } while (!seguir.equalsIgnoreCase("N"));
        System.out.println("Se ha creado el siguiente conjunto de paises :");
        mostrarPaises();
    }

    private void mostrarPaises() {

        conjuntoPaises.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    /**
     * Ordena el conjunto de paises alfabeticamente y lo muestra para ello lo
     * convierte a lista
     */
    public void ordenAlfabetico() {
        ArrayList<Pais> listaPais = new ArrayList(conjuntoPaises);
        Collections.sort(listaPais, ComparadorPais.ordenarAlfabeticamente);
        System.out.println("Lista de paises ordenados alfabeticamente :");
        listaPais.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    /**
     * Remueve un pais del conjunto con un iterator si este se encuentra y
     * muestra el conjunto sin dicho pais, si no se encuentra notifica al
     * usuario
     *
     */
    public void quitarPaisSet() {
        Iterator<Pais> itPais = conjuntoPaises.iterator();
        System.out.println("Ingrese el pais que desea quitar");
        String quitarPais = leer.next();
        Pais aux = new Pais();
        aux.setPais(quitarPais);
        System.out.println("");
        
        // se utilizo el hashCode para eliminar el pais
//        System.out.println(aux.hashCode());
//        conjuntoPaises.forEach((hashAux)->{
//            System.out.println(hashAux.hashCode());
//        });
    
        boolean encontrar = conjuntoPaises.contains(aux);
        
        if (encontrar) {

            while (itPais.hasNext()) {
                if (itPais.next().hashCode() == aux.hashCode()) {
                    itPais.remove();
                    System.out.println("Se ha removido exitosamente el pais introducido");
                    System.out.println("Paises restantes :");
                    mostrarPaises();
                }
            }
            
        } else {
            System.out.println("El pais introducido no se encuentra en la lista");
        }
        System.out.println("");

    }

}
