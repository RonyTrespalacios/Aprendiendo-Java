## ➕ **Retos de Aprendizaje 2** 🧠💡

¡Bienvenidos a la segunda serie de **Retos de Aprendizaje**! En esta sección, encontrarán ejercicios diseñados para integrar todos los conceptos que hemos aprendido hasta ahora: tipos de variables, operadores, sentencias de control (if, switch), manejo de excepciones (`try-catch-finally`), y las clases `String` y `Math`. Estos ejercicios no solo pondrán a prueba sus conocimientos, sino que les ayudarán a desarrollar habilidades para enfrentar problemas del mundo real. 🌍✨

¡Ahora es tu turno de resolver estos retos y poner a prueba todo lo aprendido! 🚀💪 Recuerda que la práctica es clave para dominar cualquier habilidad. ¡Tú puedes hacerlo! 😊

### **Ejercicio 1: Calculadora de Gastos del Mes** 💸📝

Crea un programa que permita al usuario calcular sus gastos totales del mes. El usuario debe ingresar los gastos de tres categorías: **alimentación**, **transporte**, y **entretenimiento**. El programa debe mostrar el total de gastos y calcular el porcentaje que representa cada categoría respecto al total.

- Si el usuario ingresa un valor negativo, muestra un mensaje de error y convierte el valor a positivo utilizando `Math.abs()`.
- Calcula los porcentajes usando operaciones aritméticas y muestra los resultados con dos decimales.

**Ejemplo de entrada/salida:**

- Entrada: `Alimentación = -200`, `Transporte = 150`, `Entretenimiento = 100`
- Salida:
  - **Total de gastos:** 450
  - **Porcentaje de Alimentación:** 44.44%
  - **Porcentaje de Transporte:** 33.33%
  - **Porcentaje de Entretenimiento:** 22.22%

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class CalculadoraGastos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar gastos al usuario
            System.out.print("Ingrese el gasto en alimentación: ");
            double alimentacion = Math.abs(Double.parseDouble(scanner.nextLine()));

            System.out.print("Ingrese el gasto en transporte: ");
            double transporte = Math.abs(Double.parseDouble(scanner.nextLine()));

            System.out.print("Ingrese el gasto en entretenimiento: ");
            double entretenimiento = Math.abs(Double.parseDouble(scanner.nextLine()));

            // Calcular total de gastos
            double total = alimentacion + transporte + entretenimiento;

            // Calcular y mostrar porcentajes
            double porcentajeAlimentacion = (alimentacion / total) * 100;
            double porcentajeTransporte = (transporte / total) * 100;
            double porcentajeEntretenimiento = (entretenimiento / total) * 100;

            System.out.printf("Total de gastos: %.2f\n", total);
            System.out.printf("Porcentaje de Alimentación: %.2f%%\n", porcentajeAlimentacion);
            System.out.printf("Porcentaje de Transporte: %.2f%%\n", porcentajeTransporte);
            System.out.printf("Porcentaje de Entretenimiento: %.2f%%\n", porcentajeEntretenimiento);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor ingrese un número.");
        } finally {
            scanner.close();
        }
    }
}
```

</details>

### **Ejercicio 2: Conversor de Unidades** 📏🔄

Crea un programa que convierta una distancia ingresada por el usuario en **kilómetros** a **millas** y en **metros**. Utiliza `Math.round()` para redondear los resultados a dos decimales.

- **Conversión:** 1 kilómetro = 0.621371 millas, 1 kilómetro = 1000 metros.
- Muestra un mensaje de error si el usuario ingresa un valor negativo.

**Ejemplo de entrada/salida:**

- Entrada: `Distancia en kilómetros = 5`
- Salida:
  - **Millas:** 3.11
  - **Metros:** 5000

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar distancia en kilómetros
            System.out.print("Ingrese la distancia en kilómetros: ");
            double kilometros = Double.parseDouble(scanner.nextLine());

            if (kilometros < 0) {
                System.out.println("Error: La distancia no puede ser negativa.");
            } else {
                // Convertir a millas y metros
                double millas = kilometros * 0.621371;
                double metros = kilometros * 1000;

                // Mostrar resultados
                System.out.printf("Millas: %.2f\n", Math.round(millas * 100.0) / 100.0);
                System.out.printf("Metros: %.0f\n", metros);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor ingrese un número.");
        } finally {
            scanner.close();
        }
    }
}
```

</details>

### **Ejercicio 3: Clasificador de Números** 🔢📊

Crea un programa que solicite al usuario ingresar tres números enteros y determine cuál es el **mayor**, cuál es el **menor**, y si alguno de ellos es **igual** a otro.

- Utiliza operadores lógicos y aritméticos para comparar los números.
- Muestra un mensaje de error si el usuario ingresa un valor no numérico.

**Ejemplo de entrada/salida:**

