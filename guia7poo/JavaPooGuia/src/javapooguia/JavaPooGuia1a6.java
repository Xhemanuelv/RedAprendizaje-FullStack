/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooguia;

import java.util.Scanner;
import javapooguia.entities.Cafetera;
import javapooguia.entities.CuentaBancaria;
import javapooguia.entities.Persona;
import javapooguia.entities.Rectangulo;
import javapooguia.services.CafeteraServices;
import javapooguia.services.CuentaBancariaServices;
import javapooguia.services.PersonaServices;
import javapooguia.services.RectanguloServices;

/**
 *
 * @author Xhemanuelv
 */
public class JavaPooGuia1a6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

//        RectanguloServices rs = new RectanguloServices();
//        Rectangulo longBox = rs.crearRectangulo();
//        rs.areaRectangulo(longBox);
//        rs.perimetroRectangulo(longBox);
//        rs.dibujarRectangulo(longBox);

//        CuentaBancariaServices cbs=new CuentaBancariaServices();
//        CuentaBancaria Emanuel=cbs.crearCuenta();
//        cbs.depositoCuenta(Emanuel);
//        cbs.retiroCuenta(Emanuel);
//        cbs.extraccionRapidaCuenta(Emanuel);
//        cbs.consultaSaldo(Emanuel);
//        cbs.consultarDatos(Emanuel);
      
//        CafeteraServices cafeserv=new CafeteraServices();
//        Cafetera peabody=new Cafetera();
//        System.out.println(peabody);
//        cafeserv.llenarCafetera(peabody);
//        System.out.println(peabody);
//        cafeserv.servirTaza(peabody);
//        System.out.println(peabody);
//        cafeserv.vaciarCafetera(peabody);
//        System.out.println("Ingrese cuanto agregara de cafe(agua?)");
//        int aguaCafe=leer.nextInt();
//        cafeserv.agregarCafe(peabody, aguaCafe);
//        System.out.println(peabody);

    /*
        PersonaServices perServ = new PersonaServices();
        Persona joe = perServ.crearPersona();
        Persona jane = perServ.crearPersona();
        Persona trent = perServ.crearPersona();
        Persona lucy = perServ.crearPersona();

        perServ.calcularIMC(joe);
        System.out.print(joe.getNombre() + " tiene ");
        if (joe.getIndiceMasaCorporal() < 0) {
            System.out.print(" bajo peso, IMC < 20\n");
        } else if (joe.getIndiceMasaCorporal() == 0) {
            System.out.print(" peso ideal, IMC entre 20 y 25\n");
        } else if (joe.getIndiceMasaCorporal() < 0) {
            System.out.print(" sobrepeso, IMC > 25\n");
        }
        System.out.print(jane.getNombre() + " tiene ");
        perServ.calcularIMC(jane);
        if (jane.getIndiceMasaCorporal() < 0) {
            System.out.print(" bajo peso, IMC < 20\n");
        } else if (jane.getIndiceMasaCorporal() == 0) {
            System.out.print(" peso ideal, IMC entre 20 y 25\n");
        } else if (jane.getIndiceMasaCorporal() < 0) {
            System.out.print(" sobrepeso, IMC > 25\n");
        }
        System.out.print(trent.getNombre() + " tiene ");
        perServ.calcularIMC(trent);
        if (trent.getIndiceMasaCorporal() < 0) {
            System.out.print(" bajo peso, IMC < 20\n");
        } else if (trent.getIndiceMasaCorporal() == 0) {
            System.out.print(" peso ideal, IMC entre 20 y 25\n");
        } else if (trent.getIndiceMasaCorporal() < 0) {
            System.out.print(" sobrepeso, IMC > 25\n");
        }
        System.out.print(lucy.getNombre() + " tiene ");
        perServ.calcularIMC(lucy);
        if (lucy.getIndiceMasaCorporal() < 0) {
            System.out.print(" bajo peso, IMC < 20\n");
        } else if (lucy.getIndiceMasaCorporal() == 0) {
            System.out.print(" peso ideal, IMC entre 20 y 25\n");
        } else if (lucy.getIndiceMasaCorporal() < 0) {
            System.out.print(" sobrepeso, IMC > 25\n");
        }
        System.out.println();
        perServ.mayoriaEdad(joe);
        if (joe.isMayorEdad()) {
            System.out.println(joe.getNombre()+" es mayor de edad");
        } else {
            System.out.println(joe.getNombre()+" es menor de edad");
        }
        perServ.mayoriaEdad(jane);
        if (jane.isMayorEdad()) {
            System.out.println(jane.getNombre()+" es mayor de edad");
        } else {
            System.out.println(jane.getNombre()+" es menor de edad");
        }
        perServ.mayoriaEdad(trent);
        if (trent.isMayorEdad()) {
            System.out.println(trent.getNombre()+" es mayor de edad");
        } else {
            System.out.println(trent.getNombre()+" es menor de edad");
        }
        perServ.mayoriaEdad(lucy);
        if (lucy.isMayorEdad()) {
            System.out.println(trent.getNombre()+" es mayor de edad");
        } else {
            System.out.println(trent.getNombre()+" es menor de edad");
        }

        float porcentajeEdad, porcentajePeso;
        int counter = 0, underweight=0,overweight=0,ideal=0;
        for (int i = 0; i < 4; i++) {
            if (i == 0 && joe.isMayorEdad()) {
                counter++;
            } else if (i == 1 && jane.isMayorEdad()) {
                counter++;
            } else if (i == 2 && trent.isMayorEdad()) {
                counter++;
            } else if (i == 3 && lucy.isMayorEdad()) {
                counter++;
            }
        }
        porcentajeEdad = (counter * 100) / 4;
        System.out.println("Un " + porcentajeEdad + "% es mayor de edad");

        if (joe.getIndiceMasaCorporal()<0) {
            underweight++;
        }else if (joe.getIndiceMasaCorporal()>0) {
            overweight++;
        }else if (joe.getIndiceMasaCorporal()==0) {
            ideal++;
        }
        
        if (jane.getIndiceMasaCorporal()<0) {
            underweight++;
        }else if (jane.getIndiceMasaCorporal()>0) {
            overweight++;
        }else if (jane.getIndiceMasaCorporal()==0) {
            ideal++;
        }
        
        if (trent.getIndiceMasaCorporal()<0) {
            underweight++;
        }else if (trent.getIndiceMasaCorporal()>0) {
            overweight++;
        }else if (trent.getIndiceMasaCorporal()==0) {
            ideal++;
        }
        
        if (lucy.getIndiceMasaCorporal()<0) {
            underweight++;
        }else if (lucy.getIndiceMasaCorporal()>0) {
            overweight++;
        }else if (lucy.getIndiceMasaCorporal()==0) {
            ideal++;
        }
        float idealPorcent=(ideal*100)/4;
        float overweightPorcent=(overweight*100)/4;
        float underweightPorcent=(underweight*100)/4;
        System.out.println("Poseen un peso ideal "+idealPorcent+"% de las personas evaluadas");
        System.out.println("Presentan bajo peso "+overweightPorcent+"% de las personas evaluadas");
        System.out.println("Presentan elevado peso "+underweightPorcent+"% de las personas evaluadas");
        */
    
        
    }

}
