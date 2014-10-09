/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojo;

/**
 *
 * @author Papi
 */
public class PruebaCientificaLoro {
    private PruebaCientifica pruebaCientifica;
    private Loro loro;
    private boolean passed;

    public PruebaCientificaLoro() {
    }

    public PruebaCientificaLoro(PruebaCientifica pruebaCientifica, Loro loro, boolean passed) {
        this.pruebaCientifica = pruebaCientifica;
        this.loro = loro;
        this.passed = passed;
    }

    public PruebaCientifica getPruebaCientifica() {
        return pruebaCientifica;
    }

    public void setPruebaCientifica(PruebaCientifica pruebaCientifica) {
        this.pruebaCientifica = pruebaCientifica;
    }

    public Loro getLoro() {
        return loro;
    }

    public void setLoro(Loro loro) {
        this.loro = loro;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
    
    
}
