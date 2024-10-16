/*
    Escribe un programa que  pida al usuario un número entero y muestra en pantalla su valor absoluto utilizando el método abs() de la clase Math.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un numero entero: ");
            int num = sc.nextInt();
            System.out.println(Math.abs(num));
        } catch (InputMismatchException e) {
            System.out.println("Tipo de dato invalido.");
            throw new ArithmeticException();
        } catch (Exception e) {
            System.out.println("Error inesperado.");
            e.printStackTrace();
        } finally {
            System.out.println("Programa terminado.");
            sc.close();
        }
    }
}