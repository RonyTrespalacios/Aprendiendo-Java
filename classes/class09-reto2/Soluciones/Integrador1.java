/*
    Escribe un programa que cumpla con las siguientes condiciones:
    1. Solicita al usuario ingresar una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).
    2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla.
    De Celsius a Fahrenheit	De Fahrenheit a Celsius
    [°F] = ([°C] × 9 ⁄ 5) + 32	[°C] = ([°F] − 32) × 5 ⁄ 9
    3. El programa debe manejar al menos las siguientes situaciones:
    Si ingresa una unidad de medida inválida, mostrará un mensaje de error.
    Si ingresa una temperatura no válida, mostrará un mensaje de error.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Integrador1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite el valor de la temperatura >> ");
            double temp = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite la unidad de medida [C/F] >> ");
            char unit = scanner.nextLine().toUpperCase().charAt(0);
            if (unit != 'C' && unit != 'F') {
                System.out.println("Unidad de temperatura no valida.");
            } else {
                double farenheit, celsius;
                if (unit == 'C') {
                    farenheit = (temp * 9 / 5) + 32;
                    System.out.println("La temperatura en celsius de " + temp + " grados equivale a " + farenheit
                            + " grados farenheit");
                } else {
                    celsius = (temp - 32) * 5 / 9;
                    System.out.println(
                            "La temperatura en farenheit de " + temp + " grados equivale a " + celsius
                                    + " grados celsius");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error, entrada no valida.");
            throw new ArithmeticException();
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado.");
        } finally {
            System.out.println("Programa terminado.");
            scanner.close();
        }
        System.out.println("rony trespalacios");
    }
}