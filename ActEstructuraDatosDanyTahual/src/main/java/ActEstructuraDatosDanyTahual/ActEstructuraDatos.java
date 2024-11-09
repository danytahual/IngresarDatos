/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActEstructuraDatosDanyTahual;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dany Alexsis Tahual
 */
public class ActEstructuraDatos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int opcion = 0;
        
        
        

        do {
           
            System.out.println("Ingreso de datos :");
            System.out.println("1) Ingresar datos ");
            System.out.println("2) Buscar empleado ");
            System.out.println("3) Modificar datos ");
            System.out.println("4) Listas empleados ");
            System.out.println("5) Salir ");
            
             try{ 
                opcion = scanner.nextInt(); 
           
            switch (opcion) {
                case 1:
                     GestionarDatos.IngresoDeDatos(scanner);
                    break;
                case 2: 
                     GestionarDatos.BucarEmpleado(scanner);
                    break;
                case 3: 
                    GestionarDatos.modificardatos(scanner);
                    break;
                case 4:
                    GestionarDatos.ListarEmpleados();
                    break; 
                case 5:
                    System.out.println("gracias por usar el sistema ");
                    break;
                default:
                    System.out.println("ingrese otra opcion opcion invalida ");
            }
           }catch(InputMismatchException e){
                    System.out.println("ha ingresado una letra en ves de numero ");
                    scanner.nextLine(); 
                    }

        } while (opcion != 5);

    }

}
