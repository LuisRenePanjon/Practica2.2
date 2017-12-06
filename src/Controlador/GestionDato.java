/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Atleta;
import Modelo.Competencia;
import Modelo.Resultado;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
     public boolean persistirListPersona(List<Resultado> lista) {

        try {
            FileWriter ae = new FileWriter("E:/Practica2.txt");
            BufferedWriter escritura = new BufferedWriter(ae);
            int i;
            i = 0;
            for (Resultado p : this.listResultado) {
                escritura.append(p.toString());
                escritura.newLine();

            }
            escritura.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(GestionDato.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

      public Atleta buscarAtleta1(String txt) {
        Atleta retorno = null;
        int i = 0;
        for (Atleta at : this.listAtleta) {
            if (at.getNonbYAp().equals(txt)) {
                i++;
                return at;
            }
        }
        return retorno;
    }
      
    public Competencia buscarCompetencia1(String txt) {
        Competencia retorno = null;
        int i = 0;
        for (Competencia cm : this.listCompetencia) {
            if (cm.getNombre().equals(txt)) {
                i++;
                return cm;
            }
        }
        return retorno;
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
    
    public boolean buscarAtleta(String cedul) {

        boolean retorno = false;
        int i = 0;
        for (Atleta at : this.listAtleta) {
            if (at.getCedula().equals(cedul)) {
                i++;
                retorno = true;
            }
        }
        return retorno;
    }
    public boolean buscarCompetencia(String nom){
        boolean retorno = false;
        int i = 0;
        for (Competencia c : listCompetencia) {
            if(c.getNombre().equals(nom)){
                i++;
                retorno = true;
            }
        }
        return retorno;
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
