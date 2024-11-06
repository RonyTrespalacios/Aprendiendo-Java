# Manejo de Excepciones con `try-catch` en Java

## ➕ **Introducción al `try-catch`**

### ¿Qué es un `try-catch`?

Un bloque `try-catch` es una estructura de control utilizada en Java para manejar excepciones o errores durante la ejecución de un programa. Cuando el código dentro de un bloque `try` genera un error, el bloque `catch` captura la excepción y permite que el programa continúe ejecutándose de manera controlada sin detenerse abruptamente. 😊

### ¿Para qué se usa?

- Para prevenir la interrupción inesperada del programa, evitando que el usuario vea un error brusco que cierre la aplicación. 🚫
- Para manejar errores que podrían ocurrir debido a entradas incorrectas del usuario o situaciones imprevistas, como la conexión a una base de datos fallida. 🛠️
- Para mejorar la robustez y confiabilidad del código, haciendo que el sistema sea más resistente a errores. 💪

### Aplicaciones reales

- **Validación de entradas del usuario**: Si un usuario ingresa un valor incorrecto, como una letra en lugar de un número, `try-catch` puede gestionar ese error y solicitar la entrada nuevamente. 🔄
- **Manejo de conexiones a recursos externos** (bases de datos, archivos): En caso de que la conexión falle, `try-catch` puede capturar la excepción y tomar medidas alternativas, como mostrar un mensaje de error adecuado. 🌐
- **Manejo de errores aritméticos**: Evitar errores como la división por cero para que el programa no falle abruptamente. ➗

### Importancia

Utilizar `try-catch` permite al programador controlar y manejar errores sin que el programa se detenga de manera abrupta, mejorando así la experiencia del usuario y la estabilidad del sistema. Esto hace que el software sea más confiable y fácil de usar, especialmente en situaciones inesperadas. ✅

## ➕ **Ejemplo básico de `try-catch`**

Vamos a ver un ejemplo sencillo de cómo utilizar un bloque `try-catch` para evitar errores cuando el usuario ingresa un valor incorrecto. 🚀

```java
import java.util.Scanner;

public class EjemploTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        try {
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresó un valor no válido.");
        }
    }
}
```

<details>
<summary>Salida</summary>

```
Ingrese un número entero: abc
Error: Ingresó un valor no válido.
```

</details>

**Explicación:** En este ejemplo, si el usuario ingresa un valor que no es un número (como "abc"), el bloque `catch` capturará la excepción `NumberFormatException` y mostrará un mensaje de error adecuado en lugar de detener el programa abruptamente. 🔄

## ➕ **Tipos de errores comunes**

Para manejar errores en Java, es importante conocer los tipos de excepciones más comunes y cuándo ocurren. 📋

