/*
    Escribe un programa que solicite al usuario un número entero y muestre la tabla de multiplicar de ese número utilizando un bucle while. El programa debe seguir solicitando números hasta que el usuario ingrese un valor igual a cero, en cuyo caso debería salir del bucle.
*/

import java.util.Scanner;

public class Complementario01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Programa de tablas de multiplicar");
        do {
            System.out.print("Digita un numero entero >> ");
            num = Integer.parseInt(scanner.nextLine());
            if (num != 0) {
                System.out.println("Tabla del " + num + ":");
                System.out.println(">>>");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(" | " + i + " x " + num + "\t=\t" + (num * i));
                }
                System.out.println("<<<");
            }
        } while (num != 0);
        scanner.close();
    }
}
