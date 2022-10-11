/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author xhemanuelv
 */
public class JavaAprendizaje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int selector;
        String salida;
        String exit = "S";
        boolean bandera = false;
        do {
            System.out.println("Ingrese el primer numero");
            int num1 = leer.nextInt();
            System.out.println("Ingrese el segundo numero");
            int num2 = leer.nextInt();
            System.out.println("");
            System.out.format("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción:");
            selector = leer.nextInt();
            switch (selector) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    System.out.println("¿Está seguro que\n"
                            + "desea salir del programa (S/N)?");
                    salida = leer.next();
                    bandera = salida.equals("S") && selector == 5;
                    break;

                default:
                    System.out.println("Entrada invalida");
            }

        } while (bandera == false);

    }

}
