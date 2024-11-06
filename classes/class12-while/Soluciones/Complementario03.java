/*
    Crea un programa que solicite al usuario ingresar una serie de números enteros positivos. Utiliza un bucle do-while para ir acumulando la suma de los números ingresados. Después de cada entrada de número, pregunta al usuario si desea ingresar otro número. Si el usuario responde afirmativamente, continúa solicitando números; de lo contrario, muestra la suma acumulada de todos los números ingresados y termina el programa.
*/

import java.util.Scanner;

public class Complementario03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int num = 0;
        String validar = "S";
        do {
            if (validar.equals("S")) {
                System.out.print("Digita un numero >> ");
                num = Integer.parseInt(scanner.nextLine());
                if (num > 0) {
                    suma += num;
                } else {
                    System.out.println("El numero no es positivo. Vuelve a intentarlo.");
                }
            } else {
                break;
            }
            System.out.print("Desa seguir digitando numeros? (S/N) >> ");
            validar = scanner.nextLine().trim().toUpperCase();
        } while (true);
        System.out.println("La suma de los numeros digitados es : " + suma);
        scanner.close();
    }
}
