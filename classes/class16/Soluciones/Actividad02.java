/*
    En esta actividad, te propongo un desafío adicional relacionado con la serie de Fibonacci. La tarea consiste en crear un programa que te permita ingresar la posición de un número en la serie de Fibonacci y, a continuación, mostrar el valor correspondiente a esa posición.
    Recuerda que la serie de Fibonacci comienza con valores específicos para las primeras posiciones:
    Posición 0: 0
    Posición 1: 1
    Posición 2: 1
    Posición 3: 2
    Posición 4: 3
    Tu objetivo es desarrollar un programa que sea capaz de calcular y mostrar el valor de la serie de Fibonacci para cualquier posición ingresada por el usuario. Este ejercicio te ayudará a consolidar tu comprensión sobre cómo generar y trabajar con la serie de Fibonacci.
 */

package Soluciones;

import java.util.Arrays;
import java.util.Scanner;

public record Actividad02() {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 2;
        int N = 0;
        do {
            System.out.print("Digite la posicion de la serie de Fibonacci deseada >> ");
            N = Integer.valueOf(scanner.nextLine());
            if (N <= 0) {
                System.out.println("La serie de Fibonacci solo acepta valores positivos");
            } else {
                break;
            }
        } while (true);
        long[] fibonacci = new long[N];
        fibonacci[0] = 0L;
        if (N > 1) {
            fibonacci[1] = 1L;
            while (i < N) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                i++;
            }
        }
        System.out.println(Arrays.toString(fibonacci));
        System.out.println("El " + N + "-ésimo termino de la serie de fibonacci es : " + fibonacci[N - 1]);
        scanner.close();
    }
}