| Tipo de error                    | Descripción                                                                                   |
| -------------------------------- | --------------------------------------------------------------------------------------------- |
| `Exception`                      | Clase base para todas las excepciones comprobadas en Java.                                     |
| `RuntimeException`               | Clase base para todas las excepciones no comprobadas que ocurren durante la ejecución.        |
| `NumberFormatException`          | Ocurre cuando se intenta convertir una cadena a un número inválido. 📉                        |
| `ArithmeticException`            | Ocurre cuando se realiza una operación aritmética inválida, como división entre cero. ➗      |
| `NullPointerException`           | Se genera cuando se intenta usar un objeto que no ha sido inicializado. ❌                    |
| `ArrayIndexOutOfBoundsException` | Ocurre cuando se intenta acceder a una posición fuera del límite del array. 📊                |
| `IndexOutOfBoundsException`      | Se produce cuando se intenta acceder a un índice fuera del rango de una lista o array. 🔢     |
| `IllegalArgumentException`       | Se lanza para indicar que un argumento no es válido. ⚠️                                       |
| `InputMismatchException`         | Ocurre cuando se proporciona un tipo de entrada incorrecto al usar `Scanner`. 📥              |
| `ClassCastException`             | Ocurre cuando se intenta convertir un objeto a una clase incompatible. 🔄                     |
| `IOException`                    | Se lanza cuando ocurre un error de entrada/salida, como al leer un archivo. 📁                |
| `FileNotFoundException`          | Ocurre cuando se intenta acceder a un archivo que no existe. 📂                               |
| `IllegalStateException`          | Se lanza para indicar que el estado de la aplicación no permite la operación solicitada. ⚠️   |
| `NoSuchElementException`         | Se lanza cuando no hay más elementos disponibles en una colección o iterador. ❌              |
| `UnsupportedOperationException`  | Se lanza para indicar que la operación solicitada no está soportada. 🚫                       |
| `StackOverflowError`             | Se lanza cuando ocurre un desbordamiento de pila, normalmente debido a recursión infinita. ♾️ |
| `OutOfMemoryError`               | Se lanza cuando la máquina virtual de Java no puede asignar más memoria. 🧠                   |
| `SecurityException`              | Se lanza para indicar una violación de seguridad. 🔒                                         |
| `InterruptedException`           | Ocurre cuando un hilo es interrumpido mientras está esperando o dormido. 💤                   |
| `SQLException`                   | Se lanza cuando ocurre un error al acceder a la base de datos mediante SQL. 🗄️                |
| `MalformedURLException`          | Se lanza cuando una URL no tiene un formato válido. 🌐                                        |
| `EOFException`                   | Se lanza para indicar que se ha alcanzado el final del archivo inesperadamente. 📄            |
| `CloneNotSupportedException`     | Se lanza cuando se intenta clonar un objeto que no implementa la interfaz `Cloneable`. ✨     |
| `TimeoutException`               | Se lanza cuando una operación excede el tiempo máximo de espera permitido. ⏱️                |

**Consejo:** Conocer estos errores y cómo manejarlos puede ayudarte a escribir programas más robustos y menos propensos a fallar en situaciones inesperadas. ✅

## ➕ **Excepción básica: `Exception`**

`Exception` es la clase base de todas las excepciones comprobadas en Java. Se utiliza para manejar errores generales y permite capturar cualquier excepción que no esté específicamente definida en el código. Esto es útil cuando no estamos seguros del tipo exacto de error que podría ocurrir. 🛠️

```java
try {
    // Código que puede lanzar una excepción
} catch (Exception e) {
    System.out.println("Se produjo un error: " + e.getMessage());
}
```

<details>
<summary>Salida</summary>

```
Se produjo un error: / por cero
```

</details>

**Nota:** Utilizar `Exception` como una captura general puede ser útil, pero no siempre es la mejor práctica. Es mejor ser lo más específico posible con los tipos de excepciones que capturamos. 🎯

</details>

## ➕ **Uso de `throw new`**

### ¿Qué es `throw new`?

El uso de `throw new` en Java permite lanzar una excepción de forma manual. Esto se utiliza cuando queremos indicar explícitamente que ha ocurrido un error en nuestro programa, por ejemplo, cuando una condición específica no se cumple y queremos notificarlo. 🚨

### ¿Para qué se usa?

- Para validar condiciones que no se deben cumplir y, en caso contrario, lanzar un error controlado. 🔍
- Para crear nuestras propias excepciones personalizadas y mejorar la claridad del código. 🛠️

### Ejemplo de uso

Supongamos que tenemos un sistema que permite reservar entradas para un evento. Queremos asegurarnos de que el usuario no pueda reservar una cantidad de entradas que sea negativa. Para ello, utilizaremos `throw new` para lanzar una excepción manualmente. ✨

