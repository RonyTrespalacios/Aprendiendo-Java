/*
    El programa debe crear un array de tamaño 3 que almacene números enteros. Luego, solicita un número al usuario y muestra por consola si ese número está presente en el array o no. Es importante utilizar únicamente las herramientas aprendidas hasta el momento, sin emplear bucles en el proceso.
 */

import java.util.Scanner;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = { 4, 7, 8 };
        System.out.print("Digita tu numero >> ");
        int num = Integer.parseInt(scanner.nextLine());
        boolean bool = (num == array[0]) || (num == array[1]) || (num == array[2]);
        System.out.println(bool ? "El numero SI esta en el array." : "El numero NO esta en el array.");
        scanner.close();
    }
}
