# ➕ **Bucles `for` y `for-each` en Java** 🔄

## **¿Qué es un Bucle `for`?**

Un **bucle `for`** es una estructura de control que nos permite repetir un bloque de código varias veces de una manera controlada. Es muy útil cuando conocemos de antemano cuántas veces queremos ejecutar el bloque de código. Podemos pensar en el bucle `for` como un ciclo que va "contando" desde un valor inicial hasta un valor final.

La sintaxis general del bucle `for` en Java es la siguiente:

```java
for (inicialización; condición; actualización) {
    // Código a ejecutar en cada iteración
}
```

- **Inicialización**: Aquí se inicializa la variable de control del bucle. Por ejemplo, `int i = 0`.
- **Condición**: Esta expresión se evalúa antes de cada iteración. Si es `true`, el bucle se ejecuta; si es `false`, el bucle se detiene.
- **Actualización**: Se ejecuta al final de cada iteración. Normalmente se usa para incrementar o decrementar la variable de control.

**Ejemplo de un Bucle `for`**

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteración " + i);
}
```

- **Inicialización**: `int i = 0` establece la variable `i` en 0.
- **Condición**: `i < 5` indica que el bucle continuará ejecutándose mientras `i` sea menor que 5.
- **Actualización**: `i++` incrementa el valor de `i` en cada iteración.

**Salida**:
```
Iteración 0
Iteración 1
Iteración 2
Iteración 3
Iteración 4
```

## **Bucle `for` Incremental y Decremental**

- **Incremental**: Cuando el valor de la variable de control aumenta en cada iteración. Por ejemplo:

  ```java
  for (int i = 1; i <= 10; i++) {
      System.out.println("Valor de i: " + i);
  }
  ```

  En este caso, `i` empieza en `1` y se incrementa hasta llegar a `10`.

- **Decremental**: Cuando el valor de la variable de control disminuye en cada iteración. Por ejemplo:

  ```java
  for (int i = 10; i >= 1; i--) {
      System.out.println("Valor de i: " + i);
  }
  ```

  En este caso, `i` empieza en `10` y se decrementa hasta llegar a `1`.

- **Incremento o Decremento Personalizado**: Podemos personalizar el incremento o decremento, por ejemplo, para aumentar o disminuir en pasos diferentes a `1`.

  ```java
  for (int i = 0; i <= 20; i += 5) {
      System.out.println("Valor de i: " + i);
  }
  ```
  En este caso, `i` comienza en `0` y se incrementa de `5` en `5` hasta llegar a `20`.

  **Salida**:
  ```
  Valor de i: 0
  Valor de i: 5
  Valor de i: 10
  Valor de i: 15
  Valor de i: 20
  ```

## **Modificar los Pasos del Bucle**

Podemos modificar el **paso** del bucle para incrementar o decrementar el valor de la variable de control en más de una unidad. Por ejemplo, si queremos que `i` aumente de dos en dos:

```java
for (int i = 0; i <= 10; i += 2) {
    System.out.println("Valor de i: " + i);
}
```

En este ejemplo, `i` comienza en `0` y se incrementa en `2` en cada iteración, por lo que los valores de `i` serán `0, 2, 4, 6, 8, 10`.

También podemos reducir el valor de `i` en pasos personalizados:

```java
for (int i = 20; i >= 0; i -= 4) {
    System.out.println("Valor de i: " + i);
}
```

**Salida**:
```
Valor de i: 20
Valor de i: 16
Valor de i: 12
Valor de i: 8
Valor de i: 4
Valor de i: 0
```

## **Imprimir Figuras por Consola Usando Bucle `for`**

Podemos usar bucles `for` para imprimir diferentes figuras en la consola. A continuación, algunos ejemplos:

### **Ejemplo 1: Imprimir un Cuadrado de Asteriscos**

```java
int n = 5; // Tamaño del cuadrado
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.print("*");
    }
    System.out.println(); // Salto de línea para la siguiente fila
}
```
**Salida**:
```
*****
*****
*****
*****
*****
```

### **Ejemplo 2: Imprimir un Triángulo Rectángulo de Asteriscos**

```java
int n = 5; // Altura del triángulo
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```
**Salida**:
```
*
**
***
****
*****
```

### **Ejemplo 3: Imprimir un Triángulo Invertido de Asteriscos**

```java
int n = 5; // Altura del triángulo invertido
for (int i = n; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```
**Salida**:
```
*****
****
***
**
*
```

### **Ejemplo 4: Imprimir una Pirámide de Asteriscos**

```java
int n = 5; // Altura de la pirámide
for (int i = 1; i <= n; i++) {
    for (int j = n - i; j > 0; j--) {
        System.out.print(" ");
    }
    for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
    }
    System.out.println();
}
```
**Salida**:
```
    *
   ***
  *****
 *******
