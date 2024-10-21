# ➕ **Introducción a Arrays** 📊

## **¿Qué es un Array?**

Un **array** (o arreglo) es una estructura de datos que permite almacenar varios valores del mismo tipo en una única variable. Es como una caja con compartimentos donde cada compartimento puede contener un valor. Por ejemplo, si queremos almacenar los nombres de nuestros amigos, podríamos utilizar un array para guardarlos todos juntos en lugar de tener una variable para cada nombre.

A diferencia de las variables comunes que solo pueden contener un valor, los arrays permiten trabajar con un conjunto de elementos, lo cual es útil para manejar colecciones de datos de manera eficiente. Cada valor almacenado en un array se denomina **elemento**, y cada elemento se identifica mediante un **índice** que indica su posición en el array. Los índices comienzan en **0**, por lo que el primer elemento de un array se encuentra en la posición 0, el segundo en la posición 1, y así sucesivamente.

## **Tipos de Arrays**

1. **Arrays Unidimensionales**: Son los más comunes y representan una lista de elementos del mismo tipo. Por ejemplo, una lista de números enteros o una lista de cadenas de texto. Podemos imaginar un array unidimensional como una fila de casillas, donde cada casilla almacena un valor.

   **Ejemplo de un Array Unidimensional**

   ```java
   int[] numeros = {1, 2, 3, 4, 5};
   ```

   En este ejemplo, el array `numeros` contiene cinco valores enteros: 1, 2, 3, 4 y 5.

2. **Arrays Multidimensionales**: Son arrays que contienen otros arrays. Los más comunes son los **arrays bidimensionales**, que pueden ser vistos como una tabla con filas y columnas. Es como una hoja de cálculo con datos organizados en diferentes filas y columnas.

   **Ejemplo de un Array Bidimensional**

   ```java
   int[][] matriz = {
       {1, 2, 3},
       {4, 5, 6},
       {7, 8, 9}
   };
   ```

   En este ejemplo, `matriz` tiene tres filas y tres columnas. Cada valor se puede acceder usando dos índices: el primero indica la fila y el segundo indica la columna.

## **Crear un Array Vacío**

Podemos crear un array sin valores iniciales, definiendo el tamaño del array (es decir, el número de elementos que podrá contener). Por ejemplo:

```java
int[] arrayVacio = new int[4];
```

En este ejemplo, `arrayVacio` es un array de 4 posiciones, pero cada una de sus posiciones inicialmente tiene el valor por defecto para su tipo (en el caso de los enteros, `0`). A continuación, podemos ver cómo quedaría el array:

| Índice | Elemento |
| ------ | -------- |
| 0      | 0        |
| 1      | 0        |
| 2      | 0        |
| 3      | 0        |

Podemos asignar valores a cada posición más adelante utilizando los índices.

## **Índices en Arrays**

Los arrays en Java son **indexados desde cero**, lo que significa que el primer elemento tiene el índice 0, el segundo elemento tiene el índice 1, y así sucesivamente. Esto es algo importante de recordar, ya que acceder a un índice que no existe (por ejemplo, un índice negativo o mayor que el tamaño del array) causará un error.

Supongamos que tenemos el siguiente array:

```java
int[] numeros = {10, 20, 30, 40, 50};
```

| Índice | Elemento |
| ------ | -------- |
| 0      | 10       |
| 1      | 20       |
| 2      | 30       |
| 3      | 40       |
| 4      | 50       |

En este caso, el array `numeros` tiene 5 elementos y sus índices van desde 0 hasta 4. Para acceder al valor del tercer elemento, usaríamos `numeros[2]`, que devolvería `30`.

## **Acceder a los Elementos de un Array**

Para acceder a un elemento del array, usamos el nombre del array seguido del índice entre corchetes `[]`. El índice indica la posición del elemento que queremos acceder. Por ejemplo:

```java
int[] edades = {25, 30, 45, 50};
System.out.println("La edad del segundo elemento es: " + edades[1]); // Salida: 30
```

