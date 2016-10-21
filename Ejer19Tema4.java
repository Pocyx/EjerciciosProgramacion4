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
public class Ejer19Tema4 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n, digitos = 0;
    System.out.println("    -NUMERO DE CIFRAS-");
    System.out.print("Por favor, introduzca un numero entero (de 5 cifras como maximo): ");
    n = Math.abs(Integer.parseInt(s.nextLine()));
    
    if ( n < 10 ) {
      digitos = 1;
    }else if (( n >= 10 ) && ( n < 100 )) {
      digitos = 2;
    }else if (( n >= 100 ) && ( n < 1000 )) {
      digitos = 3;
    }else if (( n >= 1000 ) && ( n < 10000 )) {
      digitos = 4;
    }else if ( n >= 10000 && ( n < 100000 )) {
      digitos = 5;
    }else {
        System.out.println("El numero introducido tiene mas de 5 cifras");
    }
    
    System.out.println("El numero introducido tiene " + digitos + " digitos.");
  }
}
