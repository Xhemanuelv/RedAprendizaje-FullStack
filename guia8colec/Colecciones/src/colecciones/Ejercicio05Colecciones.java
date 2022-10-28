

package colecciones;

import services.PaisService;

/**
 *
 * @author Xhemanuelv
 */
public class Ejercicio05Colecciones {

    /**
     * Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
    usaremos un conjunto. 
    si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
    los servicios en la clase correspondiente)
    Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    cómo se ordena un conjunto.
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
    al usuario.
     */
    public static void main(String[] args) {
        // Países
        PaisService paServ=new PaisService();
        paServ.addCountry();
        System.out.println("");
        paServ.ordenAlfabetico();
        System.out.println("");
        paServ.quitarPaisSet();
    }

}
