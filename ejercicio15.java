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
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner datos = new Scanner (System.in);
     
     //Creación de  variables
     double r;
     double ta;
     double cota;
     double sec;
     double cose;
     
     //Solicitud al usuario para ingresar variables
        System.out.println("Angulo en radianes");
        System.out.println("Radianes");
        r = datos.nextDouble();
        
     //Realizar operaciones
     r= Math.toRadians(r);
     ta = Math.sin(r)/Math.cos(r);
     cota = Math.cos(r)/Math.sin(r);
     sec = 1/Math.cos(r);
     cose =1/Math.sin(r);
     
     
     //Presentar en Pantalla
        System.out.println("Tangente: " +ta+"\n Cotangente: "+cota+"\n Secante: "+sec+"\n Cosecante: "+cose);
             
    }
    
}
