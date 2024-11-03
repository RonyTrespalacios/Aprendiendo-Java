/*
    Pide al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter en la cadena y utiliza Character.isLetter() para verificar si todos los caracteres son letras. Muestra un mensaje al usuario indicando si la cadena contiene solo letras o no.
*/

package Soluciones;

import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita una cadena de texto >> ");
        String input = sc.nextLine();
        boolean banderaCaracter = true;
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i))) {
                banderaCaracter = false;
                break;
            }
        }
        if (banderaCaracter) {
            System.out.println("El texto contiene solo letras!!");
        } else {
            System.out.println("El texto no contiene solo letras, contiene digitos y/o caracteres especiales. :c");
        }
        sc.close();
    }
}
