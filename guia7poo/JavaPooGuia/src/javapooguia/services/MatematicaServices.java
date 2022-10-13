package javapooguia.services;

import java.util.Scanner;
import javapooguia.entities.Matematica;

/**
 *
 * @author xhemanuelv
 */
public class MatematicaServices {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public double devolverMayor(Matematica datos) {
        double mayor;
        if (datos.getNum1() > datos.getNum2()) {
            mayor = datos.getNum1();
        } else {
            mayor = datos.getNum2();
        }
        return mayor;
    }

    public void calcularPotencia(Matematica datos) {
        if (datos.getNum1() > datos.getNum2()) {
            System.out.println("El mayor valor de " + datos + " elevado al menor da como resultado: " + Math.pow(Math.round(datos.getNum1()), Math.round(datos.getNum2())));
        } else {
            System.out.println("El mayor valor de " + datos + " elevado al menor da como resultado: " + Math.pow(Math.round(datos.getNum2()), Math.round(datos.getNum1())));
        }
    }

    public void calculaRaiz(Matematica datos) {
        if (datos.getNum1() > datos.getNum2()) {
            System.out.println("La raíz cuadrada del menor de los dos valores de " + datos + "es: " + Math.sqrt(Math.abs(datos.getNum2())));
        } else {
            System.out.println("La raíz cuadrada del menor de los dos valores de " + datos + "es: " + Math.sqrt(Math.abs(datos.getNum1())));
        }
    }
}
