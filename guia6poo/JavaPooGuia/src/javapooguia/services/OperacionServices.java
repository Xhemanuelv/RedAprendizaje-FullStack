package javapooguia.services;

import java.util.Scanner;
import javapooguia.entities.Operacion;

/**
 *
 * @author xhemanuelv
 */
public class OperacionServices {

    public Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        return new Operacion(num1, num2);
    }

    public int sumar(Operacion sumando) {
        return sumando.getNumero1() + sumando.getNumero2();
    }

    public int restar(Operacion restando) {
        return restando.getNumero1() - restando.getNumero2();
    }

    public int multiplicar(Operacion multiplicando) {
        if (multiplicando.getNumero1() == 0 || multiplicando.getNumero2() == 0) {
            System.out.println("Error, cualquier numero multiplicado cero es cero");
            return 0;
        } else {
            return multiplicando.getNumero1() * multiplicando.getNumero2();
        }

    }

    public int dividir(Operacion dividiendo) {
        if (dividiendo.getNumero2() == 0) {
            System.out.println("Error no se puede realizar una division por cero");
            return 0;
        } else {
            return dividiendo.getNumero1() / dividiendo.getNumero2();
        }
    }
}
