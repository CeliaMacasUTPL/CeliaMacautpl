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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner datos = new Scanner (System.in);

      //Creación de variables
      int cantdolares;
      int pesos;
      int Vtotal;
      
      //Solicitud al usuario para ingresar variables
        System.out.println("Ingresar la cantidad en dolares");
        cantdolares = datos.nextInt();
        System.out.println("Ingresar la cantidad en pesos");
        pesos = datos.nextInt();
        
      //Realizar la operación
      Vtotal = cantdolares * pesos;
      
      //Presentar en pantalla
        System.out.println("La cantidad a pagar es: "+Vtotal);
    }
    
}
