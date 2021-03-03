
package view.paneles;

import contols.GestorClases;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VistaTiempo extends JFrame implements ActionListener{
    
    private GestorClases miGestorClases;
    private JPanel miPanel;
    private JLabel miTitulo;
    private JLabel subTitulo;
    private JLabel bgImg;
    private ButtonGroup timeGrup;
    private JRadioButton days;
    private JRadioButton months;
    private JRadioButton years;
    private JButton btnCalcularTiempo;
    private JButton btnAtras;
    
    
    public VistaTiempo() {
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
        miTitulo.setText("Calcular Tiempo");
        miTitulo.setForeground(Color.BLACK);
        miTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        miTitulo.setVerticalAlignment(SwingConstants.BOTTOM);
        miTitulo.setBounds(70, 20, 290, 25);
        miTitulo.setFont(new Font("Time New Roman", Font.BOLD, 16));
        miPanel.add(miTitulo);
        
    /*------ Sub Titulo -------*/      
        subTitulo = new JLabel();
        subTitulo.setText("Calcular Seleccione el Tiempo");
        subTitulo.setForeground(Color.BLACK);
        subTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        subTitulo.setVerticalAlignment(SwingConstants.BOTTOM);
        subTitulo.setBounds(-5, 50, 290, 25);
        subTitulo.setFont(new Font("Time New Roman", Font.BOLD, 12));
        miPanel.add(subTitulo);
    /*---- Radio Buttons ----*/
        timeGrup = new ButtonGroup();
        days = new JRadioButton();
        days.setText("Dias");
        days.setLayout(null);
        days.setOpaque(false);
        days.setSelected(true);
        days.setBounds(25, 90, 70, 40);
        
        months = new JRadioButton();
        months.setText("Meses");
        months.setLayout(null);
        months.setOpaque(false);
        months.setBounds(100, 90, 70, 40);
        
        years = new JRadioButton();
        years.setText("Años");
        years.setLayout(null);
        years.setOpaque(false);
        years.setBounds(170, 90, 70, 40);

        timeGrup.add(days);
        timeGrup.add(months);
        timeGrup.add(years);
        miPanel.add(days);
        miPanel.add(months);     
        miPanel.add(years);  
        
        days.addActionListener(this);
        
              /*----------------- Buttons -------------------*/
 /*---------- Botton Calcular -----------*/
        btnCalcularTiempo = new JButton(); // Se crea el boton
        btnCalcularTiempo.setText("Calcular"); // Texto del bioton
        btnCalcularTiempo.setBounds(25, 220, 90, 30); // Posicionamiento y dimenciones del boton
        btnCalcularTiempo.setFont(new Font("Time New Roman", Font.BOLD, 10)); // fuente, Variante de letra, y tamaño de esta 

        /*-----------Botton Salir -------------*/
        btnAtras = new JButton();
        btnAtras.setText("Salir");
        btnAtras.setBorder(BorderFactory.createBevelBorder(10));
        btnAtras.setBounds(125, 220, 90, 30);
        btnAtras.setFont(new Font("Time New Roman", Font.BOLD, 10));

        /*--- Agregar Ventos al boton ---*/
        btnCalcularTiempo.addActionListener(this); // Evento del boton
        btnAtras.addActionListener(this);

        /*-------- Agregar Botones al Panel --------*/
        miPanel.add(btnCalcularTiempo); // Agrega el boton al panel
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
        if (e.getSource() == btnCalcularTiempo){
            System.out.println("Hola");
        }else if(e.getSource() == btnAtras){
            dispose();
        }
    }
    
    private void validarRadio(){
        if (days.isSelected()) {
            
        }
    }
    
    
    
}

/*

 

*/