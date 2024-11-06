/*
    Escribe un programa en el que declares una variable de tipo array que contenga 10 elementos de tipo entero. Inicializa el arreglo con valores aleatorios entre 1 y 100, imprime por consola el arreglo inicial y luego ordenalo en forma descendente utilizando el método Arrays.sort(). Finalmente, imprime los elementos ordenados en la consola.
 */

package Soluciones;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantos numeros desea generar? >> ");
        int N = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = (int) (Math.random() * 101 + 1);
        }
        System.out.println("Arreglo inicial >> \n\t" + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Arreglo final >> \n\t" + Arrays.toString(nums));
        scanner.close();
    }
}
