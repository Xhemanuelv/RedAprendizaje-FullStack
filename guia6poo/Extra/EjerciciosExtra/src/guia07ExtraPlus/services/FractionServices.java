package guia07ExtraPlus.services;

import guia07ExtraPlus.entities.Fraction;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class FractionServices {

    public Fraction createFraction() {
        Scanner leer = new Scanner(System.in);
        int denominador2, denominador1;
        System.out.println("Ingrese el 1° numerador");
        int numerador1 = leer.nextInt();
        do {
            System.out.println("Ingrese el 1° denominador");
            denominador1 = leer.nextInt();
            if (denominador1 == 0) {
                System.out.println("El denominador no puede ser cero");
            }
        } while (denominador1 == 0);

        System.out.println("Ingrese el 2° numerador");
        int numerador2 = leer.nextInt();
        do {
            System.out.println("Ingrese el 2° denominador");
            denominador2 = leer.nextInt();
            if (denominador2 == 0) {
                System.out.println("El denominador no puede ser cero");
            }
        } while (denominador2 == 0);

        return new Fraction(numerador1, denominador1, numerador2, denominador2);
    }

    private void sumar(Fraction irrational) {
        int denominComun;
        boolean mcm = false, cero = false;
        if (irrational.getDenominador1() == 0 || irrational.getDenominador2() == 0) {
            denominComun = 0;
            cero = true;
        } else if (irrational.getDenominador1() == irrational.getDenominador2()) {
            denominComun = irrational.getDenominador1();
            irrational.setCommonDenom(denominComun);
        } else if (irrational.getDenominador1() != irrational.getDenominador2()) {
            denominComun = irrational.getDenominador1() * irrational.getDenominador2();
            irrational.setCommonDenom(denominComun);
            mcm = true;
        } else {
            denominComun = 0;
            cero = true;
        }

        // (a/b)+(c/d)= ((a)*((b*d)/b))+((c)*((b*d)/d))= numerador suma
        if (mcm) {
            int numeradorSuma = ((irrational.getNumerador1()) * ((irrational.getDenominador1() * irrational.getDenominador2()) / irrational.getDenominador1())) + ((irrational.getNumerador2()) * ((irrational.getDenominador1() * irrational.getDenominador2()) / irrational.getDenominador2()));
            System.out.println("La suma es igual a : " + numeradorSuma + "/" + denominComun);
        } else if (cero) {
            System.out.println("No se puede realizar la division por cero");
        } else {
            int numeradorSuma = irrational.getNumerador1() + irrational.getNumerador2();
            System.out.println("La suma es igual a : " + numeradorSuma + "/" + denominComun);
        }

    }

    private void restar(Fraction irrational) {

        // (a/b)-(c/d)= ((a)*((b*d)/b))-((c)*((b*d)/d))= numerador resta
        if (irrational.getDenominador1() != irrational.getDenominador2()) {
            int numeradorResta = ((irrational.getNumerador1()) * ((irrational.getCommonDenom()) / irrational.getDenominador1())) - ((irrational.getNumerador2()) * ((irrational.getCommonDenom()) / irrational.getDenominador2()));
            System.out.println("La Resta es igual a : " + numeradorResta + "/" + irrational.getCommonDenom());
        } else {
            int numeradorResta = irrational.getNumerador1() - irrational.getNumerador2();
            System.out.println("La Resta es igual a : " + numeradorResta + "/" + irrational.getCommonDenom());
        }
    }

    private void multiplicar(Fraction irrational) {
        System.out.println("La multiplicación es igual a : " + (irrational.getNumerador1() * irrational.getNumerador2()) + "/" + (irrational.getDenominador1() * irrational.getDenominador2()));
    }

    private void dividir(Fraction irrational) {
        System.out.println("La división es igual a : " + (irrational.getNumerador1() * irrational.getDenominador2()) + "/" + (irrational.getNumerador2() * irrational.getDenominador1()));
    }

    private void mcm(Fraction irrational) {
        if (irrational.getDenominador1() != irrational.getDenominador2()) {
            irrational.setCommonDenom(irrational.getDenominador1() * irrational.getDenominador2());
        } else {
            irrational.setCommonDenom(irrational.getDenominador1());
        }

    }

    public void operacionesFraccion(Fraction irrational) {
        Scanner leer = new Scanner(System.in);

        int selector;
        do {
            System.out.println("Eliga la operacion que desea realizar");
            System.out.println("1- Sumar " + irrational.getNumerador1() + "/" + irrational.getDenominador1() + " + " + irrational.getNumerador2() + "/" + irrational.getDenominador2());
            System.out.println("2- Restar " + irrational.getNumerador1() + "/" + irrational.getDenominador1() + " - " + irrational.getNumerador2() + "/" + irrational.getDenominador2());
            System.out.println("3- Multiplicar " + irrational.getNumerador1() + "/" + irrational.getDenominador1() + " * " + irrational.getNumerador2() + "/" + irrational.getDenominador2());
            System.out.println("4- Dividir " + irrational.getNumerador1() + "/" + irrational.getDenominador1() + " / " + irrational.getNumerador2() + "/" + irrational.getDenominador2());
            System.out.println("5- Salir");
            selector = leer.nextInt();
            mcm(irrational);
            switch (selector) {
                case 1:
                    sumar(irrational);
                    break;
                case 2:
                    restar(irrational);
                    break;
                case 3:
                    multiplicar(irrational);
                    break;
                case 4:
                    dividir(irrational);
                    break;
                default:
                    if (selector != 5) {
                        System.out.println("Opcion invalida");
                    } else {
                        System.out.println("Adios");
                    }

            }
        } while (selector != 5);

    }
}
