package excepcionesjavaguia10.Services;

import excepcionesjavaguia10.Entities.NumerosAleatorios;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class NumerosAleatoriosService {

    public NumerosAleatorios cNumerosAleatorios() {
        NumerosAleatorios random = new NumerosAleatorios();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese cuantos numeros desea generar");
        int limite = leer.nextInt();

        try {
            for (int i = 0; i < limite; i++) {
                random.setDatoAleatorio((double)((int)(Math.random() * 9 + 1)), i);
            }
        } catch (Exception e) {
            System.out.println("Solo se ingreso hasta cierto punto " +e.getMessage());
            Throwable fillInStackTrace = e.fillInStackTrace();
            System.out.println(fillInStackTrace);
        }
        
        System.out.println(random);

        return random;
    }

}
