/*

Crea un programa que calcule el monto final después de aplicar intereses compuestos. El usuario debe ingresar el monto inicial, la tasa de interés anual, y la cantidad de años. La fórmula para el cálculo de los intereses compuestos es:
A = P(1 + r/n)^(nt)  
Donde:
- A es el monto final
- P es el monto inicial
- r es la tasa de interés anual (en decimal, por ejemplo, 5% = 0.05)
- n es el número de veces que se aplican los intereses por año (usa 12 para mensual)
- t es el número de años

 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto inicial: ");
        double P = scanner.nextDouble();
        System.out.print("Ingrese la tasa de interés anual (%): ");
        int r = scanner.nextInt();
        System.out.print("Ingrese los años: ");
        int t = scanner.nextInt();

        double A = P*Math.pow((1+((double)r/1200)), 12*t);

        System.out.println("El monto final después de 10 años es: " + A);

        scanner.close();
    }
}
