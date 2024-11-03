/*
    Escribe un programa que solicite al usuario ingresar 4 números entre 1 y 20. Luego, imprime una representación visual de estos números en forma de gráfico de barras utilizando asteriscos. Cada número ingresado corresponderá a la longitud de una barra en el gráfico, donde cada asterisco representa una unidad en la escala. 
*/

package Soluciones;

import java.util.Scanner;

public class Actividad06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        do {
            try {
                System.out.print("Cuantos numeros deseas ingresar? >> ");
                N = Integer.valueOf(sc.nextLine());
                if (N <= 0) {
                    System.out.println("El numero tiene que ser mayor a cero.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato de numero invalido.");
            }
        } while (true);
        int[] arregloNumeros = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            do {
                try {
                    System.out.print("Digita el numero " + (i + 1) + " >> ");
                    arregloNumeros[i] = Integer.valueOf(sc.nextLine());
                    if (arregloNumeros[i] < 0 || arregloNumeros[i] > 20) {
                        System.out.println("El numero tiene que estar entre (1-20)");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Formato de numero invalido.");
                }
            } while (true);
        }
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(arregloNumeros[i] + "\t");
            for (int j = 0; j <= arregloNumeros[i] - 1; j++) {
                System.out.print("█");
            }
            System.out.println("");
        }
        sc.close();
    }
}
