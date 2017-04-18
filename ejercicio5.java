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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
       
      //Creacion de variables
      int gradosCentigrados;
      double temperaturaF;
      
     //Solicitud al usuario para ingresar variables
      System.out.println("Ingrese los grados centigrados");
      gradosCentigrados = datos.nextInt();
      
      //Realizar la operación
      temperaturaF = (gradosCentigrados * 1.8)+32;
      
      //presentar en pantalla
        System.out.println("La temperatura en Faherenheit es: "+temperaturaF);
        
      
    }
    
}
