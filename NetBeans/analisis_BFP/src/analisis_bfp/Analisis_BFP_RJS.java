/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis_bfp;

/**
 *
 * @author ajiromes
 */

public class Analisis_BFP_RJS{

    // Constantes (valores que no van a cambiar)
    static double porcentaje_cumplimiento = 0.9;
    static double cero = 0.0;
    static char falso = ' ';
    static char verdadero = 'X';
    static double valor_primer_tope_imcumplimiento = 0.75;
    static double factor_primer_tope_imcumplimiento = 1.0;
    static double valor_segundo_tope_imcumplimiento = 0.90;
    static double factor_segundo_tope_imcumplimiento = 2.0;
    
    
    // Variables para BFP
    public char FL_Notificar_Primer_Incumplimiento;
    public int Contador_BFP;
    public double Penalizacion_Acumulada_BFP;
    

/**
* @param args the command line arguments
*/
    public static void main(String[] args) {

        Analisis_BFP_RJS frm_ppal = new Analisis_BFP_RJS();
        double valor_BFP;
        double importe_Energia;        
        
        frm_ppal.Contador_BFP = 0;
        frm_ppal.FL_Notificar_Primer_Incumplimiento = Analisis_BFP_RJS.falso;
        frm_ppal.Penalizacion_Acumulada_BFP = 0.0;
        
        valor_BFP = 0.7;
        importe_Energia = 100.00;
        
        frm_ppal.analisis(
                // Entradas
                frm_ppal.Contador_BFP,                              // contador FP
                valor_BFP,                                          // Factor Potencia
                frm_ppal.FL_Notificar_Primer_Incumplimiento,        // Primer Incumplimiento Notificado
                importe_Energia,                                    // Importe Energia MES
                frm_ppal.Penalizacion_Acumulada_BFP                 // Penalizacion Acumulada
                
                );   
        
        
    }
    
    private Analisis_BFP_RJS()
    {
        
    }
    
    public void analisis(int i_contador_BFP
                         ,double i_valor_FP
                         ,char i_Primer_Incumplmiento_Notificado
                         ,double i_Importe_Energia
                         ,double i_valor_acumulado
            

    )
    {
        if (i_valor_FP < cero)
            return ;
        Contador_BFP = i_contador_BFP; 
        switch (i_contador_BFP)
        {
            case 0:  /*
                      * 
                      * Se verifica si incumple por primera vez para 
                      * enviar la notificacion al cliente.
                      * CRM valida si debe notificar y cuando envie la notificacion
                      * marca el FL Primer_incumplimiento_notificado
                      */
                if (i_valor_FP < porcentaje_cumplimiento)
                {
                    FL_Notificar_Primer_Incumplimiento = verdadero;
                    Contador_BFP = 1;
                }
                else
                {
                    // No hacer nada sigue a la espera que incumpla con el Factor de Potencia
                }
                break;    
                
            case 1 - 4: /*
                         * Si imcumple se acumula el importe a cobrar
                         * Si cumple no se acumula 
                         *
                         */
                Contador_BFP ++;
                if (i_valor_FP < porcentaje_cumplimiento)
                {
                    if (i_Primer_Incumplmiento_Notificado == verdadero)
                    {
                        /*  
                         *  Calcular importe a cobrar 
                         *    Los primeros 0.75 tienen una % de multa incumplimiento
                         *    De ahi en adelante tienen otro % de multa incumplimiento
                        */
                        Penalizacion_Acumulada_BFP = i_valor_acumulado = calcular_importe_bfp(i_Importe_Energia, i_valor_FP);
                    }            
                }
            case 5:
        }
    }

    private double calcular_importe_bfp(double i_Importe_Energia, double i_valor_FP)
    {
        double o_importe;
        double aux_FP;
        o_importe = 0.00;
        if (i_valor_FP >=  valor_primer_tope_imcumplimiento)
        {
            aux_FP = i_valor_FP - valor_primer_tope_imcumplimiento;
            o_importe = i_Importe_Energia * aux_FP * factor_segundo_tope_imcumplimiento;
            aux_FP = valor_primer_tope_imcumplimiento;
        }
        else
        {
            aux_FP = i_valor_FP;
        }
        o_importe = o_importe + i_Importe_Energia * aux_FP * factor_primer_tope_imcumplimiento;
        return o_importe;
    }
    
    
}
