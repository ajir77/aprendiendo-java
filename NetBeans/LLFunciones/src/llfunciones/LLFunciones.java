/*
 * Clase para las funciones logicas de una lavadora
 */
package llfunciones;

/**
 *
 * @author ajir77
 */
public class LLFunciones {

    private int kilos;
    private int tipoDeRopa = 0; // 0 Sin Definit; 1 Ropa Blanca; 2 Ropa de Color
    private int llenadoCompleto = 0; // 0 No se ha llenado; 1 ya se lleno
    private int lavadoCompleto = 0; // 0 InCompleto; 1 Completo
    private int secadoCompleto = 0; // 0 InCompleto; 1 Completo

    public LLFunciones(int kilos, int tipoDeRopa) {
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;

    }

    private void Llenado() {
        llenadoCompleto = 1;
    }

    private void Lavado() {
        lavadoCompleto = 1;
    }

    private void Secado() {
        secadoCompleto = 1;
    }

    public void CicloCompletado() {
        llenadoCompleto = 0;
        lavadoCompleto = 0;
        secadoCompleto = 0;

        while (llenadoCompleto == 0) {
            Llenado();
        }

        while (lavadoCompleto == 0) {
            Lavado();
        }

        while (secadoCompleto == 0) {
            Secado();
        }
    }

    /**
     * @return the kilos
     */
    public int getKilos() {
        return kilos;
    }

    /**
     * @param kilos the kilos to set
     */
    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    /**
     * @return the tipoDeRopa
     */
    public int getTipoDeRopa() {
        return tipoDeRopa;
    }

    /**
     * @param tipoDeRopa the tipoDeRopa to set
     */
    public void setTipoDeRopa(int tipoDeRopa) {
        this.tipoDeRopa = tipoDeRopa;
    }

}
