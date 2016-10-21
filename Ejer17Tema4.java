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
public class Ejer17Tema4 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("    -ULTIMA CIFRA- ");
    System.out.print("Por favor, introduzca un numero entero: ");
    int n = Integer.parseInt(s.nextLine());
    System.out.println("La ultima cifra del numero "+n+" es " + (Math.abs(n) % 10));
  }
}
