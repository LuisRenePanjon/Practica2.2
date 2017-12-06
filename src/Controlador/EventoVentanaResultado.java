/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Atleta;
import Modelo.Competencia;
import Modelo.Resultado;
import Vista.VentanaResultado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author SVAIO
 */
public class EventoVentanaResultado implements ActionListener {

    private VentanaResultado vResultado;
    private GestionDato gD;

    public EventoVentanaResultado(VentanaResultado vResultado) {
        this.vResultado = vResultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource().equals(this.vResultado.getBotonList().get(0))) {

                int pos = Integer.parseInt(this.vResultado.getTxtList().get(0).getText());
                String atl = this.vResultado.getCombobox().getSelectedItem().toString();
                String comp = this.vResultado.getCombobox1().getSelectedItem().toString();
                Atleta at = this.vResultado.getgD().buscarAtleta1(atl);
                Competencia com = this.vResultado.getgD().buscarCompetencia1(comp);
                Resultado r = new Resultado(pos, at, com);
                this.vResultado.getgD().addResultado(r);
                Object[][] datoRes = this.vResultado.cargarDatosTabla(this.vResultado.getgD().getListResultado().size(), 3);
                this.vResultado.setDatos(datoRes);
                this.vResultado.getModeloTabla().setDataVector(this.vResultado.getDatos(), this.vResultado.getEncabezado());
                this.vResultado.getgD().EscribirListResultado(this.vResultado.getgD().getListResultado());
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(vResultado, "Puesto es un numero entero");
        }

        if (e.getSource().equals(this.vResultado.getBotonList().get(1))) {
            this.vResultado.getTxtList().get(0).setText("");
        }
    }

}
