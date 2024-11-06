/*
    Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor redondeado utilizando el método round() de la clase Math.
 */

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese un número decimal para calcular el valor redondeado");
            float nroIngresado = sc.nextFloat();
            int nroRedondeado = Math.round(nroIngresado);
            System.out.println("El redondeo del número " + nroIngresado + " sería: " + nroRedondeado);
        } catch (Exception err) {
            System.out.println("Ocurrió un error.");
            err.printStackTrace();
        } finally {
            sc.close();
        }
    }
}