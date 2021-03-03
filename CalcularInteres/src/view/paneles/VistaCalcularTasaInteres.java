
package view.paneles;

import contols.GestorClases;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;


public class VistaCalcularTasaInteres extends JFrame implements ActionListener, ItemListener{
    
    private GestorClases miGestorClases;
    private JPanel miPanel;
    private JLabel miTitulo;
    private JLabel bgImg;
    private JComboBox<String> Formulas;
    private JButton btnCalcular;
    private JButton btnAtras;
    
    public VistaCalcularTasaInteres(){ 
        setSize(320, 200); // Dimenciones de la ventana
        setTitle("Ingenieria Economica"); // Titulo de la ventana 
        setLocationRelativeTo(null); // Posicion de la ventana
        setResizable(false); // Ajuste del las dimenciones anulada
        
        miPanel = new JPanel();
        miPanel.setLayout(null);
        this.getContainerListeners();
        add(miPanel);
        
        /* Titulo */
        miTitulo = new JLabel();
        miTitulo = new JLabel(); // Instancia de la etiqueta 
        miTitulo.setText("Formulas Para calcular la Tasa de Interes"); // Texto que tiene la etiqueta
        miTitulo.setForeground(Color.BLACK); // Color que tiene el texto
        miTitulo.setHorizontalAlignment(SwingConstants.CENTER); // Posicion del texto en la etiqueta
        miTitulo.setBounds(10, 20, 290, 25); // Alineamiento, dimenciones de la etiqueta
        miTitulo.setFont(new Font("Time New Roman", Font.BOLD, 14)); // Fuente, Variante de letra, y tamaño de esta 
        
        miPanel.add(miTitulo); // Se agrega en el panel
        
        /*     JComboBox       */
        Formulas = new JComboBox<String>();
        Formulas.setBounds(40, 50 , 220, 25);
        Formulas.setOpaque(false);
        Formulas.addItem("Seleccione Una Operacion");
        Formulas.addItem("Calcular Con el Interes");
        Formulas.addItem("Calcular Con Valor Final e Inicial");
        
        Formulas.addItemListener(this);
        
        miPanel.add(Formulas);
        
        /*     Botones       */
        btnCalcular = new JButton();
        btnCalcular.setText("Calcular");
        btnCalcular.setBounds(40, 80, 90, 30);
        btnCalcular.setFont(new Font("Time New Roman", Font.BOLD, 10));
        btnCalcular.setEnabled(false);
        // Boton Atras
        btnAtras = new JButton();
        btnAtras.setText("Atras");
        btnAtras.setBounds(200, 80, 60, 30);
        btnAtras.setFont(new Font("Time New Roman", Font.BOLD, 10));
        /*       Eventos            */
        btnCalcular.addActionListener(this);
        btnAtras.addActionListener(this);
        
        /*     Agregando al Panel    */
        miPanel.add(btnCalcular);
        miPanel.add(btnAtras);
                
        /*      Fondo del Programa    */        
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
        if(e.getSource() == btnCalcular){
            String Formula = Formulas.getSelectedItem().toString();
            miGestorClases.CargarFormulas(Formula);
        }else if(e.getSource() == btnAtras){
            dispose();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String Formula = Formulas.getSelectedItem().toString();
        if(Formula == "Seleccione Una Operacion"){
            btnCalcular.setEnabled(false);
        }else{
            if(e.getSource() == Formulas){
                btnCalcular.setEnabled(true);
            }
        }
    }
    
}
