/*
    Escribe un programa que genere un array de 10 elementos de tipo entero. Inicializa cada elemento con un número aleatorio menor a 100 y luego imprime todos los elementos del array en una única línea. Posteriormente, recorre el array para contar los elementos pares y muestra el total en la consola.
 */

package Soluciones;

import java.util.Scanner;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = (int) ((Math.random() * 100) + 1);
        }
        print_array(array);
        int contador = 0;
        for (int num : array) {
            contador = num % 2 == 0 ? contador + 1 : contador;
        }
        System.out.println("Hay " + contador + " numeros pares!");
        scanner.close();
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
