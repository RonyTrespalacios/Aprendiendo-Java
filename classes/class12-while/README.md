# ➕ **Bucles `while` y `do-while` en Java** 🔄

## **¿Qué es un Bucle `while`?**

Un **bucle `while`** es una estructura de control que permite repetir un bloque de código mientras se cumpla una condición determinada. La condición se evalúa al comienzo de cada iteración, lo que significa que si la condición es falsa desde el inicio, el código del bucle no se ejecuta ninguna vez.

La sintaxis del bucle `while` en Java es la siguiente:

```java
while (condición) {
    // Código a ejecutar mientras la condición sea verdadera
}
```

**Ejemplo de un Bucle `while`**

```java
int contador = 1;
while (contador <= 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

- En este ejemplo, el bucle se repite mientras `contador` sea menor o igual a 5. Cada vez que se ejecuta el bucle, `contador` se incrementa en 1.

**Salida**:
```
Contador: 1
Contador: 2
Contador: 3
Contador: 4
Contador: 5
```

## **¿Qué es un Bucle `do-while`?**

Un **bucle `do-while`** es similar al bucle `while`, pero con una diferencia importante: el bloque de código se ejecuta al menos una vez, ya que la condición se evalúa después de ejecutar el código.

La sintaxis del bucle `do-while` en Java es la siguiente:

```java
do {
    // Código a ejecutar al menos una vez
} while (condición);
```

**Ejemplo de un Bucle `do-while`**

```java
int contador = 1;
do {
    System.out.println("Contador: " + contador);
    contador++;
} while (contador <= 5);
```

- En este ejemplo, el bucle ejecuta el bloque de código y luego evalúa si `contador` es menor o igual a 5. Por lo tanto, el código se ejecuta al menos una vez, incluso si la condición es falsa desde el principio.

**Salida**:
```
Contador: 1
Contador: 2
Contador: 3
Contador: 4
Contador: 5
```

## **Diferencias Entre `while` y `do-while`**

- **Evaluación de la Condición**: En un bucle `while`, la condición se evalúa antes de ejecutar el bloque de código. En un bucle `do-while`, la condición se evalúa después de ejecutar el bloque de código.
- **Ejecución Garantizada**: El bucle `do-while` siempre ejecutará el bloque de código al menos una vez, mientras que el bucle `while` podría no ejecutarse si la condición es falsa desde el inicio.

## **Tabla Comparativa de los Bucles `for`, `for-each`, `while` y `do-while`**

| Bucle       | Características Principales                          | Uso Común                                |
|-------------|------------------------------------------------------|------------------------------------------|
| `for`       | Se usa cuando se conoce el número exacto de iteraciones. Tiene inicialización, condición y actualización. | Repetir una acción un número conocido de veces. |
| `for-each`  | Recorre todos los elementos de una colección o array. No permite modificar la colección directamente. | Iterar sobre elementos de un array o lista. |
| `while`     | Ejecuta el bloque mientras la condición sea verdadera. La condición se evalúa al inicio. | Cuando no se conoce el número exacto de iteraciones. |
| `do-while`  | Similar al `while`, pero garantiza al menos una ejecución del bloque. | Situaciones donde se necesita ejecutar el código al menos una vez. |

## **Equivalencias Entre Bucles**

Cualquier bucle se puede escribir usando otro tipo de bucle, aunque la sintaxis sea diferente. Veamos algunos ejemplos de equivalencias:

### **Ejemplo 1: Usar `for` en Lugar de `while`**

**Bucle `while`**:

```java
int i = 0;
while (i < 5) {
    System.out.println("i: " + i);
    i++;
}
```

**Bucle `for` Equivalente**:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("i: " + i);
}
```

Ambos códigos imprimen los valores de `i` de 0 a 4.

### **Ejemplo 2: Usar `while` en Lugar de `for`**

**Bucle `for`**:

```java
for (int i = 1; i <= 3; i++) {
    System.out.println("Valor: " + i);
}
```

**Bucle `while` Equivalente**:

```java
int i = 1;
while (i <= 3) {
    System.out.println("Valor: " + i);
    i++;
}
```

Ambos códigos imprimen los valores de `i` de 1 a 3.

## **Ejemplos Prácticos del Uso de `while` y `do-while`**

### **Ejemplo 1: Leer Datos Hasta que el Usuario Ingrese un Valor Válido**

Este ejemplo utiliza un bucle `while` para seguir pidiendo al usuario que ingrese un número mayor que cero.

```java
import java.util.Scanner;

public class LeerNumeroPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = -1;

        while (numero <= 0) {
            System.out.print("Ingrese un número mayor que cero: ");
            numero = scanner.nextInt();
        }

        System.out.println("Número ingresado: " + numero);
    }
}
```

- En este ejemplo, el bucle `while` sigue ejecutándose hasta que el usuario ingresa un número mayor que cero.

### **Ejemplo 2: Menú de Opciones con `do-while`**

Este ejemplo utiliza un bucle `do-while` para mostrar un menú de opciones al usuario y permitirle elegir una opción hasta que decida salir.

```java
import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola!");
                    break;
                case 2:
                    System.out.println("Adios!");
                    break;
                case 3:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }
}
```

- En este ejemplo, el bucle `do-while` asegura que el menú se muestra al menos una vez, y sigue mostándose hasta que el usuario elige la opción de salir.

## **Características Clave de Cada Tipo de Bucle**

