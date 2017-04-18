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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner datos = new Scanner (System.in);
     
    //Creación de  variables
    double y,p,l,m;
    int d;
    //Solicitud al usuario para ingresar variables
        System.out.println("Introduce el numero de dolares a comprar");
        d = datos.nextInt();
        
    //Realizar la operacion
    y = (d*91.2001);
    p = (d*100);
    l = (d*0.597);
    m = (d*1.330);
    
    //Presentar en pantalla
        System.out.println("La cantidad de pagar en yenes es:" +y);
        System.out.println("La cantidad de pagar en pesetas es:" +p);
        System.out.println("La cantidad de pagar en libras esterlinas es:" +l);
        System.out.println("La cantidad de pagar en marcos es:" +m);
    }
    
}
