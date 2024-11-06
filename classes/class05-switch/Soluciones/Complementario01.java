/*
    En este ejercicio, crearás un programa que pedirá al usuario ingresar un número del 1 al 7, representando un día de la semana. El programa determinará si ese día es hábil o no. Se mostrará el resultado en pantalla. Se considera que los días hábiles son del 1 al 5 (de lunes a viernes). Utilizaremos la estructura "switch" para implementar este programa. ( Ten en cuenta que los días hábiles son del 1 al 5 (de lunes a viernes).)
 */

import java.util.Scanner;

public class Complementario01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita un número del 1 al 7 >> ");
        int num = scanner.nextInt();
        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("El día es hábil.");
            case 6, 7 -> System.out.println("El día es de descanso, no es hábil.");
            default -> System.out.println("El número no corresponde a un día de la semana.");
        }
        scanner.close();
    }
}
