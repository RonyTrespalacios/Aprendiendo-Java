/*
    Escribe un programa que pida al usuario que ingrese dos números enteros y realice la división del primer número entre el segundo número. Implementa un bloque "try-catch" para manejar la excepción en caso de que se intente realizar una división por cero. En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa de division entre 2 numeros enteros.");
        try {
            System.out.print("Digita el primer numero >> ");
            int a = scanner.nextInt();
            System.out.print("Digita el segundo numero >> ");
            int b = scanner.nextInt();
            double resultado = a / b;
            System.out.println("El resultado es -> " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error, no se puede dividir entre 0.");
        } catch (InputMismatchException e) {
            System.out.println("Error, tipo de dato invalido.");
        }
        scanner.close();
    }
}