/*
    Desarrolla un programa que inicie creando un array de 3 enteros, con valores predeterminados. Posteriormente, genera una copia del mismo con una extensión de 2 elementos adicionales.
    Solicita al usuario que ingrese dos números para ser almacenados en las nuevas posiciones del array.
    Finalmente, muestra por consola el contenido del nuevo array.
    Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento, evitando el uso de bucles en el proceso.
 */

import java.util.Scanner;
import java.util.stream.IntStream;

public class Actividad05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] primerArray = { 9, 10, 11 };
        int[] segundoArray = new int[5];
        segundoArray[0] = primerArray[0];
        segundoArray[1] = primerArray[1];
        segundoArray[2] = primerArray[2];
        System.out.println("Digita 2 numeros >> ");
        segundoArray[3] = Integer.parseInt(scanner.nextLine());
        segundoArray[4] = Integer.parseInt(scanner.nextLine());
        System.out.println("Array de salida >> ");
        String salida = String.join(", ", IntStream.of(segundoArray).mapToObj(String::valueOf).toArray(String[]::new));
        System.out.println(salida);
        scanner.close();
    }
}
