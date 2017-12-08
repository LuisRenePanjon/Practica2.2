/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.EventoVentanaLeer;
import Controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;

/**
 *
 * @author SVAIO
 */
public class VentanaLeer extends JInternalFrame {

    private JFileChooser chooser;
    private JTextField txt;
    private JButton boton;
    private JComboBox combobox;
    private GestionDato gD;
    private JTextPane txp;
    private JScrollPane scroll;
    public VentanaLeer(GestionDato gD) {
        super("Leer Datos", true, true, true, true);
        this.gD = gD;
        this.setDefaultCloseOperation(3);
        this.setSize(400, 110);
        iniciaComponente();
        this.setVisible(true);

    }

    public void iniciaComponente() {
        //Se agrega un layout
        setLayout(new BorderLayout());

        //Se crea el editor de texto y se agrega a un scroll
        this.txp = new JTextPane();
        this.scroll = new JScrollPane();
        this.scroll.setViewportView(txp);

        add(this.scroll, BorderLayout.CENTER);

        //Se crea un boton para abrir el archivo
        this.boton= new JButton("Abrir");
        this.boton.addActionListener(new EventoVentanaLeer(this));
        
        add(this.boton, BorderLayout.NORTH);

        //Tamaño de la ventana
        setSize(500, 500);

        //Esto sirve para centrar la ventana
        //setLocationRelativeTo(null);
    }

    public JTextPane getTxp() {
        return txp;
    }

    public void setTxp(JTextPane txp) {
        this.txp = txp;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    
    
    public JFileChooser getChooser() {
        return chooser;
    }

    public void setChooser(JFileChooser chooser) {
        this.chooser = chooser;
    }

    public JTextField getTxt() {
        return txt;
    }

    public void setTxt(JTextField txt) {
        this.txt = txt;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JComboBox getCombobox() {
        return combobox;
    }

    public void setCombobox(JComboBox combobox) {
        this.combobox = combobox;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

}
