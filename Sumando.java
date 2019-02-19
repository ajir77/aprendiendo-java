import java.util.Scanner;
public class Sumando
{
  public static void main(String args[])
  {
    Scanner in_teclado = new Scanner(System.in);
    String nombre = "";
    int numero1 = 0, numero2 = 0, resultado = 0;
    
    System.out.println("Cual es tu nombre?");
    nombre = in_teclado.nextLine();
    
    System.out.println("Dame el primer valor");
    numero1 = in_teclado.nextInt();
    
    System.out.println("Dame el segundo valor");
    numero2 = in_teclado.nextInt();
    
    resultado = numero1 + numero2;
    
    System.out.println("Hola " + nombre + " el resultado de tu suma es " + resultado );
  }
}