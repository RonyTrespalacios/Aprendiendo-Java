/*
    Siguiendo el ejemplo del ejercicio de “números primos”, ahora el desafío es que desarrolles un programa que te solicite la cantidad deseada de números primos que deseas obtener.
    Tu programa deberá generar y mostrar la cantidad de números primos que hayas solicitado.
*/

package Soluciones;

import java.util.Scanner;

public class Actividad04 {
    public static void main(String[] args) {
        System.out.println("\033\143"); // limpiar la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de primos");
        int primos = 0;
        do {
            try {
                System.out.print("Cuantos numeros primos quieres imprimir >> ");
                primos = Integer.valueOf(scanner.nextLine());
                if (primos <= 0) {
                    System.out.println("La cantidad no puede ser 0 o negativa.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato de entrada invalido.");
            }
        } while (true);
        System.out.println("Los primeros " + primos + " números primos son: ");
        int contadorPrimos = 0;
        int numero = 3;
        boolean banderaPrimo = true;
        System.out.print(" >>> ");
        switch (primos) {
            case 1 -> {
                System.out.println("1.");
            }
            case 2 -> {
                System.out.println("1, 2.");
            }
            default -> {
                primos -= 2;
                System.out.print("1, 2, ");
                while (contadorPrimos < primos) {
                    banderaPrimo = true;
                    for (int i = 2; i < numero; i++) {
                        if (numero % i == 0) {
                            banderaPrimo = false;
                            break;
                        }
                    }
                    if (banderaPrimo) {
                        contadorPrimos++;
                        System.out.print(numero);
                        if (contadorPrimos < primos) {
                            System.out.print(", ");
                        } else {
                            System.out.println(".");
                        }
                    }
                    numero++;
                }
            }
        }
        scanner.close();
    }
}
