package javapooguia.services;

import java.util.Date;
import java.util.Scanner;
import javapooguia.entities.Vendedor;

/**
 *
 * @author Xhemanuelv
 */
public class VendedorServicio {

    Scanner leer = new Scanner(System.in);

    public Vendedor altaVendedor() {

        //fill attributes
        System.out.println("Ingrese el nombre del vendedor");
        String name = leer.next();
        System.out.println("Ingrese el DNI del vendedor");
        int id = leer.nextInt();
        System.out.println("Ingrese el sueldo basico del vendedor");
        double basicSalary = leer.nextDouble();
        System.out.println("Ingrese el dia que comenzo a trabajar");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes en que comenzo a trabajar");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año en que comenzo a trabajar");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        //create new object type Vendedor
        return new Vendedor(name, id, basicSalary, fecha);
    }

    public void SueldoMensual(Vendedor employee) {
        System.out.println("Ingrese las ventas totales del vendedor");
        double ventas = leer.nextDouble();
        employee.setComisiones(ventas * 0.15);
        employee.setSueldoMensual(employee.getSueldoBasico() + employee.getComisiones());
        System.out.println("El sueldo mensual del vendedor:"
                + employee.getNombre() + " es de $" + employee.getSueldoMensual());
    }

    public void Vacaciones(Vendedor employee) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - employee.getFechaInicio().getYear();
        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 dias de vacaciones");
        } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 dias de vacaciones");
        } else if (antiguedad < 20) {
            System.out.println("Le corresponden 28 dias de vacaciones");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 dias de vacaciones");
        } else if (antiguedad < 1) {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }
}
