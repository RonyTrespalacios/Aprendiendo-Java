/*
    Escribe un programa que recorra un array de enteros y los imprima en orden inverso, comenzando desde el último elemento.. El tamaño y los números  a contener pueden ser de tu elección.
 */

package Soluciones;

import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = array_int();
        print_array(array);
        final int N = array.length;
        System.out.print("{ ");
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(array[N - 1 - i] + " ");
        }
        System.out.println("} ");
        scanner.close();
    }

    private static int[] array_int() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita cuantos enteros quieres digitar >> ");
        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(" i = " + i + " >>> ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();
        return array;
    }

    private static void print_array(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int N = array.length;
        System.out.print("{ ");
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("} ");
        scanner.close();
    }
}