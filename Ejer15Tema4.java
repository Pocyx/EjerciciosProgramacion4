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
public class Ejer15Tema4 {
    public static void main(String[] args) {
        
                Scanner s = new Scanner(System.in);
				
		System.out.println("    -PINTA-PIRAMIDE-");
		System.out.print("Introduzca un caracter de relleno: ");
		String c = s.nextLine();
		System.out.println("Elija un tipo de pirámide");
		System.out.println("1. Con el vertice hacia arriba");
		System.out.println("2. Con el vertice hacia abajo");
		System.out.println("3. Con el vertice hacia la izquierda");
		System.out.println("4. Con el vertice hacia la derecha");
		int opcion = Integer.parseInt(s.nextLine());

		switch(opcion) {
			case 1:
        System.out.println("  " + c);
        System.out.println(" " + c + c + c);
        System.out.println(c + c + c + c + c);
        break;
			case 2:
        System.out.println(c + c + c + c + c);
        System.out.println(" " + c + c + c);
        System.out.println("  " + c);
        break;
			case 3:
        System.out.println("    " + c);
        System.out.println("  " + c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println("  " + c + " " + c);
        System.out.println("    " + c);
        break;
			case 4:
        System.out.println(c);
        System.out.println(c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println(c + " " + c);
        System.out.println(c);
        break;
      default:
		}
	}
}
