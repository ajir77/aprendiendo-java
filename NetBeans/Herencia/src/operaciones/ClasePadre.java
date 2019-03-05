/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;
import java.util.Scanner;
/**
 *
 * @author ajiromes
 */
public class ClasePadre {
    protected int operandoUno;
    protected int operandoDos;
    protected int resultado;
    Scanner entrada = new Scanner(System.in);

    // Este metodo pide los valores al usuario
    public void PedirDatos(){
        System.out.println("Dame el primer valor: ");
        operandoUno = entrada.nextInt();
        
        System.out.println("Dame el segundo valor: ");
        operandoDos = entrada.nextInt();
        
    }
    
    // Este metodo imprime el resultado
    public void MostrarResultado(){
        System.out.println("El resultado es: " + resultado);
    }
}
