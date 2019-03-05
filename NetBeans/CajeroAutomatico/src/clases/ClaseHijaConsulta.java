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
public class ClaseHijaConsulta extends ClasePadre_Abstracta{
    @Override
    public void Transacciones(){
        System.out.println("--------------------------");
        System.out.println("Tu Saldo es "+getSaldo());
        System.out.println("--------------------------");
    }
}
