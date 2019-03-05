/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplouno;

import java.util.Scanner;

/**
 *
 * @author ajir77
 */
public class EjemploUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Cadena = "";
        String CadenaInvertida = "";
        int longitudCadena = 0;
        Scanner mi_teclado = new Scanner(System.in);
        
        System.out.println("Hola Ajir77");
        System.out.println("Esribe una Frase: ");
        Cadena = mi_teclado.nextLine();
        
        longitudCadena = Cadena.length();
        for (int i = longitudCadena; i>0; i--){
            CadenaInvertida += Cadena.substring(i - 1, i);
        }
        System.out.println(CadenaInvertida);
    }
}

   