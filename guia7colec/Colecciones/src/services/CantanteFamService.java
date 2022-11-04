package Services;

import Entities.CantanteFamoso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteFamService {

    public CantanteFamoso agregarCantante(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el nombre del cantante");
        String name= leer.nextLine();
        System.out.println("Ingrese el disco más vendido del cantante");
        String disk=leer.nextLine();
        return new CantanteFamoso(name,disk);
    }

    /**
     * Requiere referencia de un arraylist con los cantantes y discos
     * esto es ineficiente porque copia los valores, java no soporta punteros
     * o pasaje por valor
     * @param cantFamlist
     */
    public void mostrarCantantes(ArrayList<CantanteFamoso> cantFamlist){
        for (CantanteFamoso aux : cantFamlist) {
            System.out.println(aux.getNombreCantante() + " ~ " + aux.getDiscoMasVendido());
        }
    }

    public void eliminaCantante(ArrayList<CantanteFamoso> cantFamlist){
        Scanner leer=new Scanner(System.in);
        Iterator<CantanteFamoso> itCanFam=cantFamlist.iterator();
        System.out.println("Ingrese el nombre del cantante a eliminar");
        String canFamRem=leer.nextLine();
        while (itCanFam.hasNext()){
            if (itCanFam.next().getNombreCantante().equalsIgnoreCase(canFamRem)){
                itCanFam.remove();
            }

        }
    }
}
