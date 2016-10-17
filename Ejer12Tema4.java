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

public class Ejer12Tema4 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE 1º DAW");
    
    System.out.println("1. En la consola del sistema ¿Cual es la función del comando  lusrmgr.msc  ?");
    System.out.println("a) Administrar seguridad del sistema\nb) Modificar usuarios y grupos\nc) no existe"); 
    System.out.print("=> ");
    respuesta = s.nextLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("2. En la consola del sistema ¿Cual es la función del comando  diskmgmt.msc  ?");
    System.out.println("a) Modificar permisos\nb) Administrar disco\nc) Instación de recursos"); 
    System.out.print("=> ");
    respuesta = s.nextLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("3. En la consola del sistema ¿Cual es la función del comando  net user  ?");
    System.out.println("a) Administrar cuentas de usuario\nb) Borrar programas en desuso\nc) Recuperar datos"); 
    System.out.print("=> ");
    respuesta = s.nextLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("4. En la consola del sistema ¿Cual es la función del comando  secpol.msc  ?");
    System.out.println("a) Administrar seguridad\nb) Configurar cortafuegos\nc) no existe"); 
    System.out.print("=> ");
    respuesta = s.nextLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("5. En la consola del sistema ¿Cual es la función del comando  ipconfig  ?");
    System.out.println("a) Recursos de la RAM\nb) Informacion estado hardware\nc) Administrar conexiones de red"); 
    System.out.print("=> ");
    respuesta = s.nextLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }
    
    System.out.println("6. En la consola del sistema ¿Cual es la función del comando  msconfig  ?");
    System.out.println("a) Estado de la RAM\nb) Configura inicio del sistema\nc) Estado de la ROM"); 
    System.out.print("=> ");
    respuesta = s.nextLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
