
package view.paneles;

import contols.GestorClases;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VistaCalcularInteres extends JFrame implements ActionListener{
    
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
        
        /*----Valor Inicial-------*/ 
        vInicial = new JLabel();
        vInicial.setText("Ingrese Valor Inicial");
        vInicial.setForeground(Color.BLACK);
        vInicial.setHorizontalAlignment(SwingConstants.LEFT);
        vInicial.setBounds(30, 70, 150, 25);
        vInicial.setFont(new Font("Time New Roman", Font.ITALIC, 14));
        miPanel.add(vInicial);
        
        /*------- Text Fiel Valor Inicial ------------*/
        miFielVInicial = new JTextField(20);
        miFielVInicial.setLayout(null);
        miFielVInicial.setBorder(BorderFactory.createBevelBorder(12));
        miFielVInicial.setOpaque(false);
        miFielVInicial.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        miFielVInicial.setBounds(160, 70, 150, 20);
   
        miPanel.add(miFielVInicial);
        
         /*----Valor Inicial-------*/ 
        vFinal = new JLabel();
        vFinal.setText("Ingrese Valor Final");
        vFinal.setForeground(Color.BLACK);
        vFinal.setHorizontalAlignment(SwingConstants.LEFT);
        vFinal.setBounds(30, 120, 150, 25);
        vFinal.setFont(new Font("Time New Roman", Font.ITALIC, 14));
        miPanel.add(vFinal);
        
        /*------- Text Fiel Valor Inicial ------------*/
        miFielVFinal = new JTextField(20);
        miFielVFinal.setLayout(null);
        miFielVFinal.setBorder(BorderFactory.createBevelBorder(12));
        miFielVFinal.setOpaque(false);
        miFielVFinal.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        //miFielVFinal.setBorder(null);
        miFielVFinal.setBounds(160, 120, 150, 20);
        
        miPanel.add(miFielVFinal);
        
        
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
    
}
