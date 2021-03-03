package contols;

import model.Interes;
import view.VentanaPrincipal;
import view.paneles.VistaCalcularInteres;
import view.paneles.VistaCalcularTasaInteres;
import view.paneles.VistaCalcularTasaInteresF1;
import model.TasaInteres;
import view.paneles.VistaCalcularTasaInteresF2;
import view.paneles.VistaCalcularTiempo;
import view.paneles.VistaCalcularValorFinal;
import view.paneles.VistaCalcularValorPresente;
import view.paneles.VistaTiempo;

public class GestorClases {

    /*  
    Se crean Accesos para modificar y acceder a las distintas clases atravez de las 
    instancias que se hacen de forma local.
     */

    private VentanaPrincipal miVentanaPrincipal;
    private VistaCalcularInteres miCalInteres;
    private VistaCalcularTasaInteres miVistaTInteres;
    private Interes miInteres;
    private VistaCalcularTasaInteresF1 miVistaFormula1;
    private VistaCalcularTasaInteresF2 miVistaFormula2;
    private VistaCalcularValorPresente miVistaValorPresente;
    private VistaCalcularValorFinal miVistaValorFinal;
    private VistaTiempo miVistaCalcularTiempo;
    private VistaCalcularTiempo miVistaCalculoTiempo;
    public TasaInteres miCalTasaInteres;

    /*  Metodos Ventana Principal */
    public VentanaPrincipal getMiVentanaPrincipal() {
        return miVentanaPrincipal;
    }

