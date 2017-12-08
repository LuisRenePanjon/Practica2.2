/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaLeer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author SVAIO
 */
public class EventoVentanaLeer implements ActionListener {

    private VentanaLeer vLeer;

    public EventoVentanaLeer(VentanaLeer vLeer) {
        this.vLeer = vLeer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vLeer.getBoton())) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            int result = fileChooser.showOpenDialog(this.vLeer);

            if (result != JFileChooser.CANCEL_OPTION) {

                File fileName = fileChooser.getSelectedFile();

                if ((fileName == null) || (fileName.getName().equals(""))) {
                    this.vLeer.getTxt().setText("...");
                } else {
                    this.vLeer.getTxt().setText(fileName.getAbsolutePath());
                }
            }
        }
    }
}