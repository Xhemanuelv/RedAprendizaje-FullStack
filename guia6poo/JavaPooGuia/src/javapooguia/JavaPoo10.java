package javapooguia;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author xhemanuelv
 */
public class JavaPoo10 {

    public static void main(String[] args) {

        ArrayList<Double> a = new ArrayList<>();
        ArrayList<Double> b = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            a.add(Math.random() * 10);

            //System.out.println((i + 1) + "" + a.get(i));
        }

        System.out.println("Arreglo A");
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + "" + a.get(i));
        }

        //ordenar Arraylist
        
        
        Collections.sort(a);

        
        for (int i = 0; i < 10; i++) {
            b.add(a.get(i));
        }
        for (int i = 10; i < 20; i++) {
            b.add(0.5);
        }
        System.out.println("Arreglo A");
        for (int i = 0; i < 50; i++) {
            System.out.println((i+1)+" "+a.get(i));
        }
        System.out.println("Arreglo B");
        for (int i = 0; i < 20; i++) {
            System.out.println((i+1)+" "+b.get(i));
    }
    }

}
