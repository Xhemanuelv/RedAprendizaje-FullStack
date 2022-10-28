package services;

import colecciones.utlilities.ComparadorPeliculas;
import entities.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class PeliculasService {

    private List<Peliculas> moviesCinema = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Peliculas crearPelicula() {

        System.out.println("Ingrese el titulo de la pelicula");
        String title = leer.next();
        System.out.println("Ingrese el director de la pelicula");
        String director = leer.next();
        System.out.println("Ingrese la duración de la pelicula en minutos");
        float minutos = leer.nextInt();
        float filmLength = (minutos / 60);
        return new Peliculas(title, director, filmLength);
    }

    public void carteleraCine() {
        String confirmacion = "s";
        do {

            if (confirmacion.equalsIgnoreCase("n") || confirmacion.equalsIgnoreCase("s")) {
                moviesCinema.add(crearPelicula());

            } else {
                System.out.println("Ingreso invalido");
            }
            System.out.println("Agregar otra pelicula S/N");
            confirmacion = leer.next().substring(0);
        } while (!confirmacion.equalsIgnoreCase("n"));

    }

    /**
     * Mostrar en pantalla todas las películas
     */
    private void mostrarPeliculas() {
        System.out.println("Las peliculas actualmente en cartelera son :");
        moviesCinema.forEach((pelicula) -> {
            System.out.printf("%s - %.1f hora/s ~ Director  %s\n", pelicula.getTitulo(), pelicula.getDuracion(), pelicula.getDirector());
            System.out.format("");
        });
    }

    /**
     * Mostrar en pantalla todas las películas con una duración mayor a 1 hora
     */
    private void mostrarPeliculasHora() {
        System.out.println("Las peliculas de mas de 1 hora actualmente en cartelera son :");
//        //For i
//        for (int i = 0; i < moviesCinema.size(); i++) {
//            if (moviesCinema.get(i).getDuracion() > 1) {
//                System.out.printf("\n%s - %.1f hora/s ~ Director  %s\n", moviesCinema.get(i).getTitulo(), moviesCinema.get(i).getDuracion(), moviesCinema.get(i).getDirector());
//            }
//        }
//        //for mejorado
//        for (Peliculas movie : moviesCinema) {
//            if (movie.getDuracion() > 1) {
//                System.out.printf("\n%s - %.1f hora/s ~ Director  %s\n", movie.getTitulo(), movie.getDuracion(), movie.getDirector());
//            }
//        }
//        //for mejorado funcional
        moviesCinema.forEach((Peliculas peliculas) -> {
            if (peliculas.getDuracion() > 1) {
                System.out.printf("\n%s - %.1f hora/s ~ Director  %s\n", peliculas.getTitulo(), peliculas.getDuracion(), peliculas.getDirector());
            }
        });
    }

    /**
     * Ordenar las películas de acuerdo a su duración (de mayor a menor) y
     * mostrarlo en pantalla.
     */
    private void ordenarDuracionMayorMenor() {
        Collections.sort(moviesCinema, ComparadorPeliculas.ordenarDuracionDescendente);
        System.out.println("Las peliculas y su duracion respectiva son por duracion descendente :");
        mostrarPeliculas();
    }

    /**
     * Ordenar las películas de acuerdo a su duración (de menor a mayor) y
     * mostrarlo en pantalla
     */
    private void ordenarDuracionMenorMayor() {
        Collections.sort(moviesCinema, ComparadorPeliculas.ordenarDuracionAscendente);
        System.out.println("Las peliculas y su duracion respectiva son por duracion descendente :");
        mostrarPeliculas();
    }

    /**
     * Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla
     */
    private void ordenarTituloAlfabeticamente() {
        Collections.sort(moviesCinema, ComparadorPeliculas.ordenarTituloAlfabetico);
        mostrarPeliculas();
    }

    /**
     * Ordenar las películas por director, alfabéticamente y mostrarlo en
     * pantalla
     */
    private void ordenarDirectorAlfabeticamente() {
        Collections.sort(moviesCinema, ComparadorPeliculas.ordenarDirectorAlfabetico);
        mostrarPeliculas();
    }

    /**
     * Ejecuta los metodos De PeliculaService
     */
    public void visualizarPeliculas() {
        int salir;
        do {
            System.out.println("1 - Mostrar todas las peliculas");
            System.out.println("2 - Mostrar todas las peliculas de mas de 1 hora");
            System.out.println("3 - Mostrar todas las peliculas segun duracion(mayor a menor)");
            System.out.println("4 - Mostrar todas las peliculas segun duracion(menor a mayor)");
            System.out.println("5 - Mostrar todas las peliculas por su titulo");
            System.out.println("6 - Mostrar todas las peliculas por su director");
            System.out.println("7 - Salir");
            salir = leer.nextInt();
            switch (salir) {
                case 1:
                    mostrarPeliculas();
                    break;
                case 2:
                    mostrarPeliculasHora();
                    break;
                case 3:
                    ordenarDuracionMayorMenor();
                    break;
                case 4:
                    ordenarDuracionMenorMayor();
                    break;
                case 5:
                    ordenarTituloAlfabeticamente();
                    break;
                case 6:
                    ordenarDirectorAlfabeticamente();
                    break;
                case 7:
                    System.out.println("Recuerde cerrar su sesion!");
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Entrada invalida");
            }
        } while (salir != 7);

    }
}
