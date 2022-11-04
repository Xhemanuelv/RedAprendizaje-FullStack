package colecciones;

import services.PeliculasService;

/**
 *
 * @author Xhemanuelv
 */
public class Ejercicio04Colecciones {

    public static void main(String[] args) {
        // Peliculas

        PeliculasService peliServ = new PeliculasService();

        peliServ.carteleraCine();
        peliServ.visualizarPeliculas();
    }

}
