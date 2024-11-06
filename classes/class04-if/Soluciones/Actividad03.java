/*
    En esta actividad, escribirás un programa que solicite al usuario un número y determine si es divisible por 5, por 3, por ambos o por ninguno. El resultado se mostrará en pantalla.
 */

import java.util.Scanner;

public class Actividad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este pograma calcula si un numero es divisible entre 5 o 3.");
        System.out.print("Digita un numero >> ");
        int num = scanner.nextInt();
        boolean div5 = num % 5 == 0;
        boolean div3 = num % 3 == 0;
        System.out.print("El numero es divisible entre ");
        if (div5 && div3) {
            System.out.println("ambos, 5 y 3. :D");
        }else if (div5 || div3) {
            System.out.println(div3 ? "3." : "5.");
        }else{
            System.out.println("niguno de los dos, 3 o 5. :c");
        }
        scanner.close();    
    }
}
