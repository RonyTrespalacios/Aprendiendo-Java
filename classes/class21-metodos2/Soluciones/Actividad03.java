/*
    Crea un método llamado "esPrimo()" que reciba por parámetro un "int" y devuelva un valor booleano que verifique si el número es primo o no. Luego, intenta modificar la lógica para resolverlo utilizando recursividad.
 */

package Soluciones;

import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solicitarPrimo(sc);
        System.out.println("Continuando con la ejecucion del programa...");
        sc.close();
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void solicitarPrimo(Scanner sc) {
        System.out.print("Digita un numero >> ");
        int num = sc.nextInt();
        if (esPrimo(num)) {
            System.out.println("El numero es primo.");
        } else {
            System.out.println("El numero no es primo.");
            solicitarPrimo(sc);
        }
    }
}
