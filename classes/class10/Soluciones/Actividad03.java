
/*
    Escribe un programa en el cual se cree una variable de tipo array que contenga cinco elementos de tipo entero, ingresados por el usuario. El programa debe buscar el máximo e imprimir por consola el resultado utilizando solamente las herramientas adquiridas hasta el momento.
 */

import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Digita 5 numeros para hallar el maximo >> ");
        // array[0] = (int) scanner.nextLine().charAt(0);
        array[0] = Integer.parseInt(scanner.nextLine());
        array[1] = Integer.parseInt(scanner.nextLine());
        array[2] = Integer.parseInt(scanner.nextLine());
        array[3] = Integer.parseInt(scanner.nextLine());
        array[4] = Integer.parseInt(scanner.nextLine());
        int maximo = array[0];
        maximo = array[1] > maximo ? array[1] : maximo;
        maximo = array[2] > maximo ? array[2] : maximo;
        maximo = array[3] > maximo ? array[3] : maximo;
        maximo = array[4] > maximo ? array[4] : maximo;
        System.out.println("El numero maximo es >> " + maximo);
        scanner.close();
    }
}
