/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogravedad;

//Importo el paqueta java.util para poder utilizar la clase Scanner

import java.util.*;

/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t = √2h g siendo g = 9.81m/s 2
 *
 * @author Amarico
 */
public class EjercicioGravedad {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    // Creo un objeto de la clase Scanner
    
    Scanner entrada = new Scanner (System.in);
    
    // Creo las variables de tipo double
    
    double altura, tiempo;
    
    // Creo una constante de la gravedad 
    
     final double gravedad = 9.82;
    
     
     // Pido la altura por teclado
     
     System.out.println("Introduce la altura: ");
     
     altura = entrada.nextDouble();
     
     // Realizo la fórmula 
     tiempo  = Math.sqrt(2*altura/gravedad);
     
     // Imprimo por pantalla el resultado
     
     System.out.println("El tiempo que tardará en caer el objeto desde una altura" + altura + " será de: "+tiempo);
     
     
    
    
  }
  
}
