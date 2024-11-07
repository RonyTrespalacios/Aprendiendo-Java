# 🌀 **Métodos II**

En esta sección continuaremos explorando conceptos avanzados sobre los métodos en Java. Los métodos son fundamentales para la estructura y reutilización del código, y a veces se presentan situaciones especiales que debemos manejar adecuadamente. Estas situaciones pueden involucrar estructuras como bucles infinitos, parámetros variables o el manejo de excepciones. Vamos a ver cómo abordar estas situaciones complejas.

## **Salir de un bucle `while (true)` dentro de un método**

Los bucles `while (true)` se utilizan comúnmente en situaciones en las que necesitas que un proceso se repita indefinidamente hasta que se cumpla una condición específica para salir del bucle. Sin embargo, una pregunta común es cómo romper este tipo de bucle de manera adecuada dentro de un método. Hay dos formas populares de hacerlo: usando `break` o `return`. Cada una tiene su uso y contexto particular. Vamos a explorarlo con algunos ejemplos.

### **Salir del `while (true)` con `break`**

En algunas situaciones, simplemente necesitas salir del bucle y continuar con el flujo del programa. Para esto, puedes usar la sentencia `break`. Esta instrucción te permitirá terminar el bucle y pasar a la siguiente instrucción después del bucle.

```java
public class BucleConBreak {
    public static void main(String[] args) {
        ejecutarBucle();
    }

    public static void ejecutarBucle() {
        int contador = 0;
        while (true) {
            System.out.println("Contador: " + contador);
            contador++;

            if (contador == 5) {
                System.out.println("Condición alcanzada, saliendo del bucle.");
                break; // Sale del bucle cuando contador alcanza 5
            }
        }
        System.out.println("Bucle terminado, continuando con el resto del método.");
    }
}
```

En este ejemplo, el bucle `while (true)` continúa indefinidamente hasta que el valor de `contador` alcanza `5`. En ese punto, se ejecuta el `break`, lo que hace que el programa salga del bucle y continúe con las líneas posteriores.

### **Salir del `while (true)` con `return`**

Otra forma de salir de un bucle infinito es usar `return`. Esto es útil cuando deseas no solo salir del bucle, sino también finalizar el método en el que se encuentra.

```java
public class BucleConReturn {
    public static void main(String[] args) {
        ejecutarBucle();
        System.out.println("Este mensaje no se imprimirá si se llama a return dentro del método.");
    }

    public static void ejecutarBucle() {
        int contador = 0;
        while (true) {
            System.out.println("Contador: " + contador);
            contador++;

            if (contador == 3) {
                System.out.println("Condición alcanzada, terminando el método.");
                return; // Sale del bucle y del método cuando contador alcanza 3
            }
        }
        // Este código nunca se alcanzará debido al return
        System.out.println("Esta línea no se ejecutará.");
    }
}
```

En este caso, al alcanzar `contador == 3`, la instrucción `return` hace que el método `ejecutarBucle()` termine inmediatamente. Cualquier código después del bucle dentro del mismo método no se ejecutará, y también se evita la ejecución de cualquier instrucción que viniera después de la llamada al método en `main()`.

### **¿Cuándo usar `break` y cuándo usar `return`?**

- **`break`**: Úsalo cuando necesites terminar un bucle pero deseas seguir ejecutando el resto del código dentro del método donde está el bucle. Es útil cuando tienes lógica adicional que debe ser ejecutada después de salir del bucle.

- **`return`**: Úsalo cuando quieras terminar por completo el método en el que estás. Esto es útil para simplificar el flujo de control si no hay necesidad de continuar ejecutando el código del método actual después del bucle.

---

## **Métodos Recursivos**

Un método recursivo es aquel que se llama a sí mismo para resolver un problema. La recursividad es una técnica poderosa para dividir un problema en subproblemas más pequeños, facilitando la solución de ciertos tipos de problemas, como cálculos matemáticos. Sin embargo, es importante tener una condición de parada para evitar que la recursión se convierta en un bucle infinito. A continuación, veremos algunos ejemplos clásicos de métodos recursivos.

### **1. Suma Recursiva**

Un ejemplo sencillo de recursividad es la suma de los primeros `n` números naturales.

```java
public class SumaRecursiva {
    public static void main(String[] args) {
        int resultado = sumar(5);
        System.out.println("La suma de los primeros 5 números es: " + resultado);
    }

    public static int sumar(int n) {
        if (n == 1) {
            return 1; // Caso base
        } else {
            return n + sumar(n - 1); // Llamada recursiva
        }
    }
}
```

