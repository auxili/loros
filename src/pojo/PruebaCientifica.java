/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojo;

import java.util.List;

/**
 *
 * @author Papi
 */
public class PruebaCientifica {
    private int id;
    private int nombre;
    private List <PruebaCientificaLoro> pruebaCientificaLoro;

    public PruebaCientifica(int id, int nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public PruebaCientifica() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
}
