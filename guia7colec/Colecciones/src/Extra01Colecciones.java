import java.util.ArrayList;
import java.util.Scanner;

public class Extra01Colecciones {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros=new ArrayList<>();
        Scanner leer=new Scanner(System.in);
        int ingreso;
        do {
            System.out.println("Ingrese un numero");
            ingreso=leer.nextInt();
            if (ingreso!=(-99)){
                listaNumeros.add(ingreso);
            }
        }while (ingreso!=(-99));

        System.out.println("los numeros guardados son");
        for (Integer aux : listaNumeros) {
            System.out.println(aux);
        }
        int suma=0,denom=0;
        for (Integer aux : listaNumeros) {
            suma=suma+aux;
            denom++;
        }
        System.out.println("La suma de los numeros es :"+ suma);
        System.out.println("El promedio de los numeros introducidos es "+(suma/denom));

    }
}