- Entrada: `Número 1 = 7`, `Número 2 = 3`, `Número 3 = 7`
- Salida:
  - **Mayor:** 7
  - **Menor:** 3
  - **Hay números iguales.**

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class ClasificadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar los tres números al usuario
            System.out.print("Ingrese el primer número: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el segundo número: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el tercer número: ");
            int num3 = Integer.parseInt(scanner.nextLine());

            // Determinar mayor y menor
            int mayor = Math.max(num1, Math.max(num2, num3));
            int menor = Math.min(num1, Math.min(num2, num3));

            // Mostrar resultados
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);

            // Verificar si hay números iguales
            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Hay números iguales.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor ingrese un número entero.");
        } finally {
            scanner.close();
        }
    }
}
```

</details>

### **Ejercicio 4: Verificación de Contraseñas** 🔐✅

Crea un programa que permita al usuario ingresar una contraseña y verifique si cumple con los siguientes criterios de seguridad:

- **Al menos 8 caracteres**.
- **Contiene al menos una letra mayúscula, una minúscula y un número**.
- Si la contraseña no cumple con alguno de los requisitos, muestra un mensaje de error específico para cada uno.

**Ejemplo de entrada/salida:**

- Entrada: `Contraseña = Hola1234`
- Salida:
  - **Contraseña válida.**

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class VerificarContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();

        boolean longitudValida = contrasena.length() >= 8;
        boolean tieneMayuscula = contrasena.matches(".*[A-Z].*");
        boolean tieneMinuscula = contrasena.matches(".*[a-z].*");
        boolean tieneNumero = contrasena.matches(".*[0-9].*");

        if (!longitudValida) {
            System.out.println("Error: La contraseña debe tener al menos 8 caracteres.");
        } else if (!tieneMayuscula) {
            System.out.println("Error: La contraseña debe contener al menos una letra mayúscula.");
        } else if (!tieneMinuscula) {
            System.out.println("Error: La contraseña debe contener al menos una letra minúscula.");
        } else if (!tieneNumero) {
            System.out.println("Error: La contraseña debe contener al menos un número.");
        } else {
            System.out.println("Contraseña válida.");
        }

        scanner.close();
    }
}
```

</details>

### **Ejercicio 5: Sistema de Gestión de Inventario** 📦📝

Crea un programa que permita gestionar el inventario de una pequeña tienda. El usuario debe poder ingresar el nombre del producto, su precio y la cantidad disponible. Luego, el programa debe permitir realizar las siguientes acciones:

1. **Mostrar el valor total del inventario** (precio × cantidad de cada producto).
2. **Determinar si algún producto está agotado** (cantidad igual a cero).
3. **Mostrar el producto más caro y el más barato**.

- Utiliza un `switch` para permitir al usuario seleccionar la acción que desea realizar.
- Maneja posibles entradas incorrectas con `try-catch` y muestra mensajes claros de error.

**Ejemplo de entrada/salida:**

- Entrada:
  - Producto 1: `Nombre = Televisor`, `Precio = 500`, `Cantidad = 5`
  - Producto 2: `Nombre = Celular`, `Precio = 300`, `Cantidad = 0`
  - Producto 3: `Nombre = Laptop`, `Precio = 800`, `Cantidad = 3`
- Salida:
  - **Valor total del inventario:** 4900
  - **Producto agotado:** Celular
  - **Producto más caro:** Laptop
  - **Producto más barato:** Celular

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class GestionInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar información de los productos
            System.out.print("Ingrese el nombre del primer producto: ");
            String producto1 = scanner.nextLine();
            System.out.print("Ingrese el precio del primer producto: ");
            double precio1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese la cantidad del primer producto: ");
            int cantidad1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el nombre del segundo producto: ");
            String producto2 = scanner.nextLine();
            System.out.print("Ingrese el precio del segundo producto: ");
            double precio2 = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese la cantidad del segundo producto: ");
            int cantidad2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el nombre del tercer producto: ");
            String producto3 = scanner.nextLine();
            System.out.print("Ingrese el precio del tercer producto: ");
            double precio3 = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese la cantidad del tercer producto: ");
            int cantidad3 = Integer.parseInt(scanner.nextLine());

            // Menú de opciones
            System.out.println("\nSeleccione una acción:");
            System.out.println("1. Mostrar el valor total del inventario");
            System.out.println("2. Determinar si algún producto está agotado");
            System.out.println("3. Mostrar el producto más caro y el más barato");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    double valorTotal = (precio1 * cantidad1) + (precio2 * cantidad2) + (precio3 * cantidad3);
                    System.out.printf("Valor total del inventario: %.2f\n", valorTotal);
                    break;
                case 2:
                    if (cantidad1 == 0) {
                        System.out.println("Producto agotado: " + producto1);
                    }
                    if (cantidad2 == 0) {
                        System.out.println("Producto agotado: " + producto2);
                    }
                    if (cantidad3 == 0) {
                        System.out.println("Producto agotado: " + producto3);
                    }
                    break;
                case 3:
                    String productoCaro = (precio1 >= precio2 && precio1 >= precio3) ? producto1 : (precio2 >= precio3) ? producto2 : producto3;
                    String productoBarato = (precio1 <= precio2 && precio1 <= precio3) ? producto1 : (precio2 <= precio3) ? producto2 : producto3;
                    System.out.println("Producto más caro: " + productoCaro);
                    System.out.println("Producto más barato: " + productoBarato);
                    break;
                default:
                    System.out.println("Error: Opción no válida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor ingrese un número válido.");
        } finally {
            scanner.close();
        }
    }
}
```

</details>

---
