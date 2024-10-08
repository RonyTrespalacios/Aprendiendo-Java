/* 
    Crea un programa que permita al usuario ingresar dos números y una operación aritmética (+, -, *, /).
    El programa debe realizar la operación solicitada por el usuario y mostrar el resultado. Asegúrate de gestionar los posibles errores como la división por cero.
 */

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número >> ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número >> ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese la operación (+, -, *, /): >> ");
        char op = scanner.next().charAt(0);

        double resultado = (op == '+') ? num1 + num2 :
                           (op == '-') ? num1 + num2 :
                           (op == '*') ? num1 * num2 :
                           (op == '/') ? (double) num1 / num2 : 0;

        System.out.println("El resultado es: " + resultado);

        scanner.close();
    }
}
