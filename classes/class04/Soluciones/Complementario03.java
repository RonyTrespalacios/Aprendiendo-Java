/*
    En este ejercicio, desarrollarás un programa que solicite al usuario su edad y determine en qué categoría se encuentra. Las categorías son las siguientes:
        Si la edad es menor de 18 años, mostrar el mensaje "Eres menor de edad".
        Si la edad está entre 18 y 64 años (inclusive), mostrar el mensaje "Eres adulto".
        Si la edad es igual o mayor a 65 años, mostrar el mensaje "Eres un adulto mayor".
        El programa deberá mostrar el mensaje correspondiente según la categoría de edad en la que se encuentre el usuario.
 */


import java.util.Scanner;

public class Complementario03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa de categorias de edades.");
        System.out.print("Digita tu edad >> ");
        byte edad = scanner.nextByte();
        if (edad > 0) {
            if (edad < 18) {
                System.out.println("Eres menor de edad.");
            } else if (edad < 65) {
                System.out.println("Eres adulto.");
            }else {
                System.out.println("Eres adulto mayor.");
            }
        }else{
            System.out.println("Que chistoso, tienes " + edad + " anos.");
        }
        scanner.close();
    }
}
