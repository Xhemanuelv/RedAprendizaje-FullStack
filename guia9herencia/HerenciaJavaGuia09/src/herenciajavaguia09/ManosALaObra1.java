package herenciajavaguia09;

import herenciajavaguia09.Entities.Animal;
import herenciajavaguia09.Entities.Caballo;
import herenciajavaguia09.Entities.Gato;
import herenciajavaguia09.Entities.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Xhemanuelv
 */
public class ManosALaObra1 {

    /**
     * EJERCICIO ANIMAL Vamos a crear una clase Animal que tenga un método
     * hacerRuido() que devuelva un saludo “Hola”. Luego haremos clase Perro y
     * clase Gato que extiendan de Animal y sobreescriban el método hacerRuido()
     * con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
     * un ArrayList de animales y los siguientes animales Animal a = new
     * Animal(); Animal b = new Perro(); Animal c = new Gato(); Agregaremos a la
     * lista a cada uno y luego, con un for each, recorreremos la lista llamando
     * al método hacerRuido() de cada ítem.
     *
     */
    /**
     * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
     * Caballo. La clase Animal tendrá como atributos el nombre, alimento, edad
     * y raza del Animal. Crear un método en la clase Animal a través del cual
     * cada clase hija deberá mostrar luego un mensaje por pantalla informando
     * de que se alimenta. Generar una clase Main que realice lo siguiente:
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro = new Perro("Fido", "Carnivoro", 8, "Bulldog");
        Animal gato = new Gato("Pelusa", "Croquetas", 6, "Tabi");
        Animal caballo = new Caballo("Spark", "Heno", 9, "Fino");
        
        List<String> lista=new ArrayList();
        System.out.println("Ruido del animal");
        System.out.println(perro.hacerRuido());
        System.out.println(gato.hacerRuido());
        System.out.println(caballo.hacerRuido());
        System.out.println("Dieta de cada animal");
        perro.Alimentarse();
        gato.Alimentarse();
        caballo.Alimentarse();
    }

}
