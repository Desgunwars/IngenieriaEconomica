
package view;
import contols.GestorClases;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;


public class VentanaPrincipal extends JFrame implements ActionListener, ItemListener{
    private GestorClases miGestorClases;
    private JPanel miPanel;
    private JLabel labelTitulo;
    private JComboBox<String> listCalculos;
    private JButton btnCalcular;
    private JButton btnSalir;
    private JLabel bgImg;
    
    
    public VentanaPrincipal(){
        
        /* --- Creacion de la Ventana --- */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Termianr ejercucion 
        setSize(520, 520); // Dimenciones de la ventana
        setTitle("Ingenieria Economica"); // Titulo de la ventana 
        setLocationRelativeTo(null); // Posicion de la ventana
        setResizable(false); // Ajuste del las dimenciones anulada
        
        /*----------------- Panel ------------------*/
        miPanel = new JPanel(); // Ceacion del Panel 
        miPanel.setLayout(null); // Desactivando estilos por defauld del panel 
        this.getContainerListeners();  // Activamos el control de ventos de la ventana
        add(miPanel); // Colocamos el panel en la ventana
        
        /*------------ Etiquetas -------------*/
            /* ----- Insertar texto ----- */
        labelTitulo = new JLabel(); // Instancia de la etiqueta 
        labelTitulo.setText("Seleccione la Operacio a Realizar"); // Texto que tiene la etiqueta
        labelTitulo.setForeground(Color.BLACK); // Color que tiene el texto
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER); // Posicion del texto en la etiqueta
        labelTitulo.setBounds(100, 70, 290, 25); // Alineamiento, dimenciones de la etiqueta
        labelTitulo.setFont(new Font("Time New Roman", Font.BOLD, 14)); // Fuente, Variante de letra, y tamaño de esta 
        
        miPanel.add(labelTitulo); // Se agrega en el panel
        
        /*------------------ Crear JComboBox --------------*/
        listCalculos = new JComboBox<String>();
        listCalculos.setBounds(135, 100 , 220, 25);
        listCalculos.addItem("Seleccione Una Operacion");
        listCalculos.addItem("Calcular Interes");
        listCalculos.addItem("Calcular Tasa Interes");
        listCalculos.addItem("Calcular Valor Presente");
        listCalculos.addItem("Calcular Valor Final");
        listCalculos.addItem("Calcular Tiempo");
        
        miPanel.add(listCalculos);// Se agrega al panel
        /*------------ Eventos ------------*/
        listCalculos.addItemListener(this); // Activa el evento del JComboBox
        
        /*----------------- Buttons -------------------*/
        /*---------- Botton Calcular -----------*/
        btnCalcular = new JButton(); // Se crea el boton
        btnCalcular.setText("Calcular"); // Texto del bioton
        btnCalcular.setBounds(115, 150, 90, 30); // Posicionamiento y dimenciones del boton
        btnCalcular.setFont(new Font("Time New Roman", Font.BOLD, 10)); // fuente, Variante de letra, y tamaño de esta 
        btnCalcular.setEnabled(false);// Boton desabilitado
        
        /*-----------Botton Salir -------------*/
        btnSalir = new JButton();
        btnSalir.setText("Salir");
        btnSalir.setBorder(BorderFactory.createBevelBorder(10));
        btnSalir.setBounds(315, 150, 90, 30);
        btnSalir.setFont(new Font("Time New Roman", Font.BOLD, 10));
        
        /*--- Agregar Ventos al boton ---*/
        btnCalcular.addActionListener(this); // Evento del boton
        btnSalir.addActionListener(this);
        
        
        /*-------- Agregar Botones al Panel --------*/
        miPanel.add(btnCalcular); // Agrega el boton al panel
        miPanel.add(btnSalir);
        
        /*---------- Imagen de la Ventana ------------*/
        ImageIcon imgBg = new ImageIcon("src/Img/t2.jpg"); // Crea el Objeto de la imagen
        bgImg = new JLabel(); // Crea la etiqueta para poner la imagen
        bgImg.setSize(510, 500); // Crea el ancho y alto de la imagen
        bgImg.setIcon(new ImageIcon(imgBg.getImage().getScaledInstance(bgImg.getWidth(), bgImg.getHeight(), Image.SCALE_SMOOTH))); // Permite adaptar la etiqueta para que tenga un buen Scalad
        miPanel.add(bgImg); // Se pone la imagen de fondo
    }
    
    public void setGestorDeClases(GestorClases miGestorClases) {
        this.miGestorClases = miGestorClases;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnCalcular){
           String Cal = listCalculos.getSelectedItem().toString();
           miGestorClases.CargarCalculo(Cal);
        }else if(e.getSource() == btnSalir){
            dispose();
        }
    }

    /*Metodo abstacto que permite el vento del JComboBox, para que compare el contenido del
    listCalculos, y habilitar o no depenidendo lo que seleccione. Ademas de anidar una
    segunda Conidicion de habilitar el boton si selecciona una operacion*/
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        Object desi = listCalculos.getSelectedItem();
        if(desi == "Seleccione Una Operacion"){
            btnCalcular.setEnabled(false);
        }else{
              if(e.getSource() == listCalculos){
                btnCalcular.setEnabled(true);
            }
        }
    }

   
}
