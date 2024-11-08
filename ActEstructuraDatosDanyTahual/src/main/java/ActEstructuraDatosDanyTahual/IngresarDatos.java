/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActEstructuraDatosDanyTahual;

/**
 *
 * @author Dany Alexsis Tahual
 */
public class IngresarDatos {
    
    private static int ultimoCodigo= 0; 
    
    private int codigo; 
    private String Nombe; 
    private String Apellido; 
    private String Puesto; 
    private double SueldoBase; 
    private double Bonificacion; 
    private double Igss; 
    private double SueldoLiquido; 


    public IngresarDatos(int codigo, String Nombe, String Apellido, String Puesto, double SueldoBase, double Bonificacion) {
        this.codigo = ++ultimoCodigo;
        this.Nombe = Nombe;
        this.Apellido = Apellido;
        this.Puesto = Puesto;
        this.SueldoBase = SueldoBase;
        this.Bonificacion = Bonificacion;

    }

    public IngresarDatos() {
        this.codigo = ++ ultimoCodigo; 
    }
    

    public int getCodigo() {
        return codigo;
    }

    public String getNombe() {
        return Nombe;
    }

    public void setNombe(String Nombe) {
        this.Nombe = Nombe;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public double getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(double SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public double getBonificacion() {
        return Bonificacion;
    }

    public void setBonificacion(double Bonificacion) {
        this.Bonificacion = Bonificacion;
    }
    
    public double getIgss (){
        Igss = getSueldoBase() * 0.0483;       
        return Igss; 
    }
    
    public double getSueldoLiquido (){
        SueldoLiquido = getSueldoBase() + getBonificacion() - getIgss(); 
        return SueldoLiquido; 
    }
    

      
    
}
