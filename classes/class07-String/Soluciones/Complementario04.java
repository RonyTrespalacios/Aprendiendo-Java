/*
 * En esta actividad, se solicita al usuario ingresar una cadena de texto y
 * calcular su longitud, pero esta vez sin contar los espacios en blanco. Para
 * lograr esto, se utilizará el método length() de la clase String y se
 * realizará un proceso adicional para excluir los espacios de la cuenta.
 */

import java.util.Scanner;

class Complementario01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite una frase >> ");
        String frase = scanner.nextLine();
        int a = frase.replace(" ", "").length();
        System.out.println("Longitud de las letras >> " + a);
        scanner.close();
    }
}