En este ejemplo, `edades[1]` accede al segundo elemento del array, que tiene el valor `30`.

Podemos modificar el valor de un elemento del array utilizando su índice:

```java
edades[1] = 35;
System.out.println("La nueva edad del segundo elemento es: " + edades[1]); // Salida: 35
```

## **Tipos de Arrays y Ejemplos de Definición**

La siguiente tabla muestra cómo definir diferentes tipos de arrays, tanto vacíos como con valores iniciales:

| Tipo de Array       | Definición de Array Vacío         | Definición de Array con Valores               |
| ------------------- | --------------------------------- | --------------------------------------------- |
| Array de Enteros    | `int[] array = new int[5];`       | `int[] array = {1, 2, 3, 4, 5};`              |
| Array de Cadenas    | `String[] array = new String[3];` | `String[] array = {"Ana", "Luis", "Carlos"};` |
| Array de Decimales  | `double[] array = new double[4];` | `double[] array = {1.1, 2.2, 3.3, 4.4};`      |
| Array Bidimensional | `int[][] matriz = new int[2][3];` | `int[][] matriz = { {1, 2}, {3, 4} };`        |



- **Array de Enteros Vacío**: `int[] array = new int[5];` crea un array de 5 posiciones, todas inicialmente con valor `0`.
- **Array de Cadenas con Valores**: `String[] array = {"Ana", "Luis", "Carlos"};` crea un array con 3 elementos, que son cadenas de texto.
- **Array Bidimensional Vacío**: `int[][] matriz = new int[2][3];` crea una matriz con 2 filas y 3 columnas, todas con valores `0` iniciales.

## **Ejemplos de Arrays**

### **Array de Enteros**

```java
int[] edades = {25, 30, 45, 50};
System.out.println("La edad del segundo elemento es: " + edades[1]); // Salida: 30
```

### **Array de Strings**

```java
String[] nombres = {"Ana", "Luis", "Carlos", "Maria"};
System.out.println("El primer nombre es: " + nombres[0]); // Salida: Ana
```

### **Array Bidimensional**

Podemos imaginar un array bidimensional como una tabla con filas y columnas. Por ejemplo, si tenemos una matriz que representa una cuadrícula de números:

```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
System.out.println("Elemento en la segunda fila y tercera columna: " + matriz[1][2]); // Salida: 6
```

En este ejemplo, `matriz[1][2]` accede al valor en la segunda fila y tercera columna, que es `6`.

## ➕ **Ejercicios de Práctica con Arrays**

### **Ejercicio 1: Suma de Elementos del Array**

Crea un programa que solicite al usuario ingresar 4 números y los almacene en un array. Luego, calcula la suma de todos los elementos del array y muestra el resultado.

- Si el usuario ingresa un valor no numérico, muestra un mensaje de error utilizando `try-catch`.

**Ejemplo de entrada/salida:**

- Entrada: `10, 20, 30, 40`
- Salida: `La suma de los elementos es: 100`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class SumaElementosArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];

        try {
            // Solicitar los números al usuario
            System.out.print("Ingrese el primer número: ");
            numeros[0] = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el segundo número: ");
            numeros[1] = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el tercer número: ");
            numeros[2] = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el cuarto número: ");
            numeros[3] = Integer.parseInt(scanner.nextLine());

            // Calcular la suma de los elementos
            int suma = numeros[0] + numeros[1] + numeros[2] + numeros[3];

            // Mostrar el resultado
            System.out.println("La suma de los elementos es: " + suma);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor ingrese un número entero.");
        } finally {
            scanner.close();
        }
    }
}
```

</details>

### **Ejercicio 2: Encontrar el Mayor y Menor Valor**

Crea un programa que permita al usuario ingresar 5 números y los almacene en un array. Luego, determina cuál es el **mayor** y cuál es el **menor** valor del array y muestra los resultados.

**Ejemplo de entrada/salida:**

- Entrada: `15, 8, 23, 5, 12`
- Salida:
  - **Mayor:** 23
  - **Menor:** 5

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class MayorMenorValorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        try {
            // Solicitar los números al usuario
            System.out.print("Ingrese el primer número: ");
            numeros[0] = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el segundo número: ");
            numeros[1] = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el tercer número: ");
            numeros[2] = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el cuarto número: ");
            numeros[3] = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el quinto número: ");
            numeros[4] = Integer.parseInt(scanner.nextLine());

            // Encontrar el mayor y menor valor
            int mayor = numeros[0];
            int menor = numeros[0];

            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > mayor) {
                    mayor = numeros[i];
                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }

            // Mostrar los resultados
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor ingrese un número entero.");
        } finally {
            scanner.close();
        }
    }
}
```

