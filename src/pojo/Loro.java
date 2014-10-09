/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojo;

import java.util.List;

/**
 *
 * @author KIke
 */
public class Loro {
    private int id;
    private String name;
    private int size;
    private Colour colour;
    private List <PruebaCientificaLoro> pruebaCientificaLoro;

    public Loro() {
    }

    public Loro(int id, String name, int size, Colour colour) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.colour = colour;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the colour
     */
    public Colour getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(Colour colour) {
        this.colour = colour;
    }

}

