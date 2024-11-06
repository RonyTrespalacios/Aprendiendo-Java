/*
    Escribe un programa que pida al usuario dos números enteros, representando la base y el exponente, y calcula el resultado de elevar la base al exponente utilizando el método pow() de la clase Math. Muestra el resultado en pantalla.
 */

import java.util.Scanner;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa de potencias!!");
        System.out.print("Digita la base >> ");
        int base = Integer.parseInt(scanner.nextLine());
        System.out.print("Digita el exponente >> ");
        int exp = Integer.parseInt(scanner.nextLine());
        int resultado = (int) Math.pow(base, exp);
        System.out.println("El resultado de " + base + "^" + exp + " es: " + resultado);
        scanner.close();
    }
}
