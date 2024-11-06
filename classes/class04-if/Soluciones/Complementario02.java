/*
    En este ejercicio, desarrollarás un programa que solicitará al usuario el precio de un producto y determinará si tiene derecho a un descuento. Si el precio es igual o mayor a $100, se aplicará un descuento del 10% y se mostrará el nuevo precio con descuento. De lo contrario, se mostrará el precio original sin descuento.
 */

import java.util.Scanner;

public class Complementario02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa de descuentos.");
        System.out.print("Digita el precio sin descuento >> ");
        double price = scanner.nextDouble();
        if (price >= 100) {
            System.out.println("El producto tiene un descuento del 10% :D");
            System.out.println("\tPrecio final > " + price*0.9);
        }else{
            System.out.println("El precio es menor a 100. No se aplicara descuento.");
            System.out.println("\tPrecio final > " + price);
        }
        scanner.close();
    }
}
