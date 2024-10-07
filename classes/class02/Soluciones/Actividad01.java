/*Clase Escaner
    Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una variable e imprime el dato por consola..

    Solicita al usuario que ingrese su edad (número), guárdalo en una variable e imprime el dato por consola..

    Luego imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.\
*/ 

import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nomrbe:");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + "! :D");

        System.out.println("Ingresa tu edad:");
        byte edad = scanner.nextByte();
        System.out.println("Tu edad es de " + edad);

        System.out.println("Tu nombres es ["+nombre+"] y su edad es ["+edad+"]");
        System.out.println("Tus datos han sido robados satisfactoriamente!");
        System.out.println("\nEs broma xd, gracias por usarme.");
        
        scanner.close();
    }
}

