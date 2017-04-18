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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
      
      //Creacion de variables
       String articulo;
       double costo;
       double utilidad;
       double impuesto;
       double  precio;

      //Asignacion de variables
      utilidad=150;
      impuesto=15;
      
      //Solicitud al usuario para ingresar variables
        System.out.println("Ingrese el nombre del artículo");
        articulo = datos.next();
        
        System.out.println("Ingrese el costo del articulo");
        costo = datos.nextInt();
        
        // realizar la operación
       utilidad = costo*utilidad;
       impuesto= costo*impuesto;
       precio= utilidad + impuesto;
        
        // Presentar en pantalla
        System.out.println("La utilidad: "+utilidad );
        System.out.println("el impuesto: "+impuesto );
        System.out.println("el precio total: "+precio);
        
    }
    
}
