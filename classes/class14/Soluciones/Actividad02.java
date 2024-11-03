/*
    Escribe un programa que lea una cadena que represente un número entero como entrada utilizando la clase Scanner. Luego, convierte la cadena en un número entero utilizando la clase de envoltura Integer.
*/

package Soluciones;

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita un numero entero >> ");
        int num = Integer.valueOf(sc.nextLine());
        System.out.println("El numero ingresado fue " + num + ".");
        sc.close();
    }
}