En este ejemplo, el método `sumar()` se llama a sí mismo con un valor decreciente de `n` hasta llegar a `1`, donde termina la recursión. Esto asegura que la suma se realice correctamente, devolviendo el resultado acumulado.

### **2. Factorial de un Número**

El factorial de un número `n` se define como el producto de todos los números enteros positivos desde `1` hasta `n`. El factorial de `n` se denota como `n!`.

```java
public class FactorialRecursivo {
    public static void main(String[] args) {
        int resultado = factorial(5);
        System.out.println("El factorial de 5 es: " + resultado);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Caso base: 0! es 1
        } else {
            return n * factorial(n - 1); // Llamada recursiva
        }
    }
}
```

En este ejemplo, el método `factorial()` se llama a sí mismo con un valor decreciente de `n` hasta llegar a `0`, donde el factorial se define como `1`. Esto asegura que se calcule el factorial de manera correcta.

### **3. Secuencia de Fibonacci**

La secuencia de Fibonacci es una serie de números donde cada número es la suma de los dos anteriores, comenzando con `0` y `1`. La secuencia se ve así: `0, 1, 1, 2, 3, 5, 8, ...`.

```java
public class FibonacciRecursivo {
    public static void main(String[] args) {
        int posicion = 6;
        int resultado = fibonacci(posicion);
        System.out.println("El número en la posición " + posicion + " de la secuencia de Fibonacci es: " + resultado);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Caso base
        } else if (n == 1) {
            return 1; // Caso base
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Llamada recursiva
        }
    }
}
```

En este ejemplo, el método `fibonacci()` se llama a sí mismo para calcular el valor de la secuencia en la posición `n`. Hay dos casos base: cuando `n` es `0` o `1`, el método devuelve esos valores directamente. Para cualquier otro valor de `n`, se devuelve la suma de los dos valores anteriores en la secuencia.

### **Importancia de los Métodos Recursivos**

- **División del Problema**: La recursividad permite dividir problemas grandes en problemas más pequeños y manejables.
- **Simplicidad**: Algunos problemas, como el cálculo del factorial o la secuencia de Fibonacci, son más fáciles de implementar de forma recursiva.
- **Cuidado con el Desbordamiento**: Es importante tener una condición de parada clara para evitar una recursión infinita, que puede llevar a un desbordamiento de pila (StackOverflowError).

Los métodos recursivos son una herramienta poderosa, pero deben usarse con cuidado. Siempre debe existir un caso base que permita terminar la recursión para evitar que el programa se quede atrapado en un ciclo infinito.

---

## **Métodos con Parámetros Variables (Varargs)**

En Java, puedes definir métodos que acepten un número variable de argumentos utilizando `varargs`. Esta característica permite que un método acepte múltiples parámetros sin tener que definir explícitamente cada uno de ellos. Los `varargs` son útiles cuando no sabes cuántos argumentos se pasarán al método. A continuación, veremos algunos ejemplos.

### **Uso de `varargs` en Métodos**

La sintaxis de un parámetro `varargs` es agregar `...` después del tipo de dato. Esto significa que el método puede aceptar cero o más argumentos de ese tipo.

```java
public class MetodoVarargs {
    public static void main(String[] args) {
        imprimirNumeros(1, 2, 3, 4, 5);
        imprimirNumeros(); // También se puede llamar sin argumentos
    }

    public static void imprimirNumeros(int... numeros) {
        System.out.println("Cantidad de números: " + numeros.length);
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }
    }
}
```

En este ejemplo, el método `imprimirNumeros()` acepta un número variable de argumentos de tipo `int`. Puedes pasar tantos argumentos como desees, incluidos ninguno. Dentro del método, los argumentos se tratan como un arreglo.

### **Combinación de `varargs` con Otros Parámetros**

Puedes combinar `varargs` con otros parámetros, pero el parámetro `varargs` debe ser el último en la lista de parámetros.

```java
public class SumaVarargs {
    public static void main(String[] args) {
        int resultado = sumar("Suma de números:", 1, 2, 3, 4);
        System.out.println("Resultado: " + resultado);
    }

    public static int sumar(String mensaje, int... numeros) {
        System.out.println(mensaje);
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }
}
```

En este ejemplo, el método `sumar()` tiene un parámetro `String` llamado `mensaje` seguido de un parámetro `varargs` de tipo `int`. El método imprime el mensaje y luego calcula la suma de los números pasados como argumentos.

### **Consideraciones al Usar `varargs`**

