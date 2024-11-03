/*
    Vas a desarrollar un programa en Java que genere una contraseña aleatoria. Esta contraseña estará compuesta por una mezcla de letras mayúsculas, letras minúsculas y dígitos. La contraseña será almacenada en un arreglo de caracteres.
    Para generar la contraseña, utilizarás un bucle for que repetirá la operación tantas veces como la longitud de la contraseña especificada por el usuario.
    Para asegurarte de que la contraseña generada contenga al menos una letra mayúscula, una letra minúscula y un dígito, usaré bucles do-while y while junto con los métodos isUpperCase, isLowerCase e isDigit de la clase Character.
    Finalmente, convertirás el arreglo de caracteres en un String con un bucle for y luego imprimirás la contraseña generada en la consola.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longitud = 0;
        do {
            try {
                System.out.print("Digite la longitud de la contraseña >> ");
                longitud = scanner.nextInt();
                if (!(longitud >= 3)) {
                    throw new InputMismatchException("Digita un numero mayor o igual a 3.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (longitud <= 2);
        char[] psswrd = new char[longitud];
        boolean condition = false;
        boolean digitos = false;
        boolean minuscula = false;
        boolean mayuscula = false;
        do {
            digitos = false;
            minuscula = false;
            mayuscula = false;
            for (int i = 0; i <= longitud - 1; i++) {
                psswrd[i] = (char) ((int) (Math.random() * (122 - 48 + 1) + 48));
                if (!digitos) {
                    digitos = Character.isDigit(psswrd[i]);
                }
                if (!minuscula) {
                    minuscula = Character.isLowerCase(psswrd[i]);
                }
                if (!mayuscula) {
                    mayuscula = Character.isUpperCase(psswrd[i]);
                }
            }
            condition = digitos && minuscula && mayuscula;
        } while (!condition);
        String salida = String.valueOf(psswrd);
        System.out.println("La contraseña generada es >> " + salida);
        scanner.close();
    }
}