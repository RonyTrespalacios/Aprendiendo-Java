/*
 * El objetivo de esta actividad es que desarrolles un programa que solicite al
 * usuario ingresar un número y posteriormente calcule su factorial mediante un
 * bucle do-while. El factorial de un número se define como el producto de todos
 * los enteros desde 1 hasta ese número. A continuación, te presentamos algunos
 * ejemplos para mayor claridad:
 * 
 * El factorial de 3 se calcula como 1 * 2 * 3, lo que resulta en 6.
 * 
 * El factorial de 5 se obtiene multiplicando 1 * 2 * 3 * 4 * 5, dando como
 * resultado 120.
 * 
 * Para calcular el factorial de 7, multiplicamos 1 * 2 * 3 * 4 * 5 * 6 * 7, que
 * da 5040.
 */

package Soluciones;

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de factoriales :D");
        long numero = -1;
        do {
            try {
                System.out.print("Digita el numero >> ");
                numero = Long.valueOf(sc.nextLine());
                if (numero >= 21) {
                    System.out.println("Resultado demasiado grande para ser expresado.");
                    System.out.println("Intenta con un numero mas pequeño.");
                }
                if (numero < 0) {
                    System.out.println("No existen factoriales negativos.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato de numero invalido!. Vuelve a intentarlo.");
            }
        } while (numero >= 21 || numero < 0);
        System.out.println("Calculando " + numero + "!");
        int i = 0;
        long salida = 1;
        do {
            i++;
            if (i > numero) {
                break;
            } else {
                System.out.print(i);
                salida *= i;
                if (i == numero) {
                    System.out.print(" = ");
                } else {
                    System.out.print(" * ");
                }
            }
        } while (true);
        System.out.println(salida);
        sc.close();
    }
}