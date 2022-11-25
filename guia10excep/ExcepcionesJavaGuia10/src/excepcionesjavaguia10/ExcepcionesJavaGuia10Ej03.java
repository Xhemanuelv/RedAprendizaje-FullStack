package excepcionesjavaguia10;

import excepcionesjavaguia10.Entities.DivisionNumero;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class ExcepcionesJavaGuia10Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero dosNumeros = new DivisionNumero();
        System.out.println("Dividiendo 2 numeros");
        System.out.println("Ingrese un numero");
        String numA = leer.next();
        System.out.println("Ingrese otro numero");
        String numB = leer.next();
        try {
            dosNumeros.setNumeroUno(Integer.parseInt(numA));
            dosNumeros.setNumeroDos(Integer.parseInt(numB));
            double dividiendo = (dosNumeros.getNumeroUno()) / (dosNumeros.getNumeroDos());
            dosNumeros.setNumeroUnoDivididonumeroDos(dividiendo);
            System.out.println(dividiendo);
        } catch (NumberFormatException e) {
            System.out.println("Error se a ingresado un valor inapropiado");
            System.out.println(e.getMessage());
//            System.out.println(e.fillInStackTrace());

        } catch (ArithmeticException e) {

            System.out.println("Error al realizar la division");
            System.out.println(e.fillInStackTrace());
            System.out.println(Arrays.toString(e.getStackTrace()));

        } catch (Exception e) {

            System.out.println("Que habeis hecho!!!");
        }

        System.out.println(dosNumeros);

    }

}
