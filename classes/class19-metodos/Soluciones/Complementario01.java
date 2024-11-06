/*
    Tabla de multiplicar
    En esta actividad, vas a crear un programa que solicita al usuario que ingrese un número (incluida la lógica en un método llamado pedirNumero())  y luego imprime la tabla de multiplicar de ese número del 1 al 10 (incluida la lógica en un método llamado imprimirTablaMultiplicar()). Para ello, implementarás un método que reciba el número ingresado por el usuario y que imprima la tabla de multiplicar correspondiente.
*/

package Soluciones;

import java.util.Scanner;

public class Complementario01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero_ingresado = pedirNumero(sc);
        imprimirTablaMultiplicar(numero_ingresado);
        sc.close();
    }

    public static int pedirNumero(Scanner sc) {
        System.out.print("Digita un numero >> ");
        return Integer.valueOf(sc.nextLine());
    }

    public static void imprimirTablaMultiplicar(int numero) {
        System.out.print("\n");
        System.out.println("Tabla del [" + numero + "] >>> ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("| " + numero + " x " + i + " = " + (numero * i));
        }
        System.out.println("<<<");
    }
}
