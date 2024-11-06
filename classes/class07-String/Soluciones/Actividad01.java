/*
    Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla su longitud utilizando el método length() de la clase String.
 */

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite una cadena >> ");
        String frase = scanner.nextLine();
        System.out.println("La longitud de la cadena es -> " + frase.length());
        scanner.close();
    }
}