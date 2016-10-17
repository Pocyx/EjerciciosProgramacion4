/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer7Tema4 {
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);
        System.out.print("      -CALCULA LA MEDIA- \n\n");
        System.out.print("Introduce la primera nota: "); 
        double nota1 = Double.parseDouble(s.nextLine()); 
        System.out.print("Introduce la segunda nota: "); 
        double nota2 = Double.parseDouble(s.nextLine());
        System.out.print("Introduce la tercera nota: "); 
        double nota3 = Integer.parseInt(s.nextLine());
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media es : " + media);
        
    }
}
