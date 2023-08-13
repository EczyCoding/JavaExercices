/* EJERCICIO 3: 
   Programa que lea la inicial de un nombre */
package ejercicios3;
import java.util.Scanner;
public class ejercicios3 {
    public static void main(String[] args) {
    Scanner src = new Scanner(System.in);
        char vnom;
        
        System.out.print("Ingrese un nombre: ");
        vnom = src.next().charAt(0);
        
        System.out.print("Caracter: "+vnom);
    }
    
}
