/*
    Desarrolla un programa que solicite al usuario ingresar dos palabras. Utiliza el método equals() de la clase String para comparar si las dos palabras son iguales. Muestra un mensaje apropiado en pantalla indicando si las palabras son iguales o diferentes.
 */

import java.util.Scanner;

class Complementario01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite una primera palabra >> ");
        String frase1 = scanner.nextLine();
        System.out.print("Digite una segunda palabra >> ");
        String frase2 = scanner.nextLine();
        if (frase1.equalsIgnoreCase(frase2)) {
            System.out.println("Son iguales!");
        } else {
            System.out.println("Son diferentes.");
        }
        scanner.close();
    }
}