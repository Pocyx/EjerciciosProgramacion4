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
public class Ejer3Tema4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("      -Que asignatura toca a primera?- \n\n");
        System.out.print("Introduce el dia de la semana: ");
        int dia = Integer.parseInt(s.nextLine().toLowerCase()); 
        
        String diaSemana;
        
        
        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
                
            case 2:
                diaSemana = "Martes";
                break;
                
            case 3:
                diaSemana = "Miercoles";
                break;
                
            case 4:
                diaSemana = "Jueves";
                break;
                
            case 5:
                diaSemana = "Viernes";
                break;
                
            default:
                diaSemana = "no existe ese dia";
                
            
        }
        System.out.println("El dia de la semana es: " + diaSemana );
    }
}
