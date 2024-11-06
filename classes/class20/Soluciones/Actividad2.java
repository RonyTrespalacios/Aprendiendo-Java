/*
    Calculadora: Vuelve a realizar el ejercicio de la calculadora, pero esta vez crea un método llamado "menu()" que no reciba ningún parámetro y se encargue de generar la lógica de mostrar el menú de opciones y producir el bucle para seguir mostrando el menú hasta seleccionar la opción de "salir". Solicita dos números al usuario y realiza la operación matemática seleccionada, teniendo en cuenta las validaciones necesarias como la división por cero.
 */

import java.util.Scanner;

public class Actividad2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int sel = 0, a = 0, b = 0;
        do {
            imprimirOpciones();
            try {
                sel = Integer.valueOf(scanner.nextLine());
                if (sel == 5) {
                    System.out.println("Gracias por usarme!.");
                    break;
                }
                System.out.println("Digita los 2 numeros a continuacion: ");
                a = pedirNumero();
                b = pedirNumero();
                switch (sel) {
                    case 1 -> {
                        System.out.println("El resultado es >> " + suma(a, b));
                    }
                    case 2 -> {
                        System.out.println("El resultado es >> " + resta(a, b));
                    }
                    case 3 -> {
                        System.out.println("El resultado es >> " + multipicacion(a, b));
                    }
                    case 4 -> {
                        if (b == 0) {
                            System.out.println("La division entre cero no es valida.");
                        } else {
                            System.out.println("El resultado es >> " + division(a, b));
                        }
                    }
                    default -> {
                        System.out.println("Opcion no valida, vuelve a intentarlo.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato de numero invalido.");
            }
            esperarTecla();
        } while (sel != 5);
    }

    public static void imprimirOpciones() {
        System.out.println("\033\143");
        System.out.println("----------");
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1 - Sumar.");
        System.out.println("2 - Restar.");
        System.out.println("3 - Multiplicar.");
        System.out.println("4 - Dividir.");
        System.out.println("5 - Salir.");
        System.out.println("----------");
        System.out.print("Ingresa el número de opción de acuerdo al cálculo a realizar: ");
    }

    public static int pedirNumero() {
        System.out.print(">> ");
        int num = Integer.valueOf(scanner.nextLine());
        return num;
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multipicacion(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        double resultado = (double) a / (double) b;
        return resultado;
    }

    public static void esperarTecla() {
        System.out.print("\nPulse enter para continuar...");
        scanner.nextLine();
    }

}