*********
```

## **Bucle `for-each`**

El **bucle `for-each`** es una forma simplificada de recorrer los elementos de una colección o de un array. Es muy útil cuando no necesitamos conocer el índice de los elementos y simplemente queremos iterar sobre todos ellos.

La sintaxis general del bucle `for-each` es la siguiente:

```java
for (Tipo elemento : coleccion) {
    // Código a ejecutar para cada elemento
}
```

**Ejemplo de un Bucle `for-each` con un Array de Enteros**

```java
int[] numeros = {1, 2, 3, 4, 5};
for (int numero : numeros) {
    System.out.println("Valor: " + numero);
}
```

En este ejemplo, el bucle `for-each` recorre todos los elementos del array `numeros` y los imprime.

**Salida**:
```
Valor: 1
Valor: 2
Valor: 3
Valor: 4
Valor: 5
```

**Ejemplo de un Bucle `for-each` con un Array de Cadenas**

```java
String[] nombres = {"Ana", "Luis", "Carlos", "Maria"};
for (String nombre : nombres) {
    System.out.println("Hola, " + nombre + "!");
}
```

**Salida**:
```
Hola, Ana!
Hola, Luis!
Hola, Carlos!
Hola, Maria!
```

**Ejemplo de un Bucle `for-each` con una Lista de Enteros**

```java
public class ForEachArray {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }
    }
}
```

**Salida**:
```
Número: 10
Número: 20
Número: 30
```

**¿Cuándo usar `for` y cuándo usar `for-each`?**

El bucle `for` se utiliza cuando necesitamos tener control total sobre la iteración, como por ejemplo, cuando queremos acceder a los índices de un array, realizar iteraciones con incrementos personalizados o modificar los elementos mientras iteramos. Por otro lado, `for-each` es ideal para recorrer todos los elementos de una colección de una manera más simple y limpia, especialmente cuando no necesitamos conocer el índice o modificar los elementos. `for-each` es más fácil de leer y reduce el riesgo de errores al trabajar con iteraciones complejas.

## ➕ **Ejercicios de Integración con Bucles `for` y `for-each`**

A continuación, encontrarás varios ejercicios diseñados para integrar el uso del bucle `for` y `for-each` junto con otros temas vistos en clase, como arrays, condicionales, operadores ternarios, y la clase `Math`. Estos ejercicios te ayudarán a desarrollar el pensamiento crítico y el análisis, utilizando únicamente los conceptos aprendidos hasta ahora.

### **Ejercicio 1: Sumar Elementos de un Array**

Crea un programa que permita al usuario ingresar 5 números y los almacene en un array. Luego, utiliza un bucle `for` para calcular la suma de todos los elementos del array y muestra el resultado.

**Ejemplo de Entrada/Salida**
- Entrada: `2, 4, 6, 8, 10`
- Salida: `La suma de los números es: 30`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class SumarElementosArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        try {
            // Solicitar los números al usuario
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
                suma += numeros[i];
            }

            // Mostrar el resultado de la suma
            System.out.println("La suma de los números es: " + suma);
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida.");
        } finally {
            scanner.close();
        }
    }
}
```
</details>

### **Ejercicio 2: Encontrar el Número Mayor y Menor en un Array**

Crea un programa que permita al usuario ingresar 6 números y los almacene en un array. Luego, utiliza un bucle `for` para encontrar el número mayor y el número menor dentro del array y muestra ambos resultados.

