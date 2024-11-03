/*
    Desafio registro de alumnos.
*/

import java.util.Scanner;

public class RegistroDeAlumnos {
    public static void main(String[] args) {
        System.out.println("\033\143"); // Limpiar la consola

        final int MAX_NUM_ALUMNOS = 300;
        String[] alumnos = new String[MAX_NUM_ALUMNOS];
        String alumno_entrada = "";
        double[] notas = new double[MAX_NUM_ALUMNOS];
        int cant_alumnos = 0, indice_auxiliar = 0;
        double promedio = 0;

        boolean banderaBusqueda = false;

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 7) {
            try {
                imprimirMenu();
                opcion = Integer.parseInt(scanner.nextLine());
                // según la opción que escoge el usuario vamos a ejecutar algo
                switch (opcion) {
                    case 1 -> { // Registrar un alumno.
                        // Código para registrar un alumno
                        do {
                            System.out.print("Ingrese el nombre del alumno: ");
                            alumnos[cant_alumnos] = scanner.nextLine().trim();
                            if (alumnos[cant_alumnos].isEmpty() || !(alumnos[cant_alumnos].matches("[a-z A-Z]*"))) {
                                System.out.println("Entrada invalida de alumno.");
                            }
                        } while (alumnos[cant_alumnos].isEmpty() || !(alumnos[cant_alumnos].matches("[a-z A-Z]*")));
                        do {
                            System.out.print("Ingrese la nota: ");
                            notas[cant_alumnos] = Double.parseDouble(scanner.nextLine());
                            if (notas[cant_alumnos] < 0 || notas[cant_alumnos] > 10) {
                                System.out.println("La nota debe estar entre 0 y 10, vuelve a intentarlo.");
                            }
                        } while (notas[cant_alumnos] < 0 || notas[cant_alumnos] > 10);
                        cant_alumnos++;
                    }
                    case 2 -> { // Mostrar alumnos.
                        System.out.println("Los alumnos actuales son los siguientes: ");
                        for (int i = 0; i < cant_alumnos; i++) {
                            System.out.println(" - " + (i + 1) + ": " + alumnos[i]);
                        }
                    }
                    case 3 -> { // Mostrar promedio de notas
                        promedio = 0;
                        for (int i = 0; i < cant_alumnos; i++) {
                            promedio += notas[i];
                        }
                        promedio = promedio / cant_alumnos;
                        System.out.printf("El promedio de notas de la clase es: %.2f", promedio);
                    }
                    case 4 -> { // Buscar alumno por nombre.
                        System.out.print("Digita el nombre del alumno >> ");
                        alumno_entrada = scanner.nextLine().trim();
                        banderaBusqueda = false;
                        for (int i = 0; i < cant_alumnos; i++) {
                            if (alumnos[i].equals(alumno_entrada)) {
                                System.out.println("Alumno encontrado!");
                                System.out.println(" - " + (i + 1) + ": " + alumnos[i] + " | nota -> " + notas[i]);
                                banderaBusqueda = true;
                            }
                        }
                        if (!banderaBusqueda) {
                            System.out.println("No se encontro el alumno.");
                        }

                    }
                    case 5 -> { // Modificar nota de alumno por nombre.
                        System.out.print("Digita el nombre del alumno >> ");
                        alumno_entrada = scanner.nextLine().trim();
                        banderaBusqueda = false;
                        for (int i = 0; i < cant_alumnos; i++) {
                            if (alumnos[i].equals(alumno_entrada)) {
                                System.out.println("Alumno encontrado!");
                                System.out.println(" - " + (i + 1) + ": " + alumnos[i] + " | nota -> " + notas[i]);
                                banderaBusqueda = true;
                                indice_auxiliar = i;
                                i = cant_alumnos;
                            }
                        }
                        if (!banderaBusqueda) {
                            System.out.println("No se encontro el alumno.");
                        } else {
                            System.out.print("Digita la nueva nota >> ");
                            notas[indice_auxiliar] = Double.parseDouble(scanner.nextLine());
                        }
                    }
                    case 6 -> { // Eliminar alumno por nombre.
                        System.out.print("Digita el nombre del alumno >> ");
                        alumno_entrada = scanner.nextLine().trim();
                        banderaBusqueda = false;
                        for (int i = 0; i < cant_alumnos; i++) {
                            if (alumnos[i].equals(alumno_entrada)) {
                                System.out.println("Alumno encontrado!");
                                System.out.println(" - " + (i + 1) + ": " + alumnos[i] + " | nota -> " + notas[i]);
                                banderaBusqueda = true;
                                indice_auxiliar = i;
                                i = cant_alumnos;
                            }
                        }
                        if (!banderaBusqueda) {
                            System.out.println("No se encontro el alumno.");
                        } else {
                            for (int j = indice_auxiliar; j < cant_alumnos; j++) {
                                if ((j + 1) < cant_alumnos) {
                                    alumnos[j] = alumnos[j + 1];
                                    notas[j] = notas[j + 1];
                                }
                            }
                            cant_alumnos--;
                            System.out.println("Alumno eliminado satisfacoriamente!");
                        }

                    }
                    case 7 -> { // Salir.
                        System.out.println("Saliendo...");
                    }
                    default -> {
                        System.out.println("Opción invalida, intenta nuevamente!!");
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Intenta nuevamente!");
            }

            pausa(scanner); // Pausa antes de continuar a la siguiente iteracion.
        }
        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\033\143"); // Limpiar la consola
        System.out.println("Digita una de las siguientes opciones >> ");
        System.out.println("1 - Registrar un alumno."); // opción 1
        System.out.println("2 - Mostar alumnos."); // opción 2
        System.out.println("3 - Mostrar promedio total de notas."); // opción 3
        System.out.println("4 - Buscar alumno por nombre."); // opción 4
        System.out.println("5 - Modificar nota de alumno por nombre."); // opción 5
        System.out.println("6 - Eliminar alumno por nombre."); // opción 6 System.out.println("7 - salir"); // opción
        System.out.println("7 - Salir."); // salir
        System.out.print("Escoge una opción: "); // pedir al usuario la opción
    }

    public static void pausa(Scanner scanner) {
        System.out.print("\nPulsa enter para continuar...");
        scanner.nextLine();
    }
}