/*
    Escribe un programa que implemente un juego en el que el usuario debe adivinar una palabra aleatoria. El programa elegirá una palabra al azar de una lista predefinida y mostrará una pista de la longitud de la palabra. El usuario tendrá un número limitado de intentos para adivinar la palabra. Después de cada intento, el programa mostrará cuántas letras ha adivinado correctamente y en qué posición se encuentran.
    El programa debe tener las siguientes características:
    Utiliza un array de Strings para almacenar una lista de palabras predefinidas.
    Utiliza el método Math.random() para seleccionar una palabra aleatoria del array.
    Implementa un método para obtener una pista de la palabra seleccionada. Por ejemplo, si la palabra es "casa", la pista podría ser "_ _ _ _" (cuatro guiones bajos).
    Implementa un método para comprobar si una letra ingresada por el usuario está presente en la palabra seleccionada y en qué posición se encuentra.
    Utiliza un bucle para permitir al usuario ingresar sus intentos hasta que adivine la palabra o se agoten los intentos.
    Muestra un mensaje al usuario al final del juego indicando si adivinó la palabra correctamente o no, y muestra la palabra completa.
 */

package Soluciones;

import java.util.Scanner;

public interface Complementario01 {

    public static Scanner sc = new Scanner(System.in);

    public static String[] palabras = {
            "estrella", "planeta", "cometa", "galaxia", "asteroide",
            "constelacion", "meteoro", "nebulosa", "orbita", "universo",
            "gravedad", "cumulo", "supernova", "satellite", "telescopio",
            "espacial", "montana", "bosque", "ciudad", "mariposa",
            "playa", "selvatico", "florida", "invierno", "verano",
            "primavera", "computador", "telefono", "internet", "codigo",
            "ciencia", "historia", "geometria", "algebra", "biologia",
            "fisica", "quimica", "literatura", "poesia", "musica",
            "guitarra", "pintura", "escultura", "teatro", "danza",
            "deporte", "futbol", "baloncesto", "tenista", "narrador"
    };

    public static String[] pistas = {
            "Brilla sin calor en la noche y no enciende", // estrella
            "Ronda siempre cerca del gigante ardiente", // planeta
            "Sigue un camino helado y deja una estela", // cometa
            "Es una ciudad en el cosmos, pero no tiene habitantes", // galaxia
            "Un trozo del cielo que podría caer en cualquier momento", // asteroide
            "Figuras en el cielo, pero no son de carne y hueso", // constelacion
            "Visitante fugaz de luz, rápido e incandescente", // meteoro
            "Misteriosa nube que no trae agua, sino estrellas", // nebulosa
            "Siempre girando, nunca se detiene", // orbita
            "Un todo que incluye todo lo que conocemos y más", // universo
            "Invisible, pero lo sentimos caer", // gravedad
            "Un enjambre de luces que nunca se disuelve", // cumulo
            "Un adiós brillante y violento de una gran anciana", // supernova
            "Acompaña al grande, pero no lo toca", // satellite
            "Ojo gigante que observa lo inalcanzable", // telescopio
            "Más allá de la atmósfera, donde reina el vacío", // espacial
            "Elevada y firme, desafía la altura", // montana
            "Donde los susurros de hojas se oyen sin fin", // bosque
            "Una jungla de concreto y ruido", // ciudad
            "Una dama alada que vive poco y viaja lejos", // mariposa
            "Entre tierra y mar, un sitio que nunca duerme", // playa
            "Donde la jungla respira y el sol apenas llega", // selvatico
            "Un estado del sur que florece en cualquier temporada", // florida
            "Tiempo en que el sol se esconde y la nieve reina", // invierno
            "Época en la que el astro rey sonríe largo y cálido", // verano
            "El renacer de la naturaleza en colores vivos", // primavera
            "Mente de metal, más rápida que cualquiera", // computador
            "Siempre cerca de ti, pero nunca lo ves", // telefono
            "Te conecta, pero no es un hilo", // internet
            "Escribe el mundo de las máquinas en un lenguaje secreto", // codigo
            "Busca respuestas en lo invisible", // ciencia
            "Testigo de lo que ya no es, pero aún vive en la memoria", // historia
            "Todo es cuestión de líneas, formas y espacio", // geometria
            "Desafía la lógica con incógnitas en letras", // algebra
            "Explora lo que respira y crece sin pensar", // biologia
            "Estudia el movimiento sin mover un dedo", // fisica
            "Transforma una mezcla en algo inesperado", // quimica
            "Encuentra su esencia en palabras, pero no es poesía", // literatura
            "Rimas sin música que hablan del alma", // poesia
            "Una danza sin movimiento, hecha de notas", // musica
            "Se rasga en acordes, pero no se rompe", // guitarra
            "Escribe en colores lo que no se puede decir", // pintura
            "Forma con sus manos lo que no respira, pero vive", // escultura
            "Un espectáculo sin música, con gestos y palabras", // teatro
            "Se mueve sin palabras, y cuenta una historia", // danza
            "Un juego de destreza y fuerza que deja huella", // deporte
            "Un balón, dos metas, y millones de gritos", // futbol
            "Desafío de canasta en dos direcciones", // baloncesto
            "Con raqueta en mano, golpea sin tocar", // tenista
            "Da voz a historias sin ser el protagonista" // narrador
    };

