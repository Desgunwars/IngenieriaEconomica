import view.VentanaPrincipal;
import contols.GestorClases;
import model.Interes;
import model.TasaInteres;
import view.paneles.VistaCalcularInteres;
import view.paneles.VistaCalcularTasaInteres;
import view.paneles.VistaCalcularTasaInteresF1;
import view.paneles.VistaCalcularTasaInteresF2;
import view.paneles.VistaCalcularValorPresente;
import view.paneles.VistaCalcularValorFinal;
import view.paneles.VistaTiempo;
import view.paneles.VistaCalcularTiempo;

public class Principal {
    
    VentanaPrincipal miVentanaPrincipal;
    GestorClases miGestorClases;
    VistaCalcularInteres miCalInteres;
    VistaCalcularTasaInteres miVistaTInteres;
    VistaCalcularTasaInteresF1 miVistaFormula1;
    VistaCalcularTasaInteresF2 miVistaFormula2;
    VistaCalcularValorPresente miVistaValorPresente;
    VistaCalcularValorFinal miVistaValorFinal;
    VistaTiempo miVistaTiempo;
    VistaCalcularTiempo miVistaCalcularTiempo;
    Interes miInteres;
    TasaInteres miCalTasaInteres;
    
    public static void main(String[] args) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.iniciar();
        
    }
    
    private void iniciar(){
        miVentanaPrincipal = new VentanaPrincipal();
        miGestorClases = new GestorClases();
        miCalInteres = new VistaCalcularInteres();
        miVistaTInteres = new VistaCalcularTasaInteres();
        miVistaFormula1 = new VistaCalcularTasaInteresF1();
        miVistaFormula2 = new VistaCalcularTasaInteresF2();
        miVistaValorPresente = new VistaCalcularValorPresente();
        miVistaValorFinal = new VistaCalcularValorFinal();
        miVistaTiempo = new VistaTiempo();
        miVistaCalcularTiempo = new VistaCalcularTiempo();
        miInteres = new Interes();
        miCalTasaInteres = new TasaInteres();

        
        // Crear relaciones Entre vistas y logicas con la clase GestorDeClases
        miVentanaPrincipal.setGestorDeClases(miGestorClases);
        miCalInteres.setGestorDeClases(miGestorClases);
        miVistaTInteres.setGestorDeClases(miGestorClases);
        miInteres.setGestordeDeClases(miGestorClases);
        miVistaFormula1.setGestorDeClases(miGestorClases);
        miVistaFormula2.setGestorDeClases(miGestorClases);
        miVistaValorPresente.setGestorDeClases(miGestorClases);
        miVistaValorFinal.setGestorDeClases(miGestorClases);
        miVistaCalcularTiempo.setGestorDeClases(miGestorClases);
        miVistaTiempo.setGestorDeClases(miGestorClases);
        miCalTasaInteres.setGestorDeClases(miGestorClases);
        
        
        // Relaciones entre Cordinador y las Vistas e Logica
        miGestorClases.setMiVentanaPrincipal(miVentanaPrincipal);
        miGestorClases.setCalInteres(miCalInteres);
        miGestorClases.setVistaCalTInteres(miVistaTInteres);
        miGestorClases.setVistaCalInteresFormula1(miVistaFormula1);
        miGestorClases.setVistaCalcularInteresFormula2(miVistaFormula2);
        miGestorClases.setVistaCalcularValorPresente(miVistaValorPresente);
        miGestorClases.setVistaCalcularValorFinal(miVistaValorFinal);
        miGestorClases.setVistaCalcularTiempo(miVistaTiempo);
        miGestorClases.setVistaCalculoTimpo(miVistaCalcularTiempo);
        miGestorClases.setInteres(miInteres);
        miGestorClases.setCalInteres(miCalInteres);
        

        // Venetana Visible
        miVentanaPrincipal.setVisible(true);
    }
}
