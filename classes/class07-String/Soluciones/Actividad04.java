/*
 * Actividad: Búsqueda de Caracteres
 * Escribe un programa que pida al usuario ingresar una palabra y un carácter, y
 * determine si el carácter ingresado se encuentra en la palabra utilizando el
 * método indexOf() de la clase String. Muestra un mensaje adecuado en pantalla
 * indicando si el carácter se encuentra o no en la palabra.
 */

import java.util.Scanner;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digita una palabra: ");
            String palabra = scanner.nextLine();
            System.out.print("Digita un caracter: ");
            char caract = scanner.nextLine().charAt(0);
            System.out.println("Buscando '" + caract + "'' dentro de '" + palabra + "'.");
            int i = palabra.indexOf(caract);
            if (i != -1) {
                System.out.println("Encontrado! en la posicion " + i + ".");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        scanner.close();
    }
}