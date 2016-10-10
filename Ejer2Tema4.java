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
public class Ejer2Tema4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("      Dime la hora y seré educado- \n\n");
        System.out.print("Introduce una hora: ");
        double hora = Double.parseDouble(s.nextLine());
        
        
        if (hora >= 6 && hora <= 12){
            System.out.println("Buenos dias!! \n son las: " + hora );
            
        }
        
        else if (hora >= 13 && hora <= 20){
            System.out.println("Buenas tardes!! \n son las: " + hora );
        }
        
        else if (hora >= 21 || hora <= 5){
            System.out.println("Buenas noches!! \n son las: " + hora );
        }else{
            System.out.println("Lo siento, esa hora no es correcta" );
        }
        
    }
}
