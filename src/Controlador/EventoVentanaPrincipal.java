/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VentanaAtleta;
import Vista.VentanaCompetencia;
import Vista.VentanaPrincipal;
import Vista.VentanaResultado;

/**
 *
 * @author XBBC
 */
public class EventoVentanaPrincipal implements ActionListener {

    private VentanaPrincipal vPrincipal;

    public EventoVentanaPrincipal(VentanaPrincipal vPrincipal) {
        this.vPrincipal = vPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(this.vPrincipal.getMenuItemList().get(0))) {
            VentanaAtleta vAt = new VentanaAtleta(this.vPrincipal.getgD());
            vAt.setVisible(true);
            this.vPrincipal.getEscritorio().add(vAt);
        }

        if (ae.getSource().equals(this.vPrincipal.getMenuItemList().get(1))) {
            VentanaCompetencia vCo = new VentanaCompetencia(this.vPrincipal.getgD());
            vCo.setVisible(true);
            this.vPrincipal.getEscritorio().add(vCo);
        }

        if (ae.getSource().equals(this.vPrincipal.getMenuItemList().get(2))) {
            VentanaResultado vRe = new VentanaResultado(this.vPrincipal.getgD());
            vRe.setVisible(true);
            this.vPrincipal.getEscritorio().add(vRe);
        }

    }
}
