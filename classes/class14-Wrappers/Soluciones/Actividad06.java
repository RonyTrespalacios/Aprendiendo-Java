/*
    Pídele al usuario que introduzca un número. Convierte el número en una cadena y luego utiliza un bucle y Character.isDigit() para contar el número de dígitos en el número.
*/

package Soluciones;

import java.util.Scanner;

public class Actividad06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero >> ");
        int num = Integer.valueOf(sc.nextLine());
        String stringNumber = Integer.toString(num);
        int contadorDigitos = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            if (Character.isDigit(stringNumber.charAt(i))) {
                contadorDigitos++;
            }
        }
        System.out.println("El numero contiene " + contadorDigitos + " digitos.");
        sc.close();
    }
}