1. **`for`**: Se utiliza cuando conocemos el número exacto de veces que queremos iterar. La inicialización, condición y actualización están definidas en una sola línea.
2. **`for-each`**: Es ideal para recorrer elementos de una colección o un array de manera sencilla, sin necesidad de manejar índices. Es más seguro y legible cuando solo necesitamos acceder a cada elemento.
3. **`while`**: Se utiliza cuando no conocemos el número exacto de iteraciones, pero queremos seguir iterando mientras se cumpla una condición. La condición se verifica antes de cada iteración.
4. **`do-while`**: Similar al `while`, pero la condición se verifica después de ejecutar el bloque de código, garantizando al menos una ejecución.

### **Conclusión**

Los bucles son herramientas fundamentales para la programación repetitiva. Comprender cuándo utilizar cada tipo de bucle (`for`, `for-each`, `while` y `do-while`) te ayudará a escribir código más eficiente y adecuado para cada situación. Cada bucle tiene sus ventajas y se adapta mejor a ciertos contextos.

## ➕ **Ejercicios de Bucles `while` y `do-while` en Java** 🔄

A continuación, te presento una serie de ejercicios con soluciones ocultas para practicar y afianzar el conocimiento sobre los bucles `while` y `do-while` en Java. Estos ejercicios son desafiantes, claros y están diseñados para fomentar el pensamiento crítico y el análisis, así como para integrar los conceptos que ya has aprendido en clases anteriores.

### **Ejercicio 1: Contador de Letras 'a' en una Frase**

Crea un programa que permita al usuario ingresar una frase y cuente cuántas veces aparece la letra 'a'. Utiliza un bucle `while` para recorrer la frase y realizar el conteo.

**Ejemplo de Entrada/Salida**
- Entrada: `"Java es asombroso"`
- Salida: `La letra 'a' aparece 3 veces.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class ContadorLetrasA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int contador = 0;
        int indice = 0;

        while (indice < frase.length()) {
            if (frase.charAt(indice) == 'a') {
                contador++;
            }
            indice++;
        }

        System.out.println("La letra 'a' aparece " + contador + " veces.");
    }
}
```
</details>

### **Ejercicio 2: Adivina el Número**

Crea un programa que genere un número aleatorio entre 1 y 50. El usuario debe intentar adivinar el número hasta que lo logre. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Utiliza un bucle `do-while`.

**Ejemplo de Entrada/Salida**
- Entrada: `25, 40, 30 (etc.)`
- Salida: `Correcto, el número era 30.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(50) + 1;
        Scanner scanner = new Scanner(System.in);
        int intento;

        do {
            System.out.print("Adivina el número (entre 1 y 50): ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            }
        } while (intento != numeroSecreto);

        System.out.println("Correcto, el número era " + numeroSecreto + ".");
    }
}
```
</details>

### **Ejercicio 3: Ingreso de Edad Válida**

Crea un programa que permita al usuario ingresar su edad. Si el usuario ingresa un valor no numérico o una edad que no esté entre 1 y 120, debe pedir nuevamente la edad hasta que se ingrese un valor válido. Utiliza un bucle `while` junto con `try-catch` para manejar los errores.

**Ejemplo de Entrada/Salida**
- Entrada: `"-5", "abc", "25"`
- Salida: `Edad ingresada correctamente: 25`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class IngresoEdadValida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Ingrese su edad (entre 1 y 120): ");
            try {
                edad = Integer.parseInt(scanner.nextLine());
                if (edad >= 1 && edad <= 120) {
                    entradaValida = true;
                } else {
                    System.out.println("Error: La edad debe estar entre 1 y 120.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese un número entero.");
            }
        }

        System.out.println("Edad ingresada correctamente: " + edad);
    }
}
```
</details>

### **Ejercicio 4: Suma de Dígitos de un Número**

Crea un programa que permita al usuario ingresar un número entero positivo y calcule la suma de sus dígitos utilizando un bucle `while`.

**Ejemplo de Entrada/Salida**
- Entrada: `1234`
- Salida: `La suma de los dígitos es: 10`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        int suma = 0;

        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
}
```
</details>

### **Ejercicio 5: Ingresar Contraseña Correcta**

Crea un programa que permita al usuario ingresar una contraseña. La contraseña correcta es "JavaRocks". El programa debe pedir la contraseña hasta que el usuario la ingrese correctamente, utilizando un bucle `do-while`.

**Ejemplo de Entrada/Salida**
- Entrada: `"clave", "1234", "JavaRocks"`
- Salida: `Contraseña correcta. Bienvenido.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class IngresarContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasena;

        do {
            System.out.print("Ingrese la contraseña: ");
            contrasena = scanner.nextLine();

            if (!contrasena.equals("JavaRocks")) {
                System.out.println("Contraseña incorrecta. Intente de nuevo.");
            }
        } while (!contrasena.equals("JavaRocks"));

        System.out.println("Contraseña correcta. Bienvenido.");
    }
}
```
</details>

### **Ejercicio 6: Cuenta Regresiva Personalizada**

Crea un programa que permita al usuario ingresar un número entero positivo y realice una cuenta regresiva desde ese número hasta 1, utilizando un bucle `while`.

**Ejemplo de Entrada/Salida**
- Entrada: `5`
- Salida: `5, 4, 3, 2, 1`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class CuentaRegresiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        while (numero > 0) {
            System.out.println(numero);
            numero--;
        }
    }
}
```
</details>

