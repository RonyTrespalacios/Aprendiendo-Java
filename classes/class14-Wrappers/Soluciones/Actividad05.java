/*
    Pídele al usuario que introduzca una cadena que represente un número entero y luego otra cadena que represente un número decimal. Convierte cada cadena al tipo de dato correspondiente utilizando los métodos valueOf, suma sus valores e imprímelos por consola.
*/

package Soluciones;

import java.util.Scanner;

public class Actividad05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita un numero entero >> ");
        int num1 = Integer.valueOf(sc.nextLine());
        System.out.print("Digita un numero decimal >> ");
        double num2 = Double.valueOf(sc.nextLine());
        double suma = (double) num1 + num2;
        System.out.println("La suma de los 2 numeros es : " + suma);
        sc.close();
    }
}
