/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasedivision;

import java.util.Scanner;

/**
 *
 * @author ajiromes
 */
public class ClaseDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Dame el valor 1:");
            int valor1 = entrada.nextInt();

            System.out.println("Dame el valor 2:");
            int valor2 = entrada.nextInt();

            int resultado = valor1 / valor2;

            System.out.println("El resultado es :" + resultado);
        } catch (Exception e) {
            System.out.println("Error!!! "+ e);
        } finally {
            System.out.println("Operacion Concluida!");
        }

    }

}
