/*
    Obtener datos: Perfeccionando la actividad de “imprimir datos”, no solo crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, el nombre y la edad, sino a su vez, crea dos métodos para obtener el nombre y la edad, respectivamente. Ambos métodos deben recibir por parámetro un objeto de tipo "Scanner".
*/

package Soluciones;

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = obtenerNombre(sc);
        int edad = ontenerEdad(sc);
        imprimeNombre(nombre);
        imprimeNombreYEdad(nombre, edad);
        sc.close();
    }

    public static void imprimeNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public static String obtenerNombre(Scanner sc) {
        System.out.print("Digita tu nombre >> ");
        String nombre = sc.nextLine();
        return nombre;
    }

    public static int ontenerEdad(Scanner sc) {
        System.out.print("Digita tu edad >> ");
        return Integer.valueOf(sc.nextLine());
    }
}
