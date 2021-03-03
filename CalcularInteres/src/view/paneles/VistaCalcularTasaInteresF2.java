
package view.paneles;

import contols.GestorClases;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VistaCalcularTasaInteresF2 extends JFrame implements ActionListener{
    
    private GestorClases miGestorClases;
    private JPanel miPanel;
    private JLabel miTitulo;
    private JLabel vInicial;
    private JLabel vFinal;
    private JLabel bgImg;
    public JTextField miFielVInicial;
    public JTextField miFielVFinal;
    private JButton btnCalcularTInteres;
    private JButton btnAtras;
    
    public VistaCalcularTasaInteresF2(){
        setSize(400, 350); // Dimenciones de la ventana
        setTitle("Ingenieria Economica/Tasa Interes Formula #2"); // Titulo de la ventana 
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
        miFielVFinal.setBounds(160, 120, 150, 20);
        miPanel.add(miFielVFinal);
        
        
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
            String tInteresF1 = miGestorClases.TasaInteresF2(miFielVInicial.getText(), miFielVFinal.getText());
            JOptionPane.showMessageDialog(null, tInteresF1);
            miFielVInicial.setText("");
            miFielVFinal.setText("");
        }else if(e.getSource() == btnAtras){
            dispose();
        }
    }
    
}
