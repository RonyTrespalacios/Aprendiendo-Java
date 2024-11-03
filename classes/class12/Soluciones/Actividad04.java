/*
    Escribe un programa que te pida que ingreses un número entero y utilice un bucle while para calcular la cantidad de dígitos de ese número. Por ejemplo, el número 4578 tiene 4 dígitos. El programa debe tener en cuenta que el 0 tiene una cifra y también contar las cifras de números negativos.
*/

import java.util.Scanner;

public class Actividad04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que cuenta digitos");
        System.out.print("Digita un numero entero >> ");
        int num = Integer.parseInt(scanner.nextLine());
        int cont = 0;
        while (true) {
            if (((int) (num / 10)) != 0) {
                cont++;
                num = num / 10;
            } else {
                cont++;
                break;
            }
        }
        System.out.println("El numero tiene " + cont + " digitos.");
        scanner.close();
    }
}