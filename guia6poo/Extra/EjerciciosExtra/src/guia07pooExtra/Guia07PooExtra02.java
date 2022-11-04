
package guia07pooExtra;

import guia07pooExtra.entidades.Puntos;
import guia07pooExtra.servicios.PuntosServicios;

/**
 *
 * @author xhemanuelv
 */
public class Guia07PooExtra02 {
    
    /*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
    
    
    
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html */
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        PuntosServicios ps=new PuntosServicios();
        Puntos coordenadas=ps.crearPuntos();
        
        ps.calcularDistancia(coordenadas);
    }
    
}
