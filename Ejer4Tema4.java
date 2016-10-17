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
public class Ejer4Tema4 {
    
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);
        System.out.print("      -TU SALARIO- \n\n");
        System.out.print("Introduce horas trabajadas a la semana: "); 
        double horasTrabajadas = Double.parseDouble(s.nextLine()); 
        System.out.print("Introduce salario base en € (40 horas/semana): "); 
        double salarioBase = Double.parseDouble(s.nextLine());
        System.out.print("Introduce extra en €: "); 
        double salarioExtra = Integer.parseInt(s.nextLine());
        double salarioTotal = 0;
        
        if (horasTrabajadas <= 40) {
            salarioTotal = horasTrabajadas * salarioBase;
        }
        
        else if (horasTrabajadas > 40) {
            double horasExtra = horasTrabajadas - 40;
            salarioTotal = (40 * salarioBase) + (horasExtra * salarioExtra);
        }
        
        
        System.out.println("\nSi has trabajado "+horasTrabajadas+
                           " horas a la semana, tu salario será: "+salarioTotal+" €");
        
    }
    
}
