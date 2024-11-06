/*
    Escribe un programa que cumpla con las siguientes condiciones:
    Pide al usuario que ingrese un número entre 1 y 30. Este número será almacenado en una variable llamada numeroLimite .
    Utiliza la clase Math para generar un número aleatorio entre 1 y el numeroLimite recibido del usuario.
    Utiliza el método Math.sqrt() para calcular la raíz cuadrada del número aleatorio generado y muéstralo en pantalla.
    Analiza si el número aleatorio generado es primo y muestra un mensaje en pantalla indicando si lo es o no.
    Finalmente, muestra el número aleatorio generado y su raíz cuadrada en pantalla.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Complementario02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Por favor, digita un numero entre 1 y 30 >> ");
            byte numeroLimite = Byte.parseByte(scanner.nextLine()); // 0 - 255
            if (numeroLimite > 30 || numeroLimite < 1) {
                throw new InputMismatchException();
            }
            byte aleatorio = (byte) (Math.random() * numeroLimite + 1);
            double raiz = Math.sqrt(aleatorio);
            switch (numeroLimite) {
                case 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 -> {
                    System.out.println("El numero generado es primo!");
                }
                default -> System.out.println("El numero generado no es primo.");
            }
            System.out.println("Numero generado >> " + aleatorio);
            System.out.println("Raiz cuadrada -> " + raiz);
        } catch (NumberFormatException e) {
            System.out.println("Formato de numero invalido. Intentalo nuevamente.");
        } catch (InputMismatchException e) {
            System.out.println("El numero ingresado no esta entre 1 y 30. Vuelve a intentarlo.");
        } catch (Exception e) {
            System.out.println("Error inesperado, informacion el error: ");
            System.out.println("\t" + e.getMessage());
            System.out.println("<!---------------------------!>");
            e.printStackTrace();
            System.out.println("<!---------------------------!>");
        } finally {
            System.out.println("\nPrograma finalizado!");
            scanner.close();
        }

    }
}
