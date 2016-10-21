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
public class Ejer23Tema4 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("    -FACTURA-");
    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(s.nextLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = s.nextLine();
    
    System.out.print("Introduzca el codigo promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromocional = s.nextLine();
    
    // Calcula el IVA y el precio antes del descuento
    
    int tipoIVANumerico = 0;
    
    switch(tipoIVA) {
      case "general":
        tipoIVANumerico = 21;
        break;
      case "reducido":
        tipoIVANumerico = 10;
        break;
      case "superreducido":
        tipoIVANumerico = 4;
        break;
      default:
        System.out.print("El tipo de IVA introducido no es correcto.");
    }
    
    double iva = baseImponible * tipoIVANumerico / 100;
    double precioSinDescuento = baseImponible + iva;
    
    // Calcula el descuento
    
    double descuento = 0;
    
    switch(codigoPromocional) {
      case "nopro":
        break;
      case "mitad": // el precio se reduce a la mitad
        descuento = precioSinDescuento / 2;
        break;
      case "meno5": // se descuentan 5 euros
        descuento = 5;
        break;
      case "5porc": // se descuenta el 5%
        descuento = precioSinDescuento * 0.05;
        break;
      default:
        System.out.print("El codigo promocional introducido no es correcto.");
    }
    
    // Muestra el precio final del producto desglosado
    
    double total = precioSinDescuento - descuento;
    
    System.out.printf("Base imponible       %6.2f\n", baseImponible);
    System.out.printf("IVA (%2d%%)            %6.2f\n", tipoIVANumerico, iva);
    System.out.printf("Precio con IVA       %6.2f\n", precioSinDescuento);
    System.out.printf("Cod. promo. (%s) -%6.2f\n", codigoPromocional, descuento);
    System.out.printf("TOTAL                %6.2f", total);
  }

}
