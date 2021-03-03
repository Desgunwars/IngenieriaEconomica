
package view.paneles;

import contols.GestorClases;
import javax.swing.*;

public class VistaCalcularValorFinal  extends JFrame{

    private GestorClases miGestorClases;
    private JPanel miPanel;
    private JLabel miTitulo;
    private JLabel tasaInteres;
    private JLabel vFinal;
    private JLabel tiempo;
    private JLabel bgImg;
    public JTextField miFielTasaInteres;
    public JTextField miFielVFinal;
    public JTextField miFielTiempo;
    private JButton btnCalcularTInteres;
    private JButton btnAtras;
    public VistaCalcularValorFinal(){
        setSize(450, 350); // Dimenciones de la ventana
        setTitle("Ingenieria Economica"); // Titulo de la ventana 
        setLocationRelativeTo(null); // Posicion de la ventana
        setResizable(false); // Ajuste del las dimenciones anulada
        
        /*----------- Panel ---------------*/
        miPanel = new JPanel();
        miPanel.setLayout(null);
        this.getContainerListeners();
        add(miPanel);

        /*---------- Etiquetas ----------*/
    }
    
    public void setGestorDeClases(GestorClases miGestorClases) {
        this.miGestorClases = miGestorClases;
    }
    
}
