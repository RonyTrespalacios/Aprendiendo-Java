# **Clases de Envoltura (Wrappers) en Java** 📦

En Java, las clases de envoltura (o "wrappers") proporcionan una forma de usar tipos de datos primitivos como si fueran objetos. Estas clases son fundamentales cuando se necesita trabajar con colecciones, como `ArrayList`, que solo aceptan objetos y no tipos primitivos. Además, ofrecen una serie de métodos útiles para manipular los valores primitivos.

A continuación, presentamos las clases "wrapper" correspondientes a cada tipo de dato primitivo:

- `boolean` → `Boolean`
- `char` → `Character`
- `int` → `Integer`
- `double` → `Double`
- `byte` → `Byte`
- `short` → `Short`
- `long` → `Long`
- `float` → `Float`

Estas clases proporcionan una gran variedad de métodos estáticos y no estáticos que permiten trabajar con los valores de manera eficiente. Veamos algunos de los métodos más relevantes de cada clase de envoltura.

## **Métodos de la Clase `Integer`** 🔢

| Método                  | Descripción                                           |
|--------------------------|-------------------------------------------------------|
| `parseInt(String s)`     | Convierte una cadena en un valor entero.              |
| `valueOf(String s)`      | Devuelve un objeto `Integer` que contiene el valor.   |
| `compare(int x, int y)`  | Compara dos valores enteros y devuelve la comparación.|
| `toString(int i)`        | Convierte un entero en su representación en cadena.   |
| `max(int a, int b)`      | Devuelve el valor más alto entre `a` y `b`.           |
| `min(int a, int b)`      | Devuelve el valor más bajo entre `a` y `b`.           |
| `bitCount(int i)`        | Cuenta el número de bits en `i` que están en 1.       |

## **Métodos de la Clase `Double`** 💧

| Método                   | Descripción                                              |
|---------------------------|--------------------------------------------------------|
| `parseDouble(String s)`   | Convierte una cadena en un valor de tipo `double`.     |
| `valueOf(String s)`       | Devuelve un objeto `Double` con el valor especificado. |
| `isNaN(double v)`         | Verifica si el valor es "No un Número" (NaN).          |
| `toString(double d)`      | Convierte un `double` en su representación en cadena.   |
| `compare(double d1, d2)`  | Compara dos valores de tipo `double`.                  |
| `max(double a, double b)` | Devuelve el valor más alto entre `a` y `b`.            |
| `min(double a, double b)` | Devuelve el valor más bajo entre `a` y `b`.            |

## **Métodos de la Clase `Boolean`** ✔️

| Método                    | Descripción                                          |
|----------------------------|------------------------------------------------------|
| `parseBoolean(String s)`   | Convierte una cadena en un valor `boolean`.          |
| `valueOf(boolean b)`       | Devuelve un objeto `Boolean` que contiene el valor.  |
| `toString(boolean b)`      | Convierte un `boolean` en su representación en cadena.|
| `compare(boolean x, y)`    | Compara dos valores `boolean`.                       |
| `logicalAnd(boolean x, y)` | Devuelve la operación "AND" lógica de `x` e `y`.      |
| `logicalOr(boolean x, y)`  | Devuelve la operación "OR" lógica de `x` e `y`.       |

## **Métodos de la Clase `Character`** 🔤

| Método                     | Descripción                                          |
|-----------------------------|------------------------------------------------------|
| `isLetter(char ch)`         | Verifica si el carácter es una letra.                |
| `isDigit(char ch)`          | Verifica si el carácter es un dígito.                |
| `toUpperCase(char ch)`      | Convierte el carácter a mayúsculas.                   |
| `toLowerCase(char ch)`      | Convierte el carácter a minúsculas.                   |
| `isWhitespace(char ch)`     | Verifica si el carácter es un espacio en blanco.      |
| `isLowerCase(char ch)`      | Verifica si el carácter está en minúsculas.           |
| `isUpperCase(char ch)`      | Verifica si el carácter está en mayúsculas.           |

## **Métodos de la Clase `Float`** 🌊

