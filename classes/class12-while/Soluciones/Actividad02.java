/*
    Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra por consola un mensaje pidiéndote que adivines ese número utilizando un bucle do-while. El programa te indicará si el número que ingresas es mayor o menor que el número aleatorio, y seguirá pidiéndote que adivines hasta que lo hagas correctamente.
*/

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero_generado = (int) (Math.random() * 21 + 1);
        int numero_ingresado = 0;
        do {
            System.out.print("\033[H\033[2J"); // limpiar pantalla
            System.out.print("Adivina el numero >> ");
            numero_ingresado = Integer.parseInt(scanner.nextLine());
            if (numero_ingresado == numero_generado) {
                System.out.println("Felicidades! Haz acertado.");
            }
            if (numero_generado < numero_ingresado) {
                System.out.println("Casi, el numero es mas pequeño.");
            }
            if (numero_generado > numero_ingresado) {
                System.out.println("Casi, el numero es mas grande.");
            }
            System.out.print("Pulsa enter para continuar...");
            scanner.nextLine();
        } while (numero_ingresado != numero_generado);
        scanner.close();
    }
}
