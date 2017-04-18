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
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner datos = new Scanner (System.in);
      
      //Creación de  variables
      double grados;
      double r;
      double cos;
      double sen;
      
     //Solicitud al usuario para ingresar variables
        System.out.println("Introduce el número de angulo en grados: ");
        grados = datos.nextDouble();
        
      //Realizar las operaciones
      r = (grados * 3.146 / 180);
      cos = Math.cos(r);
      sen = Math.cos(r);
      
      
       //Presentar en pantalla
        System.out.println("El valor del seno es:"+ sen);
        System.out.println("El valor del coseno es"+ cos);
        
        
    }
    
}
