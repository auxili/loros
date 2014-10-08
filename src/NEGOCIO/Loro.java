/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NEGOCIO;

import java.util.List;

/**
 *
 * @author Papi
 */
public class Loro {
    private int idLoro;
    private boolean hasPrueba;
    private boolean hasPruebaOk;
    private String nombrePrueba;
    private String color;
    private int loroSize;

    public Loro() {
    
    }

    
    public Loro(int idLoro, boolean hasPrueba, boolean hasPruebaOk, String nombrePrueba, String color, int loroSize) {
        this.idLoro = idLoro;
        this.hasPrueba = hasPrueba;
        this.hasPruebaOk = hasPruebaOk;
        this.nombrePrueba = nombrePrueba;
        this.color = color;
        this.loroSize = loroSize;
    }

    /**
     * @return the idLoro
     */
    public int getIdLoro() {
        return idLoro;
    }

    /**
     * @param idLoro the idLoro to set
     */
    public void setIdLoro(int idLoro) {
        this.idLoro = idLoro;
    }

    /**
     * @return the hasPrueba
     */
    public boolean isHasPrueba() {
        return hasPrueba;
    }

    /**
     * @param hasPrueba the hasPrueba to set
     */
    public void setHasPrueba(boolean hasPrueba) {
        this.hasPrueba = hasPrueba;
    }

    /**
     * @return the hasPruebaOk
     */
    public boolean isHasPruebaOk() {
        return hasPruebaOk;
    }

    /**
     * @param hasPruebaOk the hasPruebaOk to set
     */
    public void setHasPruebaOk(boolean hasPruebaOk) {
        this.hasPruebaOk = hasPruebaOk;
    }

    /**
     * @return the nombrePrueba
     */
    public String getNombrePrueba() {
        return nombrePrueba;
    }

    /**
     * @param nombrePrueba the nombrePrueba to set
     */
    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the loroSize
     */
    public int getLoroSize() {
        return loroSize;
    }

    /**
     * @param loroSize the loroSize to set
     */
    public void setLoroSize(int loroSize) {
        this.loroSize = loroSize;
    }
    
    public List readAll(){
       List listaLoros=null;
       return listaLoros;
    }
    public List readOnlyPruebasDone(){
       List listaLoros=null;
       return listaLoros;
    }
    public void checkPruebaDone(){
        if (hasPrueba){
            readOnlyPruebasDone();
        }
    }
    
    
}
