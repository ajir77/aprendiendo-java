public class Promedio
{
  public static void main(String args[])
  {
    int matematicas = 5;
    int biologia = 4;
    int quimica = 6;
    int promedio = 0;
    
    promedio = (matematicas + biologia + quimica) / 3;
    if (promedio >= 6)
    {
      System.out.println("El alumno aprobo con promedio de:" + promedio);
    }  
    else
    {
      System.out.println("El alumno reaprobo con promedio de:" + promedio);
    }
  }
}