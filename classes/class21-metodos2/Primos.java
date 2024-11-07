public class Primos {

    public static void main(String[] args) {
        int numero = 1238436219; // Cambia este valor para probar otros números
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    static boolean esPrimo(int n) {
        return esPrimo(n, 2);
    }

    // Método recursivo para comprobar si un número es primo
    static boolean esPrimo(int n, int divisor) {
        // Caso base: Si el número es menor o igual a 1, no es primo
        if (n <= 1) {
            return false;
        }
        // Caso base: Si el divisor es mayor que la raíz cuadrada de n, es primo
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        // Si el número es divisible por el divisor, no es primo
        if (n % divisor == 0) {
            return false;
        }
        // Llamada recursiva con el siguiente divisor
        return esPrimo(n, divisor + 1);
    }
}