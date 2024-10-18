/*
    Escribe un programa en el cual se cree una variable de tipo array que contenga tres elementos de tipo entero. El programa debe sumar los tres elementos de forma manual e imprimir por consola el resultado utilizando solamente las herramientas adquiridas hasta el momento.
 */

public class Actividad01 {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 20 };
        int suma = numbers[0] + numbers[1] + numbers[2];
        System.out.println("SUMA >> " + suma);
    }
}