```java
public class EjemploThrowNew {
    public static void main(String[] args) {
        int cantidadEntradas = -5;

        try {
            if (cantidadEntradas < 0) {
                throw new IllegalArgumentException("La cantidad de entradas no puede ser negativa.");
            }
            System.out.println("Entradas reservadas: " + cantidadEntradas);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

<details>
<summary>Salida</summary>

```
Error: La cantidad de entradas no puede ser negativa.
```

</details>

**Explicación:** En el ejemplo, usamos `throw new IllegalArgumentException` para indicar que la cantidad de entradas no puede ser menor que cero. Este es un caso en el que, en lugar de esperar a que el programa falle, podemos definir de forma explícita cuándo y cómo debe lanzarse una excepción para mejorar la claridad del código. 🚀

### Casos de uso

- **Validaciones de entrada**: Como cuando los datos ingresados por el usuario no son válidos.
- **Estados inválidos**: Cuando una operación específica no debe ser permitida, como intentar operar con un valor no soportado. 🚫

**Consejo:** Utiliza `throw new` para definir de manera clara cuándo un programa debe lanzar una excepción, lo cual hace tu código más fácil de leer y depurar. 🎯

## ➕ **División entre 0**

En Java, la división entre cero tiene comportamientos distintos dependiendo del tipo de dato. ¡Veamos la diferencia! 📊

- **Enteros (`int`)**: Provoca una `ArithmeticException` porque la división por cero no está definida para enteros.
- **Punto flotante (`float` o `double`)**: No genera una excepción, sino que el resultado será `Infinity` o `-Infinity`.

**Ejemplo:**

```java
public class DivisionCero {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        double resultadoDouble = 10.0 / 0;
        System.out.println("Resultado double: " + resultadoDouble); // Imprime Infinity
    }
}
```

<details>
<summary>Salida</summary>

```
Error: / por cero
Resultado double: Infinity
```

</details>

**Consejo:** Siempre que trabajes con enteros y realices divisiones, asegúrate de verificar si el divisor es cero para evitar este tipo de errores. ⚠️

## ➕ **Ejemplo de múltiples `catch`**

Es posible tener múltiples bloques `catch` para manejar diferentes tipos de excepciones por separado. Esto nos permite ser más específicos con el manejo de errores. 🧩

```java
import java.util.Scanner;

public class MultiplesCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        try {
            int numero = Integer.parseInt(scanner.nextLine());
            int resultado = 10 / numero;
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Error: No ingresó un número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
}
```

<details>
<summary>Salida</summary>

```
Ingrese un número entero: 0
Error: No se puede dividir entre cero.
```

</details>

**Explicación:** En este ejemplo, `catch (NumberFormatException)` maneja el error cuando el usuario no ingresa un número válido, mientras que `catch (ArithmeticException)` maneja la división por cero. Al usar múltiples `catch`, podemos proporcionar mensajes de error más específicos. 🎯

## ➕ **Métodos `printStackTrace()` y `getMessage()`**

- **`printStackTrace()`**: Imprime la traza completa de la excepción, lo cual es útil para depurar el programa y ver exactamente dónde ocurrió el error. 🕵️‍♂️
- **`getMessage()`**: Devuelve un mensaje corto describiendo la causa del error. Esto es útil cuando quieres mostrar un mensaje breve al usuario. 📝

**Ejemplo:**

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    e.printStackTrace();
    System.out.println("Mensaje del error: " + e.getMessage());
}
```

<details>
<summary>Salida</summary>

```
java.lang.ArithmeticException: / por cero
	at DivisionCero.main(DivisionCero.java:5)
Mensaje del error: / por cero
```

</details>

**Consejo:** Utiliza `printStackTrace()` para depurar y `getMessage()` para informar al usuario de manera amigable. 😊

## ➕ **Identificación de un error desconocido**

En ocasiones, es posible que nos encontremos con errores que no conocemos de antemano. Podemos utilizar un bloque `catch` genérico para capturar cualquier excepción y obtener información sobre el error. 🛑

**Ejemplo:**

