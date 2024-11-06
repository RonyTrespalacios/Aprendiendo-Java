/* Operadores logicos

2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes validaciones:

A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.

B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.

 */

import java.util.Scanner;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numero entero 1: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el numero entero 2: ");
        int b = scanner.nextInt();
        System.out.print("Ingresa el numero entero 3: ");
        int c = scanner.nextInt();
        System.out.print("Ingresa el numero entero 4: ");
        int d = scanner.nextInt();

        boolean mayor = a > b ? true : false;
        System.out.println("El nümero "+a+" es mayor a "+b+" ? = "+mayor+"");
        System.out.println("El nümero "+a+" es igual a "+b+" ? = "+(a==b ? true : false));
        System.out.println("El nümero "+a+" es divisible entre 2 ? = "+(((a%=2) == 0) ? true : false));

        System.err.println("\n");
        boolean validacionA = (a>b) && (c>d);
        boolean validacionB = (a>b) || (c>d);
        System.out.println("num1 > num2 Y num3 > num4 ? = " + validacionA);
        System.out.println("num1 > num2 O num3 > num4 ? = " + validacionB);

        scanner.close();
    }
}

