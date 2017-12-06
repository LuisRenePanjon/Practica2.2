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

    public Atleta() {
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
    
    public void asignarDatos(String d) {
        int pos1 = 0;
        int pos2 = 0;

        for (int i = 0; i < d.length(); i++) {
            //System.out.println(""+d.charAt(i));
            if (d.charAt(i) == 124 && pos1 == 0) {
                pos1 = i;
            }
            if (d.charAt(i) == 124 && pos1 != 0) {
                pos2 = i;
            }
        }

        this.nonbYAp = d.substring(0, pos1 - 1);
        this.edad =Integer.parseInt(d.substring(pos1 + 2, pos2 - 1));
        this.cedula = d.substring(pos2 + 2, d.length());
        
    }

    @Override
    public String toString() {
        return   nonbYAp + "|" + edad + "|" + cedula;
    }
    
    
    
    
}
