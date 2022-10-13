package javapooguia.services;

import java.util.Scanner;
import javapooguia.entities.Cadena;

/**
 *
 * @author xhemanuelv
 */
public class CadenaServices {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena ingresarCadena() {
        System.out.println("Ingrese la frase");
        String phrase = leer.nextLine();
        return new Cadena(phrase, phrase.length());
    }

    public void mostrarVocales(Cadena palabra) {
        int vocales = 0;
        for (int i = 0; i < palabra.getLongitudFrase(); i++) {

            String a = palabra.getFrase().substring(i, i + 1);

            if (a.equalsIgnoreCase("e") || a.equalsIgnoreCase("a") || a.equalsIgnoreCase("i") || a.equalsIgnoreCase("o") || a.equalsIgnoreCase("u")) {
                vocales++;
            }
        }
        System.out.println("La frase contiene : " + vocales + " vocales");
    }

    public void invertirFrase(Cadena palabra) {
        String FraseInv = "";

        for (int i = palabra.getLongitudFrase() - 1; i >= 0; i--) {

            FraseInv = FraseInv.concat(palabra.getFrase().substring(i, i + 1));

        }

        System.out.println(FraseInv);
    }

    public void vecesRepetido(Cadena palabra) {
        System.out.println("Ingrese el caracter a buscar");
        String letra = leer.nextLine();
        int cant = 0;
        for (int i = 0; i < palabra.getLongitudFrase(); i++) {

            String a = palabra.getFrase().substring(i, i + 1);

            if (a.equalsIgnoreCase(letra)) {
                cant++;
            }
        }
        System.out.format("La %s se repite %d veces.%n",letra,cant);
    }

    public void compararLongitud(Cadena palabra) {
        System.out.println("Ingrese la segunda frase a analizar");
        String frase2 = leer.nextLine();
        if (palabra.getFrase().length() > frase2.length()) {
            System.out.println("La frase original es mas larga");
        } else if (palabra.getLongitudFrase() == frase2.length()) {
            System.out.println("Ambas tienen el mismo largo");
        } else {
            System.out.println("La frase original es mas corta");
        }
    }

    public void unirFrase(Cadena palabra) {
        System.out.println("Ingrese la frase a unir");
        String frase2 = leer.nextLine();
        System.out.println("La frase resultante es: ");
        frase2=palabra.getFrase().concat(frase2);
        System.out.println(frase2);
        palabra.setFrase(frase2);
        palabra.setLongitudFrase(frase2.length());
    }

    public void reemplazar(String letra, Cadena palabra) {
        String frase3 = "";
        
        System.out.println("Ingrese con que la reemplazara");
        String replacement=leer.nextLine();
        for (int i = 0; i < palabra.getLongitudFrase(); i++) {
            if (palabra.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                frase3 = frase3.concat(replacement);
            } else {
                frase3 = frase3.concat(palabra.getFrase().substring(i, i + 1));
            }

        }
        System.out.println(frase3);
    }

    public boolean contiene(Cadena palabra) {
        System.out.println("Ingrese la letra a buscar");
        String letra = leer.nextLine();
        return palabra.getFrase().contains(letra);
    }
}
