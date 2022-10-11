package javapooguia;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author xhemanuelv
 */
public class JavaPoo09 {

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

        System.out.println("Arreglo A");
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + "" + a.get(i));
        }

        for (int i = 0; i < 10; i++) {

        }
    }

}
