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
public class Ejer20Tema4 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n;
    boolean capicua = false;
    System.out.println("   -CAPICUA-");
    System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
    n = Integer.parseInt(s.nextLine());
    
    
    // número de una cifra
    if (n < 10) {
      capicua = true;
    }
    
    // número de dos cifras
    if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        capicua = true;
      }
    }

    // número de tres cifras
    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        capicua = true;
      }
    }

    // nÃºmero de cuatro cifras
    if ((n >= 1000) && (n < 10000)) {
      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
        capicua = true;
      }
    }
    
    // nÃºmero de cinco cifras
    if (n >= 10000) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
      System.out.println("El número introducido es capicua.");
    } else {
      System.out.println("El número introducido no es capicua.");
    }
  }
}