- Solo puede haber un parámetro `varargs` por método, y debe ser el último en la lista de parámetros.
- Internamente, los `varargs` se tratan como un arreglo, por lo que puedes iterar sobre ellos usando un bucle `for`.
- Usar `varargs` puede hacer que los métodos sean más flexibles, pero también puede hacer que el código sea menos claro si no se usa con moderación.

Los `varargs` son útiles cuando no sabes cuántos argumentos necesitarás pasar a un método, y permiten una mayor flexibilidad sin sobrecargar métodos con múltiples firmas. Sin embargo, debes asegurarte de que su uso no comprometa la claridad del código.

---

## **Métodos con Excepciones**

En Java, los métodos pueden lanzar excepciones para indicar que ha ocurrido un error. Las excepciones son útiles para manejar situaciones inesperadas, como errores de entrada de datos o problemas de conexión. En esta sección, exploraremos cómo los métodos pueden lanzar y manejar excepciones, utilizando la palabra clave `throws` y bloques `try-catch`.

### **Declaración de Métodos que Lanzan Excepciones**

Para indicar que un método puede lanzar una excepción, se utiliza la palabra clave `throws` en la firma del método. Esto es útil para advertir a los usuarios del método que puede producirse un error que deberá ser manejado.

```java
public class MetodoConExcepciones {
    public static void main(String[] args) {
        try {
            dividir(10, 0); // Intentamos dividir por cero, lo cual lanza una excepción
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        System.out.println("Resultado: " + (a / b));
    }
}
```

En este ejemplo, el método `dividir()` lanza una `ArithmeticException` si el divisor (`b`) es igual a `0`. La palabra clave `throws` en la firma del método indica que este método puede lanzar una excepción, y el bloque `try-catch` en el `main()` se encarga de manejarla.

### **Manejo de Excepciones con `try-catch`**

Los bloques `try-catch` se utilizan para manejar las excepciones y evitar que el programa termine abruptamente. Puedes colocar el código que podría lanzar una excepción dentro del bloque `try` y, en caso de que ocurra una excepción, el flujo se transfiere al bloque `catch` correspondiente.

```java
public class ManejoDeExcepciones {
    public static void main(String[] args) {
        try {
            int resultado = calcularDivision(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        }
    }

    public static int calcularDivision(int a, int b) {
        return a / b; // Esto lanzará una ArithmeticException si b es 0
    }
}
```

En este ejemplo, el método `calcularDivision()` intenta dividir dos números, y si el divisor es `0`, se lanza una `ArithmeticException`. El bloque `try-catch` se utiliza para manejar el error y mostrar un mensaje adecuado en lugar de que el programa se cierre inesperadamente.

### **Multicatch: Manejo de Múltiples Excepciones**

A veces, un método puede lanzar más de un tipo de excepción. En esos casos, puedes utilizar múltiples bloques `catch` para manejar cada tipo de excepción de manera diferente.

```java
public class MultiCatchEjemplo {
    public static void main(String[] args) {
        try {
            dividir(10, 0);
            accederElemento(new int[]{1, 2, 3}, 5);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites del arreglo.");
        }
    }

    public static void dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        System.out.println("Resultado: " + (a / b));
    }

    public static void accederElemento(int[] arreglo, int indice) throws ArrayIndexOutOfBoundsException {
        System.out.println("Elemento en el índice " + indice + ": " + arreglo[indice]);
    }
}
```

En este ejemplo, el método `dividir()` lanza una `ArithmeticException` si se intenta dividir por cero, y el método `accederElemento()` lanza una `ArrayIndexOutOfBoundsException` si se intenta acceder a un índice fuera de los límites del arreglo. Ambos tipos de excepciones se manejan con bloques `catch` separados.

### **Consideraciones al Usar Excepciones**

- **Claridad**: Las excepciones deben utilizarse para manejar situaciones excepcionales, no para el flujo normal del programa.
- **Manejo Adecuado**: Siempre que un método pueda lanzar una excepción, asegúrate de manejarla adecuadamente para evitar cierres inesperados del programa.
- **Propagación de Excepciones**: Puedes propagar una excepción hacia arriba en la pila de llamadas usando `throws` en la firma del método, lo cual delega la responsabilidad de manejar la excepción al método que lo llama.

Las excepciones son una herramienta poderosa para manejar errores y garantizar que los programas sean robustos y manejables en situaciones inesperadas. Es importante conocer cuándo lanzarlas y cómo manejarlas adecuadamente para escribir un código seguro y confiable.

---

