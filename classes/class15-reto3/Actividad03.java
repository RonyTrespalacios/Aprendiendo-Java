/*
    Escribe un programa que imprima los primeros 8 términos de la serie de Fibonacci utilizando un bucle while. La serie de Fibonacci es una secuencia en la que cada número es la suma de los dos anteriores.
    La serie de Fibonacci comienza de la siguiente manera:
    Posición 0: 0
    Posición 1: 1
    Posición 2: 1 (la suma de la posición 0 y la posición 1, 0 + 1 = 1)
    Posición 3: 2 (la suma de la posición 1 y la posición 2, 1 + 1 = 2)
    Posición 4: 3 (la suma de la posición 2 y la posición 3, 1 + 2 = 3)
    Entonces, los primeros 5 términos (considerando el índice inicial 0) de la serie de Fibonacci son: 0, 1, 1, 2, 3.
 */

import java.util.Arrays;
import java.util.Scanner;

public record Actividad03() {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 2;
        System.out.print("Digite la cantidad de numeros que quiere : ");
        int N = scanner.nextInt();
        int[] fibonacci = new int[N];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        while (i < N) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }
        System.out.println(Arrays.toString(fibonacci));
        scanner.close();
    }
}
