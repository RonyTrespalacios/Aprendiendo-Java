/*
Programa identificador de número par o impar 
Después de analizar el funcionamiento del programa requerido en el video proporcionado, tu tarea es escribir el código necesario para cumplir con los siguientes puntos:

Solicita al usuario que ingrese un número y almacena este valor en una variable.

Desarrolla un programa que determine si el número ingresado es par o impar.

Muestra el resultado en la consola.

Recuerda utilizar el operador ternario para simplificar la lógica del programa y optimizar su escritura.
 */

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un numero >> ");
        int num = scanner.nextInt();

        System.out.println(num % 2 == 0 ? "El numero es par." : "El numero es impar.");
        scanner.close();
    }
}