import java.util.Scanner;
public class TestCase
{
  public static void main(String args[])
  {
    Scanner in_teclado = new Scanner(System.in);
    String Operacion = ""; 
    float numero1 =0, numero2 = 0, resultado = 2;
    
    System.out.println("******************************************************");
    System.out.println("*Aprendiendo JAVA        2019-02-06           AJIR 77*");
    System.out.println("*Bienvenido a Operaciones Matematicas con uso de Case*");
    System.out.println("******************************************************");
    System.out.println("");
    System.out.println("");
    
    System.out.println("Ingrese el Operador (+ - * /)");
    Operacion = in_teclado.nextLine();
    System.out.println("");
    
    System.out.println("Ingrese el 1er Numero");
    numero1 = in_teclado.nextFloat();
    System.out.println("");
    
    System.out.println("Ingrese el 2o Numero");
    numero2 = in_teclado.nextFloat();
    System.out.println("");

    switch(Operacion.toLowerCase())
    {
      case "+":
      case "suma":
      case "sumar":
        resultado = numero1 + numero2;
        System.out.println("El resultado de la suma de " + numero1 + " " + Operacion +" " + numero2 + " es " + resultado);
        break;
      case "-":
      case "restar":
      case "resta":
        resultado = numero1 - numero2;
        System.out.println("El resultado de la resta de " + numero1 + " " + Operacion +" " + numero2 + " es " + resultado);
        break;
      case "*":
      case "multiplica":
      case "multiplicar":
        resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion de " + numero1 + " " + Operacion +" " + numero2 + " es " + resultado);
        break;
      case "/":
      case "divide":
      case "dividir":
        resultado = numero1 / numero2;
        System.out.println("El resultado de la division de " + numero1 + " " + Operacion +" " + numero2 + " es " + resultado);
        break;
      default:
        System.out.println("Operacion \"" + Operacion + "\" no valida !! " + numero1 + " y " + numero2 );
        break;
    }
  }
}
