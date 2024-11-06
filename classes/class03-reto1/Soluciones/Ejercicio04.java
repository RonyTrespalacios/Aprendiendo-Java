/*
    Escribe un programa que solicite al usuario ingresar 5 números enteros y, utilizando operadores aritméticos y el operador ternario, determine si cada número es par o impar. Luego, muestra un resumen con los resultados.
 */

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita el numero 1 >> ");
        int num1 = scanner.nextInt();
        System.out.print("Digita el numero 2 >> ");
        int num2 = scanner.nextInt();
        System.out.print("Digita el numero 3 >> ");
        int num3 = scanner.nextInt();
        System.out.print("Digita el numero 4 >> ");
        int num4 = scanner.nextInt();
        System.out.print("Digita el numero 5 >> ");
        int num5 = scanner.nextInt();

        String res1 = (num1 % 2 == 0) ? "par" : "impar";
        String res2 = (num2 % 2 == 0) ? "par" : "impar";
        String res3 = (num3 % 2 == 0) ? "par" : "impar";
        String res4 = (num4 % 2 == 0) ? "par" : "impar";
        String res5 = (num5 % 2 == 0) ? "par" : "impar";
        System.out.println("");
        System.out.println(num1 + " es " + res1);
        System.out.println(num2 + " es " + res2);
        System.out.println(num3 + " es " + res3);
        System.out.println(num4 + " es " + res4);
        System.out.println(num5 + " es " + res5);
        System.out.println("");

        scanner.close();
    }
}

