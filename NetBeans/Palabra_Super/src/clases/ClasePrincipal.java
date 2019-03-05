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
public class ClasePrincipal {
    public static void main(String[] args) {
        
        ClaseHija hija = new ClaseHija();
        hija.Saludar();
        System.out.println("");
        
        ClasePadre padre = new ClasePadre();
        padre.Saludar();
    }
}
