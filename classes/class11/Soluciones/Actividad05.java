/*
    Genera un array de 20 elementos de tipo float, inicializándolo con los números de tu elección. Luego, suma todos los elementos del array y calcula su promedio. Finalmente, muestra por consola tanto el resultado de la suma como el promedio de los elementos.Te sugerimos implementar el uso de la sintaxis de for-each.
 */

package Soluciones;

import java.util.Scanner;

public class Actividad05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] array = new float[20];
        final int N = array.length;
        for (int i = 0; i <= N - 1; i++) {
            array[i] = (float) (Math.random() * 100 + Math.random());
        }
        double suma = 0;
        for (float num : array) {
            suma = suma + (double) num;
        }
        double promedio = suma / N;
        System.out.println("La suma de los elementos es >> " + suma);
        System.out.println("La media de los elementos es >> " + promedio);
        scanner.close();
    }
}
