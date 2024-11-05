/*
    Usar una variable global: Modifica los métodos "obtenerNombre()" y "obtenerEdad()" para que no necesiten recibir el Scanner por parámetro. En su lugar, utiliza una variable global para acceder al Scanner y obtener los datos necesarios.
 */

package Soluciones;

import java.util.Scanner;

public class Actividad03 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = obtenerNombre();
        int edad = ontenerEdad();
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

    public static String obtenerNombre() {
        System.out.print("Digita tu nombre >> ");
        String nombre = sc.nextLine();
        return nombre;
    }

    public static int ontenerEdad() {
        System.out.print("Digita tu edad >> ");
        return Integer.valueOf(sc.nextLine());
    }
}
