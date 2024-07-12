/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.organizacion.modelo;

import java.io.Serializable;

/**
 *
 * @author ggp20
 */
public class Producto implements Serializable{
    
    //Atributos
    private String nombre;
    private int existencias;
    private double precio;
    
    //Métodos

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", existencias=" + existencias + ", precio=" + precio + '}';
    }

    public Producto() {
    }

    public Producto(String nombre, int existencias, double precio) {
        this.nombre = nombre;
        this.existencias = existencias;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
