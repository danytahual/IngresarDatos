/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActEstructuraDatosDanyTahual;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dany Alexsis Tahual
 */
public class GestionarDatos {

      private static  ArrayList<IngresarDatos> Listdatos = new ArrayList<>(); 

    
    public static void IngresoDeDatos (Scanner scanner){
        
        IngresarDatos datos = new IngresarDatos(); 
        
        System.out.println("Id: " + datos.getCodigo());
        scanner.nextLine(); 
        
        System.out.println("ingrese su nombre ");
        datos.setNombe(scanner.nextLine());
        

        System.out.println("ingrese su apellido");
        datos.setApellido(scanner.nextLine());
        
        System.out.println("ingrese su puesto: ");
        datos.setPuesto(scanner.nextLine());
        
        System.out.println("Sueldo Base ");
        datos.setSueldoBase(scanner.nextDouble());
        scanner.nextLine(); 
        System.out.println("Bonificacion: ");
        datos.setBonificacion(scanner.nextDouble());
        scanner.nextLine(); 
        
        datos.getIgss(); 
        datos.getSueldoLiquido(); 
        
        Listdatos.add(datos); 
        System.out.println("empleado agregado correctamente ");

    }
    
    public static void ListarEmpleados (){
         
        if(Listdatos.isEmpty()){
            System.out.println("no hay datos ingresados ");
        }else{
            
            for(IngresarDatos dato: Listdatos){
                
                System.out.println("codigo: "+ dato.getCodigo());
                System.out.println("nombre completo: "+ dato.getNombe() + " "+ dato.getApellido());
                System.out.println("sueldo base: " + dato.getSueldoBase());
                System.out.println("bonificacion"+ dato.getBonificacion());
                System.out.println("Igss: " + dato.getIgss());
                System.out.println("sueldo liquido: " + dato.getSueldoLiquido());
                System.out.println("--------------------------------------------\n");
                
                
            }
            
        }
        
    }
    
    
}
