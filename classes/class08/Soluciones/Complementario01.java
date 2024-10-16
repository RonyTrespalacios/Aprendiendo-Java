/*
    Escribe un programa que pida al usuario ingresar dos números enteros: un límite inferior y un límite superior. Luego, utiliza el método random() de la clase Math para generar y mostrar en pantalla un número aleatorio dentro del rango especificado por los límites ingresados.
 */

import java.util.Scanner;

public class Complementario01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa de numeros aleatorios ingresados por usuario.");
        System.out.print("Digite un limite inferior >> ");
        int inf = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite un limite superior >> ");
        int sup = Integer.parseInt(scanner.nextLine());
        int resultado = (int) (Math.random() * (sup - inf + 1) + inf);
        System.out.println("Salida del numero aleatorio >> " + resultado);
        scanner.close();
    }
}
