/*
 *  Actividad: Conversión de Mayúsculas y Minúsculas
    Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla la misma cadena, pero con todos los caracteres en mayúsculas o minúsculas. Utiliza los métodos toUpperCase() y toLowerCase() de la clase String para realizar la conversión.
 */

import java.util.Scanner;

public class Actividad05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita una cadena de texto >> ");
        String frase = scanner.nextLine();
        System.out.println("\tMinusculas >> " + frase.toLowerCase());
        System.out.println("\n\t\tMayusculas >> " + frase.toUpperCase());
        scanner.close();
    }
}
