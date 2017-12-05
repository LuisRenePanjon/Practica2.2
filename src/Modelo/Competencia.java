/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Abuelito
 */
public class Competencia {
    private String nombre;
    private String deporte;
    private String ciudad;
    private String categoria;

    public Competencia(String nombre, String deporte, String ciudad, String categoria) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.ciudad = ciudad;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nombre + "|" + deporte + "|" + ciudad + "|" + categoria ;
    }
    
    
    
    
}
