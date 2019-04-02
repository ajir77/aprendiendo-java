/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorpotencia;

/**
 *
 * @author ajiromes
 */
public class FactorPotencia {

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
    public char FL_Notificado_Primer_Incumplimiento;
    public char FL_Notificar_Reincidencia;
    public char FL_Notificado_Reincidencia;
    public int Contador_BFP;
    public double Penalizacion_Acumulada_BFP;
    public double Valor_BFP;
    public double Importe_Energia;
    public double Calculo_Mes;
    
    public int Contador_Reinicio;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FactorPotencia frm_ppal = new FactorPotencia();
        double FP_Base, FP_Variable;
        
        frm_ppal.Valor_BFP = 0.7;
        frm_ppal.Importe_Energia = 100.00;
        
        System.out.println("Hola BFP");
        
        frm_ppal.Imprimir();   
        frm_ppal.Valor_BFP = 0.7;
        frm_ppal.Importe_Energia = 100.00;
        for (int i=0;i <21;i++)
        {
            if (frm_ppal.FL_Notificar_Primer_Incumplimiento == verdadero)
            {
                frm_ppal.FL_Notificado_Primer_Incumplimiento = verdadero;
                frm_ppal.FL_Notificar_Primer_Incumplimiento = falso;
            }

            if (frm_ppal.FL_Notificar_Reincidencia == verdadero)
            {
                frm_ppal.FL_Notificado_Reincidencia = verdadero;
                frm_ppal.FL_Notificar_Reincidencia = falso;
            }
            
            if (i > 0)
            {
                if (i<6)
                {
                    FP_Base = 0.5;
                    FP_Variable = 0.3;
                }
                else if (i<11)
                {
                    FP_Base = 0.7;
                    FP_Variable = 0.3;
                }
                else
                {
                    FP_Base = 0.88;
                    FP_Variable = 0.12;                    
                }
                
                
                // BFP al azar..
                frm_ppal.Valor_BFP = FP_Base + (FP_Variable * Math.random());
                frm_ppal.Valor_BFP =  Math.round(frm_ppal.Valor_BFP * 100);
                frm_ppal.Valor_BFP /= 100;
                
                // Importe al azar..
                frm_ppal.Importe_Energia  =  100 + (50 * Math.random());
                frm_ppal.Importe_Energia  =  Math.round(frm_ppal.Importe_Energia*100) / 100;
            }
            
            frm_ppal.analisis(frm_ppal.Contador_BFP, 
                              frm_ppal.Valor_BFP, 
                              frm_ppal.FL_Notificado_Primer_Incumplimiento, 
                              frm_ppal.Importe_Energia, 
                              frm_ppal.Penalizacion_Acumulada_BFP,
                              frm_ppal.FL_Notificado_Reincidencia 
                        );

            frm_ppal.Imprimir();
        }
        
    }

    private FactorPotencia()
    {
        inicializar_proceso();
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
        o_importe  =  Math.round(o_importe*100);
        o_importe /= 100;
        return o_importe;
    }
    
    public void Imprimir()
    {
        System.out.println("**********************************************");

        System.out.print("Valor_BFP       = ");
        System.out.println(Valor_BFP);
        
        System.out.print("Importe_Energia = ");
        System.out.println(Importe_Energia);
        
        System.out.print("Calculo_Mes     = ");
        System.out.println(Calculo_Mes);

        System.out.print("Contador_BFP    = ");
        System.out.println(Contador_BFP);
        
        System.out.print("  FL_Notificar_Primer_Incumplimiento = ");
        System.out.println(FL_Notificar_Primer_Incumplimiento);
        System.out.print("  FL_Notificado_Primer_Incumplimiento = ");
        System.out.println(FL_Notificado_Primer_Incumplimiento);
        
        System.out.print("  Penalizacion_Acumulada_BFP = ");
        System.out.println(Penalizacion_Acumulada_BFP);

        if (Contador_BFP>4)
        {
            System.out.print("    FL_Notificar_Reincidencia = ");
            System.out.println(FL_Notificar_Reincidencia);
            System.out.print("    FL_Notificado_Reincidencia = ");
            System.out.println(FL_Notificado_Reincidencia);

            System.out.print("    Contador_Reinicio = ");
            System.out.println(Contador_Reinicio);
            
        }
        
        System.out.println("**********************************************");
        
    }

    public void inicializar_proceso()
    {
        Contador_BFP = 0;
        FL_Notificar_Primer_Incumplimiento = falso;
        FL_Notificado_Primer_Incumplimiento = falso;
        
        FL_Notificar_Reincidencia = falso;
        FL_Notificado_Reincidencia = falso;

        Penalizacion_Acumulada_BFP = 0.0;
        Calculo_Mes = 0.0;
        
        Valor_BFP = 0.0;
        Importe_Energia = 0.00;
        
        Contador_Reinicio = 0;
        
    }
    
    public void analisis(int i_contador_BFP
                         ,double i_valor_FP
                         ,char i_Primer_Incumplmiento_Notificado
                         ,double i_Importe_Energia
                         ,double i_valor_acumulado
                         ,char i_Reincidencia_Notificado
    )
    {
        if (i_valor_FP <= cero)
            return ;
        Calculo_Mes = calcular_importe_bfp(i_Importe_Energia, i_valor_FP);
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
                
            case 1:
            case 2:
            case 3:
            case 4: /*
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
                         *  Acumular Importe a Cobrar para Periodo 5
                        */
                        Penalizacion_Acumulada_BFP = i_valor_acumulado + Calculo_Mes;
                    }            
                }
                break;
                
            case 5:
                /*
                * Llega al primer punto de analisis,
                * Si incumple se cobra junto con acumulado  
                * Si cumple no se cobra mes ni acumulado
                * Se inicia periodo de reincidencia
                */
                Contador_BFP ++;
                if (i_valor_FP < porcentaje_cumplimiento) /* No cumple */
                {
                    Penalizacion_Acumulada_BFP = i_valor_acumulado + Calculo_Mes;
                    System.out.println("-------------------------------------");
                    System.out.print("SE COBRA AL CLIENTE = ");
                    System.out.println(Penalizacion_Acumulada_BFP);
                    System.out.println("-------------------------------------");
                    Penalizacion_Acumulada_BFP = 0.0;
                    FL_Notificado_Reincidencia = verdadero;
                }
                else
                {
                    System.out.println("-------------------------------------");
                    System.out.println("SIN COBRO AL CLIENTE ");
                    System.out.println("-------------------------------------");
                    Penalizacion_Acumulada_BFP = 0.0;
                }
                Contador_Reinicio = 0; /* Inicializar el contador para re-inicio del proceso */
                break;
                
            default:
                Contador_BFP ++;
                if (i_valor_FP < porcentaje_cumplimiento) /* No cumple */
                {
                    Contador_Reinicio = 0;
                    if (FL_Notificado_Reincidencia == verdadero)
                    {
                        System.out.println("-------------------------------------");
                        System.out.print("SE COBRA AL CLIENTE = ");
                        System.out.println(Calculo_Mes);
                        System.out.println("-------------------------------------");
                    }
                    else
                    {
                        /*
                         * Esperar a que se notifique la reincidencia
                         */
                        System.out.println("-------------------------------------");
                        System.out.println("Esperar que se notifique Reincidencia! ");
                        System.out.println("-------------------------------------");
                        FL_Notificar_Reincidencia = verdadero;
                    }
                }
                else /* Cumple */
                {
                    Contador_Reinicio ++;
                    if (Contador_Reinicio>=6)
                    {
                        /*
                         * Finaliza todo el proceso y debe volver a empezar
                        */
                        inicializar_proceso();                        
                    }
                }
                break;                    
        }
    }

}
