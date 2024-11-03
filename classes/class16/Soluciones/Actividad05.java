/*
    Realiza un programa para crear un cuadrado de N elementos por lado utilizando el carácter “*”.
    Para ello  simplemente dibuja una línea de N asteriscos. Repite este proceso N veces para completar el cuadrado. 
 */

package Soluciones;

import java.util.Scanner;

public class Actividad05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("De que longitud desas el cuadrado >> ");
        int N = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || j == 0 || i == N - 1 || j == N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.err.println("");
        }
        sc.close();
    }
}
