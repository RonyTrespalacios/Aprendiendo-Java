/*
    Escribe un programa que solicite al usuario ingresar las calificaciones de 5 materias. El programa debe calcular el promedio y clasificar el resultado según las siguientes condiciones:
        Si el promedio es mayor o igual a 90, el resultado es "Excelente".
        Si el promedio está entre 70 y 89, el resultado es "Bueno".
        Si el promedio está entre 50 y 69, el resultado es "Regular".
        Si el promedio es menor de 50, el resultado es "Insuficiente".
 */

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación 1: ");
        double promedio = scanner.nextInt();
        System.out.print("Ingrese la calificación 2: ");
        promedio += scanner.nextInt();
        System.out.print("Ingrese la calificación 3: ");
        promedio += scanner.nextInt();
        System.out.print("Ingrese la calificación 4: ");
        promedio += scanner.nextInt();
        System.out.print("Ingrese la calificación 5: ");
        promedio += scanner.nextInt();

        promedio /= 5;
        System.out.println("El promedio es: " + promedio);

        String resultado =  (promedio >= 90) ? "Excelente" : 
                            (promedio >= 70) ? "Bueno" : 
                            (promedio >= 50) ? "Regular" : "Insuficiente";
        
        System.out.println("Clasificación: " + resultado);

        scanner.close();
    }
}
