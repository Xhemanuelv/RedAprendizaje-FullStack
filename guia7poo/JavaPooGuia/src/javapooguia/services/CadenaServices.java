/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooguia.services;

import java.util.Scanner;
import javapooguia.entities.Cadena;

/**
 *
 * @author xhemanuelv
 */
public class CadenaServices {
    Scanner leer= new Scanner(System.in);
    public Cadena ingresarCadena(){
        System.out.println("Ingrese la frase");
        String phrase=leer.nextLine();
        return new Cadena(phrase,phrase.length());
    }
    
    public void mostrarVocales(Cadena palabra){
        char[] chArray;
        for (int i = 0; i < 10; i++) {
            
        }
    }
    public void invertirFrase(Cadena palabra){
        
    }
    public void vecesRepetido(String letra, Cadena palabra){
        
    }
    public void compararLongitud(String frase, Cadena palabra){
        
    }
    public void unirFrase(String frase,Cadena palabra){
        
    }
    public void reemplazar(String letra, Cadena palabra){
        
    }
    public void contiene(String letra,Cadena palabra){
        
    }
}
