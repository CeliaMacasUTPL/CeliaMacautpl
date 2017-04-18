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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
         
      // Creacion de variables
      int tiempoS;
      int distancia;
      
      //Solicitud al usuario para ingresar variables
        System.out.println("Ingrese el tiempo en segundos");
        tiempoS = datos.nextInt();
        
      //Realizar la operacion
      distancia = 300000 * tiempoS;
      
      // Presentar en pantalla
        System.out.println("La distancia que recorre es:"+distancia);
    }
    
}
