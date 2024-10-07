/*

Creando una calculadora básica
Después de analizar el funcionamiento del programa requerido en el video proporcionado, tu tarea es escribir el código necesario para cumplir con los siguientes puntos:

Solicita al usuario que ingrese dos números y almacena estos valores en variables previamente declaradas.

Declara una variable para almacenar el resultado de la operación. 

Permite al usuario elegir qué operación quiere realizar.

Muestra el resultado de la operación en la consola.

 */

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero 1 >> ");
        int a  = scanner.nextInt();
        System.out.print("Ingrese el numero 2 >> ");
        int b  = scanner.nextInt();
        
        System.out.println("\n-- Digita una de las siguientes opciones --");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division \n");

        System.out.print("Opcion numero >> ");
        int op = scanner.nextInt();
        
        double resultado =  (op == 1) ? a+b :
                            (op == 2) ? a-b :
                            (op == 3) ? a*b :
                            (op == 4) ? (double)a/b : 0;
        
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}
