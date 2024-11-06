/*
    En esta actividad, deberás escribir un programa que solicite al usuario un número y determine si es positivo, negativo o cero. El resultado se mostrará en pantalla.
 */

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita un numero >> ");
        double num = scanner.nextInt();

        if (num>0) {
            System.out.println("El numero es positivo!");
        }else if (num<0) {
            System.out.println("El numero es negativo!");
        } else {
            System.out.println("El numero es cero!");
        }
        scanner.close();
    }   
}