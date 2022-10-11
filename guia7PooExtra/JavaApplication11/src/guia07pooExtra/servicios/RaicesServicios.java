package guia07pooExtra.servicios;

import java.util.Scanner;
import guia07pooExtra.entidades.Raices;

/**
 *
 * @author xhemanuelv
 */
public class RaicesServicios {

    public Raices llenarParametros() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese a");
        double a = leer.nextDouble();
        System.out.println("Ingrese b");
        double b = leer.nextDouble();
        System.out.println("Ingrese b");
        double c = leer.nextDouble();

        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices marta) {
        double martabruce;
        martabruce = (Math.pow(marta.getB(), 2)) - (4 * (marta.getA() * (marta.getC())));
        marta.setDiscriminante(martabruce);
        return martabruce;
    }

    public boolean tieneRaices(Raices segundo) {
        return segundo.getDiscriminante() > 0;
    }

    public boolean tieneRaiz(Raices segundo) {
        return segundo.getDiscriminante() == 0;
    }

    public void obtenerRaices(Raices ramas) {
        if (tieneRaices(ramas)) {
            System.out.println("La solucion 1° es:");
            System.out.println("(-b±√((b^2)-(4*a*c)))/(2*a)= " + ((((-ramas.getB())) + Math.sqrt((Math.pow(ramas.getB(), 2)) - (4 * (ramas.getA() * (ramas.getC()))))) / (2 * ramas.getA())));
            System.out.println("La solucion 2° es:");
            System.out.println("(-b±√((b^2)-(4*a*c)))/(2*a)= " + ((((-ramas.getB())) - Math.sqrt((Math.pow(ramas.getB(), 2)) - (4 * (ramas.getA() * (ramas.getC()))))) / (2 * ramas.getA())));
        } else {
            System.out.println("No existe solucion");
        }

    }

    public void obtenerRaiz(Raices segundoGrado) {
        if (tieneRaiz(segundoGrado)) {
            System.out.println("(-b±√((b^2)-(4*a*c)))/(2*a)= " + ((((-segundoGrado.getB())) + Math.sqrt((Math.pow(segundoGrado.getB(), 2)) - (4 * (segundoGrado.getA() * (segundoGrado.getC()))))) / (2 * segundoGrado.getA())));
        } else {
            System.out.println("No tiene solucion");
        }
    }

    public void calcular(Raices nombre) {
        if (tieneRaices(nombre)) {
            obtenerRaices(nombre);
        } else if (tieneRaiz(nombre)) {
            obtenerRaiz(nombre);
        } else {
            System.out.println("No tiene solucion posible");
        }
    }

}
