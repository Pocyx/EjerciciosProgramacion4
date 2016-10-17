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
public class Ejer6Tema4 {
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);
        System.out.print("      -TIEMPO QUE TARDA EN CAER UN OBJETO- \n\n");
        System.out.print("Introduce la altura en metros: "); 
        double h = Double.parseDouble(s.nextLine()); 
        double g = 9.81;
   
        double tiempo = Math.sqrt((2*h) / g);
        
       
        
        
        System.out.println("\nSi la altura en la que esta el objeo es "+h+
                           " metros, el tiempo que tardará en caer será: "+tiempo+" segundos");
        
    }
}
