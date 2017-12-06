/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.EventoVentanaResultado;
import Controlador.GestionDato;
import Modelo.Atleta;
import Modelo.Competencia;
import Modelo.Resultado;
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
 * @author XBBC
 */
public class VentanaResultado extends JInternalFrame {

    private List<JLabel> etiquetaList;
    private List<JButton> botonList;
    private List<JTextField> txtList;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private JComboBox combobox;
    private JComboBox combobox1;
    private GestionDato gD;

    public VentanaResultado(GestionDato gD) {
        super("Resultado", true, true, true, true);
        this.setSize(600, 300);
        this.gD = gD;
        iniciaComponente();

    }

    public void iniciaComponente() {
        this.etiquetaList = new ArrayList<JLabel>();
        this.etiquetaList.add(new JLabel("Atleta"));
        this.etiquetaList.add(new JLabel("Competencia"));
        this.etiquetaList.add(new JLabel("Puesto"));
        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField(15));

        this.combobox = new JComboBox(this.CargaCombo());
        this.combobox1 = new JComboBox(this.CargaCombo2());
        this.botonList = new ArrayList<JButton>();
        this.botonList.add(new JButton("Guardar"));
        this.botonList.add(new JButton("Nuevo"));
        this.botonList.get(0).addActionListener(new EventoVentanaResultado(this));
        this.botonList.get(1).addActionListener(new EventoVentanaResultado(this));

        JPanel panel = new JPanel();
        this.encabezado = new Object[3];
        this.encabezado[0] = "Atleta";
        this.encabezado[1] = "Competencia";
        this.encabezado[2] = "Puesto";
        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);

        panel.add(this.etiquetaList.get(0));
        panel.add(this.combobox);
        panel.add(this.etiquetaList.get(1));
        panel.add(this.combobox1);
        panel.add(this.etiquetaList.get(2));
        panel.add(this.txtList.get(0));

        panel.add(this.botonList.get(0));
        panel.add(this.botonList.get(1));

        panel.add(this.scroll);
        this.add(panel);
    }

    public Object[][] cargarDatosTabla(int h, int w) {
        Object[][] retorno = new Object[h][w];
        int i = 0;
        for (Resultado r1 : this.gD.getListResultado()) {
            retorno[i][0] = r1.getPuesto();
            retorno[i][1] = r1.getAtleta().getNonbYAp();
            retorno[i][2] = r1.getCompetencia().getNombre();
            
            i++;
        }
        return retorno;
    }

    public Object[] CargaCombo() {
        String[] retorno = new String[this.gD.getListAtleta().size()];
        int i = 0;
        for (Atleta a : this.gD.getListAtleta()) {
            retorno[i] = a.getNonbYAp();
            i++;
        }
        return retorno;
    }

    public Object[] CargaCombo2() {
        String[] retorno = new String[this.gD.getListCompetencia().size()];
        int i = 0;
        for (Competencia c : this.gD.getListCompetencia()) {
            retorno[i] = c.getNombre();
            i++;
        }
        return retorno;
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

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
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

    public JComboBox getCombobox1() {
        return combobox1;
    }

    public void setCombobox1(JComboBox combobox1) {
        this.combobox1 = combobox1;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

    
    
}
