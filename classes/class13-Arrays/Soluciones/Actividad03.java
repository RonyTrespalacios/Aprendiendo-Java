/*
    Escribe un programa que compare dos arreglos de enteros utilizando el método Arrays.equals(). El programa debe imprimir si los arreglos son iguales o no.
*/

package Soluciones;

import java.util.Arrays;

public class Actividad03 {
    public static void main(String[] args) {
        int[] intArray_1 = { 1, 2, 3, 4 };
        int[] intArray_2 = { 1, 2, 3, 4 };
        if (Arrays.equals(intArray_1, intArray_2)) {
            System.out.println("Los arreglos son iguales!");
        } else {
            System.out.println("Los arreglos son diferentes!");
        }
    }
}
