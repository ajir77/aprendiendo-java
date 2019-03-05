/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.Scanner;

/**
 *
 * @author ajiromes
 */
public abstract class Operaciones_ClasePadre {

    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos() {
        System.out.print("Dame el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.print("Dame el segundo valor: ");
        valor2 = entrada.nextInt();

    }
    public abstract void Operaciones();
        
    // Este metodo imprime el resultado
    public void MostrarResultado(){
        System.out.println("El resultado es: "+resultado);
    }
    
}
