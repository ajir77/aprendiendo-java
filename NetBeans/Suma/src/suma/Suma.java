/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

/**
 *
 * @author ajiromes
 */
public class Suma {
    private int vUno, vDos, vRes;
    public Suma(int vUno, int vDos)
    {
        this.vUno = vUno;
        this.vDos = vDos;
        
    }
    public void Operacion(){
        vRes = vUno + vDos;
    }
    public void Imprimir()
    {
        Operacion();
        System.out.println("El resultado de la suma " + vRes);
    }
}
