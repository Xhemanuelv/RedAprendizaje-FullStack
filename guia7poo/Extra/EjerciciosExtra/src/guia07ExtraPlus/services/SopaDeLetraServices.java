package guia07ExtraPlus.services;

import guia07ExtraPlus.entities.SopaDeLetras;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class SopaDeLetraServices {

    public SopaDeLetras cargarPalabras() {
        //cheat para transformar string array a char array 2d
        String palabrasSopa[] = {"PERROABRAN", "ACUSOBAJAS", "BAÑESBODAS", "ASNOSALTOS", "BONOSARCES", "ACUÑOALMAS", "BEBESANDES", "BATÍSBESOS", "BESENBOGAS", "ALIASBOTEN"};

        char letterSoup[][] = new char[palabrasSopa.length][10];
        for (int i = 0; i < palabrasSopa.length; i++) {
            letterSoup[i] = palabrasSopa[i].toCharArray();
        }
        //System.out.println(Arrays.deepToString(letterSoup));
        return new SopaDeLetras(letterSoup);
    }

    public void visualizeGame(SopaDeLetras game) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(game.getMatriz()[i][j]);
            }
            System.out.println("");
        }
    }

    public void flipVisualize(SopaDeLetras game) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(game.getMatriz()[j][i]);
            }
            System.out.println("");
        }
    }

    private void reemplazarPalabra(SopaDeLetras game) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char compara[] = new char[10];
        boolean exists;
        System.out.println(game.getPalabraBuscada().length());
        for (int i = 0; i < 5; i++) {
            compara[i] = game.getPalabraBuscada().charAt(i);
        }
        int counter = 0, posI = 0, posJ = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (compara[j] == game.getMatriz()[i][j]) {
                    counter++;
                    if (counter == 5) {
                        posI = i;
                        posJ = j - 5;
                    }
                }

            }
        }
        System.out.println(counter);
        
        exists = counter >= 5;
        System.out.println(exists);
        if (exists) {
            String replace;
            do {
                System.out.println("Ingrese la palabra que ocupara su lugar");
                replace = leer.next();
                if (replace.length() > 5) {
                    System.out.println("Max length 5 chars");
                }
            } while (replace.length() > 5);
            char replaceMatrix[][] = new char[10][10];
            char replaceWord[] = new char[5];
            for (int i = 0; i < 5; i++) {
                replaceWord[i] = replace.charAt(i);
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {

                    if (i == posI && j == posJ) {
                        replaceMatrix[i][j] = replaceWord[j];
                    } else {
                        replaceMatrix[i][j] = game.getMatriz()[i][j];
                    }
                }
            }

            for (int i = posI; i < 10; i++) {
                for (int j = posJ; j < 10; j++) {

                    game.setMatriz(replaceMatrix);
                }
            }
        }

    }

    public void buscarPalabras(SopaDeLetras game) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int exit;

        do {

            System.out.println("1 - Mostrar sopa de letras");
            System.out.println("2 - Mostrar sopa de letras invertida");
            System.out.println("3 - Cambiar palabra de sopa de letras");
            System.out.println("4 - Salir");
            exit = leer.nextInt();

            switch (exit) {
                case 1:
                    visualizeGame(game);
                    break;
                case 2:
                    flipVisualize(game);
                    break;
                case 3:

                    System.out.println("Ingrese palabra a buscar");
                    String palabraBuscar = leer.next().toUpperCase();
                    game.setPalabraBuscada(palabraBuscar);
                    System.out.println(game);
                    reemplazarPalabra(game);
                    break;
                case 4:
                    System.out.println("Esperemos que haya disfrutado el juego");
                    break;
                default:
                    if (exit!=4) {
                        System.out.println("Entrada invalida");
                    }
            }

        } while (exit != 4);

    }
}
