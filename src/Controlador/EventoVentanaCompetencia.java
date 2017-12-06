/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Competencia;
import Vista.VentanaCompetencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author SVAIO
 */
public class EventoVentanaCompetencia implements ActionListener {

    private VentanaCompetencia vCompetencia;
    private GestionDato gD;

    public EventoVentanaCompetencia(VentanaCompetencia vCompetencia) {
        this.vCompetencia = vCompetencia;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.vCompetencia.getBotonList().get(0))) {

            String n = this.vCompetencia.getTxtList().get(0).getText();
            String n1 = this.vCompetencia.getTxtList().get(1).getText();
            String n2 = this.vCompetencia.getTxtList().get(2).getText();
            String n3 = this.vCompetencia.getTxtList().get(3).getText();

            if (n.equals("") || n1.equals("") || n2.equals("") || n3.equals("")) {
                JOptionPane.showMessageDialog(vCompetencia, "Todos los campos son obligatorios ", "Falta Informacion", JOptionPane.INFORMATION_MESSAGE);
            } else {
                boolean res = this.vCompetencia.getgD().buscarCompetencia(n);
                if (res == true) {
                    JOptionPane.showMessageDialog(vCompetencia, "Competencia ya  Registrada ", "Error Registro", JOptionPane.INFORMATION_MESSAGE);
                    this.vCompetencia.getTxtList().get(0).setText("");
                    this.vCompetencia.getTxtList().get(1).setText("");
                    this.vCompetencia.getTxtList().get(2).setText("");
                    this.vCompetencia.getTxtList().get(3).setText("");
                } else {
                    Competencia c = new Competencia(n, n1, n2, n3);
                    this.vCompetencia.getgD().addCompetencia(c);
                    Object[][] datoComp = this.vCompetencia.cargaDatosTabla(this.vCompetencia.getgD().getListCompetencia().size(), 4);
                    this.vCompetencia.setDatos(datoComp);
                    this.vCompetencia.getModeloTabla().setDataVector(this.vCompetencia.getDatos(), this.vCompetencia.getEncabezado());
                }
            }
        }
        if (e.getSource().equals(this.vCompetencia.getBotonList().get(0))) {
            this.vCompetencia.getTxtList().get(0).setText("");
            this.vCompetencia.getTxtList().get(1).setText("");
            this.vCompetencia.getTxtList().get(2).setText("");
            this.vCompetencia.getTxtList().get(3).setText("");
        }
    }
}
