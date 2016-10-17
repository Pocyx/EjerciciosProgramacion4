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
public class Ejer11Tema4 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("      -A LAS 12 EN CASA- \n\n");
        System.out.print("Introduce la hora actual: ");
        int hora = Integer.parseInt(s.nextLine()); 
        System.out.print("Introduce los minutos actuales: ");
        int minutos = Integer.parseInt(s.nextLine());
        
        int segundosH = hora * 3600;
        int segundosM = minutos * 60;
        int segundos = segundosH + segundosM;
        int segLimite = 24 * 3600;
        int segRestantes = segLimite - segundos;
        
        System.out.println("Faltan "+segRestantes+" segundos para media noche.");        
    }
    
}
