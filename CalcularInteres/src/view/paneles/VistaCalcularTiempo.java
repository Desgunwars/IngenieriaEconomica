
package view.paneles;

import contols.GestorClases;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class VistaCalcularTiempo extends JFrame implements ActionListener{
    private GestorClases miGestorClases;
    private JPanel miPanel;
    private JLabel miTitulo;
    private JLabel tasaInteres;
    private JLabel vFinal;
    private JLabel vPresente;
    private JLabel bgImg;
    public JTextField miFielTasaInteres;
    public JTextField miFielVFinal;
    public JTextField miFielVPresente;
    private JButton btnCalcularTInteres;
    private JButton btnAtras;
    
    public VistaCalcularTiempo(){

        /* --- Creacion de la Ventana --- */
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
 /*---- Titulo ----*/
        miTitulo = new JLabel();
        miTitulo.setText("Calcular el Timpo");
        miTitulo.setForeground(Color.BLACK);
        miTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        miTitulo.setVerticalAlignment(SwingConstants.BOTTOM);
        miTitulo.setBounds(50, 20, 290, 25);
        miTitulo.setFont(new Font("Time New Roman", Font.BOLD, 16));
        miPanel.add(miTitulo);

        /*----Valor TasaInteres-------*/
        tasaInteres = new JLabel();
        tasaInteres.setText("Ingrese la Tasa de Interes");
        tasaInteres.setForeground(Color.BLACK);
        tasaInteres.setHorizontalAlignment(SwingConstants.LEFT);
        tasaInteres.setBounds(25, 70, 170, 25);
        tasaInteres.setFont(new Font("Time New Roman", Font.ITALIC, 14));
        miPanel.add(tasaInteres);

        /*------- Text Fiel TasaInteres ------------*/
        miFielTasaInteres = new JTextField(20);
        miFielTasaInteres.setLayout(null);
        miFielTasaInteres.setBorder(BorderFactory.createBevelBorder(12));
        miFielTasaInteres.setOpaque(false);
        miFielTasaInteres.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        miFielTasaInteres.setBounds(200, 70, 150, 20);
        miPanel.add(miFielTasaInteres);

        /*---- Valor Final -------*/
        vFinal = new JLabel();
        vFinal.setText("Ingrese Valor Final");
        vFinal.setForeground(Color.BLACK);
        vFinal.setHorizontalAlignment(SwingConstants.LEFT);
        vFinal.setBounds(25, 105, 150, 25);
        vFinal.setFont(new Font("Time New Roman", Font.ITALIC, 14));
        miPanel.add(vFinal);

        /*------- Text Fiel Valor Final ------------*/
        miFielVFinal = new JTextField(20);
        miFielVFinal.setLayout(null);
        miFielVFinal.setBorder(BorderFactory.createBevelBorder(12));
        miFielVFinal.setOpaque(false);
        miFielVFinal.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        miFielVFinal.setBounds(160, 105, 170, 20);
        miPanel.add(miFielVFinal);

        /*----Valor Tiempo-------*/
        vPresente = new JLabel();
        vPresente.setText("Ingrese del Tiempo");
        vPresente.setForeground(Color.BLACK);
        vPresente.setHorizontalAlignment(SwingConstants.LEFT);
        vPresente.setBounds(25, 135, 150, 25);
        vPresente.setFont(new Font("Time New Roman", Font.ITALIC, 14));
        miPanel.add(vPresente);

        /*------- Text Fiel Tiempo ------------*/
        miFielVPresente = new JTextField(20);
        miFielVPresente.setLayout(null);
        miFielVPresente.setBorder(BorderFactory.createBevelBorder(12));
        miFielVPresente.setOpaque(false);
        miFielVPresente.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        miFielVPresente.setBounds(160, 135, 170, 20);
        miPanel.add(miFielVPresente);

        /*----------------- Buttons -------------------*/
 /*---------- Botton Calcular -----------*/
        btnCalcularTInteres = new JButton(); // Se crea el boton
        btnCalcularTInteres.setText("Calcular"); // Texto del bioton
        btnCalcularTInteres.setBounds(110, 180, 90, 30); // Posicionamiento y dimenciones del boton
        btnCalcularTInteres.setFont(new Font("Time New Roman", Font.BOLD, 10)); // fuente, Variante de letra, y tamaño de esta 

        /*-----------Botton Salir -------------*/
        btnAtras = new JButton();
        btnAtras.setText("Salir");
        btnAtras.setBorder(BorderFactory.createBevelBorder(10));
        btnAtras.setBounds(285, 180, 90, 30);
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
        bgImg.setSize(450, 350);
        bgImg.setIcon(new ImageIcon(imgBg.getImage().getScaledInstance(bgImg.getWidth(), bgImg.getHeight(), Image.SCALE_SMOOTH)));
        miPanel.add(bgImg);
    }

    public void setGestorDeClases(GestorClases miGestorClases) {
        this.miGestorClases = miGestorClases;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == btnCalcularTInteres) {
            String valorTiempo = miGestorClases.tiempo(miFielVFinal.getText(), miFielVPresente.getText(), miFielTasaInteres.getText());
            JOptionPane.showMessageDialog(null, valorTiempo);
            miFielTasaInteres.setText("");
            miFielVPresente.setText("");
            miFielVFinal.setText("");
        } else if (e.getSource() == btnAtras) {
            dispose();
        }
    }
}
