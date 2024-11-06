/*
    En este ejercicio, escribirás un programa que pida al usuario una contraseña y verificará si coincide con una contraseña predefinida. Si la contraseña ingresada es correcta, se mostrará un mensaje de "Acceso concedido". En caso contrario, se mostrará un mensaje de "Acceso denegado".
 */

import java.util.Scanner;

public class Complementario01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String psswrd = "Java1Ac";
        System.out.print("Digita la clave >> ");
        String clave = scanner.nextLine();
        if (clave.equals(psswrd)) {
            System.out.println("Acceso concedido, puedes aprender Java!");
        }else{
            System.out.println("Acceso denegado, clave incorrecta.");            
        }
        scanner.close();
    }
}
