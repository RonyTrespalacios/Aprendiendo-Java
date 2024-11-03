/*
 * Pídele al usuario que introduzca una cadena. Intenta convertir la cadena a un
 * número decimal usando Double.valueOf(). Si la cadena no representa un número
 * válido, Double.valueOf() lanzará una excepción. Captura esta excepción y
 * muestra un mensaje al usuario indicando que la entrada no es un número
 * válido.
 */

package Soluciones;

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digita un numero decimal >> ");
            double num = Double.valueOf(sc.nextLine().trim().replace(",", "."));
            System.out.println("Numero registrado satisfactoriamente!");
            System.out.println("El numero es : " + num);
        } catch (NumberFormatException e) {
            System.out.println("Formato de numero decimal no valido.");
        }
        sc.close();
    }
}