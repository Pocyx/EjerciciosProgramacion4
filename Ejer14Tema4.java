/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosProgramacion4;



/**
 *
 * @author PocyxDesigner
 */
public class Ejer14Tema4 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("      -PAR Y DIVISIBLE ENTRE 5- \n\n");
        System.out.print("Introduce un número entero: ");
        int num = Integer.parseInt(s.nextLine()); 
        
        if(num%2==0){
           System.out.print("El número "+num+" es par"); 
        }else{
            System.out.println("El número "+num+" no es par "); 
        }
        if(num%5==0){
            System.out.println("\nEl número "+num+" es divisible entre 5"); 
        }else{
            System.out.print("\nEl número "+num+" no es divisible entre 5"); 
        }
        
    }
    
}
