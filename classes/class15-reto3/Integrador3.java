/*
    Vas a desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria. Estas calificaciones se almacenarán en un arreglo de Strings.

    Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos, separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10). Necesitarás convertir los String a double para lograrlo.

    Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.

    Por último, imprimiré los resultados en consola.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Integrador3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Ingrese el tamanio del arreglo: ");
        int size = myScanner.nextInt();
        String[] array = new String[size];
        double num;
        int m = 0;
        int j = 0;
        int l = 0;
        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        for (int i = 0; i < size; i++) {
            array[i] = Double.toString((Math.random() * (10) + 1));
            num = Double.valueOf(array[i]);
            sum = sum + num;
            if (num < 4) {
                m++;
            } else if (num >= 4 && num != 10) {
                j++;
            } else {
                l++;
            }
        }
        Double[] desaprobados = new Double[m];
        Double[] aprobado = new Double[j];
        Double[] excelente = new Double[l];
        m = 0;
        j = 0;
        l = 0;
        for (int i = 0; i < size; i++) {
            num = Double.valueOf(array[i]);
            if (num < 4) {
                desaprobados[m] = num;
                sum1 = sum1 + num;
                m++;
            } else if (num >= 4 && num != 10) {
                aprobado[j] = num;
                sum2 = sum2 + num;
                j++;
            } else {
                excelente[l] = num;
                sum3 = sum3 + num;
                l++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("El promedio del arreglo general es: " + sum / size);
        System.out.println("El promedio del arreglo de desaprobados es: " + sum1 / desaprobados.length);
        System.out.println("El promedio del arreglo aprobados es: " + sum2 / aprobado.length);
        System.out.println("El promedio del arreglo excelente es: " + sum3 / excelente.length);
    }
}