**Ejemplo de Entrada/Salida**
- Entrada: `5, 12, 3, 9, 20, 8`
- Salida:
  - `El número mayor es: 20`
  - `El número menor es: 3`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class MayorMenorArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int mayor, menor;

        try {
            // Solicitar los números al usuario
            for (int i = 0; i < 6; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            // Inicializar mayor y menor con el primer elemento del array
            mayor = menor = numeros[0];

            // Encontrar el mayor y el menor
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > mayor) {
                    mayor = numeros[i];
                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }

            // Mostrar los resultados
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida.");
        } finally {
            scanner.close();
        }
    }
}
```
</details>

### **Ejercicio 3: Imprimir Nombres en Orden Inverso**

Crea un programa que permita al usuario ingresar 4 nombres y los almacene en un array. Luego, utiliza un bucle `for` para imprimir los nombres en orden inverso.

**Ejemplo de Entrada/Salida**
- Entrada: `Ana, Luis, Carlos, Maria`
- Salida:
  - `Maria`
  - `Carlos`
  - `Luis`
  - `Ana`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class NombresInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[4];

        try {
            // Solicitar los nombres al usuario
            for (int i = 0; i < 4; i++) {
                System.out.print("Ingrese el nombre " + (i + 1) + ": ");
                nombres[i] = scanner.nextLine();
            }

            // Imprimir los nombres en orden inverso
            System.out.println("Nombres en orden inverso:");
            for (int i = nombres.length - 1; i >= 0; i--) {
                System.out.println(nombres[i]);
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

### **Ejercicio 4: Contar la Cantidad de Números Pares e Impares**

Crea un programa que permita al usuario ingresar 8 números y los almacene en un array. Luego, utiliza un bucle `for` para contar cuántos de esos números son pares y cuántos son impares, y muestra ambos resultados.

**Ejemplo de Entrada/Salida**
- Entrada: `1, 4, 7, 10, 15, 22, 33, 40`
- Salida:
  - `Cantidad de números pares: 4`
  - `Cantidad de números impares: 4`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        int pares = 0, impares = 0;

        try {
            // Solicitar los números al usuario
            for (int i = 0; i < 8; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            // Contar la cantidad de números pares e impares
            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

            // Mostrar los resultados
            System.out.println("Cantidad de números pares: " + pares);
            System.out.println("Cantidad de números impares: " + impares);
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida.");
        } finally {
            scanner.close();
        }
    }
}
```
</details>

### **Ejercicio 5: Ordenar una Lista de Nombres Alfabéticamente (Sin Usar Métodos Predefinidos)**

Crea un programa que permita al usuario ingresar 5 nombres y los almacene en un array. Luego, utiliza un bucle `for` para ordenar los nombres alfabéticamente sin usar métodos predefinidos como `sort()`. Usa un algoritmo de ordenación simple, como el de burbuja.

**Ejemplo de Entrada/Salida**
- Entrada: `Luis, Ana, Pedro, Maria, Carlos`
- Salida:
  - `Ana`
  - `Carlos`
  - `Luis`
  - `Maria`
  - `Pedro`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class OrdenarNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];

        try {
            // Solicitar los nombres al usuario
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese el nombre " + (i + 1) + ": ");
                nombres[i] = scanner.nextLine();
            }

            // Ordenar los nombres alfabéticamente usando el método de burbuja
            for (int i = 0; i < nombres.length - 1; i++) {
                for (int j = 0; j < nombres.length - 1 - i; j++) {
                    if (nombres[j].compareTo(nombres[j + 1]) > 0) {
                        String temp = nombres[j];
                        nombres[j] = nombres[j + 1];
                        nombres[j + 1] = temp;
                    }
                }
            }

            // Mostrar los nombres ordenados
            System.out.println("Nombres ordenados alfabéticamente:");
            for (String nombre : nombres) {
                System.out.println(nombre);
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

### **Ejercicio 6: Generar Tabla de Multiplicar**

Crea un programa que solicite al usuario un número y luego genere la tabla de multiplicar de ese número del 1 al 10 utilizando un bucle `for`.

**Ejemplo de Entrada/Salida**
- Entrada: `n = 4`
- Salida:
  - `4 x 1 = 4`
  - `4 x 2 = 8`
  - `4 x 3 = 12`
  - `...`
  - `4 x 10 = 40`

### **Ejercicio 7: Calcular el Promedio de Notas**

Crea un programa que permita al usuario ingresar 5 notas de estudiantes y las almacene en un array. Luego, utiliza un bucle `for` para calcular el promedio de las notas y muestra el resultado.

**Ejemplo de Entrada/Salida**
- Entrada: `80, 90, 75, 88, 92`
- Salida: `El promedio de las notas es: 85`

### **Ejercicio 8: Contar las Vocales en un Array de Palabras**

Crea un programa que permita al usuario ingresar 4 palabras y las almacene en un array. Luego, utiliza un bucle `for` para contar cuántas vocales hay en total en todas las palabras ingresadas y muestra el resultado.

**Ejemplo de Entrada/Salida**
- Entrada: `Hola, Mundo, Java, Programación`
- Salida: `El número total de vocales es: 13`

