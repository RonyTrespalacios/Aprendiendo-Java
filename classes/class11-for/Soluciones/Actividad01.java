/*
    Escribe un programa que recorra un array de enteros y muestre cada elemento en una línea separada. El tamaño, tipo de datos y la información a contener pueden ser de tu elección.
 */

package Soluciones;

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita cuantos enteros quieres digitar >> ");
        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(" i = " + i + " >>> ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("\n{ ");
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("} ");
        scanner.close();
    }
}