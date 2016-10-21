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
public class Ejer22Tema4 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("   -CUANTO QUEDA PARA EL FINDE?-");
    System.out.print("Por favor, introduzca un dIa de la semana (de lunes a viernes): ");
    String dia = s.nextLine();

    int diaNumerico = 0;

    switch(dia) {
      case "lunes":
        diaNumerico = 0;
        break;
      case "martes":
        diaNumerico = 1;
        break;
      case "miÃrcoles":
      case "miercoles":
        diaNumerico = 2;
        break;
      case "jueves":
        diaNumerico = 3;
        break;
      case "viernes":
        diaNumerico = 4;
        break;
      default:
        System.out.print("El dia introducido no es correcto.");
    }
    
    System.out.println("A continuacion introduzca la hora (hora y minutos)");
    
    System.out.print("Hora: ");
    int horas = Integer.parseInt(s.nextLine());
    
    System.out.print("Minutos: ");
    int minutos = Integer.parseInt(s.nextLine());
    
    int minutosTotales = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (diaNumerico * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
  }
}
