/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ajiromes
 */
public class ClaseHija_Retiro extends ClasePadre_Abstracta{
    @Override
    public void Transacciones(){
        System.out.print("Cuanto deseas retirar? ");
        Retiro();
        if (getSaldo() > retiro){
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("------------------------------" );
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu Saldo actual es "+ getSaldo());
            System.out.println("------------------------------" );
        }
        else{
            System.out.println("------------------------------" );
            System.out.println("Saldo Insuficiente" );
            System.out.println("------------------------------" );
        }   
    }
}
