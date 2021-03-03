
package view.paneles;

import contols.GestorClases;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class VistaCalcularInteres extends JFrame implements ActionListener, ItemListener{
    
    private GestorClases miGestorDeClases;
    private JPanel miPanel;
    private JLabel miTitulo;
    private JLabel vInicial;
    private JLabel vFinal;
    private JLabel bgImg;
    private JTextField miFielVInicial;
    private JTextField miFielVFinal;
    private JButton btnCalcularInteres;
    private JButton btnAtras;
    private JComboBox<String> Intereses;
    
    public VistaCalcularInteres(){
        setSize(400, 350); // Dimenciones de la ventana
        setTitle("Ingenieria Economica/CalcularInteres"); // Titulo de la ventana 
        setLocationRelativeTo(null); // Posicion de la ventana
        setResizable(false); // Ajuste del las dimenciones anulada
        
        
        /*----------- Panel ---------------*/
        miPanel = new JPanel();
        miPanel.setLayout(null);
        this.getContainerListeners();
        add(miPanel);
        
        
        Intereses = new JComboBox<String>();
        Intereses.setBounds(40, 50 , 220, 25);
        Intereses.setOpaque(false);
        Intereses.addItem("Seleccione Una Operacion");
        Intereses.addItem("Interes Simple");
        Intereses.addItem("Interes Compuesto");
        
        Intereses.addItemListener(this);
        
        miPanel.add(Intereses);
        
        
        
        /*---------- Etiquetas ----------*/
        /*---- Titulo ----*/
        miTitulo = new JLabel();
        miTitulo.setText("Calcular Interes");
        miTitulo.setForeground(Color.BLACK);
        miTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        miTitulo.setVerticalAlignment(SwingConstants.BOTTOM);
        miTitulo.setBounds(50, 20, 290, 25);
        miTitulo.setFont(new Font("Time New Roman", Font.BOLD, 16));
        miPanel.add(miTitulo);
        
        
        
        /*-------- Bottons -------------*/
        // Boton calcular
        btnCalcularInteres = new JButton();
        btnCalcularInteres.setText("Calcular");
        btnCalcularInteres.setBorder(BorderFactory.createBevelBorder(20));
        btnCalcularInteres.setBounds(250, 180, 60, 30);
        btnCalcularInteres.setFont(new Font("Time New Roman", Font.BOLD, 10));
        btnCalcularInteres.setEnabled(false);
        // Boton Atras
        btnAtras = new JButton();
        btnAtras.setText("Atras");
        btnAtras.setBorder(BorderFactory.createBevelBorder(20));
        btnAtras.setBounds(150, 180, 60, 30);
        btnAtras.setFont(new Font("Time New Roman", Font.BOLD, 10));
        
        /* Agregar Eventos a los botones */
        btnAtras.addActionListener(this);
        
        /* Agregar Al Panel */
        miPanel.add(btnCalcularInteres);
        miPanel.add(btnAtras);
        
        /*----Imgen de Fondo----*/
        ImageIcon imgBg = new ImageIcon("src/Img/t2.jpg");
        bgImg = new JLabel();
        bgImg.setSize(400, 350);
        bgImg.setIcon(new ImageIcon(imgBg.getImage().getScaledInstance(bgImg.getWidth(), bgImg.getHeight(), Image.SCALE_SMOOTH)));
        miPanel.add(bgImg);
    }
    
    public void setGestorDeClases(GestorClases miGestorClases) {
        this.miGestorDeClases = miGestorClases;
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnCalcularInteres){
            
        }
        if(e.getSource() == btnAtras){
            dispose();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String intereses = Intereses.getSelectedItem().toString();
        if(intereses == "Seleccione Una Operacion"){
            btnCalcularInteres.setEnabled(false);
        }else{
            if(e.getSource() == Intereses){
                btnCalcularInteres.setEnabled(true);
            }
        }
    }
    
}