| Método                    | Descripción                                          |
|----------------------------|------------------------------------------------------|
| `parseFloat(String s)`     | Convierte una cadena en un valor de tipo `float`.    |
| `valueOf(String s)`        | Devuelve un objeto `Float` con el valor especificado.|
| `isNaN(float v)`           | Verifica si el valor es "No un Número" (NaN).        |
| `toString(float f)`        | Convierte un `float` en su representación en cadena.  |
| `compare(float f1, f2)`    | Compara dos valores de tipo `float`.                 |
| `max(float a, float b)`    | Devuelve el valor más alto entre `a` y `b`.          |
| `min(float a, float b)`    | Devuelve el valor más bajo entre `a` y `b`.          |

## **Métodos de la Clase `Long`** 🕒

| Método                    | Descripción                                           |
|----------------------------|-------------------------------------------------------|
| `parseLong(String s)`      | Convierte una cadena en un valor de tipo `long`.     |
| `valueOf(String s)`        | Devuelve un objeto `Long` con el valor especificado. |
| `toString(long l)`         | Convierte un `long` en su representación en cadena.   |
| `compare(long x, long y)`  | Compara dos valores de tipo `long`.                  |
| `max(long a, long b)`      | Devuelve el valor más alto entre `a` y `b`.           |
| `min(long a, long b)`      | Devuelve el valor más bajo entre `a` y `b`.           |
| `sum(long a, long b)`      | Devuelve la suma de `a` y `b`.                        |

## **Métodos de la Clase `Short`** 📏

| Método                    | Descripción                                           |
|----------------------------|-------------------------------------------------------|
| `parseShort(String s)`     | Convierte una cadena en un valor de tipo `short`.    |
| `valueOf(String s)`        | Devuelve un objeto `Short` con el valor especificado.|
| `toString(short s)`        | Convierte un `short` en su representación en cadena.  |
| `compare(short x, short y)`| Compara dos valores de tipo `short`.                 |
| `max(short a, short b)`    | Devuelve el valor más alto entre `a` y `b`.           |
| `min(short a, short b)`    | Devuelve el valor más bajo entre `a` y `b`.           |

## **Métodos de la Clase `Byte`** 🔋

| Método                    | Descripción                                           |
|----------------------------|-------------------------------------------------------|
| `parseByte(String s)`      | Convierte una cadena en un valor de tipo `byte`.     |
| `valueOf(String s)`        | Devuelve un objeto `Byte` con el valor especificado. |
| `toString(byte b)`         | Convierte un `byte` en su representación en cadena.   |
| `compare(byte x, byte y)`  | Compara dos valores de tipo `byte`.                  |
| `max(byte a, byte b)`      | Devuelve el valor más alto entre `a` y `b`.           |
| `min(byte a, byte b)`      | Devuelve el valor más bajo entre `a` y `b`.           |


## ➕ **Ejercicios sobre las Clases de Envoltura (`Wrappers`) en Java** 📦

A continuación, se presentan varios ejercicios para aplicar lo aprendido sobre las clases de envoltura en Java. Estos ejercicios están diseñados para ayudarte a comprender cómo se pueden utilizar los wrappers y sus métodos en escenarios prácticos.

### **Ejercicio 1: Conversión de Cadenas a Tipos Primitivos** 🔄

Escribe un programa que solicite al usuario ingresar diferentes tipos de datos en forma de cadenas de texto (por ejemplo, un número entero, un valor booleano y un número decimal). Convierte estas cadenas a sus tipos primitivos correspondientes utilizando las clases de envoltura y muestra los valores convertidos.

**Ejemplo de Entrada/Salida**
- Entrada: `"42"`, `"true"`, `"3.14"`
- Salida:
  - Valor entero: `42`
  - Valor booleano: `true`
  - Valor decimal: `3.14`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class ConversionWrappers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero (en forma de cadena): ");
        String enteroCadena = scanner.nextLine();
        int valorEntero = Integer.parseInt(enteroCadena);
        System.out.println("Valor entero: " + valorEntero);

        System.out.print("Ingrese un valor booleano (true/false): ");
        String booleanoCadena = scanner.nextLine();
        boolean valorBooleano = Boolean.parseBoolean(booleanoCadena);
        System.out.println("Valor booleano: " + valorBooleano);

        System.out.print("Ingrese un número decimal (en forma de cadena): ");
        String decimalCadena = scanner.nextLine();
        double valorDecimal = Double.parseDouble(decimalCadena);
        System.out.println("Valor decimal: " + valorDecimal);
    }
}
```

</details>

### **Ejercicio 2: Operaciones con `Integer` y `Double`** ➕

Escribe un programa que solicite al usuario dos números: uno entero y uno decimal. Luego, utiliza los métodos de las clases `Integer` y `Double` para encontrar el valor máximo, el valor mínimo y la suma de ambos valores.

**Ejemplo de Entrada/Salida**
- Entrada: `5`, `8.3`
- Salida:
  - Valor máximo: `8.3`
  - Valor mínimo: `5`
  - Suma: `13.3`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class OperacionesWrappers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        double valorMaximo = Double.max(numeroEntero, numeroDecimal);
        double valorMinimo = Double.min(numeroEntero, numeroDecimal);
        double suma = numeroEntero + numeroDecimal;

        System.out.println("Valor máximo: " + valorMaximo);
        System.out.println("Valor mínimo: " + valorMinimo);
        System.out.println("Suma: " + suma);
    }
}
```

