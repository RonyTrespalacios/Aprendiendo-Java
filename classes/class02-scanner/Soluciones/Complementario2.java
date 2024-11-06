/*
Pide al usuario que ingrese el valor de la base y de la altura de un rectángulo.

Almacena estos valores en variables previamente declaradas llamadas baseRectangulo y alturaRectangulo, respectivamente.

Calcula y almacena el perímetro del rectángulo utilizando la fórmula: Perímetro = 2 × base + 2 × altura.

Muestra el resultado del perímetro por consola junto con un mensaje adecuado.

Calcula y almacena el área del rectángulo utilizando la fórmula: Área = base × altura.

Muestra el resultado del área por consola junto con un mensaje adecuado.
 */

import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos
        System.out.println("Este programa calcula el area y perimetro de un rectanguilo!");
        System.err.print("Digita la base >> ");
        int baseRectangulo = scanner.nextInt();
        System.err.print("Digita la altura >> ");
        int alturaRectangulo = scanner.nextInt();

        // Procesamiento de datos
        int perimetro = 2 * baseRectangulo + 2 * alturaRectangulo;
        int area = baseRectangulo * alturaRectangulo;

        // Salida
        System.out.println("El area del rectangulo es: " + area );
        System.out.println("El perimetro del rectangulo es: " + perimetro );

        scanner.close();
    }
}
