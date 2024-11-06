/*
    Escribe un programa que solicite al usuario que introduzca un número y verifique si es un número primo utilizando un bucle do-while. Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo. Finalizar el programa cuando ingrese 0 (cero).
    Un número es primo si solo tiene dos divisores: 1 y él mismo. 
 */

import java.util.Scanner;

public class Actividad04 {
    public static void main(String[] args) {
        System.out.println("\033\143"); // limpiar la consola
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        int i = 0;
        boolean primo = true;
        while (num != 0) {
            System.out.print("Digita un numero: ");
            num = scanner.nextInt();
            i = 2;
            primo = true;
            do {
                if (num % i == 0) {
                    primo = false;
                }
                i++;
            } while (i < num && primo == true);
            if (primo) {
                System.out.println("El numero es primo!!");
            } else {
                System.out.println("No es primo.");
            }
        }
        scanner.close();
    }
}
