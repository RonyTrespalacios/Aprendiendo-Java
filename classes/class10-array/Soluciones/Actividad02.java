/*
    Escribe un programa en el cual se cree una variable de tipo array que contenga cuatro elementos de tipo entero. Estos elementos deben ser ingresados por el usuario. El programa debe sumar y promediar los cuatro elementos de forma manual e imprimir por consola el resultado, utilizando solamente las herramientas adquiridas hasta el momento.
 */

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa promediador.");
        int[] array = new int[3];
        array[0] = Integer.parseInt(scanner.nextLine());
        array[1] = Integer.parseInt(scanner.nextLine());
        array[2] = Integer.parseInt(scanner.nextLine());
        int promedio = (array[0] + array[1] + array[2]) / 3;
        System.out.println("El promedio es: " + promedio);
        scanner.close();
    }
}
