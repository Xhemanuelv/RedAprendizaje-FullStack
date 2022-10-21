
package guia07ExtraPlus.services;

import guia07ExtraPlus.entities.SopaDeLetras;

/**
 *
 * @author Xhemanuelv
 */
public class SopaDeLetraServices {

    public SopaDeLetras cargarPalabras(){
        String palabrasSopa[]={"PERRO","ABRAN","ACUSO","BAJAS","BAÑES","BODAS","ASNOS","ALTOS","BONOS","ARCES","ACUÑO","ALMAS","ANDES","BESOS","BEBES","BATÍS","BESEN","BOGAS","ALIAS","BOTEN",};
        int palabraAsignada[]=new int[20];
        String palabraAdescomponer;
        char letterSoup[][]=new char[10][10];
        //asigna aleatoriamente la "palabra predeterminada" 1 en 20 chances de repetir palabra o Math.rnd dependiente
        for (int i = 0; i < 20; i++) {
            palabraAsignada[i]=(int) (Math.random()*20);
        }
        //asigna q palabra le toca a char[][] matrix y pasa caracter a caracter
        for (int i = 0; i < 20; i++) {
            palabraAdescomponer=palabrasSopa[palabraAsignada[i]];
            System.out.println(palabraAdescomponer);//palabras repetidas 3 veces en 1 ejecucion cambiar aleatorio 
//            for (int j = 0; j < 5; j++) {
//                
//            }
        }
        return new  SopaDeLetras(letterSoup);
    }
}
