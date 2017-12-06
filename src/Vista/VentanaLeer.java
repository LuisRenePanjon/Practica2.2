/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SVAIO
 */
public class VentanaLeer extends JInternalFrame{

    private List<JLabel> etiquetaList;
    private List<JButton> botonList;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private JComboBox combobox;
    private GestionDato gD;
    
    public VentanaLeer() {
        super("Leer Datos", true, true, true, true);
        this.setSize(600, 300);
        iniciaComponente();
        this.setVisible(true);

    }
    
    public void iniciaComponente() {
        this.etiquetaList = new ArrayList<JLabel>();
        this.etiquetaList.add(new JLabel("Seleccionar"));
        this.botonList = new ArrayList<JButton>();
        this.botonList.add(new JButton("Guardar"));
        this.combobox = new JComboBox();
        this.combobox.addItem("Atleta");
        this.combobox.addItem("Competencia");
        this.combobox.addItem("Resultado");
        
        JPanel panel = new JPanel();
        this.encabezado = new Object[3];
        this.encabezado[0] = "Nombre";
        this.encabezado[1] = "Edad";
        this.encabezado[2] = "Cedula";
        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        panel.add(this.etiquetaList.get(0));
        panel.add(this.combobox);
        panel.add(this.botonList.get(0));
        
        panel.add(this.scroll);
        this.add(panel);
    }

    public List<JLabel> getEtiquetaList() {
        return etiquetaList;
    }

    public void setEtiquetaList(List<JLabel> etiquetaList) {
        this.etiquetaList = etiquetaList;
    }

    public List<JButton> getBotonList() {
        return botonList;
    }

    public void setBotonList(List<JButton> botonList) {
        this.botonList = botonList;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
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
