package guia07ExtraPlus.services;

import guia07ExtraPlus.entities.Auto;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Xhemanuelv
 */
public class AutoService {
    
    public Auto cargarAuto() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombreDuenio;
        String color;
        String modelo;
        int dia, mes, anio;
        System.out.println("Ingrese el nombre del dueño del vehículo");
        nombreDuenio = leer.next();
        System.out.println("Ingrese dia vencimiento carnet");
        dia = leer.nextInt();
        System.out.println("Ingrese mes vencimiento carnet");
        mes = leer.nextInt();
        System.out.println("Ingrese año vencimiento carnet");
        anio = leer.nextInt();
        System.out.println("Ingrese el color del vehículo");
        color = leer.next();
        System.out.println("Ingrese el modelo del vehículo");
        modelo = leer.next();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        return new Auto(nombreDuenio, fecha, color, modelo);
    }
    
    public void titularidad(Auto feo) {
        Scanner leer = new Scanner(System.in);
        String papa;
        System.out.println("Ingrese el nuevo titular");
        papa = leer.nextLine();
        feo.setNombreDuenio(papa);
    }
    
    public void vamosDePaseo(Auto feo) {
        Scanner leer = new Scanner(System.in);
        float paseo, kmrecorridos;
        System.out.println("Ingrese la distancia recorrida en el viaje");
        paseo = leer.nextFloat();
        kmrecorridos = paseo + feo.getKmMotor();
        feo.setKmMotor(kmrecorridos);
        
    }
    
    public boolean autoReqService(Auto feo){
        
        return feo.getKmMotor()>10000;
    }
}
