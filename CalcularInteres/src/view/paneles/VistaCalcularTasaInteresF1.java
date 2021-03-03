
package view.paneles;

import contols.GestorClases;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class VistaCalcularTasaInteresF1 extends JFrame implements ActionListener{
    
    private GestorClases miGestorClases;
    private JPanel miPanel;
    private JLabel miTitulo;
    private JLabel vInicial;
    private JLabel Interes;
    private JLabel bgImg;
    public JTextField miFielVInicial;
    public JTextField miFielInteres;
    private JButton btnCalcularTInteres;
    private JButton btnAtras;
    
    public VistaCalcularTasaInteresF1(){
        setSize(400, 350); // Dimenciones de la ventana
        setTitle("Ingenieria Economica/Tasa Interes Formula #1"); // Titulo de la ventana 
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
        miTitulo.setText("Calcular Tasa de Interes");
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
        Interes = new JLabel();
        Interes.setText("Ingrese El Interes");
        Interes.setForeground(Color.BLACK);
        Interes.setHorizontalAlignment(SwingConstants.LEFT);
        Interes.setBounds(30, 120, 150, 25);
        Interes.setFont(new Font("Time New Roman", Font.ITALIC, 14));
        miPanel.add(Interes);
        
        /*------- Text Fiel Valor Inicial ------------*/
        miFielInteres = new JTextField(20);
        miFielInteres.setLayout(null);
        miFielInteres.setBorder(BorderFactory.createBevelBorder(12));
        miFielInteres.setOpaque(false);
        miFielInteres.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        miFielInteres.setBounds(160, 120, 150, 20);
        miPanel.add(miFielInteres);
        
        /*----------------- Buttons -------------------*/
        /*---------- Botton Calcular -----------*/
        btnCalcularTInteres = new JButton(); // Se crea el boton
        btnCalcularTInteres.setText("Calcular"); // Texto del bioton
        btnCalcularTInteres.setBounds(110, 150, 90, 30); // Posicionamiento y dimenciones del boton
        btnCalcularTInteres.setFont(new Font("Time New Roman", Font.BOLD, 10)); // fuente, Variante de letra, y tamaño de esta 
        
        
        /*-----------Botton Salir -------------*/
        btnAtras = new JButton();
        btnAtras.setText("Salir");
        btnAtras.setBorder(BorderFactory.createBevelBorder(10));
        btnAtras.setBounds(285, 150, 90, 30);
        btnAtras.setFont(new Font("Time New Roman", Font.BOLD, 10));
        
        /*--- Agregar Ventos al boton ---*/
        btnCalcularTInteres.addActionListener(this); // Evento del boton
        btnAtras.addActionListener(this);
        
        
        /*-------- Agregar Botones al Panel --------*/
        miPanel.add(btnCalcularTInteres); // Agrega el boton al panel
        miPanel.add(btnAtras);
        
        
        /*----Imgen de Fondo----*/
        ImageIcon imgBg = new ImageIcon("src/Img/t2.jpg");
        bgImg = new JLabel();
        bgImg.setSize(400, 350);
        bgImg.setIcon(new ImageIcon(imgBg.getImage().getScaledInstance(bgImg.getWidth(), bgImg.getHeight(), Image.SCALE_SMOOTH)));
        miPanel.add(bgImg);
    }
    
    public void setGestorDeClases(GestorClases miGestorClases) {
        this.miGestorClases = miGestorClases;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnCalcularTInteres){
            String tInteresF1 = miGestorClases.TasaInteresF1(miFielVInicial.getText(), miFielInteres.getText());
            JOptionPane.showMessageDialog(null, tInteresF1);
             miFielVInicial.setText("");
            miFielInteres.setText("");
        }else if(e.getSource() == btnAtras){
            dispose();
        }
    }
    
}
