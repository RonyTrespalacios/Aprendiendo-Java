/*
    Desarrolla un programa que pida al usuario ingresar 4 nombres. Estos nombres serán ordenados alfabéticamente y posteriormente impresos en la consola. Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento.
 */

import java.util.Scanner;

public class Complementario03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[4];
        char[] primera_letra = new char[4];
        System.out.println("Digita 4 nombres >>> ");
        nombres[0] = scanner.nextLine();
        primera_letra[0] = nombres[0].toLowerCase().charAt(0);
        nombres[1] = scanner.nextLine();
        primera_letra[1] = nombres[1].toLowerCase().charAt(0);
        nombres[2] = scanner.nextLine();
        primera_letra[2] = nombres[2].toLowerCase().charAt(0);
        nombres[3] = scanner.nextLine();
        primera_letra[3] = nombres[3].toLowerCase().charAt(0);
        /* --------------------------- */ // 1ra iteracion
        char aux = ' ';
        String aux2 = "";
        if (primera_letra[0] > primera_letra[1]) {
            aux = primera_letra[0];
            primera_letra[0] = primera_letra[1];
            primera_letra[1] = aux;
            aux2 = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = aux2;
        }
        if (primera_letra[1] > primera_letra[2]) {
            aux = primera_letra[1];
            primera_letra[1] = primera_letra[2];
            primera_letra[2] = aux;
            aux2 = nombres[1];
            nombres[1] = nombres[2];
            nombres[2] = aux2;
        }
        if (primera_letra[2] > primera_letra[3]) {
            aux = primera_letra[2];
            primera_letra[2] = primera_letra[3];
            primera_letra[3] = aux;
            aux2 = nombres[2];
            nombres[2] = nombres[3];
            nombres[3] = aux2;
        }
        /* --------------------------- */ // 2da iteracion
        if (primera_letra[0] > primera_letra[1]) {
            aux = primera_letra[0];
            primera_letra[0] = primera_letra[1];
            primera_letra[1] = aux;
            aux2 = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = aux2;
        }
        if (primera_letra[1] > primera_letra[2]) {
            aux = primera_letra[1];
            primera_letra[1] = primera_letra[2];
            primera_letra[2] = aux;
            aux2 = nombres[1];
            nombres[1] = nombres[2];
            nombres[2] = aux2;
        }
        if (primera_letra[2] > primera_letra[3]) {
            aux = primera_letra[2];
            primera_letra[2] = primera_letra[3];
            primera_letra[3] = aux;
            aux2 = nombres[2];
            nombres[2] = nombres[3];
            nombres[3] = aux2;
        }
        /* --------------------------- */ // 3ra iteracion
        if (primera_letra[0] > primera_letra[1]) {
            aux = primera_letra[0];
            primera_letra[0] = primera_letra[1];
            primera_letra[1] = aux;
            aux2 = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = aux2;
        }
        if (primera_letra[1] > primera_letra[2]) {
            aux = primera_letra[1];
            primera_letra[1] = primera_letra[2];
            primera_letra[2] = aux;
            aux2 = nombres[1];
            nombres[1] = nombres[2];
            nombres[2] = aux2;
        }
        if (primera_letra[2] > primera_letra[3]) {
            aux = primera_letra[2];
            primera_letra[2] = primera_letra[3];
            primera_letra[3] = aux;
            aux2 = nombres[2];
            nombres[2] = nombres[3];
            nombres[3] = aux2;
        }
        /* ----------------FINALMENTE---------------- */
        String resultado = String.join("\n", nombres);
        System.out.println("----------------------\n" + resultado);
        scanner.close();
    }
}