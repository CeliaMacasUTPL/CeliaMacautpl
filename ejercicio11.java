/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
      
      //Creación de  variables
      double r;
      double volumen;
      double area;
      
      
     //Solicitud al usuario para ingresar variables
      System.out.println("Ingrese el radio de una esfera:");
      r=datos.nextDouble();
        
      //Realizar la operacion
      volumen = (4*3.1416)*(r*r);  
      area = (3.1416*r*r);
      
      //Presentar en pantalla
        System.out.println("El volumen de la esfera es:"+ volumen);
        System.out.println("El area de la esfera es:"+ area);
        
    
    }
    
}