    public static final int MAX_INTENTOS = 5;

    public static void main(String[] args) {
        int palabra;
        while (true) {
            System.out.println("\033[H\033[2J");
            System.out.print("Deseas jugar? (S/N) >> ");
            String entrada = sc.nextLine().trim().toUpperCase();
            if (entrada.equals("N")) {
                System.out.println("Gracias por jugar");
                break;
            } else if (entrada.equals("S")) {
                palabra = (int) (Math.random() * palabras.length);
                ejecutarJuego(palabras[palabra], palabra);
            } else {
                System.out.println("Entrada no valida. intentalo de nuevo.");
            }
            System.out.print("\nPulsa enter para continuar...");
            sc.nextLine();
        }
        sc.close();
    }

    public static void ejecutarJuego(String palabra, int indice_global) {
        int indice_pista;
        boolean[] indices_usados = new boolean[palabra.length()];
        int intentos = MAX_INTENTOS;
        String palabraIngresada = "";
        char[] letras = palabra.toCharArray();
        for (int i = 0; i <= letras.length - 1; i++) {
            letras[i] = '_';
        }
        while (true) {
            System.out.println("\033[H\033[2J");
            for (int i = 0; i <= letras.length - 1; i++) {
                System.out.print(letras[i] + " ");
            }
            System.out.println("");
            for (int i = 0; i <= letras.length - 1; i++) {
                System.out.print("^ ");
            }
            System.out.println("\n");
            if (intentos <= MAX_INTENTOS / 2) {
                System.out.println("PISTA >> " + pistas[indice_global] + "\n");
            }
            System.out.print("Digita la palabra >> ");
            palabraIngresada = sc.nextLine().trim().toLowerCase();
            if (palabraIngresada.equals(palabra)) {
                System.out.println("La palabra era: " + palabra);
                System.out.println("Felicidades!! Haz acertado.");
                break;
            } else {
                if (intentos == 0) {
                    System.out.println("Perdiste, la palabra era: " + palabra);
                    break;
                }
                System.out.println("no es la palabra, intentalo de nuevo.\n");
                intentos--;
                do {
                    indice_pista = (int) (Math.random() * letras.length);
                } while (indices_usados[indice_pista]);
                indices_usados[indice_pista] = true;
                letras[indice_pista] = palabra.charAt(indice_pista);
            }
            System.out.println("Te quedan " + intentos + " intentos.");
            System.out.print("Pulsa enter para continuar...");
            sc.nextLine();
        }
    }
}
