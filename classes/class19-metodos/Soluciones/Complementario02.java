/*
    Tabla de multiplicar 2.0
    En esta actividad, vas a crear un programa que solicita al usuario que ingrese 3 números (incluida la lógica en un método llamado pedirNumeros())  y luego imprime la tabla de multiplicar de cada uno de ellos  1 al 10 (incluida la lógica en un método llamado imprimirTablasMultiplicar(int[] numeros)). Para ello, implementarás un  un array para almacenar los números ingresados y luego invocarás el método para cada uno de ellos.
*/

package Soluciones;

import java.util.Scanner;

public class Complementario02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = pedirNumeros(sc);
        imprimirTablaMultiplicar(numeros);
        sc.close();
    }

    public static int pedirNumero(Scanner sc) {
        System.out.print("Digita un numero >> ");
        return Integer.valueOf(sc.nextLine());
    }

    public static int[] pedirNumeros(Scanner sc) {
        System.out.print("Cuantas tablas de multiplicar quieres? >> ");
        int N = Integer.valueOf(sc.nextLine());
        int[] numeros = new int[N];
        for (int i = 0; i < N; i++) {
            numeros[i] = pedirNumero(sc);
        }
        return numeros;
    }

    public static void imprimirTablaMultiplicar(int numero) {
        System.out.print("\n");
        System.out.println("Tabla del [" + numero + "] >>> ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("| " + numero + " x " + i + " = " + (numero * i));
        }
        System.out.println("<<<");
    }

    public static void imprimirTablaMultiplicar(int[] numeros) {
        for (int numero : numeros) {
            imprimirTablaMultiplicar(numero);
        }
    }
}
