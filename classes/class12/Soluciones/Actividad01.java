/*
 * Crea un menú interactivo con 5 opciones para que el usuario elija, como por
 * ejemplo:
 * 
 * Comprar producto.
 * 
 * Realizar devolución.
 * 
 * Ver mis pedidos.
 * 
 * Preguntas frecuentes.
 * 
 * Salir.
 * 
 * Luego, solicita al usuario que elija una opción del menú mostrado en
 * pantalla. El menú debe seguir apareciendo hasta que el usuario elija la
 * opción para salir del programa. En este ejercicio, no es necesario que las
 * opciones del menú realicen acciones reales, simplemente muestra un mensaje
 * que indique qué opción eligió el usuario.
 */

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1. Comprar producto.");
            System.out.println("2. Realizar devolución.");
            System.out.println("3. Ver mis pedidos.");
            System.out.println("4. Preguntas frecuentes.");
            System.out.println("5. Salir.");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            System.out.println();
        } while (opcion != 5);
        System.out.println("Gracias por utilizar nuestro programa.");
        scanner.close();
    }
}