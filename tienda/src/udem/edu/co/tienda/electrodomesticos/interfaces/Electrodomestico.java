/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.tienda.electrodomesticos.interfaces;

/**
 *
 * @author DisCor
 */
public abstract class Electrodomestico {
 
//definicion de cosntantes 
    protected final static float PRECIO_DEF=1000000;
    protected final static String COLOR_DEF="Blanco";
    protected final static String CONSUMO_DEF="F";
    protected final static float PESO_DEF=5;
    
    
//Atributos de la super-clase 
    private float precio;
    private String color;
    private String consumo;
    private float peso;

    //constructor por defecto
    public Electrodomestico() {
        this.precio = PRECIO_DEF;
        this.color = COLOR_DEF;
        this.consumo = CONSUMO_DEF;
        this.peso = PESO_DEF;
    }
    
    /**
     * Constructor con los 4 parametros
     * @param precio
     * @param color
     * @param consumo
     * @param peso 
     */
    public Electrodomestico(float precio, String color, String consumo, float peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
     
}