</details>

### **Ejercicio 3: Contar Letras y Dígitos** 🔢

Escribe un programa que solicite al usuario una cadena de texto y utilice los métodos de la clase `Character` para contar cuántos caracteres en la cadena son letras y cuántos son dígitos.

**Ejemplo de Entrada/Salida**
- Entrada: `"Hola1234"`
- Salida:
  - Cantidad de letras: `4`
  - Cantidad de dígitos: `4`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class ContarLetrasDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        int contadorLetras = 0;
        int contadorDigitos = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isLetter(caracter)) {
                contadorLetras++;
            } else if (Character.isDigit(caracter)) {
                contadorDigitos++;
            }
        }

        System.out.println("Cantidad de letras: " + contadorLetras);
        System.out.println("Cantidad de dígitos: " + contadorDigitos);
    }
}
```

</details>

### **Ejercicio 4: Comprobación de Valores `NaN`** 🤔

Escribe un programa que solicite al usuario ingresar dos valores decimales. Utiliza los métodos de la clase `Double` para verificar si alguno de los valores es "No un Número" (NaN) y muestra un mensaje adecuado.

**Ejemplo de Entrada/Salida**
- Entrada: `NaN`, `5.6`
- Salida:
  - `El primer valor es NaN.`
  - `El segundo valor es un número válido.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class ComprobacionNaN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor decimal: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo valor decimal: ");
        double valor2 = scanner.nextDouble();

        if (Double.isNaN(valor1)) {
            System.out.println("El primer valor es NaN.");
        } else {
            System.out.println("El primer valor es un número válido.");
        }

        if (Double.isNaN(valor2)) {
            System.out.println("El segundo valor es NaN.");
        } else {
            System.out.println("El segundo valor es un número válido.");
        }
    }
}
```

</details>

### **Ejercicio 5: Operaciones con `Long`** 🕒

Escribe un programa que solicite al usuario ingresar dos números largos (`long`) y calcule la suma, el valor máximo y el valor mínimo utilizando los métodos de la clase `Long`.

**Ejemplo de Entrada/Salida**
- Entrada: `1000000`, `500000`
- Salida:
  - Suma: `1500000`
  - Valor máximo: `1000000`
  - Valor mínimo: `500000`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class OperacionesLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número largo: ");
        long numero1 = scanner.nextLong();

        System.out.print("Ingrese el segundo número largo: ");
        long numero2 = scanner.nextLong();

        long suma = Long.sum(numero1, numero2);
        long maximo = Long.max(numero1, numero2);
        long minimo = Long.min(numero1, numero2);

        System.out.println("Suma: " + suma);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
    }
}
```

</details>

### **Ejercicio 6: Verificar Valores Booleanos** ✔️

Escribe un programa que solicite al usuario ingresar dos valores booleanos (como cadenas de texto). Utiliza los métodos de la clase `Boolean` para convertir las cadenas a booleanos y muestra el resultado de las operaciones lógicas "AND" y "OR" entre ambos valores.

**Ejemplo de Entrada/Salida**
- Entrada: `true`, `false`
- Salida:
  - Resultado AND: `false`
  - Resultado OR: `true`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class VerificarBooleanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor booleano (true/false): ");
        boolean valor1 = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Ingrese el segundo valor booleano (true/false): ");
        boolean valor2 = Boolean.parseBoolean(scanner.nextLine());

        boolean resultadoAnd = Boolean.logicalAnd(valor1, valor2);
        boolean resultadoOr = Boolean.logicalOr(valor1, valor2);

        System.out.println("Resultado AND: " + resultadoAnd);
        System.out.println("Resultado OR: " + resultadoOr);
    }
}
```

</details>