```java
public class ErrorDesconocido {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Provocará un error
        } catch (Exception e) {
            System.out.println("Ocurrió un error desconocido: " + e.getClass().getName());
            e.printStackTrace();
        }
    }
}
```

<details>
<summary>Salida</summary>

```
Ocurrió un error desconocido: java.lang.ArrayIndexOutOfBoundsException
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
	at ErrorDesconocido.main(ErrorDesconocido.java:5)
```

</details>

**Nota:** Este enfoque es útil para depuración, pero en un entorno de producción es mejor capturar excepciones específicas cuando sea posible. 🛠️

## ➕ **Conversión de cadena a entero usando `Scanner`**

Al leer datos con `scanner.nextLine()` y convertirlos a enteros usando `Integer.parseInt()`, se puede generar una `NumberFormatException` si la entrada no es un número válido. Veamos cómo podemos manejar esto. 🔄

**Ventajas:**

- Permite leer toda la línea y luego convertirla, lo cual es más flexible.

**Tipo de error:**

- `NumberFormatException` si la entrada no es un número.

| Conversión              | Método (Ejemplo y Salida)       |
| ----------------------- | ------------------------------ |
| Cadena a entero         | `Integer.parseInt("123") // Salida: 123`           |
| Cadena a decimal        | `Double.parseDouble("3.14") // Salida: 3.14`         |
| Cadena a booleano       | `Boolean.parseBoolean("true") // Salida: true`       |
| Cadena a long           | `Long.parseLong("123456789") // Salida: 123456789`             |
| Entero a cadena         | `Integer.toString(123) // Salida: "123"`           |
| Decimal a cadena        | `Double.toString(3.14) // Salida: "3.14"`            |
| Booleano a cadena       | `Boolean.toString(true) // Salida: "true"`           |
| Long a cadena           | `Long.toString(123456789) // Salida: "123456789"`              |
| Caracter a entero       | `(int) 'A' // Salida: 65`                   |
| Entero a carácter       | `(char) 65 // Salida: 'A'`                   |
| Cadena a arreglo de bytes | `"Hola".getBytes() // Salida: [72, 111, 108, 97]`           |
| Arreglo de bytes a cadena | `new String(new byte[]{72, 111, 108, 97}) // Salida: "Hola"`      |
| Cadena a arreglo de caracteres | `"Hola".toCharArray() // Salida: ['H', 'o', 'l', 'a']`    |
| Arreglo de caracteres a cadena | `new String(new char[]{'H', 'o', 'l', 'a'}) // Salida: "Hola"` |
| Decimal a entero        | `(int) 3.14 // Salida: 3`                 |
| Entero a decimal        | `(double) 3 // Salida: 3.0`                 |
| Cadena a float          | `Float.parseFloat("3.14") // Salida: 3.14f`           |
| Float a cadena          | `Float.toString(3.14f) // Salida: "3.14"`             |
| Cadena a short          | `Short.parseShort("123") // Salida: 123`           |
| Short a cadena          | `Short.toString((short) 123) // Salida: "123"`             |

**Ejemplo:**

```java
import java.util.Scanner;

public class ConversionCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        try {
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresó un valor no válido.");
        }
    }
}
```

<details>
<summary>Salida</summary>
```
Ingrese un número: abc
Error: Ingresó un valor no válido.
```
</details>

## ➕ **Ejercicios**

### Ejercicio 1: Sistema de reservas de entradas

Crea un programa que permita al usuario realizar una reserva de entradas para un evento. El usuario debe ingresar la cantidad de entradas que desea reservar y el precio por entrada. El programa debe calcular el total a pagar y manejar los siguientes errores:

- Si el usuario ingresa un valor no numérico para la cantidad o el precio.
- Si el usuario intenta ingresar una cantidad negativa o cero de entradas.
- Si el precio es negativo.

**Ejemplo de entrada/salida:**

