/*
    Mediante una estructura switch, desarrollarás un programa que pida al usuario ingresar un número del 1 al 3 para seleccionar una figura geométrica: 1 para círculo, 2 para cuadrado y 3 para triángulo. Después, solicitará al usuario los datos necesarios para calcular el área de la figura seleccionada. Estos datos serán:
    Para el círculo: el radio.
    Para el cuadrado: el lado.
    Para el triángulo: la base y la altura.
    Finalmente, el programa mostrará en pantalla el área correspondiente a la figura seleccionada.
 */

 import java.util.Scanner;

 public class Actividad04 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA DE AREAS");
        System.out.println("Elige una figura geometrica");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.print("Digita una de las opciones >> ");
        byte sel = scanner.nextByte();
        switch (sel) {
            case 1 -> {
                System.out.print("Ingresa el radio del circulo >> ");
                double r = scanner.nextDouble();
                double area = Math.PI * Math.pow(r, 2);
                System.out.println("El area del circulo de radio " + r + " es " + area + " unidades^2");
            }
            case 2 -> {
                System.out.print("Ingresa el lado del cuadrado >> ");
                double l = scanner.nextDouble();
                System.out.println("El area del circulo de radio " + l + " es " + l*l + " unidades^2");
            }
            case 3 -> {
                System.out.print("Ingresa la base del triangulo >> ");
                double b = scanner.nextDouble();
                System.out.print("Ingresa la altura del triangulo >> ");
                double h = scanner.nextDouble();
                System.out.println("El area del triangulo de base " + b + " y altura " + h + " es " + (b*h/2) + " unidades^2");
            }
            default -> System.out.println("Opcion invalida.");
        }
        scanner.close();
     }
 }