    public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
        this.miVentanaPrincipal = miVentanaPrincipal;
    }

    /*---------------------------------------------------*/

 /*     Metodos de la Vista Calcular Interes*/
    public VistaCalcularInteres getCalInteres() {
        return miCalInteres;
    }

    public void setCalInteres(VistaCalcularInteres miCalInteres) {
        this.miCalInteres = miCalInteres;
    }

    /*------------------------------------------------------*/
 /*      Metodos Para Calcular Interes    */
    public Interes getInteres() {
        return miInteres;
    }

    public void setInteres(Interes miInteres) {
        this.miInteres = miInteres;
    }

    /*--------------------------------------------*/

 /*       Metodos Para Visata Calcular Interes     */
    public VistaCalcularTasaInteres getVistaCalcularTasaInteres() {
        return miVistaTInteres;
    }

    public void setVistaCalTInteres(VistaCalcularTasaInteres miVistaTInteres) {
        this.miVistaTInteres = miVistaTInteres;
    }

    /*-----------------------------------------------*/

 /*             Metodo de la Primera Formula      */
    public VistaCalcularTasaInteresF1 getVistaCalcularTasaInteresF1() {
        return miVistaFormula1;
    }

    public void setVistaCalInteresFormula1(VistaCalcularTasaInteresF1 miVistaFormula1) {
        this.miVistaFormula1 = miVistaFormula1;
    }

    /*------------------------------------------------------*/
 /*               Vista Formula2              */
    public VistaCalcularTasaInteresF2 getVistaCalcularTasaInteresF2() {
        return miVistaFormula2;
    }

    public void setVistaCalcularInteresFormula2(VistaCalcularTasaInteresF2 miVistaFormula2) {
        this.miVistaFormula2 = miVistaFormula2;
    }

    /*-------------------------------------------*/

 /*          Vista Calcular Valor Presente     */
    public VistaCalcularValorPresente getVistaCalcularValorPresente() {
        return miVistaValorPresente;
    }

    public void setVistaCalcularValorPresente(VistaCalcularValorPresente miVistaValorPresente) {
        this.miVistaValorPresente = miVistaValorPresente;
    }

    /*------------------------------------------------------------------------------------------*/
 /*        Vista Calcular Valor Final        */
    public VistaCalcularValorFinal getVistaCalcularValorFinal(){
        return miVistaValorFinal;
    }
    
    public void setVistaCalcularValorFinal(VistaCalcularValorFinal miVistaValorFinal) {
        this.miVistaValorFinal = miVistaValorFinal;
    }
    /*------------------------------------------------------------------------------------------*/
    
    /*      Vista Calcular Tiempo      */
    
    public VistaTiempo getVistaCalcularTiempo(){
        return miVistaCalcularTiempo;
    }
    
    public void setVistaCalcularTiempo(VistaTiempo miVistaTiempo) {
        this.miVistaCalcularTiempo = miVistaTiempo;
    }
    
    /*------------------------------------------------------------------------------------------*/
    
    /*              Vista Para Calcular Tiempo      */
    
    public VistaCalcularTiempo getVistaCalculoTiempo(){
        return miVistaCalculoTiempo;
    }
    
    public void setVistaCalculoTimpo(VistaCalcularTiempo miVistaCalcularTiempo) {
        this.miVistaCalculoTiempo = miVistaCalcularTiempo;
    }
    
    /*-------------------------------------------------------------------------------------------*/
    public TasaInteres getCalTasaDeInteres() {
        return miCalTasaInteres;
    }

    public void setCalTasaDeInteres(TasaInteres miCalTasaInteres) {
        this.miCalTasaInteres = miCalTasaInteres;
    }

    /*----------------------- Fuinciones para mostrar las ventanas --------------------------*/
    private void mostrarVistaCalculoInteres() {
        miCalInteres.setVisible(true);
    }

    private void mostrarVistaCalculoTasaInteres() {
        miVistaTInteres.setVisible(true);
    }

    private void mostrarVistaFormula1() {
        miVistaFormula1.setVisible(true);
    }

    private void mostrarVistaFormula2() {
        miVistaFormula2.setVisible(true);
    }

    private void mostrarVistaCalcularValorPresente() {
        miVistaValorPresente.setVisible(true);
    }
    
    private void mostrarVistaCalularValorFinal(){
        miVistaValorFinal.setVisible(true);
    }
    
    private void mostrarVistaCalculoTiempo(){
        miVistaCalculoTiempo.setVisible(true);
    }
    
    private void mostrarVistaCalcularTiempo(){
        miVistaCalcularTiempo.setVisible(true);
    }
    /*
    
    Terminar de dividir los calculos en los distintos archivos
    
     */

 /*------------------------ Desicion del metoo para mostrar ventanas------------------------------------------*/
    public void CargarCalculo(String Cal) {
        switch (Cal) {
            case "Calcular Interes":
                mostrarVistaCalculoInteres();
                break;
            case "Calcular Tasa Interes":
                mostrarVistaCalculoTasaInteres();
                break;
            case "Calcular Valor Presente":
                mostrarVistaCalcularValorPresente();
                break;
            case "Calcular Valor Final":
                mostrarVistaCalularValorFinal();
                break;
            case "Calcular Tiempo":
                mostrarVistaCalculoTiempo();
                break;
        }

    }

    public void CargarFormulas(String Formulas) {
        switch (Formulas) {
            case "Calcular Con el Interes":
                mostrarVistaFormula1();
                break;
            case "Calcular Con Valor Final e Inicial":
                mostrarVistaFormula2();
                break;

        }
    }

    /*------------------------------------------------------------*/
 /* Interes  */
 /* Tasa Interes F1 */
    public String TasaInteresF1(String num1, String num2) {
        if (num1.equals("") || num2.equals("")) {
            return "No deje ningun Campo Vacio";
        } else {
            float Vinicial = Float.parseFloat(num1);
            float interes = Float.parseFloat(num2);

            if (Vinicial > 0 && interes > 0) {
                return Float.toString(interes / Vinicial);
            } else {
                return "No puede ingresar datos negativos";
            }
        }
    }

    /* Tasa Interes F2  */
    public String TasaInteresF2(String vI, String vF) {
        if (vI.equals("") || vF.equals("")) {
            return "No deje ningun Campo Vacio";
        } else {
            float Vinicial = Float.parseFloat(vI);
            float Vfinal = Float.parseFloat(vF);
            if (Vinicial > 0 && Vfinal > 0) {
                return Float.toString((Vfinal - Vinicial) / Vinicial);
            } else {
                return "No puede ingresar datos negativos";
            }
        }
    }

    /*           Opereaciones    */

 /* Valor final */
    public String ValorFinal(String num1, String num2) {
        if (num1.equals("") || num2.equals("")) {
            return "No deje ningun campo vacio";
        } else {
            float Vpresente = Float.parseFloat(num1);
            float tInteres = Float.parseFloat(num2);
            if (Vpresente > 0 && tInteres > 0) {
                return Float.toString(Vpresente * (1 + tInteres));
            } else {
                return "No puede ingresar datos negativos";
            }

        }
    }

    /* Valor Presente */
    public String ValorPresente(String Vf, String tI, String tiem) {

        if (Vf.equals("") || tI.equals("") && tiem.equals("")) {
            return "No deje ningun campo vacio";
        } else {
            float Vfinal = Float.parseFloat(Vf);
            float tInteres = Float.parseFloat(tI);
            int tiempo = Integer.parseInt(tiem);
            if (Vfinal > 0 && tInteres > 0 && tiempo > 0) {
                return Float.toString(Vfinal / ((1 + tInteres) * tiempo));
            } else {
                return "No puede ingresar datos negativos o iguales a cero";
            }

        }
    }

    public String tiempo(String Vf, String Vp, String tI) {

        if (Vf.equals("") || Vp.equals("") && tI.equals("")) {
            return "No deje ningun campo vacio";
        } else {
            float Vfinal = Float.parseFloat(Vf);
            float Vpresente = Float.parseFloat(Vp);
            float tInteres = Float.parseFloat(tI);
            if (Vfinal > 0 && Vpresente > 0 && tInteres > 0) {
                return Float.toString(((Vpresente / Vfinal) - 1) / tInteres);
            } else {
                return "No puede ingresar datos negativos o iguales a cero";
            }
            
        }
    }

   

    

}
