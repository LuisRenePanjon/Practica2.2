/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestionDato;
import Modelo.Atleta;
import Modelo.Competencia;
import Modelo.Resultado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XBBC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Atleta> aL=new ArrayList<Atleta>();
        List<Competencia> cL=new ArrayList<Competencia>();
        List<Resultado> rL=new ArrayList<Resultado>();
        GestionDato gD=new GestionDato(aL, cL, rL);
        VentanaPrincipal vP= new VentanaPrincipal("Software de Gestion",gD);
        vP.setVisible(true);
    }
    
}
