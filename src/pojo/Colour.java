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
public class Colour {
    private int id;
    private String nombre;
    private boolean rojo;
    private boolean verde;
    private boolean azul;

    public Colour() {
    }

    public Colour(int id, String nombre, boolean rojo, boolean verde, boolean azul) {
        this.id = id;
        this.nombre = nombre;
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRojo() {
        return rojo;
    }

    public void setRojo(boolean rojo) {
        this.rojo = rojo;
    }

    public boolean isVerde() {
        return verde;
    }

    public void setVerde(boolean verde) {
        this.verde = verde;
    }

    public boolean isAzul() {
        return azul;
    }

    public void setAzul(boolean azul) {
        this.azul = azul;
    }
    
    
    
}
