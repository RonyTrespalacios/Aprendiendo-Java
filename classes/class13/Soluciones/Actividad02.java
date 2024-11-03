/*
    La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos. La clase Arrays ya incluye su implementación mediante el método binarySearch(). Escribe un programa que realice una búsqueda binaria en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). El programa debe imprimir el arreglo generado originalmente, solicitar al usuario el valor buscado e imprimir el índice del valor buscado si está presente en el arreglo.
*/

package Soluciones;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantos numeros desea generar? >> ");
        int N = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = (int) (Math.random() * 101 + 1);
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.print("Que numero desea buscar? >> ");
        int intBuscar = Integer.parseInt(scanner.nextLine());
        int indice = Arrays.binarySearch(nums, intBuscar);
        if (indice != -1) {
            System.out.println("Numero encontrado en la posicion " + indice + ".");
        } else {
            System.out.println("Numero no encontrado.");
        }
        scanner.close();
    }
}
