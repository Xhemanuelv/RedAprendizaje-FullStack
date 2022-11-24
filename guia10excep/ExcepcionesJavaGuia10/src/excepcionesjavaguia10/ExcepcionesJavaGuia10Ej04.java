package excepcionesjavaguia10;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class ExcepcionesJavaGuia10Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Todas estas operaciones puede tirar excepciones a manejar, el ingreso
         * por teclado puede causar una excepción de tipo
         * InputMismatchException, el método Integer.parseInt() si la cadena no
         * puede convertirse a entero, arroja una NumberFormatException y
         * además, al dividir un número por cero surge una ArithmeticException.
         * Manipule todas las posibles excepciones utilizando bloques try/catch
         * para las distintas excepciones
         */

        int uno = 0, dos;
        String tres;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            System.out.println("Ingrese un numero");
            uno = leer.nextInt();
            System.out.println("Ingrese otro numero");

            dos = leer.nextInt();
            System.out.println("int/int= " + (uno / dos));
            System.out.println("Ingrese otro numero");
            tres = leer.next();
            System.out.println("int/Integer.parseInt= " + (uno / Integer.parseInt(tres)));
        } catch (ArithmeticException e) {

            System.out.println(e.fillInStackTrace());
            System.out.println("Error : " + uno + " " + e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));

        } catch (InputMismatchException e) {
            System.out.println("Error en ingreso de datos");
            System.out.println(e.fillInStackTrace());
            System.out.println(Arrays.toString(e.getStackTrace()));
        } catch (NumberFormatException e) {
            System.out.println("Error cargando segundo dato");
            System.out.println(e.fillInStackTrace());
            System.out.println(Arrays.toString(e.getStackTrace()));
        } catch (Exception e) {
            System.out.println("Critical error");
        }

    }

}
