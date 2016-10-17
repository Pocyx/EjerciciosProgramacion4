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
public class Ejer13Tema4 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("      -ORDENAR NUMEROS- \n\n");
        System.out.print("Introduce el primer número: ");
        int n1 = Integer.parseInt(s.nextLine()); 
        System.out.print("Introduce el segundo número: ");
        int n2 = Integer.parseInt(s.nextLine());
        System.out.print("Introduce el tercer número: ");
        int n3 = Integer.parseInt(s.nextLine());
        
        if(n1<n2 && n1<n3){
            if(n2<n3){
                System.out.print("Ordenados de menor a mayor: "+n1+" "+n2+" "+n3);
            }else if(n2>n3){
                System.out.print("Ordenados de menor a mayor: "+n1+" "+n3+" "+n2);
            }
            
        }else if(n2<n1 && n2<n3){
            if(n1<n3){
                System.out.print("Ordenados de menor a mayor: "+n2+" "+n1+" "+n3);
            }else if(n1>n3){
                System.out.print("Ordenados de menor a mayor: "+n2+" "+n3+" "+n1);
            }
            
        }else if(n3<n1 && n3<n2){
            if(n1<n2){
                System.out.print("Ordenados de menor a mayor: "+n3+" "+n1+" "+n2);
            }else if(n1>n2){
                System.out.print("Ordenados de menor a mayor: "+n3+" "+n2+" "+n1);
            }
            
        }
        
    }
    
}
