/* Operadores logicos!
 * 
 * 1. Pide al usuario que ingrese dos números, y la salida deberia verse:
 * Ingresa un numero entero: 4
 * Ingresé otro numero entero: 5
 * El nümero 4 es mayor a 5 ? = false
 * B. Verifica si el primer número ingresado  es distinto al segundo número ingresado . Muestra el resultado en consola.
 * C. Verifica si el primer número ingresado  es divisible por 2 . Muestra el resultado en consola.
 * 
 */

import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa otro numero entero: ");
        int b = scanner.nextInt();

        boolean mayor = a > b ? true : false;
        System.out.println("El nümero "+a+" es mayor a "+b+" ? = "+mayor+"");
        System.out.println("El nümero "+a+" es igual a "+b+" ? = "+(a==b ? true : false));
        System.out.println("El nümero "+a+" es divisible entre 2 ? = "+(((a%=2) == 0) ? true : false));

        scanner.close();
    }
}
