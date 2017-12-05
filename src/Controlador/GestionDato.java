/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Atleta;
import Modelo.Competencia;
import Modelo.Resultado;
import java.util.List;

/**
 *
 * @author Abuelito
 */
public class GestionDato {
    private List<Atleta> listAtleta;
    private List<Competencia> listCompetencia;
    private List<Resultado> listResultado;

    public GestionDato(List<Atleta> listAtleta, List<Competencia> listCompetencia, List<Resultado> listResultado) {
        this.listAtleta = listAtleta;
        this.listCompetencia = listCompetencia;
        this.listResultado = listResultado;
    }

    public boolean addAtleta(Atleta a) {
        return this.listAtleta.add(a);
    }
    public boolean addCompetencia(Competencia c) {
        return this.listCompetencia.add(c);
    }
    public boolean addResultado(Resultado r) {
        return this.listResultado.add(r);
    }
    
    public List<Atleta> getListAtleta() {
        return listAtleta;
    }

    public void setListAtleta(List<Atleta> listAtleta) {
        this.listAtleta = listAtleta;
    }

    public List<Competencia> getListCompetencia() {
        return listCompetencia;
    }

    public void setListCompetencia(List<Competencia> listCompetencia) {
        this.listCompetencia = listCompetencia;
    }

    public List<Resultado> getListResultado() {
        return listResultado;
    }

    public void setListResultado(List<Resultado> listResultado) {
        this.listResultado = listResultado;
    }
    
    
    
    
}
