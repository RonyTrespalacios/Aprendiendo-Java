/*
    En este ejercicio de calificación, tu tarea es escribir un programa que solicite al usuario ingresar un número entre 0 y 100. Luego, el programa validará el número ingresado y mostrará la calificación correspondiente según la siguiente escala:
        Si la puntuación está entre 90 y 100, se mostrará "A".
        Si la puntuación está entre 80 y 89, se mostrará "B".
        Si la puntuación está entre 70 y 79, se mostrará "C".
        Si la puntuación está entre 60 y 69, se mostrará "D".
        Si la puntuación es menor a 60, se mostrará "F".
    Si el usuario ingresa un número que no está dentro del rango establecido (es decir, fuera del intervalo de 0 a 100), el programa debe informar al usuario que el número ingresado está fuera del rango válido.
    El programa mostrará en la consola el valor de la calificación obtenida.
    Realiza varias pruebas de tu programa, para asegurarte que la lógica implementada sea la correcta. 
 */

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita un numero >> ");
        int num = scanner.nextInt();
        if (num >= 0 && num <= 100) {
            if (num >= 90 && num <= 100) {
                System.out.println("A");
            } else if (num >= 80 && num <= 89) {
                System.out.println("B");
            } else if (num >= 70 && num <= 79) {
                System.out.println("C");
            } else if (num >= 60 && num <= 69) {
                System.out.println("D");
            } else if (num < 60) {
                System.out.println("F");
            }
        } else {
            System.out.println("El numero esta fuera del rango");
        }
        scanner.close();
    }
}
