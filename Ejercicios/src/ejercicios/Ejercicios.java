/* EJERCICIO 1: 

USE 4 NOTAS, Y CALCULE EL PROMEDIO */
package ejercicios;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    
    String vnom;
    double n1, n2, n3, n4, rslt;
    
    System.out.print("CLAC - PROMEDIOS \n\n");
    
    System.out.print("Digite su nombre: \n");
    vnom = sc.nextLine();
    
    System.out.print("Ingrese el primer numero: ");
    n1 = sc.nextDouble();
    
    System.out.print("Ingrese el segundo numero: ");
    n2 = sc.nextDouble();
    
    System.out.print("Ingrese el tercer numero: ");
    n3 = sc.nextDouble();
    
    System.out.print("Ingrese el cuarto numero: ");
    n4 = sc.nextDouble();
    
    rslt = (n1+n2+n3+n4) / 4;
    
    if(rslt > 69){
    System.out.println("Nombre: "+vnom);
    System.out.print("El promedio es: "+rslt);
    System.out.print("\nEl usuario ha aprobado.");
    } else {
    System.out.println("Nombre: "+vnom);
    System.out.print("El promedio es: "+rslt);
    System.out.print("\nEl usuario ha reprobado.");
    }
    }
}