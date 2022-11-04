package javapooguia;

import javapooguia.entities.Operacion;
import javapooguia.services.OperacionServices;

/**
 *
 * @author xhemanuelv
 */
public class JavaPoo03 {

    public static void main(String[] args) {
        // Operacion

        OperacionServices os = new OperacionServices();
        Operacion calc1 = os.crearOperacion();
        int sum, resta, multiplica, divide;
        sum = os.sumar(calc1);
        resta = os.restar(calc1);
        multiplica = os.multiplicar(calc1);
        divide = os.dividir(calc1);
        System.out.println("La suma de los numeros ingresados es " + calc1.getNumero1() + "+" + calc1.getNumero2() + "=" + sum);
        System.out.println("La resta de los numeros ingresados es " + calc1.getNumero1() + "-" + calc1.getNumero2() + "=" + resta);
        if (multiplica != 0) {
            System.out.println("La suma de los numeros ingresados es " + calc1.getNumero1() + "*" + calc1.getNumero2() + "=" + multiplica);
        }

        if (calc1.getNumero2() != 0) {
            System.out.println("La suma de los numeros ingresados es " + calc1.getNumero1() + "/" + calc1.getNumero2() + "=" + divide);
        }
    }

}
