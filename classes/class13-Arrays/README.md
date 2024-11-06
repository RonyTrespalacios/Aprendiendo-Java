# ➕ **La Clase `Arrays` en Java** 📋

La clase `Arrays` en Java es una herramienta fundamental que ofrece una variedad de métodos estáticos para facilitar la manipulación, copiado, ordenamiento, búsqueda y comparación de arreglos. Para acceder a esta clase y utilizar sus funcionalidades, es necesario importarla desde el paquete `java.util`:

```java
import java.util.Arrays;
```

Esta clase simplifica muchas tareas comunes cuando trabajamos con arreglos, permitiendo manipular los datos de forma más fácil y eficiente.

## **Métodos Comunes de la Clase `Arrays`**

| Método                | Descripción                                                                 |
|------------------------|------------------------------------------------------------------------------|
| `Arrays.sort()`        | Ordena los elementos de un arreglo en orden ascendente.                     |
| `Arrays.binarySearch()`| Busca un elemento en un arreglo previamente ordenado y devuelve su índice.  |
| `Arrays.equals()`      | Compara dos arreglos para determinar si son iguales.                        |
| `Arrays.fill()`        | Llena todas las posiciones de un arreglo con un valor especificado.         |
| `Arrays.copyOf()`      | Crea una copia de un arreglo con una longitud específica.                  |
| `Arrays.copyOfRange()` | Crea una copia de un rango específico de un arreglo.                       |
| `Arrays.toString()`    | Devuelve una representación en forma de cadena del arreglo.                |
| `Arrays.asList()`      | Convierte un arreglo en una lista para facilitar manipulaciones.            |

## **Ejemplos de Uso de los Métodos de la Clase `Arrays`**

### **1. `Arrays.sort()`**

Ordena un arreglo de manera ascendente.

```java
import java.util.Arrays;

public class ArraysSortExample {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 1, 2};
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
    }
}
```

**Salida**:
```
Arreglo ordenado: [1, 2, 3, 5, 8]
```

### **2. `Arrays.binarySearch()`**

Busca un elemento en un arreglo previamente ordenado.

```java
import java.util.Arrays;

public class ArraysBinarySearchExample {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 5, 8};
        int indice = Arrays.binarySearch(numeros, 5);
        System.out.println("El número 5 está en el índice: " + indice);
    }
}
```

**Salida**:
```
El número 5 está en el índice: 3
```

### **3. `Arrays.equals()`**

Compara dos arreglos para verificar si son iguales.

```java
import java.util.Arrays;

public class ArraysEqualsExample {
    public static void main(String[] args) {
        int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = {1, 2, 3};
        boolean sonIguales = Arrays.equals(arreglo1, arreglo2);
        System.out.println("¿Los arreglos son iguales?: " + sonIguales);
    }
}
```

**Salida**:
```
¿Los arreglos son iguales?: true
```

### **4. `Arrays.fill()`**

Llena todas las posiciones de un arreglo con un valor especificado.

```java
import java.util.Arrays;

public class ArraysFillExample {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Arrays.fill(numeros, 7);
        System.out.println("Arreglo lleno: " + Arrays.toString(numeros));
    }
}
```

**Salida**:
```
Arreglo lleno: [7, 7, 7, 7, 7]
```

### **5. `Arrays.copyOf()`**

Crea una copia del arreglo con una longitud específica.

```java
import java.util.Arrays;

public class ArraysCopyOfExample {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] copia = Arrays.copyOf(numeros, 3);
        System.out.println("Copia del arreglo: " + Arrays.toString(copia));
    }
}
```

**Salida**:
```
Copia del arreglo: [1, 2, 3]
```

### **6. `Arrays.copyOfRange()`**

Crea una copia de un rango específico de un arreglo.

```java
import java.util.Arrays;

public class ArraysCopyOfRangeExample {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] rangoCopia = Arrays.copyOfRange(numeros, 1, 4);
        System.out.println("Copia del rango del arreglo: " + Arrays.toString(rangoCopia));
    }
}
```

**Salida**:
```
Copia del rango del arreglo: [2, 3, 4]
```

### **7. `Arrays.toString()`**

