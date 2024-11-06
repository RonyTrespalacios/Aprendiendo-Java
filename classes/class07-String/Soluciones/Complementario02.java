/*
 * Crea un programa que solicite al usuario ingresar una frase con espacios en
 * blanco al principio y al final. Utiliza el método trim() de la clase String
 * para eliminar los espacios en blanco y luego muestra la frase resultante en
 * pantalla.
 */

import java.util.Scanner;

class Complementario01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite una frase con espacios al inicio y fin >> ");
        String frase = scanner.nextLine();
        System.out.println("Salida >> '" + frase.trim() + "'");
        scanner.close();
    }
}