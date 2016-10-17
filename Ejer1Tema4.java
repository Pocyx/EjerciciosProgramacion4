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
public class Ejer1Tema4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("      -Que asignatura toca a primera?- \n\n");
        System.out.print("Introduce el dia de la semana: ");
        String dia = s.nextLine().toLowerCase(); 
        
        String asignatura;
        
        
        switch (dia) {
            case "lunes":
                asignatura = "Sistemas informaticos";
                break;
                
            case "martes":
                asignatura = "Programacion";
                break;
                
            case "miercoles":
                asignatura = "Programacion";
                break;
                
            case "jueves":
                asignatura = "Bases de datos";
                break;
                
            case "viernes":
                asignatura = "Lenguage de marcas";
                break;
                
            default:
                asignatura = "no existe ese dia";
                
            
        }
        System.out.println("El " + dia + " a primera hora tenemos: " + asignatura);
    }
    
}
