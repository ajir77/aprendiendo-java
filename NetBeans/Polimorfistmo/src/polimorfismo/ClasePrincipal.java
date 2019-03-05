/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author ajiromes
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Operaciones_ClasePadre restita = new Resta_ClaseHija();
        Operaciones_ClasePadre sumita = new Suma_ClaseHija();
        
        restita.PedirDatos();
        restita.Operaciones();
        restita.MostrarResultado();
        
        sumita.PedirDatos();
        sumita.Operaciones();
        sumita.MostrarResultado();
        
    }
}
