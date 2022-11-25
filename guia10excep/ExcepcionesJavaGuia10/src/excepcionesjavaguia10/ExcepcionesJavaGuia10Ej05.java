package excepcionesjavaguia10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class ExcepcionesJavaGuia10Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Escribir un programa en Java que juegue con el usuario a adivinar un
         * número. La computadora debe generar un número aleatorio entre 1 y
         * 500, y el usuario tiene que intentar adivinarlo. Para ello, cada vez
         * que el usuario introduce un valor, la computadora debe decirle al
         * usuario si el número que tiene que adivinar es mayor o menor que el
         * que ha introducido el usuario. Cuando consiga adivinarlo, debe
         * indicárselo e imprimir en pantalla el número de veces que el usuario
         * ha intentado adivinar el número. Si el usuario introduce algo que no
         * es un número, se debe controlar esa excepción e indicarlo por
         * pantalla. En este último caso también se debe contar el carácter
         * fallido como un intento.
         */
        int adivinadme = (int) (Math.random() * 500 + 1);
        int intentoUsuario = 69420;
        int contador = 1;

        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            try {

                System.out.println("Ingrese un numero para intentar acertar al numero oculto");
                System.out.println("Nro intentos : " + contador);
                intentoUsuario = leer.nextInt();
                if (intentoUsuario > adivinadme) {
                    System.out.println("Te pasaste");
                } else if (intentoUsuario < adivinadme) {
                    System.out.println("Un poco mas");
                }

                if (((adivinadme - intentoUsuario) <= 20) && ((adivinadme - intentoUsuario) > 10)) {
                    System.out.println("Tibio");
                } else if (((adivinadme - intentoUsuario) <= 10) && ((adivinadme - intentoUsuario) > 0)) {
                    System.out.println("Caliente");
                } else if (intentoUsuario == adivinadme) {
                    System.out.println("Felicidades! Has acertado");
                } else {
                    System.out.println("Frio");
                }

            } catch (Exception e) {
                System.out.println("Ingreso invalido");
                System.out.println(e.fillInStackTrace());
//            } catch (Exception e) {
//                System.out.println("Error");
            } finally {
                contador++;
            }

        } while (adivinadme != intentoUsuario);

        System.out.println("Tardo " + contador + " intentos en descubrir el Nro " + adivinadme);
    }

}
