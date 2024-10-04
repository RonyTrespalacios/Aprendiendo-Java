/*

Pide al usuario que ingrese su año de nacimiento y almacena el dato en una variable previamente declarada llamada anioNacimiento.

Declara una variable del tipo Constante llamado ANIOACTUAL con el año actual.

Calcula la edad actual del usuario, considerando que la cuenta sería ANIOACTUAL - añoNacimiento. Almacena el dato en una variable llamada calculoEdad.

Determina si el usuario es mayor de edad (tener 18 años o más) y muestra un mensaje apropiado.

 */

import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ANIOACTUAL = 2024;

        System.out.print("Digita tu anio de nacimiento >> ");
        int anioNacimiento = scanner.nextInt();

        int calculoEdad = ANIOACTUAL - anioNacimiento;

        System.out.println("Tienes "+calculoEdad+" años.");
        System.out.println(calculoEdad>=18? "Eres mayor de edad!" : "Eres menor de edad.");

        scanner.close();
    }
}
