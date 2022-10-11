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
    /*      a e i o u
            @ # $ % *
     */
    public static void main(String[] args) {
        String textoCodificado = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase: ");
        String textoUsuario = leer.nextLine();

        while (textoUsuario.charAt(textoUsuario.length() - 1) != '.') {
            System.out.println("La frase debe terminar en punto");
            textoUsuario = leer.nextLine();
        }
        char[] textoUsuarioArray = textoUsuario.toCharArray();
        char enigma;
        for (int i = 0; i < textoUsuarioArray.length; i++) {
            enigma = codificarSecuencia(textoUsuarioArray[i]);
            textoCodificado += enigma;
//            if (i + 1 == textoUsuarioArray.length) {
//                textoCodificado += ".";
//            }
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
