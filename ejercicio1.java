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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner (System.in);
      
      // Creacion de variables
      double  costoprod;
      int numerounidad;
      double factor;
      int costofijo;
         
      
      // Asignacion de variables 
      factor=3.5;
      costofijo=10700;
      
      //Solicitud al usuario para ingresar variables
      System.out.println("Ingrese el número de unidades producidas");
      numerounidad = datos.nextInt();
      
      // Realizo la operación
      costoprod = (numerounidad *(3.5 + 10700));
      
      //Presentar en pantalla
        System.out.println("El costo de producción de un articulo es:"+ costoprod);
    }
    
}
