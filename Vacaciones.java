import java.util.Scanner;
public class Vacaciones
{
  public static void main (String args[])
  {
    Scanner in_teclado = new Scanner(System.in);
    String nombre = "";
    int clave = 0;
    int antiguedad = 0;
    
    System.out.println("********************************************************");
    System.out.println("*Bienvenido al sistema de vaciones de Coca-Cola Company*");
    System.out.println("********************************************************");
    System.out.println("");
    System.out.println("");
    
    
    System.out.println("Dame el nombre del trabajador:");
    nombre = in_teclado.nextLine();
    System.out.println("");
    
    System.out.println("Dame la antiguedad del trabajador:");
    antiguedad = in_teclado.nextInt();
    System.out.println("");
    
    System.out.println("Dame la clave del trabajador:");
    clave = in_teclado.nextInt();
    System.out.println("");
    
    if (clave == 1)
    {
      if (antiguedad >= 7)
      {
        System.out.println(nombre + " tiene derecho a 20 dias de vacaciones");
      }
      else if (antiguedad >= 2)
      {
        System.out.println(nombre + " tiene derecho a 14 dias de vacaciones");
      }
      else if (antiguedad >= 1)
      {
        System.out.println(nombre + " tiene derecho a 7 dias de vacaciones");
      }
    }
    else if (clave == 2)
    {
      if (antiguedad >= 7)
      {
        System.out.println(nombre + " tiene derecho a 22 dias de vacaciones");
      }
      else if (antiguedad >= 2)
      {
        System.out.println(nombre + " tiene derecho a 15 dias de vacaciones");
      }
      else if (antiguedad >= 1)
      {
        System.out.println(nombre + " tiene derecho a 7 dias de vacaciones");
      }
    }
    else if (clave == 3)
    {
      if (antiguedad >= 7)
      {
        System.out.println(nombre + " tiene derecho a 30 dias de vacaciones");
      }
      else if (antiguedad >= 2)
      {
        System.out.println(nombre + " tiene derecho a 20 dias de vacaciones");
      }
      else if (antiguedad >= 1)
      {
        System.out.println(nombre + " tiene derecho a 10 dias de vacaciones");
      }
    }
    else
    {
      System.out.println(nombre + " Clave no existe");
    }

  }
}
