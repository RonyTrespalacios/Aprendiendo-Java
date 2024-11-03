/*
    Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices. Luego, solicita al usuario dos índices: un índice inicial y un índice final. Con estos dos índices, copia la parte del arreglo original comprendida entre ellos (inclusive) en un nuevo arreglo utilizando el método Arrays.copyOfRange(). Asegúrate de incluir validaciones para confirmar que el índice inicial es menor que el índice final y que ambos índices están dentro del rango válido del arreglo original. Finalmente, imprime el nuevo arreglo por consola.
*/

package Soluciones;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = 10;
        int int_indice_inicio, int_indice_final;
        int[] int_array_nums = new int[N];
        System.out.println(" index -> value");
        for (int i = 0; i < N; i++) {
            int_array_nums[i] = (int) (Math.random() * 21 + 1);
            System.out.println(" " + i + " -> " + int_array_nums[i]);
        }
        System.out.println("Elige un indice de inicio y uno de fin.");
        do {
            System.out.print("Indice inicio >> ");
            int_indice_inicio = Integer.parseInt(scanner.nextLine());
            if (int_indice_inicio >= N) {
                System.out.println("Indice fuera de rango, reintenta nuevamente.");
            }
        } while (int_indice_inicio >= N);
        do {
            System.out.print("Indice final >> ");
            int_indice_final = Integer.parseInt(scanner.nextLine());
            if (int_indice_final < int_indice_inicio || int_indice_final >= N) {
                System.out.println("Indice fuera de rango, reintenta nuevamente.");
            }
        } while (int_indice_final < int_indice_inicio || int_indice_final >= N);
        int[] int_array_salida = Arrays.copyOfRange(int_array_nums, int_indice_inicio, int_indice_final + 1);
        System.out.println(Arrays.toString(int_array_salida));
        scanner.close();
    }
}
