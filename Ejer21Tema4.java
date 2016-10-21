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
public class Ejer21Tema4 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    System.out.println("    -NOTA MEDIA-");
    System.out.print("Nota del primer control: ");
    double nota1 = Double.parseDouble(s.nextLine());

    System.out.print("Nota del segundo control: ");
    double nota2 = Double.parseDouble(s.nextLine());
    
    double media = (nota1 + nota2) / 2;
    
    if (media < 5) {
      System.out.print("¿Cual ha sido el resultado de la recuperacion? (apto/no apto): ");
      String recuperacion = s.nextLine();
      if (recuperacion.equals("apto")) {
        media = 5;
      }
    }
    
    System.out.print("Tu nota de Programacion es " + media);
  }
}
