/* 
   Reorganiza el código extrayendo la lógica en métodos sin alterar su funcionamiento. Después, intenta modificar la lógica para resolverlo de forma recursiva. 
 */

package Soluciones;

import java.util.Scanner;

public class Actividad01 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("ingrese la posicion");
      int posicion = sc.nextInt();
      int resultado = calcularFibonacci(posicion);
      System.out.println("el valor en la posicion " + posicion + " es: " + resultado);
      sc.close();
   }

   public static int calcularFibonacci(int posicion) {
      if (posicion == 0) {
         return 0;
      } else if (posicion == 1) {
         return 1;
      }

      return calcularFibonacci(posicion - 1) + calcularFibonacci(posicion - 2);
   }

}