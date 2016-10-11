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
public class Ejer9Tema4 {
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);
        System.out.print("      -EQUACION DE SEGUNDO GRADO- \nax*x + bx + c = 0 \n");
        System.out.print("Introduce a: "); 
        double a = Double.parseDouble(s.nextLine()); 
        System.out.print("Introduce b: "); 
        double b = Double.parseDouble(s.nextLine());
        System.out.print("Introduce c: "); 
        double c = Double.parseDouble(s.nextLine());
        
        if (a != 0) {
            double x1 = (-b+Math.sqrt((b*b)- (4*a*c)) / (2*a));
            double x2 = (-b-Math.sqrt((b*b)- (4*a*c)) / (2*a));
            System.out.print("La primera solucion es: "+x1+"\ny la segunda es :"+x2);
            
        }
        
        else if (a==0 && b!=0){
            System.out.print("a es 0 y b es distinto a 0 asi que no tiene solucion. ");
        }
        
        else if (a==0 && b==0){
            System.out.print("a y b son 0, esta ecuacion tiene infinitas soluciones. ");
        }
        
        
    }
}
