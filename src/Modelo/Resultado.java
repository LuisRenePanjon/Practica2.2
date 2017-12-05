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
public class Resultado {
    private int puesto;
    private Atleta atleta;
    private Competencia competencia;

    public Resultado(int puesto, Atleta atleta, Competencia competencia) {
        this.puesto = puesto;
        this.atleta = atleta;
        this.competencia = competencia;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }
    
    
    
}
