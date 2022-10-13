package javapooguia;

import java.util.Scanner;
import javapooguia.entities.Cadena;
import javapooguia.services.CadenaServices;

/**
 *
 * @author xhemanuelv
 */
public class JavaPoo08 {

    public static void main(String[] args) {
        // cadenaService & cadena entity
            Scanner leer=new Scanner(System.in);
            CadenaServices cadserv=new CadenaServices();
            //Cadena palabra=cadserv.ingresarCadena();
            Cadena word=new Cadena();
            System.out.println("Ingrese frase a evaluar");
            word.setFrase(leer.nextLine());
            word.setLongitudFrase(word.getFrase().length());
            
            System.out.format("La frase tiene una longitud de %d caracteres",word.getLongitudFrase());
            cadserv.mostrarVocales(word);
            cadserv.invertirFrase(word);
            cadserv.vecesRepetido(word);
            cadserv.compararLongitud(word);
            System.out.println(word);
            cadserv.unirFrase(word);
            System.out.println(word);
            System.out.println("Ingrese letra a reemplazar");
            String letra=leer.next();
            cadserv.reemplazar(letra, word);
            boolean contenida=cadserv.contiene(word);
            System.out.println("La letra buscada se encuentra: "+contenida);
            
    }

}
