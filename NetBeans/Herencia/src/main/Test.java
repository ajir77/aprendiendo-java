/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import operaciones.*;

/**
 *
 * @author ajiromes
 */
public class Test {
    public static void main(String[] args) {
        ClaseHija_Suma  sumita = new ClaseHija_Suma();
        ClaseHija_Resta restita = new ClaseHija_Resta();
        
        sumita.PedirDatos();
        sumita.Sumar();
        sumita.MostrarResultado();
        
        restita.PedirDatos();
        restita.Restar();
        restita.MostrarResultado();
        
    }
}
