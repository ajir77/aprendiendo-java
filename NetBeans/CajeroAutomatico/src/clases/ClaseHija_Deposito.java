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
public class ClaseHija_Deposito extends ClasePadre_Abstracta{
    @Override
    public void Transacciones(){
        System.out.println("Cuando vas a depositar");
        Deposito();
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("------------------------------" );
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu Saldo actual es "+ getSaldo());
        System.out.println("------------------------------" );        
    }
}
