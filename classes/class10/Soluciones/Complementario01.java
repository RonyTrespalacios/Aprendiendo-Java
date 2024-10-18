/*
    Escribe un programa en el que se cree una variable de tipo array que contenga seis elementos de tipo entero. El programa debe contar la cantidad de elementos pares presentes en el array y mostrar el resultado por consola utilizando solo las herramientas aprendidas hasta el momento.
 */

import java.util.stream.IntStream;

public class Complementario01 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        String salida = String.join(", ", IntStream.of(nums).mapToObj(String::valueOf).toArray(String[]::new));
        System.out.println(salida + "\n");
        System.out.println(" ->" + nums[0] + " es: " + ((nums[0] % 2 == 0) ? "par" : "impar"));
        System.out.println(" ->" + nums[1] + " es: " + ((nums[1] % 2 == 0) ? "par" : "impar"));
        System.out.println(" ->" + nums[2] + " es: " + ((nums[2] % 2 == 0) ? "par" : "impar"));
        System.out.println(" ->" + nums[3] + " es: " + ((nums[3] % 2 == 0) ? "par" : "impar"));
        System.out.println(" ->" + nums[4] + " es: " + ((nums[4] % 2 == 0) ? "par" : "impar"));
        System.out.println(" ->" + nums[5] + " es: " + ((nums[5] % 2 == 0) ? "par" : "impar"));
    }
}
