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
public class JavaIntroEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
    en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
    reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
    vocales acentuadas) se mantienen sin cambios.
        Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
    correspondiente. Utilice la estructura “según” para la transformación.*/
        String textoUsuario;
        String textoCodificado = "";
        Scanner leer = new Scanner(System.in);
        textoUsuario = leer.nextLine();
        char[] textoUsuarioArray = textoUsuario.toCharArray();
        for (int i = 0; i < textoUsuarioArray.length; i++) {
            char enigma;
            //enigma = codificarSecuencia(textoUsuario.charAt(i));
            //textoCodificado.concat();
            //textoCodificado = textoUsuario.replace(textoUsuario.charAt(i), enigma);

        }
        System.out.println(textoCodificado);
    }

    public static char codificarSecuencia(char plainChar) {
        char codedText;
        switch (plainChar) {
            case 'a':
                codedText = '@';
                break;
            case 'A':
                codedText = '@';
                break;
            case 'e':
                codedText = '#';
                break;
            case 'E':
                codedText = '#';
                break;
            case 'i':
                codedText = '$';
                break;
            case 'I':
                codedText = '$';
                break;
            case 'o':
                codedText = '%';
                break;
            case 'O':
                codedText = '%';
                break;
            case 'u':
                codedText = '*';
                break;
            case 'U':
                codedText = '*';
                break;
            default:
                codedText = plainChar;
        }
        return codedText;
    }
}
