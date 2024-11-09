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
    
    public static void BucarEmpleado (Scanner scanner){
        boolean encontrado = false; 
        System.out.println("ingrese el id del trabajador que busca: ");
        int buscarCodigo = scanner.nextInt(); 
        scanner.nextLine(); 
        
        for(IngresarDatos dato: Listdatos){
            if(dato.getCodigo() == buscarCodigo){
                   System.out.println("codigo: "+ dato.getCodigo());
                System.out.println("nombre completo: "+ dato.getNombe() + " "+ dato.getApellido());
                System.out.println("puesto:" + dato.getPuesto());
                System.out.println("sueldo base: " + dato.getSueldoBase());
                System.out.println("bonificacion"+ dato.getBonificacion());
                System.out.println("Igss: " + dato.getIgss());
                System.out.println("sueldo liquido: " + dato.getSueldoLiquido());
                System.out.println("--------------------------------------------\n");
                encontrado = true; 
                break;
            }
        }
        if(!encontrado){
            System.out.println("empleado con el codigo: "+ buscarCodigo + " no se ha encontrado ");
        }
    }
    
    public static  void modificardatos(Scanner scanner){
        boolean encontrado = false ; 
        
        System.out.println("ingrese el codigo que desea modificar ");
        int buscarCodigo = scanner.nextInt(); 
        scanner.nextLine(); 
        
        for(IngresarDatos dato : Listdatos){
            if(buscarCodigo == dato.getCodigo()){
                
                System.out.println("nombre actual: "+ dato.getNombe());
                System.out.println("ingrese el nombre a modificar ");
                dato.setNombe(scanner.nextLine());
                
                System.out.println("apellido actual: "+ dato.getApellido());
                System.out.println("ingrese el apellido a modificar");
                dato.setApellido(scanner.nextLine());
                
                System.out.println("puesto actual: " + dato.getPuesto());
                System.out.println("ingrese el puesto a modificar ");
                dato.setPuesto(scanner.nextLine());
                
                System.out.println("suedlo base actual: "+ dato.getSueldoBase());
                System.out.println("ingrese el sueldo base a modificar ");
                dato.setSueldoBase(scanner.nextDouble());
                scanner.nextLine(); 
                
                System.out.println("bonificacion actual: "+ dato.getBonificacion());
                System.out.println("ingrese la bonificaccion a modificar");
                dato.setBonificacion(scanner.nextDouble());
                scanner.nextLine(); 
                
                encontrado= true;     
                System.out.println("empleado modificado correctamente ");
                break;
            
            }
        
        }
            if(!encontrado){
                System.out.println("el codigo: "+ buscarCodigo + " no esta en el sistema");
            }
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
