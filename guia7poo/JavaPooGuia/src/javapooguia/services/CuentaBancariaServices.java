package javapooguia.services;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javapooguia.entities.CuentaBancaria;

/**
 *
 * @author Xhemanuelv
 */
public class CuentaBancariaServices {

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.println("Registrando nuevo usuario");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese el nombre del cliente");
        String name = leer.next();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese el dni del cliente");
        long id = leer.nextLong();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        int accountnumber = ThreadLocalRandom.current().nextInt(9000, 180000);
        System.out.println("El numero de cuenta asignado al cliente es " + accountnumber);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ingrese el monto que desea depositar");
        float saldoInicial = leer.nextFloat();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        float interestRate = 6.15f;
        System.out.println("La tasa de interes actual es de " + interestRate);
        return new CuentaBancaria(name, id, accountnumber, saldoInicial, interestRate);
    }

    public void depositoCuenta(CuentaBancaria cliente) {
        System.out.println("Deposite el dinero");
        double deposit = leer.nextDouble();
        cliente.setSaldo((float) (cliente.getSaldo() + deposit));
        System.out.println("Su nuevo saldo es : $" + cliente.getSaldo());
    }

    public void retiroCuenta(CuentaBancaria cliente) {
        System.out.println("Que cantidad desea extraer de su cuenta");
        double retiro = leer.nextDouble();
        if ((cliente.getSaldo() - retiro) < 0) {
            System.out.println("No dispone de suficiente saldo en su cuenta");
            System.out.println("Realizado retiro de $" + cliente.getSaldo());
            cliente.setSaldo(0);
            System.out.println("Saldo disponible : $" + cliente.getSaldo());
        } else if ((cliente.getSaldo() - retiro) == 0) {
            System.out.println("Retire su dinero");
            cliente.setSaldo(0);
            System.out.println("Saldo disponible : $" + cliente.getSaldo());
        } else {
            System.out.println("Retire su dinero");
            cliente.setSaldo((float) (cliente.getSaldo() - retiro));
            System.out.println("Saldo disponible : $" + cliente.getSaldo());
        }
    }

    public void extraccionRapidaCuenta(CuentaBancaria cliente) {
        double retiro;
        do {
            System.out.println("Introduzca cantidad a retirar");
            retiro = leer.nextDouble();
            if (retiro > (cliente.getSaldo() * 0.2)) {
                System.out.println("Error solo puede extraer rapidamente un 20% de su saldo");
                System.out.println("Saldo disponible a retirar $" + (cliente.getSaldo() * 0.2));
            }
        } while (retiro > (cliente.getSaldo() * 0.2));
        cliente.setSaldo((float) (cliente.getSaldo() - retiro));

    }

    public void consultaSaldo(CuentaBancaria cliente) {
        System.out.println("Saldo disponible en su cuenta :");
        System.out.println("$" + cliente.getSaldo());
    }

    public void consultarDatos(CuentaBancaria cliente) {
        System.out.println("Datos del cliente");
        System.out.println("Nombre : " + cliente.getNombreCliente());
        System.out.println("DNI : " + cliente.getClientDNI());
        System.out.println("N° de cuenta : " + cliente.getNumeroCuenta());
        System.out.println("Saldo disponible : $" + cliente.getSaldo());
        System.out.println("Tasa interes : " + cliente.getInteres() + "%");

    }

}
