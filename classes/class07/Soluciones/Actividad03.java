/*
    Actividad:Extracción de Subcadena
    Escribe un programa que solicite al usuario ingresar una frase y dos números enteros, que representen un índice inicial y un índice final. Utiliza el método substring() de la clase String para extraer la subcadena que se encuentra entre los índices ingresados por el usuario, y muestra la subcadena resultante en pantalla.
 */

import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digita una frase >> ");
            String stringFrase = scanner.nextLine();
            System.out.println("La frase '" + stringFrase + "' tiene '" + stringFrase.length() + "' caracteres.");
            System.out.print("Desde que posicion la quieres partir? (desde 1) >> ");
            int intDesde = Integer.parseInt(scanner.nextLine());
            System.out.print("Hasta que posicion la quieres? >> ");
            int intHasta = Integer.parseInt(scanner.nextLine());
            System.out.println("Resultado >> '" + stringFrase.substring(intDesde - 1, intHasta) + "'.");
        } catch (NumberFormatException e) {
            System.out.println("Formato de numero invalido. Por favor intente nuevamente.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Indice invalido. Por favor intente nuevamente.");
        } catch (Exception e) {
            System.out.println("Ups. Algo salio mal. Por favor intente nuevamente.");
        }
        scanner.close();
    }
}
