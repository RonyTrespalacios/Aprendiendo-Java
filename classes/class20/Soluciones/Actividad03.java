// Ejercicio de calificación: Basándote en el siguiente ejercicio que ya has realizado, crea un método "obtenerNota()" que reciba por parámetro un "int" y devuelva un "String". El método debe utilizar la estructura de control "switch expression".

// Ejercicio anterior: En este ejercicio de calificación, tu tarea es escribir un programa que solicite al usuario ingresar un número entre 0 y 100. Luego, el programa validará el número ingresado y mostrará la calificación correspondiente según la siguiente escala:
// - Si la puntuación está entre 90 y 100, se mostrará "A".
// - Si la puntuación está entre 80 y 89, se mostrará "B".
// - Si la puntuación está entre 70 y 79, se mostrará "C".
// - Si la puntuación está entre 60 y 69, se mostrará "D".
// - Si la puntuación es menor a 60, se mostrará "F".
// El programa mostrará en la consola el valor de la calificación obtenida.

import java.util.Scanner;

class EjercicioDeCalificacion {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\033\143");
        int nota = requerirNota();
        String resultado = obtenerNota(nota);
        System.out.println(resultado);
    }

    public static int requerirNota() {
        System.out.print("Ingresar calificacion: ");
        return sc.nextInt();
    }

    public static String obtenerNota(int nota) {
        String opcion = "";

        if (nota >= 90 && nota <= 100) {
            opcion = "A";
        } else if (nota >= 80 && nota < 90) {
            opcion = "B";
        } else if (nota >= 70 && nota < 80) {
            opcion = "C";
        } else if (nota >= 60 && nota < 70) {
            opcion = "D";
        } else if (nota < 60) {
            opcion = "E";
        } else {
            opcion = "Opcion no valida.";
        }

        return opcion;

    }
}
