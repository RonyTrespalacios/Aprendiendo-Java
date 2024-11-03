import java.util.Arrays;
import java.util.Scanner;

public class gestorOracion {
    public static void main(String[] args) {
        System.out.println("\033\143"); // limpiar terminal
        Scanner scanner = new Scanner(System.in);
        int sel = 0;
        String oracion = "", buscar = "", palabra_aux = "";
        String[] palabras = new String[1];
        int num = 0;
        boolean flag = false;
        boolean verificar = true;
        while (sel != 9) {
            menu();
            try {
                sel = Integer.parseInt(scanner.nextLine());
                switch (sel) {
                    case 1: // Crear Borrar
                        if (oracion.isEmpty()) {
                            System.out.print("Ingresa una oracion >> ");
                            oracion = scanner.nextLine();
                        } else {
                            System.out.println("Borrar oracion.");
                            oracion = "";
                        }
                        break;

                    case 2: // Cantidad de caracteres
                        System.out.println("La cantidad de caracteres es: " + oracion.length());
                        break;

                    case 3: // Cantidad de palabras
                        palabras = oracion.trim().split(" ");
                        System.out.println("Las palabras son: " + palabras.length);
                        break;

                    case 4: // Ordenar palabras
                        palabras = oracion.trim().split(" ");
                        Arrays.sort(palabras);
                        System.out.println(Arrays.toString(palabras));
                        break;

                    case 5: // Mostrar n-esima palabra
                        palabras = oracion.trim().split(" ");
                        do {
                            System.out.println("Que palabra quieres mostrar? ");
                            num = Integer.parseInt(scanner.nextLine());
                            if (num > palabras.length || num <= 0) {
                                System.out.println("Número inválido. Intente nuevamente.");
                            }
                        } while (num > palabras.length || num <= 0);
                        System.out.println("La palabra {" + num + "}" + " es: " + palabras[num - 1]);
                        break;

                    case 6: // Buscar palabra dentro de la oracion
                        flag = false;
                        palabras = oracion.trim().split(" ");
                        // System.out.println(Arrays.toString(palabras));
                        System.out.print("Digita la palabra que vas a buscar >> ");
                        buscar = scanner.nextLine();
                        for (int i = 0; i < palabras.length; i++) {
                            if (palabras[i].equals(buscar)) {
                                System.out.println("Palabra encontrada en la posicion " + (i + 1));
                                flag = true;
                                i = palabras.length;
                            }
                        }
                        if (!flag) {
                            System.out.println("No se encontro la plabra :c");
                        }
                        break;

                    case 7: // fdsafsdafas
                        flag = false;
                        verificar = true;
                        palabras = oracion.trim().split(" ");
                        System.out.println(Arrays.toString(palabras));
                        do {
                            System.out.print("Digita la palabra que vas a buscar >> ");
                            buscar = scanner.nextLine();
                            for (int i = 0; i < palabras.length; i++) {
                                if (palabras[i].equals(buscar)) {
                                    flag = true;
                                    do {
                                        System.out.print("Por que palabra la quieres reemplazar? ");
                                        palabra_aux = scanner.nextLine();
                                        for (int j = 0; j < palabra_aux.length(); j++) {
                                            verificar = Character.isAlphabetic(palabra_aux.charAt(i))
                                                    || palabra_aux.charAt(i) == ' ';
                                            if (!verificar) {
                                                j = palabra_aux.length();
                                            }
                                        }
                                    } while (!verificar);
                                    palabras[i] = palabra_aux;
                                    i = palabras.length;
                                }
                            }
                        } while (!flag);
                        System.out.println(Arrays.toString(palabras));
                        break;

                    case 8:
                        System.out.println("Que contenido desea agregar?");
                        palabra_aux = scanner.nextLine();
                        oracion = oracion.concat(" ".concat(palabra_aux));
                        System.out.println(oracion);
                        break;

                    case 9:
                        System.out.println("Adios!! Saliendo...");
                        break;

                    default:
                        System.out.println("Ingresa una opcion valida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Muy mal, vuelve a intentarlo.");
            }
            System.out.print("Digite cualquier tecla para continuar ...");
            scanner.nextLine();
            System.out.println("\033\143"); // limpiar terminal
        }
        scanner.close();
    }

    public static void menu() {
        System.out.println("Digita una de las siguientes opciones:");
        System.out.println(" 1. Crear oración o Borrar oración");
        System.out.println(" 2. Cantidad de caracteres de la oración");
        System.out.println(" 3. Cantidad de palabras de la oración");
        System.out.println(" 4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println(" 5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println(" 6. Buscar palabra dentro de la oración");
        System.out.println(" 7. Modificar palabra dentro de la oración");
        System.out.println(" 8. Agregar contenido a la oración");
        System.out.println(" 9. Salir");
        System.out.print("Digita una opcion del 1 al 9 >> ");
    }
}