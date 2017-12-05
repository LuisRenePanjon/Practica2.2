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
public class Atleta {
    private String nonbYAp;
    private int edad;
    private String cedula;

    public Atleta(String nonbYAp, int edad, String cedula) {
        this.nonbYAp = nonbYAp;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNonbYAp() {
        return nonbYAp;
    }

    public void setNonbYAp(String nonbYAp) {
        this.nonbYAp = nonbYAp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    
    
}
