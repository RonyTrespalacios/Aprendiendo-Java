
/*
    Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza la resta del primer número menos el segundo número. Implementa un bloque "try-catch" para manejar las excepciones que puedan surgir en caso de que el usuario no ingrese números. En caso de que se produzca una excepción, muestra un mensaje apropiado en pantalla. Si no se produce ninguna excepción, muestra el resultado de la resta.
 */

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Programa de resta entre 2 numeros.");
        try {
            System.out.print("Digita el primer numero >> ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Digita el segundo numero >> ");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println("El resultado de la resta es = " + (a - b));
        } catch (NumberFormatException e) {
            System.out.println("Error, numero no valido.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}