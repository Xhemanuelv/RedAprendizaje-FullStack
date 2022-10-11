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
public class JavaAprendizaje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/
        Scanner leer = new Scanner(System.in);
        String fde = "&&&&&";
        String entrada;
        int correctas=0, incorrectas=0;

        boolean bandera1=false;
        boolean bandera2=false;
        boolean bandera3=false;
        do {
            System.out.println("Ingrese una frase");
            entrada = leer.next();
            if ("X".equals(entrada.substring(0, 1))) {
                bandera1=true;
            }
            if ("O".equals(entrada.substring(4, 5))) {
                bandera2=true;
            }
            if (entrada.length()==5) {
                bandera3=true;
            }
            if (bandera1&&bandera2&&bandera3) {
                correctas+=1;
            }else{
                incorrectas+=1;
            }
            
        } while (!entrada.equals(fde));
        System.out.println("Se registraron "+correctas+" entradas correctas y "+incorrectas+" entradas incorrectas");
    }
    
}
