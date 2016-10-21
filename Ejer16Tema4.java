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
public class Ejer16Tema4 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    String respuesta;
    int puntos = 0;
    
    System.out.println("TEST DE FIDELIDAD");
    System.out.println("Este programa te dirÃ¡ si hay probabilidad de que tu pareja estÃ¡ siendo infiel.\n");

    System.out.print("1. Tu pareja parece estar mas inquieta de lo normal sin ningÃºn motivo aparente.\n(v)erdadero o (f)also: ");
    respuesta = s.nextLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("2. Ha aumentado sus gastos de vestuario.\n(v)erdadero o (f)also: ");
    respuesta = s.nextLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("3. Ha perdido el interÃ©s que mostraba anteriormente por ti.\n(v)erdadero o (f)also: ");
    respuesta = s.nextLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("4. Ahora se afeita y se asea con mÃ¡s frecuencia (si es hombre) o ahora se arregla el pelo y se asea con mÃ¡s frecuencia (si es mujer).\n(v)erdadero o (f)also: ");
    respuesta = s.nextLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("5. No te deja que mires la agenda de su telÃ©fono mÃ³vil.\n(v)erdadero o (f)also: ");
    respuesta = s.nextLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estÃ¡s tÃº delante.\n(v)erdadero o (f)also: ");
    respuesta = s.nextLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
        
    System.out.print("7. Ãšltimamente se preocupa mÃ¡s en cuidar la lÃ­nea y/o estar bronceado/a.\n(v)erdadero o (f)also: ");
    respuesta = s.nextLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("8. Muchos dÃ­as viene tarde despuÃ©s de trabajar porque dice tener mucho mÃ¡s trabajo.\n(v)erdadero o (f)also: ");
    respuesta = s.nextLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("9. Has notado que Ãºltimamente se perfuma mÃ¡s.\n(v)erdadero o (f)also: ");
    respuesta = s.nextLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n(v)erdadero o (f)also: ");
    respuesta = s.nextLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
  
    // Muestra el resultado del test
    
    if ( puntos <= 10 ) {
      System.out.print("Â¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    
    if ( (puntos > 11 ) && (puntos <= 22) ) {
      System.out.print("QuizÃ¡s exista el peligro de otra persona en su vida o en su mente, aunque seguramente serÃ¡ algo sin importancia. No bajes la guardia.");    
    }
    
    if ( puntos >= 22 ) {
      System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco mÃ¡s y averigÃ¼es quÃ© es lo que estÃ¡ pasando por su cabeza.");
    }
  }
}
