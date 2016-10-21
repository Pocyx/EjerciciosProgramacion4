/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosProgramacion4;

import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer18Tema4 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n, primera = 0;
    System.out.println("    -PRIERA CIFRA- ");
    System.out.print("Por favor, introduzca un numero entero (de 5 cifras como maximo): ");
    n = Integer.parseInt(s.nextLine());
    
    if ( n < 10 ) {
      primera = n;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      primera = n / 10;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      primera = n / 100;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      primera = n / 1000;
    }
    
    if ( n >= 10000 ) {
      primera = n / 10000;
    }
    
    System.out.println("La primera cifra del numero introducido es el " + primera);
  }
}
