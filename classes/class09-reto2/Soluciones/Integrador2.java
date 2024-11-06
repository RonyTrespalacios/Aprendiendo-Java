/*
    Escribe un programa que solicite al usuario que ingrese una contraseña y verifique si cumple con los siguientes criterios para considerarse segura:
    La contraseña debe tener al menos 8 caracteres.
    La contraseña debe contener al menos una letra mayúscula y una letra minúscula.
    La contraseña debe contener al menos un número.
    La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).
    El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según los criterios establecidos. Puedes utilizar métodos de la clase String para verificar cada uno de los criterios.
 */

import java.util.Scanner;

public class Integrador2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su contraseña: ");
        String psswrd = scanner.nextLine();

        System.out.println();
        scanner.close();
    }
}