</details>

### **Ejercicio 3: Ordenar Nombres Alfabéticamente**

Crea un programa que solicite al usuario ingresar 3 nombres y los almacene en un array. Luego, ordena los nombres alfabéticamente y muestra los resultados. No se permite el uso de bucles ni el método `sort()`.

**Ejemplo de entrada/salida:**

- Entrada: `Ana, Carlos, Beatriz`
- Salida:
  - **Nombres Ordenados:** Ana, Beatriz, Carlos

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class OrdenarNombresSinBucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[3];

        try {
            // Solicitar los nombres al usuario
            System.out.print("Ingrese el primer nombre: ");
            nombres[0] = scanner.nextLine();

            System.out.print("Ingrese el segundo nombre: ");
            nombres[1] = scanner.nextLine();

            System.out.print("Ingrese el tercer nombre: ");
            nombres[2] = scanner.nextLine();

            // Ordenar los nombres alfabéticamente sin bucles ni sort
            String temp;
            if (nombres[0].compareTo(nombres[1]) > 0) {
                temp = nombres[0];
                nombres[0] = nombres[1];
                nombres[1] = temp;
            }

            if (nombres[0].compareTo(nombres[2]) > 0) {
                temp = nombres[0];
                nombres[0] = nombres[2];
                nombres[2] = temp;
            }

            if (nombres[1].compareTo(nombres[2]) > 0) {
                temp = nombres[1];
                nombres[1] = nombres[2];
                nombres[2] = temp;
            }

            // Mostrar los resultados
            System.out.println("Nombres ordenados: " + nombres[0] + ", " + nombres[1] + ", " + nombres[2]);
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida.");
        } finally {
            scanner.close();
        }
    }
}
```

</details>

### **Ejercicio 4: Verificar si un Nombre Existe en el Array**

Crea un programa que permita al usuario ingresar 4 nombres y los almacene en un array. Luego, solicita al usuario ingresar otro nombre y verifica si ese nombre está en el array.

**Ejemplo de entrada/salida:**

- Entrada:
  - Nombres: `Ana, Luis, Carlos, Maria`
  - Nombre a buscar: `Carlos`
- Salida: `El nombre Carlos está en el array.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class VerificarNombreArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[4];

        try {
            // Solicitar los nombres al usuario
            System.out.print("Ingrese el primer nombre: ");
            nombres[0] = scanner.nextLine();

            System.out.print("Ingrese el segundo nombre: ");
            nombres[1] = scanner.nextLine();

            System.out.print("Ingrese el tercer nombre: ");
            nombres[2] = scanner.nextLine();

            System.out.print("Ingrese el cuarto nombre: ");
            nombres[3] = scanner.nextLine();

            // Solicitar el nombre a buscar
            System.out.print("Ingrese el nombre a buscar: ");
            String nombreBuscar = scanner.nextLine();

            // Verificar si el nombre existe en el array
            boolean encontrado = false;
            for (String nombre : nombres) {
                if (nombre.equalsIgnoreCase(nombreBuscar)) {
                    encontrado = true;
                    break;
                }
            }

            // Mostrar el resultado
            if (encontrado) {
                System.out.println("El nombre " + nombreBuscar + " está en el array.");
            } else {
                System.out.println("El nombre " + nombreBuscar + " no está en el array.");
            }
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida.");
        } finally {
            scanner.close();
        }
    }
}
```

</details>
