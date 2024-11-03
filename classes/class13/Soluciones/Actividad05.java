/*
    El método fill() de la clase Arrays cambia todos los elementos en un arreglo por un valor estático, desde el índice start (por defecto 0) hasta el índice end (por defecto array.length) y devuelve el arreglo modificado. Vamos a escribir un programa que solicite al usuario el tamaño para un arreglo y un número entero con el que quiera rellenarlo. Luego crea el arreglo y utiliza Arrays.fill(). Finalmente, imprime el arreglo resultante.
*/

package Soluciones;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita el tamano del arreglo >> ");
        int N = Integer.parseInt(scanner.nextLine());
        int[] int_array_numeros = new int[N];
        System.out.print("Con que numero lo quiere rellenar? >> ");
        Arrays.fill(int_array_numeros, Integer.parseInt(scanner.nextLine()));
        System.out.println(Arrays.toString(int_array_numeros));
        scanner.close();
    }
}
