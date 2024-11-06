/*
    Escribe un programa que cree un array de 50 elementos de tipo carácter, inicializándolo con una frase elegida. Luego, solicita al usuario un carácter objetivo y cuenta cuántas veces aparece ese carácter en el array. Finalmente, imprime el resultado por consola.
 */

package Soluciones;
import java.util.Scanner;

public class Complementario03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita una frase >> ");
        String frase = scanner.nextLine();
        final int N = frase.length();
        char[] array = new char[N];
        System.out.print("[");
        for (int i=0; i<=N-1; i++) {
            array[i] = frase.charAt(i);
            System.out.print(" '"+array[i]+"' ");
        }
        System.out.println("]");
        System.out.print("Digita el caracter a buscar >> ");
        char caracter = scanner.nextLine().charAt(0);
        int cont = 0;
        for (char a : array) {
            if(a == caracter){
                cont++;
            }
        }
        if(cont!=0){
            System.out.println("El carácter '"+caracter+"' aparece "+cont+" veces.");
        }else{
            System.out.println("El carácter '"+caracter+"' no aparece en la frase.");
        }
        scanner.close();
    }
}
