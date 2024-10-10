/*
    Calculadora de Área y Perímetro:
    Implementando el uso de la estructura "switch expression", solicita al usuario que elija entre una de las siguientes dos figuras geométricas:
    Opción 1: "Circulo"
    Opción 2: "Rectangulo"
    Según la figura seleccionada, deberás solicitar que ingrese los valores necesarios para calcular el área o el perímetro de cada figura:
    Para el Círculo: Solicita el valor del radio, ya que PI es una constante.
    Para el Rectángulo: Solicita el valor de la base y de la altura.
    Dentro de la opción elegida, permite al usuario seleccionar si desea conocer el área o el perímetro de dicha figura.
    Realiza los cálculos necesarios y muestra el resultado por consola junto con un mensaje adecuado.
*/

import java.util.Scanner;

public class Complementario02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA DE AREA Y PERIMETRO");
        System.out.println("Opción 1: Circulo");
        System.out.println("Opción 2: Rectangulo");
        System.out.print("Digita una opcion valida (1 o 2) >> ");
        byte sel = scanner.nextByte();
        switch (sel) {
            case 1 -> {
                System.out.print("Digita el radio del circulo >> ");
                double r = scanner.nextDouble();
                System.out.print("Calcular | 1 -> Area | 2 -> Perimetro | >> ");
                byte calc = scanner.nextByte();
                switch (calc) {
                    case 1 -> System.out.println("El area es -> "+ Math.PI*Math.pow(r,2) +" unidades^2.");
                    case 2 -> System.out.println("El perimetro es -> "+ 2*Math.PI*r +" unidades^2.");
                    default -> System.out.println("Opcion invalida.");
                }
            }
            case 2 -> {
                System.out.print("Digita la base del rectangulo >> ");
                double b = scanner.nextDouble();
                System.out.print("Digita la altura del rectangulo >> ");
                double h = scanner.nextDouble();
                System.out.print("Calcular | 1 -> Area | 2 -> Perimetro | >> ");
                byte calc = scanner.nextByte();
                switch (calc) {
                    case 1 -> System.out.println("El area es -> "+ b*h +" unidades^2.");
                    case 2 -> System.out.println("El perimetro es -> "+ (2*b+2*h) +" unidades^2.");
                    default -> System.out.println("Opcion invalida.");
                }
            }
            default -> System.out.println("Opcion invalida.");
        }
        scanner.close();
    }
}
