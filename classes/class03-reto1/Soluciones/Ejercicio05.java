/*
    Crea un programa que verifique si una palabra o frase ingresada por el usuario es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda, ignorando los espacios y signos de puntuación).
 */

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digita una frase o palabra: ");
        String frase = scanner.nextLine();
        frase = frase.replaceAll("\\s","");
        frase = frase.toLowerCase();

        StringBuffer fraseNormal = new StringBuffer(frase);
        StringBuffer fraseInvertida = new StringBuffer(frase).reverse();

        String out = (fraseNormal.toString().equals(fraseInvertida.toString())) ? "Es un palíndromo." : "No es palíndromo.";
        
        System.out.println(frase);
        System.out.println(fraseInvertida.toString());
        System.out.println(out);

        scanner.close();
    }
}
