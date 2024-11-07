/*
    Crea un método llamado "factorial()" que tome un parámetro de tipo "int" y devuelva un valor entero que corresponda al cálculo del factorial del número proporcionado. Posteriormente, intenta modificar la lógica para resolverlo de manera recursiva.
*/

package Soluciones;

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de factoriales [ n! ]");
        System.out.print("Digita el valor de n >> ");
        int n = sc.nextInt();
        System.out.println("[ " + n + "! ] = " + factorial(n));
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
