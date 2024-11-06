/*
    En esta actividad, vas a desarrollar un programa que mostrará un menú con las siguientes opciones:
    Opción 1: "Guardar"
    Opción 2: "Cargar"
    Opción 3: "Salir"
    El programa solicitará al usuario que ingrese un número del 1 al 3 para seleccionar una opción. 
    Utilizarás la estructura "switch" para implementar este programa y mostrar en pantalla el mensaje correspondiente a la opción seleccionada.
 */

import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opción 1: \"Guardar\"");
        System.out.println("Opción 2: \"Cargar\"");
        System.out.println("Opción 3: \"Salir\"");
        System.out.print("Ingresa una opción: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1 -> System.out.println("Guardando...");
            case 2 -> System.out.println("Cargando...");
            case 3 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción inválida");
        }
        scanner.close();
    }
}