Devuelve una representación en forma de cadena del arreglo.

```java
import java.util.Arrays;

public class ArraysToStringExample {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Representación del arreglo: " + Arrays.toString(numeros));
    }
}
```

**Salida**:
```
Representación del arreglo: [1, 2, 3, 4, 5]
```

### **8. `Arrays.asList()`**

Convierte un arreglo en una lista para facilitar manipulaciones.

```java
import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Pedro"};
        List<String> listaNombres = Arrays.asList(nombres);
        System.out.println("Lista de nombres: " + listaNombres);
    }
}
```

**Salida**:
```
Lista de nombres: [Ana, Luis, Pedro]
```

## ➕ **Ejercicios sobre los Métodos de la Clase `Arrays` en Java** 🔄

A continuación, se presentan algunos ejercicios prácticos que permiten poner en práctica lo aprendido sobre los métodos de la clase `Arrays`. Estos ejercicios están diseñados para ayudarte a comprender mejor cómo funcionan y cómo se pueden utilizar en diferentes escenarios.

### **Ejercicio 1: Ordenar un Arreglo de Enteros** 📊

Escribe un programa que permita al usuario ingresar 5 números enteros, los almacene en un arreglo y luego los ordene de manera ascendente. Muestra el arreglo antes y después de ordenarlo.

**Ejemplo de Entrada/Salida**
- Entrada: `8, 3, 5, 1, 9`
- Salida:
  - Arreglo original: `[8, 3, 5, 1, 9]`
  - Arreglo ordenado: `[1, 3, 5, 8, 9]`

<details>
<summary>Ver solución</summary>

```java
import java.util.Arrays;
import java.util.Scanner;

public class OrdenarArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
    }
}
```

</details>

### **Ejercicio 2: Buscar un Elemento en un Arreglo** 🔍

Escribe un programa que genere un arreglo de 10 números aleatorios entre 1 y 100, y luego permita al usuario buscar un número en ese arreglo. Asegúrate de ordenar el arreglo antes de buscar.

**Ejemplo de Entrada/Salida**
- Entrada: `Busca el número: 42`
- Salida:
  - Arreglo ordenado: `[3, 15, 28, 42, 56, 67, 75, 83, 92, 100]`
  - El número 42 está en el índice: `3`

<details>
<summary>Ver solución</summary>

```java
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscarElemento {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número a buscar: ");
        int buscar = scanner.nextInt();

        int indice = Arrays.binarySearch(numeros, buscar);
        if (indice >= 0) {
            System.out.println("El número " + buscar + " está en el índice: " + indice);
        } else {
            System.out.println("El número " + buscar + " no se encuentra en el arreglo.");
        }
    }
}
```

</details>

### **Ejercicio 3: Verificar Igualdad de Dos Arreglos** 🤝

Crea un programa que tenga dos arreglos de enteros, cada uno con 5 elementos ingresados por el usuario. Verifica si los dos arreglos son iguales y muestra el resultado.

**Ejemplo de Entrada/Salida**
- Entrada:
  - Arreglo 1: `1, 2, 3, 4, 5`
  - Arreglo 2: `1, 2, 3, 4, 5`
- Salida: `¿Los arreglos son iguales?: true`

<details>
<summary>Ver solución</summary>

```java
import java.util.Arrays;
import java.util.Scanner;

public class VerificarIgualdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo1 = new int[5];
        int[] arreglo2 = new int[5];

        System.out.println("Ingrese 5 elementos para el primer arreglo:");
        for (int i = 0; i < 5; i++) {
            arreglo1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese 5 elementos para el segundo arreglo:");
        for (int i = 0; i < 5; i++) {
            arreglo2[i] = scanner.nextInt();
        }

        boolean sonIguales = Arrays.equals(arreglo1, arreglo2);
        System.out.println("¿Los arreglos son iguales?: " + sonIguales);
    }
}
```

</details>

### **Ejercicio 4: Llenar un Arreglo con un Valor Específico** ✏️

Escribe un programa que permita al usuario definir el tamaño de un arreglo y luego llene todas las posiciones del arreglo con un mismo valor ingresado por el usuario. Luego, muestra el arreglo lleno.

