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

public class Analisis_BFP {

    // Constantes
    static double porcentaje_cumplimiento = 0.9;
    static double cero = 0.0;
    static char falso = ' ';
    static char verdadero = 'X';
    static double valor_primer_tope_imcumplimiento = 0.75;
    static double factor_primer_tope_imcumplimiento = 1.0;
    static double valor_segundo_tope_imcumplimiento = 0.90;
    static double factor_segundo_tope_imcumplimiento = 2.0;
    
    
    // Variables para BFP
    char FL_Notificar_Primer_incumplimiento = Analisis_BFP.falso;
    int Contador_BFP = 0;
    

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Analisis_BFP frm_ppal = new Analisis_BFP();
        
        
        frm_ppal.analisis(
                // Entradas
                0,          // contador FP
                0.7,        // Factor Potencia
                frm_ppal.falso,                                 // Primer Incumplimiento Notificado
                // Salidas
                frm_ppal.FL_Notificar_Primer_incumplimiento,
                frm_ppal.Contador_BFP);   // Se debe notificar primer incumplimiento
        
        
    }
    
    private double calcular_importe_bfp(double i_Importe_Energia, double i_valor_FP)
    {
        double o_importe;
        double aux_FP;
        o_importe = 0;
        if (i_valor_FP >=  Analisis_BFP.valor_primer_tope_imcumplimiento)
        {
            aux_FP = i_valor_FP -  Analisis_BFP.valor_primer_tope_imcumplimiento;
            o_importe = i_Importe_Energia * aux_FP * Analisis_BFP.factor_segundo_tope_imcumplimiento
            aux_FP = Analisis_BFP.valor_primer_tope_imcumplimiento;
        }
        else
        {
            aux_FP = i_valor_FP;
        }
        o_importe = o_importe + i_Importe_Energia * aux_FP * Analisis_BFP.factor_primer_tope_imcumplimiento        
    }
    
    public void analisis(int i_contador_BFP, double i_valor_FP
                         ,char i_Primer_Incumplmiento_Notificado
                         ,double i_Importe_Energia
                         ,double i_valor_acumulado
            
                         ,char o_FL_Notificar_Primer_Incumplimiento
                         ,int o_Contador_BFP
                         ,double o_valor_acumulado
                         )
    {
        if (i_valor_FP < cero)
            return ;
        o_Contador_BFP = i_contador_BFP; 
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
                    o_FL_Notificar_Primer_Incumplimiento = verdadero;
                    o_Contador_BFP = 1;
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
                o_Contador_BFP ++;
                if (i_valor_FP < porcentaje_cumplimiento)
                {
                    if (i_Primer_Incumplmiento_Notificado == Analisis_BFP.verdadero)
                    {
                        /*  
                         *  Calcular importe a cobrar 
                         *    Los primeros 0.75 tienen una % de multa incumplimiento
                         *    De ahi en adelante tienen otro % de multa incumplimiento
                        */
                        o_valor_acumulado = i_valor_acumulado = calcular_importe_bfp(i_Importe_Energia);
                    }            
                }
            case 5:
        }
    }
    
}
