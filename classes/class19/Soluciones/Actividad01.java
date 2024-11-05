/*
    Imprimir nombre:  Crea un método llamado imprimeNombre() que reciba por parámetro un nombre y luego imprima el mensaje "Mi nombre es [nombre]". Invocar dicho método desde el método main para ver el mensaje por consola

    Imprimir nombre y edad: Crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, el nombre y la edad, y luego imprima el mensaje "Me llamo [nombre] y tengo [edad] años".
*/

package Soluciones;

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita tu nombre >> ");
        String nombre = sc.nextLine();
        System.out.print("Digita tu edad >> ");
        int edad = Integer.valueOf(sc.nextLine());
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
}