- Entrada: `cantidad = 2`, `precio = 50`
- Salida: `Total a pagar: 100`
- Entrada: `cantidad = 0`, `precio = 50`
- Salida: `Error: La cantidad de entradas debe ser mayor que cero.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class ReservaEntradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese la cantidad de entradas: ");
            int cantidad = Integer.parseInt(scanner.nextLine());
            if (cantidad <= 0) {
                throw new IllegalArgumentException("La cantidad de entradas debe ser mayor que cero.");
            }

            System.out.print("Ingrese el precio por entrada: ");
            double precio = Double.parseDouble(scanner.nextLine());
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo.");
            }

            double total = cantidad * precio;
            System.out.println("Total a pagar: " + total);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresó un valor no válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

</details>

### Ejercicio 2: Calculadora de interés simple

Crea un programa que calcule el interés simple dado el capital, la tasa de interés y el tiempo en años. Debes manejar los siguientes errores:

- Si el usuario ingresa un valor no numérico para el capital, la tasa o el tiempo.
- Si el capital, la tasa o el tiempo son valores negativos.

**Ejemplo de entrada/salida:**

- Entrada: `capital = 1000`, `tasa = 5`, `tiempo = 2`
- Salida: `Interés simple: 100.0`
- Entrada: `capital = -1000`, `tasa = 5`, `tiempo = 2`
- Salida: `Error: El capital no puede ser negativo.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class CalculadoraInteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el capital: ");
            double capital = Double.parseDouble(scanner.nextLine());
            if (capital < 0) {
                throw new IllegalArgumentException("El capital no puede ser negativo.");
            }

            System.out.print("Ingrese la tasa de interés (%): ");
            double tasa = Double.parseDouble(scanner.nextLine());
            if (tasa < 0) {
                throw new IllegalArgumentException("La tasa de interés no puede ser negativa.");
            }

            System.out.print("Ingrese el tiempo en años: ");
            int tiempo = Integer.parseInt(scanner.nextLine());
            if (tiempo < 0) {
                throw new IllegalArgumentException("El tiempo no puede ser negativo.");
            }

            double interes = (capital * tasa * tiempo) / 100;
            System.out.println("Interés simple: " + interes);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresó un valor no válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

</details>

### Ejercicio 3: Manejo de excepciones incorrecto

A continuación, se presenta un ejemplo de un uso incorrecto del bloque `try-catch`. Analiza el problema y explica por qué el manejo de la excepción es inadecuado.

```java
public class ManejoIncorrecto {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Algo salió mal.");
        }
    }
}
```

<details>
<summary>Ver solución</summary>
**Problema:**
- **Falta de especificidad**: El bloque `catch` está capturando todas las excepciones con `Exception`, lo cual no permite manejar de manera adecuada el tipo de error específico (en este caso, `ArithmeticException`). Además, el mensaje de error "Algo salió mal" no proporciona suficiente información al usuario sobre la causa real del error. ⚠️

