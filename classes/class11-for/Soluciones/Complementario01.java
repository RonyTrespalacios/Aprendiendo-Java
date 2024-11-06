/*
    Escribe un programa que recorra un array de enteros y lo invierta, es decir, que el primer elemento se convierta en el último y viceversa, luego imprime el array resultante por consola.  El tamaño y los números  a contener pueden ser de tu elección.
    IMPORTANTE: Debes invertir de forma permanente el orden de los elementos. Analiza si necesitas hacer uso de elementos auxiliares para concluir el ejercicio.
 */

package Soluciones;
import java.util.Scanner;

public class Complementario01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita cuantos numeros quieres digitar >> ");
        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];
        for(int i = 0; i <= N-1; i++){ //Leer los datos
            System.out.print(" i = "+ i + " >>> ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int aux = 0;
        for(int i = 0; i <= (int) Math.floor((N-1)/2); i++){ //Invertir el orden
            aux = array[N-1-i];
            array[N-1-i] = array[i];
            array[i] = aux;
        }
        System.out.print("\n{ ");
        for(int i = 0; i <= N-1; i++){ //Imprimir los datos
            System.out.print(array[i]+" ");
        }
        System.out.print(" }");
        scanner.close();
    }
}
