/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Atleta;
import Vista.VentanaAtleta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author SVAIO
 */
public class EventoVentanaAtleta implements ActionListener {

    private VentanaAtleta vAtleta;
    private GestionDato gD;

    public EventoVentanaAtleta(VentanaAtleta vAtleta) {
        this.vAtleta = vAtleta;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.vAtleta.getBotonList().get(0))) {
            try {
                String n = this.vAtleta.getTxtList().get(0).getText();
                int edad = Integer.parseInt(this.vAtleta.getTxtList().get(1).getText());
                String ced = this.vAtleta.getTxtList().get(2).getText();
                if (n.equals("") || ced.equals("")) {
                    JOptionPane.showMessageDialog(vAtleta, "Todos los campos son obligatorios ", "Falta Informacion", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    boolean res = this.vAtleta.getgD().buscarAtleta(ced);

                    if (res == true) {
                        JOptionPane.showMessageDialog(vAtleta, "Atleta ya  Registrado ", "Error Registro", JOptionPane.INFORMATION_MESSAGE);
                        this.vAtleta.getTxtList().get(0).setText("");
                        this.vAtleta.getTxtList().get(1).setText("");
                        this.vAtleta.getTxtList().get(2).setText("");
                    } else {
                        Atleta at = new Atleta(n, edad, ced);
                        this.vAtleta.getgD().addAtleta(at);
                        Object[][] datoAtleta = this.vAtleta.cargaDatosTabla(this.vAtleta.getgD().getListAtleta().size(), 3);
                        this.vAtleta.setDatos(datoAtleta);
                        this.vAtleta.getModeloTabla().setDataVector(this.vAtleta.getDatos(), this.vAtleta.getEncabezado());
                    }
                }
            } catch (NumberFormatException numb) {
                JOptionPane.showMessageDialog(vAtleta, "Edad es un numero entero");
            }
        }
        if (e.getSource().equals(this.vAtleta.getBotonList().get(1))) {
            this.vAtleta.getTxtList().get(0).setText("");
            this.vAtleta.getTxtList().get(1).setText("");
            this.vAtleta.getTxtList().get(2).setText("");
        }
    }
}
