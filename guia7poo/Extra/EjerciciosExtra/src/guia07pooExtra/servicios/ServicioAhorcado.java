package guia07pooExtra.servicios;

import guia07pooExtra.entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author xhemanuelv
 */
public class ServicioAhorcado {

    private Ahorcado crearJuego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra que se buscara");
        String separar = leer.next().toLowerCase();
        System.out.println("Especifique la cantidad de intentos");
        int tries = leer.nextInt();
        char[] ch = new char[separar.length()];

        for (int i = 0; i < separar.length(); i++) {
            ch[i] = separar.charAt(i);
        }
        return new Ahorcado(ch, tries);
    }

    private void longitud(Ahorcado palabra) {
        int tamano = palabra.getPalabra().length;
        System.out.println("Longitud de la palabra :" + tamano);
    }

    private void buscar(Ahorcado palabra, char letra) {

        int contador = 0;
        String letras, aux;
        for (int i = 0; i < palabra.getPalabra().length; i++) {
            if (letra == palabra.getPalabra()[i]) {
                contador++;
                aux = String.valueOf(letra);
                letras = palabra.getEncontradas().concat(aux);
                palabra.setEncontradas(letras);
            }
        }
        if (contador > 0) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
        }

    }

    private boolean encontradas(Ahorcado palabra, char letra) {
        //retorna boolean verificando intentos con el valor retornado
        int contador = 0;
        for (int i = 0; i < palabra.getPalabra().length; i++) {
            if (letra == palabra.getPalabra()[i]) {
                contador++;
            }
        }

        return contador > 0;
    }

    
    private void intentos(Ahorcado palabra, char letra) {

        if (!(encontradas(palabra, letra))) {
            System.out.println("Intentos restantes: " + (palabra.getIntentos() - 1));
            palabra.setIntentos((palabra.getIntentos() - 1));
        } else {
            System.out.println("Intentos restantes: " + palabra.getIntentos());
        }

    }

    public void juego() {
        Scanner leer = new Scanner(System.in);
        Ahorcado juguemos = crearJuego();
        System.out.println("Que comience el juego");
        char letra;
        int ausiliar = juguemos.getIntentos();
        //el juego no se termina cuando se descubren todas las letras
        //sigue hasta agotar los intentos
        for (int i = 0; i < ausiliar; i++) {

            System.out.println("Ingrese una letra");
            letra = leer.next().toLowerCase().charAt(0);
            longitud(juguemos);
            buscar(juguemos, letra);
            encontradas(juguemos, letra);
            juguemos.getEncontradas();
            intentos(juguemos, letra);
            System.out.println(juguemos.getEncontradas());
        }
        System.out.print("La palabra era: ");
        System.out.print(juguemos.getPalabra());
        System.out.println();
    }
}
