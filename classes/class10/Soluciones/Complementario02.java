/*
    Desarrolla un programa que cree un array de tamaño 5 que almacene números enteros. Luego, suma los elementos ubicados en las posiciones pares del array (es decir, las posiciones 0, 2 y 4) y muestra por consola el resultado de la suma. Utiliza exclusivamente las herramientas aprendidas hasta el momento.
 */

import java.util.stream.IntStream;

public class Complementario02 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        String salida = String.join(", ", IntStream.of(nums).mapToObj(String::valueOf).toArray(String[]::new));
        System.out.println(salida + "\n");
        System.out.println("Suma de indices pares >> " + (nums[0] + nums[2] + nums[4]));
    }
}
