package javapooguia;

import javapooguia.entities.Matematica;
import javapooguia.services.MatematicaServices;

/**
 *
 * @author xhemanuelv
 */
public class JavaPoo09 {

    public static void main(String[] args) {
        //matematicas
        double rnd1=Math.random() * 10+1,rnd2=Math.random() * 10+1;
        Matematica data=new Matematica(rnd1,rnd2);
        MatematicaServices matServ=new MatematicaServices();
        System.out.println(data);
        System.out.println("El mayor de los numeros es: "+ matServ.devolverMayor(data));
        matServ.calcularPotencia(data);
        matServ.calculaRaiz(data);
    
    }

}
