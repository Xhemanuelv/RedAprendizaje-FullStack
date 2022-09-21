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
public class JavaIntroVideo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la pelicula de 1 a 5 estrellas");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <=5)
        {
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no haya disfrutado la pelicula");
                    break;
                case 3:
                    System.out.println("Ha calificado la pelicula como buena");
                    break;
                case 4:
                    System.out.println("Ha calificado la pelicula como muy buena");
                    break;
                case 5:
                    System.out.println("Fantastico, nos alegra que haya disfrutado de la pelicula");
                    break;
            }       
            
        } else if (opinion<0){
            System.out.println("¿Una opinion negativa?¿Tan mala fue la pelicula?");
        } else if (opinion == 0){
            System.out.println("El valor " + opinion + " no es valido y no se tomara en cuenta");
        } else if (opinion >5){
            System.out.println("Su valoración de la pelicula excede los valores validos, pero nos alegra que disfrutara de la misma");
        }
    }
    
}
