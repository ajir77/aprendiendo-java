/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import java.util.Scanner;

/**
 *
 * @author ajiromes
 */
public class RectanguloMain {
        
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame la base:");
        int base = entrada.nextInt();

        System.out.println("Dame la altura:");
        int altura = entrada.nextInt();

        Rectangulo rectangulo = new Rectangulo(base, altura);
        rectangulo.Imprimir();
    }
}
