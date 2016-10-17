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
public class Ejer10Tema4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("      -HOROSCOPOP- \n\n");
        System.out.print("Introduce el dia que naciste: ");
        int dia = Integer.parseInt(s.nextLine()); 
        System.out.print("Introduce el mes que naciste: ");
        int mes = Integer.parseInt(s.nextLine());
        
        if((dia>=21 && mes==3) || (dia<=20 && mes==4 )){
            System.out.print("Aries ");
        }else if((dia>=21 && mes==4) || (dia<=20 && mes==5 )){
            System.out.print("Taurus ");
        }else if((dia>=21 && mes==5) || (dia<=22 && mes==6 )){
            System.out.print("Géminis ");
        }else if((dia>=23 && mes==6) || (dia<=22 && mes==7 )){
            System.out.print("Cancer ");
        }else if((dia>=23 && mes==7) || (dia<=23 && mes==8 )){
            System.out.print("Leo ");
        }else if((dia>=24 && mes==8) || (dia<=23 && mes==9 )){
            System.out.print("Virgo ");
        }else if((dia>=24 && mes==9) || (dia<=23 && mes==10 )){
            System.out.print("Libra ");
        }else if((dia>=24 && mes==10) || (dia<=22 && mes==11 )){
            System.out.print("Scropio ");
        }else if((dia>=23 && mes==11) || (dia<=21 && mes==12 )){
            System.out.print("Sagitario ");
        }else if((dia>=22 && mes==12) || (dia<=20 && mes==1 )){
            System.out.print("Capricornio ");
        }else if((dia>=21 && mes==1) || (dia<=20 && mes==2 )){
            System.out.print("Acuario ");
        }else if((dia>=21 && mes==2) || (dia<=20 && mes==3 )){
            System.out.print("Piscis ");
        }else{
            System.out.print("Dia o mes invalido ");
        }
               
    }
    
}
