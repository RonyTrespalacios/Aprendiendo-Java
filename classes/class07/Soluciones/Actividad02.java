/*
    Escribe un programa que solicite al usuario ingresar su nombre y apellido por separado, y luego muestre en pantalla el nombre completo utilizando el método concat() de la clase String.
 */

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita tu nombre >> ");
        String nombre = scanner.nextLine();
        nombre = capitalize(nombre);
        System.out.print("Digita tu apellido >> ");
        String apellido = scanner.nextLine();
        apellido = capitalize(apellido);
        String nombre_completo = nombre.concat(" ").concat(apellido);
        System.out.println("Hola, " + nombre_completo + "!");
        scanner.close();
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Convertir la primera letra a mayúscula y el resto a minúsculas
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

}
