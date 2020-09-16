/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.tienda.electrodomesticos;

import udem.edu.co.tienda.electrodomesticos.interfaces.Electrodomestico;

/**
 *
 * @author DisCor
 */
public class Televisor extends Electrodomestico{
    //valor por defecto de la resolucion en pulgadas
    private final static int RESOLUCION_DEF=20;
    //Definicion del atributo resolucion
   
    private int resolucion;

    public Televisor() {
       super(PRECIO_DEF, COLOR_DEF, CONSUMO_DEF,PESO_DEF);
       this.resolucion = RESOLUCION_DEF;
    }

    public Televisor(int resolucion, float precio, String color, String consumo, float peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "El televisor tiene una " + "resolucion de " + this.getResolucion() + ", vale " +super.getPrecio()+", es de color "+super.getColor()+", tiene un consumo de "+super.getConsumo()+", pesa "+super.getPeso()+" KG";
    }
    
    
}
