/*
    Pídele al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter en la cadena y utiliza Character.isWhitespace() para contar el número de espacios en blanco en la cadena. Muestra el recuento al usuario.
*/

package Soluciones;

import java.util.Scanner;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita una oracion >> ");
        String stringEntrada = sc.nextLine();
        int contador = 0;
        for (int i = 0; i < stringEntrada.length(); i++) {
            if (Character.isWhitespace(stringEntrada.charAt(i))) {
                contador++;
            }
        }
        System.out.println("El texto ingresado contiene " + contador + " espacios en blanco.");
        sc.close();
    }
}
