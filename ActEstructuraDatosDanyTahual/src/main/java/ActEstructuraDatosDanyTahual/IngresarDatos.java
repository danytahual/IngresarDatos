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
    
    private static int ultimoCodigo= 1; 
    
    private int codigo; 
    private String Nombe; 
    private String Apellido; 
    private String Puesto; 
    private double SueldoBase; 
    private double Bonificacion; 

    public IngresarDatos(int codigo, String Nombe, String Apellido, String Puesto, double SueldoBase, double Bonificacion) {
        this.codigo = ++ultimoCodigo;
        this.Nombe = Nombe;
        this.Apellido = Apellido;
        this.Puesto = Puesto;
        this.SueldoBase = SueldoBase;
        this.Bonificacion = Bonificacion;
    }

    public static int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public static void setUltimoCodigo(int ultimoCodigo) {
        IngresarDatos.ultimoCodigo = ultimoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    @Override
    public String toString() {
        return "IngresarDatos{" + "codigo=" + codigo + ", NombeCompleto=" + Nombe + Apellido  + ", SueldoBase=" + SueldoBase + ", Bonificacion=" + Bonificacion + '}';
    }
    
    
            
            
    
    
}
