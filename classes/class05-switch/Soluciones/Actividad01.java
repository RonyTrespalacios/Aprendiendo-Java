/*
    En esta actividad, escribirás un programa que solicite al usuario ingresar un número del 1 al 7, que representará un día de la semana. Luego, el programa mostrará en pantalla el nombre correspondiente a ese día. Utilizaremos la estructura "switch" para implementar este programa.
 */

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita un numero del dia de la semana del 1 al 7 >> ");
        byte num = scanner.nextByte();
        switch (num) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia no valido.");
        }
        scanner.close();
    }
}
