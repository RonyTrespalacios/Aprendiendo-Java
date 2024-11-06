/*
    Es par: Reemplaza la lógica de pedir un número por un método llamado "solicitarNumero()" que no reciba parámetros y devuelva un entero. También reemplaza la condición del if por un método llamado "esPar()" que reciba por parámetro un entero y devuelva un booleano.
 */

import java.util.Scanner;

public class Actividad1 {
    public static Scanner pepe = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println(esPar(solicitarNumero()) ? "Es par" : "Es impar");
        } catch (Exception e) {
            System.out.println("Algo salio mal. El error es el siguiente >> ");
            e.printStackTrace();
        } finally {
            pepe.close();
        }
    }

    public static int solicitarNumero() {
        Integer numero = null;
        System.out.println("Por favor ingrese un número:");
        do {
            try {
                numero = pepe.nextInt();
            } catch (Exception e) {
                pepe.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);

        return numero;
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;

    }

}