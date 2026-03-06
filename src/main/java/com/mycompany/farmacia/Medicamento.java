/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmacia;

import java.time.LocalDate;

/**
 *
 * @author atp09
 */
public class Medicamento {
    private String nombre;
    private String laboratorio;
    private boolean generico;
    private int codigoBarras;
    private float costo;
    private float precioPublico;
    private LocalDate fechaFabricacion;
    private LocalDate fechaCaducidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public boolean isGenerico() {
        return generico;
    }

    public void setGenerico(boolean generico) {
        this.generico = generico;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(float precioPublico) {
        this.precioPublico = precioPublico;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    
    //methods
     //aumentar % de precio publico
    public void aumento(float porcentajePP, float porcentajeC){
        precioPublico = precioPublico + (precioPublico*(porcentajePP/100));
        costo = costo + (costo*(porcentajeC/100));
    }

    @Override
    public String toString() {
        return "Medicamento{" + "nombre=" + nombre + ", laboratorio=" + laboratorio + ", precioPublico=" + precioPublico+", generico=" + generico + ", codigoBarras=" + codigoBarras  + '}';
    }

  
    
    boolean patente(){
        if(generico == false){
        return true;    
        }
        else{
            return false;
        }
        
        
    }
    
    boolean Cgenerico(){
         if(generico == true){
        return true;    
        }
        else{
            return false;
        }
        
    }
    
    boolean compararNombre(String searchNombre){
        if(searchNombre.equals(nombre)){
            return true;
        } 
        else{
            return false;
        }
    }
    
   boolean compararCodigoBarras(int cbarras){
          if(cbarras == codigoBarras){
            return true;
        } 
        else{
            return false;
        }
   }
    
    
}
