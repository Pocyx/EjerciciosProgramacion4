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
public class Ejer8Tema4 {
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
        
        if (media >= 0 && media <5) {
            System.out.print("Insuficiente ");
        }else if (media == 5) {
            System.out.print("Suficiente ");
        }else if (media > 5 && media <= 7) {
            System.out.print("Bien ");
        }else if (media >= 7 && media < 9) {
            System.out.print("Notable ");
        }else if (media >= 9 && media <= 10) {
            System.out.print("Sobresaliente ");
        }else {
            System.out.print("La nota no esta entre 0-10 ");
        }

        System.out.println(", la media es : " + media);
        
    }
}
