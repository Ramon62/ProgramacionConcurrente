/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ramonserrano
 */
public class ModelRadio {
    
    private int bajar;
    private int subir;
    
    public int bajarVolumen(int valor){
        bajar=valor-1;
        return bajar;
        
    }
    
    public int subirVolumen(int valor){
        subir = valor-1;
        return subir;
    }

    public int getBajar() {
        return bajar;
    }

    public int getSubir() {
        return subir;
    }

    public void setBajar(int bajar) {
        this.bajar = bajar;
    }

    public void setSubir(int subir) {
        this.subir = subir;
    }
    
    
    
}
