/*
 * Escribe un programa que solicite al usuario ingresar una frase y dos
 * caracteres. Utiliza el método replace() de la clase String para reemplazar
 * todas las ocurrencias del primer carácter con el segundo carácter en la frase
 * ingresada por el usuario. Muestra la frase resultante en pantalla.
 */

import java.util.Scanner;

class Complementario01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite una frase >> ");
        String frase = scanner.nextLine();
        System.out.print("Que caracter quieres reemplazar? >> ");
        char a = scanner.nextLine().charAt(0);
        System.out.print("Con que valor lo deseas sobreescribir? >> ");
        char b = scanner.nextLine().charAt(0);
        frase = frase.replace(a, b);
        System.out.println("\nSalida >> " + frase + "\n");
        scanner.close();
    }
}