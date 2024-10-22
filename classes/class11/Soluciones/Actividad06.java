/*
    Crea un array del tamaño que prefieras que contenga elementos de tipo cadena. Luego, concatena los elementos en una sola cadena, separados por espacios, e imprime el resultado por consola.
 */

package Soluciones;

public class Actividad06 {
    public static void main(String[] args) {
        String[] elementos = { "rony", "daniela", "isaac", "gabriel" };
        String salida = "";
        for (String elemento : elementos) {
            salida = salida.concat(" ".concat(elemento));
        }
        System.out.println(salida);
    }
}