**Ejemplo de Entrada/Salida**
- Entrada: `Tamaño del arreglo: 6, Valor a llenar: 4`
- Salida: `Arreglo lleno: [4, 4, 4, 4, 4, 4]`

<details>
<summary>Ver solución</summary>

```java
import java.util.Arrays;
import java.util.Scanner;

public class LlenarArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();
        System.out.print("Ingrese el valor a llenar: ");
        int valor = scanner.nextInt();

        int[] arreglo = new int[tamaño];
        Arrays.fill(arreglo, valor);
        System.out.println("Arreglo lleno: " + Arrays.toString(arreglo));
    }
}
```

</details>

### **Ejercicio 5: Copiar un Arreglo** 📑

Crea un programa que permita al usuario ingresar 5 números enteros y los almacene en un arreglo. Luego, crea una copia del arreglo con una longitud mayor y muestra ambas versiones del arreglo.

**Ejemplo de Entrada/Salida**
- Entrada: `5, 8, 2, 7, 1`
- Salida:
  - Arreglo original: `[5, 8, 2, 7, 1]`
  - Copia del arreglo con longitud 7: `[5, 8, 2, 7, 1, 0, 0]`

<details>
<summary>Ver solución</summary>

```java
import java.util.Arrays;
import java.util.Scanner;

public class CopiarArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        int[] copia = Arrays.copyOf(numeros, 7);
        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        System.out.println("Copia del arreglo con longitud 7: " + Arrays.toString(copia));
    }
}
```

</details>

### **Ejercicio 6: Copiar un Rango Específico de un Arreglo** 📋

Escribe un programa que permita al usuario ingresar 8 números enteros y los almacene en un arreglo. Luego, crea una copia de un rango específico del arreglo e imprime la copia del rango.

**Ejemplo de Entrada/Salida**
- Entrada: `3, 6, 1, 9, 12, 4, 8, 7`
- Salida: `Copia del rango del índice 2 al 5: [1, 9, 12]`

<details>
<summary>Ver solución</summary>

```java
import java.util.Arrays;
import java.util.Scanner;

public class CopiarRangoArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        System.out.println("Ingrese 8 números enteros:");
        for (int i = 0; i < 8; i++) {
            numeros[i] = scanner.nextInt();
        }

        int[] rangoCopia = Arrays.copyOfRange(numeros, 2, 5);
        System.out.println("Copia del rango del índice 2 al 5: " + Arrays.toString(rangoCopia));
    }
}
```

</details>

### **Ejercicio 7: Representar un Arreglo como Cadena** 📝

Crea un programa que tenga un arreglo de nombres de 4 personas ingresados por el usuario. Muestra el contenido del arreglo como una cadena.

**Ejemplo de Entrada/Salida**
- Entrada: `Juan, Ana, Luis, Marta`
- Salida: `Arreglo de nombres: [Juan, Ana, Luis, Marta]`

<details>
<summary>Ver solución</summary>

```java
import java.util.Arrays;
import java.util.Scanner;

public class RepresentarArregloComoCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[4];

        System.out.println("Ingrese 4 nombres:");
        for (int i = 0; i < 4; i++) {
            nombres[i] = scanner.nextLine();
        }

        System.out.println("Arreglo de nombres: " + Arrays.toString(nombres));
    }
}
```

</details>

### **Ejercicio 8: Convertir un Arreglo en una Lista** 📜

Crea un programa que tenga un arreglo de colores ingresados por el usuario. Convierte el arreglo en una lista y muestra el contenido de la lista.

**Ejemplo de Entrada/Salida**
- Entrada: `Rojo, Azul, Verde`
- Salida: `Lista de colores: [Rojo, Azul, Verde]`

<details>
<summary>Ver solución</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConvertirArregloEnLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] colores = new String[3];

        System.out.println("Ingrese 3 colores:");
        for (int i = 0; i < 3; i++) {
            colores[i] = scanner.nextLine();
        }

        List<String> listaColores = Arrays.asList(colores);
        System.out.println("Lista de colores: " + listaColores);
    }
}
```

</details>