**Solución recomendada:**
Es mejor utilizar una excepción específica y proporcionar un mensaje claro que indique el problema exacto:

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: No se puede dividir entre cero.");
}
```

**Consejo:** Utiliza excepciones específicas siempre que sea posible para hacer que el manejo de errores sea más claro y efectivo. 🎯

</details>

# ➕ **Contenido Complementario `try-catch-finally`**

## ➕ **¿Qué es el bloque `finally`?** 🔒

El bloque `finally` es una parte opcional de la estructura `try-catch` en Java. Se utiliza para ejecutar un bloque de código que debe ser ejecutado sin importar si ocurre o no una excepción en el bloque `try`. Esto significa que, sin importar si se produce un error y si el bloque `catch` se ejecuta, el bloque `finally` siempre será ejecutado.

### **¿Por qué usar `finally`?**

El uso del bloque `finally` es muy útil para realizar tareas de **limpieza**, como cerrar archivos, liberar recursos, o cerrar conexiones a bases de datos. Por ejemplo, cuando trabajamos con recursos que deben ser liberados (como un archivo o un `Scanner`), debemos asegurarnos de que se cierren correctamente para evitar problemas de memoria o errores inesperados.

## ➕ **Estructura del bloque `try-catch-finally`** 🧩

Veamos la estructura básica de un bloque `try-catch-finally`:

```java
import java.util.Scanner;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número: ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El valor ingresado no es un número válido.");
        } finally {
            // Este bloque siempre se ejecutará
            scanner.close();
            System.out.println("Recurso 'scanner' cerrado.");
        }
    }
}
```

### **Explicación del ejemplo**

- **`try`**: En el bloque `try` se coloca el código que puede lanzar una excepción, en este caso, intentamos convertir una entrada del usuario a un número entero usando `Integer.parseInt()`.
- **`catch`**: Si ocurre un error durante la conversión, el bloque `catch` captura la excepción `NumberFormatException` y muestra un mensaje de error.
- **`finally`**: El bloque `finally` siempre se ejecuta, incluso si ocurre una excepción. Aquí cerramos el recurso `scanner` para asegurarnos de que no queden recursos abiertos.

## ➕ **¿Qué sucede si ocurre un error dentro de `catch`?** ⚠️

A veces, el bloque `catch` también puede lanzar una excepción, lo que podría llevar a que el código de limpieza (como cerrar recursos) no se ejecute. Es por esto que el bloque `finally` es tan importante, ya que asegura que ciertas acciones se realicen sin importar qué pase en el `try` o el `catch`.

### **Ejemplo con error en `catch`**

```java
import java.util.Scanner;

public class ErrorEnCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número: ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            // Intentamos hacer algo que también puede fallar
            System.out.println(1 / 0); // Esto lanza una ArithmeticException
        } finally {
            // Este bloque siempre se ejecutará
            scanner.close();
            System.out.println("Recurso 'scanner' cerrado.");
        }
    }
}
```

### **Explicación del ejemplo**

- En el bloque `catch`, estamos haciendo una división por cero, lo cual lanza una `ArithmeticException`.
- A pesar del error en el `catch`, el bloque `finally` aún se ejecuta y el recurso `scanner` se cierra adecuadamente.

## ➕ **Diferencias entre `finally` y código después de `try-catch`** ⚖️

Podrías preguntarte por qué usar `finally` si podemos simplemente escribir el código después del bloque `try-catch`. La razón principal es que el bloque `finally` **siempre se ejecuta**, incluso si ocurre una excepción que detenga la ejecución del programa antes de llegar al final del bloque `try-catch`.

### **Ejemplo: Código después del `try-catch`**

```java
import java.util.Scanner;

public class TryCatchWithoutFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número: ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El valor ingresado no es un número válido.");
        }
        // Código después del try-catch
        scanner.close();
        System.out.println("Recurso 'scanner' cerrado.");
    }
}
```

### **¿Cuál es la diferencia?**

En este ejemplo, si ocurre un error en el bloque `try` o `catch` que impida la continuación del programa, el código después del `try-catch` no se ejecutará y el recurso `scanner` no se cerrará, lo que podría causar un problema de recursos no liberados.

Por otro lado, el bloque `finally` garantiza que **siempre** se ejecute, sin importar qué pase dentro del `try` o `catch`.

## ➕ **Resumen del uso de `finally`** 📝

- El bloque `finally` se usa para asegurarse de que ciertas tareas, como cerrar recursos, **siempre** se ejecuten.
- Incluso si ocurre un error en el bloque `catch`, el bloque `finally` se ejecutará.
- Es una buena práctica utilizar `finally` para liberar recursos que necesitan cerrarse o limpiarse, como archivos, conexiones de red, o instancias de `Scanner`.

Con el uso adecuado del bloque `finally`, podemos escribir código más seguro y confiable, evitando fugas de recursos y asegurándonos de que siempre se ejecuten las tareas críticas de limpieza. 😊