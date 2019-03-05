/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author ajiromes
 */
public class Rectangulo {
    private int base;
    private int altura;
    private int area;
    
    public Rectangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void Operacion(){
        area = base * altura;
    }
    
    public void Imprimir(){
        Operacion();
        System.out.println("El area del rectangulo es "+ area);
    }
    
}
