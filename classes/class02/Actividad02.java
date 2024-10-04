/*
    Declara dos variables, y asígnales un valor a cada una de ellas.

    Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola. Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado, Ej: La suma de las 2 variables es : “[resultado]”;

    Posteriormente, pide al usuario que ingrese dos números, guardarlos en variables previamente declaradas, realiza la suma de los números y muestra el resultado en la consola.
*/

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita el valor de a -> ");
        int a = scanner.nextInt();

        System.out.print("Digita el valor de b -> ");
        int b = scanner.nextInt();

        System.out.println("\n\ta = " + a + " | b = " + b);

        System.out.println("\n\ta + b = " + (a+b));
        System.out.println("\n\ta - b = " + (a-b));
        System.out.println("\n\ta * b = " + (a*b));
        System.out.println("\n\ta / b = " + ((float)a/(float)b)); // casteo de variables
        System.out.println("\n\ta % b = " + (a%b));

        scanner.close();
    }
}
