import java.util.Scanner;
public class Fibonacci
{
  public static void main(String args[])
  {
    Scanner in_teclado = new Scanner(System.in);
    int longitud_serie = 0;
    int antecesor = 0;
    int predecesor = 1;
    int auxiliar = 0;
    
    System.out.println("******************************************************");
    System.out.println("*Aprendiendo JAVA        2019-02-06           AJIR 77*");
    System.out.println("*Bienvenido a Fibonacci / Ciclos For`                *");
    System.out.println("******************************************************");
    System.out.println("");
    System.out.println("");
    
    System.out.println("Cual es la longitud de la serie Fibonaci que desea calcular?");
    //longitud_serie = 10;
    longitud_serie = in_teclado.nextInt();
    System.out.println("");
    
    
    System.out.print( antecesor);
    for (int i=1; i < longitud_serie; i++)
    {
      System.out.print( ", " + predecesor);
      auxiliar = antecesor;
      antecesor = predecesor;
      predecesor = predecesor + auxiliar; // auxiliar contiene el numero antesesor original 
    }
  }
}