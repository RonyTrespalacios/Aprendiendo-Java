/*
    Escribe un programa que solicite que ingreses una contraseña y la valide utilizando un bucle while. La contraseña correcta es "secreto". Continuará pidiéndote que ingreses la contraseña hasta que sea correcta.
*/

import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String clave_interna = "secreto";
        String clave_ingresada = "";
        while (true) {
            System.out.print("Digita la clave >> ");
            clave_ingresada = scanner.nextLine();
            if (clave_ingresada.equals(clave_interna)) {
                break;
            } else {
                System.out.println("clave incorrecta, intenta nuevamente.");
            }
        }
        scanner.close();
    }
}
