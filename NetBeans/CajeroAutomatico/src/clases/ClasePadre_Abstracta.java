/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author ajiromes
 */
public abstract class ClasePadre_Abstracta {
    protected int transacciones, retiro, deposito;
    private static int saldo = 500;
    Scanner entrada = new Scanner(System.in);
    
    public void Operaciones(){
        int     bandera = 0, 
                seleccion = 0;
        
        do{
            System.out.println("Por favor seleccione una opcion:");
            System.out.println("\t 1. Consulta de Saldo");
            System.out.println("\t 2. Retiro de efetivo");
            System.out.println("\t 3. Deposito");
            System.out.println("\t 4. Salir");
            seleccion = entrada.nextInt();
            switch (seleccion){
                case 1:{
                        ClasePadre_Abstracta mensajero = new ClaseHijaConsulta();
                        mensajero.Transacciones();
                        break;
                }
                case 2:{
                        ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                        mensajero.Transacciones();
                        break;
                }
                case 3:{
                        ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                        mensajero.Transacciones();
                        break;
                }
                case 4:
                        bandera = 1;
                        break;
                default:
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("La seleccion debe ser del 1 al 4!, vuelva a intentar por favor");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            }
        }while(bandera == 0);
        System.out.println("=======================");
        System.out.println("Gracias, Vuelva Pronto!");
        System.out.println("=======================");
    }
    
    // Metodo para solicitar la cantidad de retiro
    public void Retiro(){
        retiro = entrada.nextInt();
    }
    
    // Metodo para solcitar Deposito
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    
    // Metodo abstracto
    public abstract void Transacciones();

    /**
     * @return the saldo
     */
    public static int getSaldo() {
        return saldo;
    }

    /**
     * @param aSaldo the saldo to set
     */
    public static void setSaldo(int aSaldo) {
        saldo = aSaldo;
    }
    
    
}
