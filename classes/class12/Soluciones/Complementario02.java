/*
    Escribe un programa que solicite al usuario ingresar una serie de números enteros. Utiliza un bucle while para contar la cantidad de números pares e impares ingresados hasta que el usuario decida terminar la entrada de números. Al finalizar, muestra la cantidad de números pares e impares ingresados
*/

import java.util.Scanner;

public class Complementario02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0, impares = 0;
        int num = 0;
        String validar = "";
        while (true) {
            System.out.print("Desa seguir digitando numeros? (S/N) >> ");
            validar = scanner.nextLine().trim().toUpperCase();
            if (validar.equals("S")) {
                System.out.print("Digita un numero >> ");
                num = Integer.parseInt(scanner.nextLine());
                if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            } else {
                break;
            }
        }
        System.out.println("Cantidad de numeros pares ingresados\t:\t" + pares);
        System.out.println("Cantidad de numeros impares ingresados\t:\t" + impares);
        scanner.close();
    }
}
