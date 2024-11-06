# **Clase `String` en Java**

## ➕ **Introducción a la Clase `String`**

### ¿Qué es un `String`? 😃

En Java, `String` es una clase utilizada para representar una secuencia de caracteres. Es muy común en casi todos los programas, ya que se usa para almacenar y manipular texto. Los `String` son objetos inmutables, lo que significa que no se pueden cambiar una vez creados. Si se realiza alguna operación que modifica un `String`, en realidad se crea un nuevo objeto en la memoria. 💡

### ¿Cómo crear un `String`? 🔨

Puedes crear `String` de las siguientes maneras:

- **Literal de cadena**:
  ```java
  String saludo = "Hola, Mundo!";
  ```
- **Usando el constructor de la clase `String`**:
  ```java
  String saludo = new String("Hola, Mundo!");
  ```

Ambas formas son válidas, pero usar literales de cadena es más eficiente. 🚀

## ➕ **Métodos más utilizados de la clase `String`**

A continuación, te mostraremos algunos de los métodos más útiles de la clase `String`, junto con ejemplos sencillos para entender cómo se utilizan. 😊

### 1. **`length()`** 📏

Este método devuelve la longitud del `String` (es decir, el número de caracteres que contiene).

```java
String texto = "Hola, Mundo!";
int longitud = texto.length();
System.out.println("Longitud: " + longitud); // Salida: Longitud: 12
```

### 2. **`charAt(int index)`** 🔤

Devuelve el carácter en la posición especificada del `String`. Recuerda que los índices comienzan desde 0. 😎

```java
String texto = "Hola";
char letra = texto.charAt(1);
System.out.println("Carácter en la posición 1: " + letra); // Salida: Carácter en la posición 1: o
```

### 3. **`toUpperCase()`** 🔠

Convierte todos los caracteres del `String` a mayúsculas.

```java
String texto = "hola";
String textoMayusculas = texto.toUpperCase();
System.out.println(textoMayusculas); // Salida: HOLA
```

### 4. **`toLowerCase()`** 🔡

Convierte todos los caracteres del `String` a minúsculas.

```java
String texto = "HOLA";
String textoMinusculas = texto.toLowerCase();
System.out.println(textoMinusculas); // Salida: hola
```

### 5. **`substring(int beginIndex, int endIndex)`** ✂️

Devuelve una parte del `String` desde el índice `beginIndex` hasta `endIndex` (excluyendo `endIndex`).

```java
String texto = "Hola, Mundo!";
String subcadena = texto.substring(0, 4);
System.out.println(subcadena); // Salida: Hola
```

### 6. **`contains(CharSequence sequence)`** 🔍

Verifica si el `String` contiene la secuencia de caracteres especificada.

```java
String texto = "Hola, Mundo!";
boolean contiene = texto.contains("Mundo");
System.out.println("¿Contiene 'Mundo'?: " + contiene); // Salida: ¿Contiene 'Mundo'?: true
```

### 7. **`replace(char oldChar, char newChar)`** 🔄

Reemplaza todas las apariciones de un carácter específico por otro.

```java
String texto = "Java es genial!";
String textoModificado = texto.replace('a', 'o');
System.out.println(textoModificado); // Salida: Jovo es geniol!
```

### 8. **`indexOf(String str)`** 🔢

Devuelve el índice de la primera aparición de la subcadena especificada.

```java
String texto = "Hola, Mundo!";
int indice = texto.indexOf("Mundo");
System.out.println("Índice de 'Mundo': " + indice); // Salida: Índice de 'Mundo': 6
```

### 9. **`equals(Object obj)`** ✅

Compara si dos `String` son iguales.

```java
String texto1 = "Hola";
String texto2 = "Hola";
boolean sonIguales = texto1.equals(texto2);
System.out.println("¿Son iguales?: " + sonIguales); // Salida: ¿Son iguales?: true
```

### 10. **`trim()`** ✂️

Elimina los espacios en blanco al principio y al final del `String`.

```java
String texto = "   Hola, Mundo!   ";
String textoSinEspacios = texto.trim();
System.out.println("Texto sin espacios: " + textoSinEspacios); // Salida: Texto sin espacios: Hola, Mundo!
```

## ➕ **Tabla de métodos adicionales** 📋

| Método                                         | Descripción                                                 | Ejemplo de uso                  |
| ---------------------------------------------- | ----------------------------------------------------------- | ------------------------------- |
| `startsWith(String prefix)`                    | Verifica si el `String` comienza con el prefijo dado.       | `texto.startsWith("Hola");`     |
| `endsWith(String suffix)`                      | Verifica si el `String` termina con el sufijo dado.         | `texto.endsWith("!");`          |
| `concat(String str)`                           | Concatena el `String` con otro `String`.                    | `texto.concat(" Bienvenido!");` |
| `isEmpty()`                                    | Verifica si el `String` está vacío.                         | `texto.isEmpty();`              |
| `lastIndexOf(String str)`                      | Devuelve el índice de la última aparición de la subcadena.  | `texto.lastIndexOf("a");`       |
| `replaceAll(String regex, String replacement)` | Reemplaza todas las coincidencias de una expresión regular. | `texto.replaceAll("a", "e");`   |
| `split(String regex)`                          | Divide el `String` en un array usando la expresión regular. | `texto.split(",");`             |
| `matches(String regex)`                        | Verifica si el `String` coincide con la expresión regular.  | `texto.matches("[A-Za-z]+");`   |
| `compareTo(String anotherString)`              | Compara dos `String` lexicográficamente.                    | `texto.compareTo("Hola");`      |
| `toCharArray()`                                | Convierte el `String` en un array de caracteres.            | `texto.toCharArray();`          |
| `substring(int beginIndex)`                    | Devuelve una subcadena comenzando en el índice especificado. | `texto.substring(3);`            |
| `substring(int beginIndex, int endIndex)`      | Devuelve una subcadena desde `beginIndex` hasta `endIndex`.  | `texto.substring(1, 4);`         |
| `toUpperCase()`                                | Convierte todos los caracteres del `String` a mayúsculas.   | `texto.toUpperCase();`           |
| `toLowerCase()`                                | Convierte todos los caracteres del `String` a minúsculas.   | `texto.toLowerCase();`           |
| `trim()`                                       | Elimina los espacios en blanco al principio y al final.     | `texto.trim();`                  |
| `charAt(int index)`                            | Devuelve el carácter en la posición especificada.           | `texto.charAt(2);`               |
| `replace(char oldChar, char newChar)`          | Reemplaza todas las apariciones de un carácter específico.  | `texto.replace('a', 'o');`       |
| `contains(CharSequence sequence)`              | Verifica si el `String` contiene una secuencia de caracteres. | `texto.contains("Hola");`     |
| `length()`                                     | Devuelve la longitud del `String`.                          | `texto.length();`                |
| `indexOf(String str)`                          | Devuelve el índice de la primera aparición de la subcadena. | `texto.indexOf("a");`           |
| `equals(Object obj)`                           | Compara si dos `String` son iguales.                        | `texto.equals("Hola");`         |
| `equalsIgnoreCase(String anotherString)`       | Compara dos `String` ignorando mayúsculas y minúsculas.     | `texto.equalsIgnoreCase("hola");`|

## ➕ **Ejercicios de integración** 📝

### Ejercicio 1: Verificar Palíndromo

Crea un programa que solicite al usuario ingresar una palabra y determine si es un palíndromo (es decir, si se lee igual de izquierda a derecha y de derecha a izquierda). Utiliza los métodos `toLowerCase()`, `replace()`, y `equals()` para ayudarte.

**Ejemplo de entrada/salida:**

- Entrada: `Anita lava la tina`
- Salida: `Es un palíndromo.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String entrada = scanner.nextLine();

        // Normalizamos la entrada
        String normalizada = entrada.toLowerCase().replace(" ", "");
        String invertida = new StringBuilder(normalizada).reverse().toString();

        if (normalizada.equals(invertida)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }
}
```

</details>

### Ejercicio 2: Contador de Vocales

Crea un programa que solicite al usuario ingresar una frase y cuente cuántas vocales tiene. Utiliza los métodos `toLowerCase()`, `replace()`, y `length()` para realizar la verificación.

**Ejemplo de entrada/salida:**

- Entrada: `Hola Mundo`
- Salida: `Número de vocales: 4`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine().toLowerCase();

        // Contar vocales sin bucles
        int totalVocales = frase.length() - frase.replace("a", "").length()
                        + frase.length() - frase.replace("e", "").length()
                        + frase.length() - frase.replace("i", "").length()
                        + frase.length() - frase.replace("o", "").length()
                        + frase.length() - frase.replace("u", "").length();

        System.out.println("Número de vocales: " + totalVocales);
    }
}
```

</details>

### Ejercicio 3: Validar Contraseña Segura

Crea un programa que valide si una contraseña ingresada por el usuario cumple con los siguientes requisitos:

- Al menos 8 caracteres.
- Debe contener al menos una letra mayúscula, una minúscula y un número.
- Debe contener al menos uno de los siguientes caracteres especiales: `@`, `#`, `$`, `%`, `&`.

Utiliza los métodos `length()`, `matches()`, y `charAt()`. Aquí tienes algunos ejemplos de expresiones regulares que podrías utilizar:

- Para verificar si contiene al menos una letra mayúscula: `.*[A-Z].*`
- Para verificar si contiene al menos una letra minúscula: `.*[a-z].*`
- Para verificar si contiene al menos un número: `.*[0-9].*`
- Para verificar si contiene al menos un carácter especial: `.*[@#$%&].*`

**Ejemplo de entrada/salida:**

- Entrada: `Contra123`
- Salida: `Contraseña válida.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();

        boolean esValida = contrasena.length() >= 8 &&
                contrasena.matches(".*[A-Z].*") &&
                contrasena.matches(".*[a-z].*") &&
                contrasena.matches(".*[0-9].*");

        if (esValida) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña inválida. Debe tener al menos 8 caracteres, una letra mayúscula, una minúscula y un número.");
        }
    }
}
```

</details>

---

**¡Ahora es tu turno!** Practica estos métodos y ejercicios para reforzar tu comprensión sobre la clase `String` en Java. 💪😃

# **Contenido Complementario**

## ➕ **Diferencias entre `replace` y `replaceAll`**

### **`replace()`** 🔄

El método `replace()` en la clase `String` reemplaza todas las ocurrencias de un carácter o secuencia de caracteres específica por otra. Este método acepta dos tipos de parámetros:

1. **`replace(char oldChar, char newChar)`**: Reemplaza todas las apariciones del carácter `oldChar` por el carácter `newChar`.

   ```java
   String texto = "Java es asombroso!";
   String textoModificado = texto.replace('a', 'o');
   System.out.println(textoModificado); // Salida: Jovo es osombroso!
   ```

2. **`replace(CharSequence target, CharSequence replacement)`**: Reemplaza todas las apariciones de una secuencia de caracteres (`target`) por otra (`replacement`).

   ```java
   String texto = "Java es asombroso!";
   String textoModificado = texto.replace("Java", "Python");
   System.out.println(textoModificado); // Salida: Python es asombroso!
   ```

### **`replaceAll()`** 🔄

El método `replaceAll()` en la clase `String` reemplaza todas las ocurrencias que coincidan con una expresión regular. Este método es útil cuando queremos reemplazar patrones complejos. La firma de este método es:

- **`replaceAll(String regex, String replacement)`**: Reemplaza todas las coincidencias del patrón `regex` por el valor de `replacement`.
  ```java
  String texto = "123-456-789";
  String textoModificado = texto.replaceAll("\d", "*");
  System.out.println(textoModificado); // Salida: ***-***-***
  ```

### **Diferencia principal**

- **`replace()`** trabaja con caracteres o secuencias de caracteres específicas y no entiende expresiones regulares.
- **`replaceAll()`** usa expresiones regulares (`regex`) para encontrar los patrones que se deben reemplazar.

#### **¿Qué es `regex`?**

`regex` (expresión regular) es un lenguaje especializado para buscar y manipular patrones dentro de un texto. En `replaceAll()`, `regex` permite especificar patrones complejos, por ejemplo, dígitos, letras, espacios en blanco, etc.

## ➕ **Tabla de Expresiones Útiles** 📋

| Expresión Regular | Descripción                           | Ejemplo de uso                       |
| ----------------- | ------------------------------------- | ------------------------------------ |
| `\t`              | Tabulación                            | `texto.replaceAll("\t", " ");`       |
| `\n`              | Nueva línea                           | `texto.replaceAll("\n", " ");`       |
| `\s`              | Cualquier espacio en blanco           | `texto.replaceAll("\s", "_");`       |
| `\d`              | Cualquier dígito (0-9)                | `texto.replaceAll("\d", "*");`       |
| `\.`              | Literal punto                         | `texto.split("\.");`                 |
| `\w`              | Cualquier carácter alfanumérico       | `texto.matches("\w+");`              |
| `[a-zA-Z]`        | Cualquier letra de la a-z o A-Z       | `texto.replaceAll("[a-zA-Z]", "X");` |
| `\(debug\)`      | Literal de `(debug)`                  | `texto.contains("\(debug\)");`       |
| `\d{3}`           | Exactamente tres dígitos consecutivos | `texto.matches("\d{3}");`            |
| `^`               | Inicio de una línea                   | `texto.matches("^Hola.*");`          |
| `$`               | Fin de una línea                      | `texto.matches(".*adiós$");`         |
| `[^abc]`          | Cualquier carácter excepto `a`, `b`, o `c` | `texto.replaceAll("[^abc]", "X");`  |
| `\b`              | Límite de palabra                     | `texto.matches("\bHola\b");`        |
| `\S`              | Cualquier carácter que no sea espacio en blanco | `texto.replaceAll("\S", "*");`  |
| `+`               | Uno o más repeticiones                | `texto.matches("\d+");`             |
| `*`               | Cero o más repeticiones               | `texto.matches("\w*");`             |
| `?`               | Cero o una repetición                 | `texto.matches("\w?");`             |
| `|`               | Alternativa (OR) entre expresiones    | `texto.matches("Hola|Adiós");`       |
| `{n,m}`           | Entre `n` y `m` repeticiones         | `texto.matches("\d{2,4}");`         |
| `\D`              | Cualquier carácter que no sea un dígito | `texto.replaceAll("\D", "X");`     |
| `\W`              | Cualquier carácter que no sea alfanumérico | `texto.replaceAll("\W", "_");`     |
| `(a|b|c)`         | Alternativa entre `a`, `b`, o `c`    | `texto.matches("(a|b|c)");`         |
| `[0-9]`           | Cualquier dígito entre 0 y 9          | `texto.replaceAll("[0-9]", "#");`   |
| `[A-Z]`           | Cualquier letra mayúscula             | `texto.replaceAll("[A-Z]", "_");`   |

## ➕ **Verificar si un String es nulo o vacío** 🛡️

Antes de trabajar con cadenas de texto en Java, es importante verificar si un `String` es nulo o está vacío. Esto ayuda a evitar errores como `NullPointerException` cuando intentamos acceder a métodos de un `String` que no ha sido inicializado.

### **Métodos para verificar un `String`**

- **`texto == null`**: Verifica si el `String` es nulo.
- **`texto.isEmpty()`**: Verifica si el `String` está vacío (es decir, tiene una longitud de 0).
- **`texto.isBlank()`**: (Java 11 y posteriores) Verifica si el `String` está vacío o contiene solo espacios en blanco.

### **Ejemplo**

```java
String texto = "";
if (texto == null || texto.isEmpty()) {
    System.out.println("El String es nulo o vacío");
} else {
    System.out.println("El String tiene contenido: " + texto);
}
```

En este ejemplo, primero verificamos si el `String` es nulo y luego, si no lo es, verificamos si está vacío.

## ➕ **Ejercicio: Crear función `capitalize`** ✨

### **Objetivo**

Crear una función llamada `capitalize` que tome un `String` y haga que la primera letra sea mayúscula y el resto minúsculas. Por ejemplo:

- Entrada: `java`
- Salida: `Java`

### **Paso a paso**

1. **Verificar si el `String` está vacío**: Si el `String` está vacío, devolverlo sin modificaciones.
2. **Convertir el primer carácter a mayúscula**: Usa `charAt(0)` y el método `toUpperCase()`.
3. **Convertir el resto del `String` a minúsculas**: Utiliza `substring(1)` y el método `toLowerCase()`.
4. **Concatenar**: Combina el primer carácter en mayúscula con el resto en minúsculas.

### **Código**

```java
public class CapitalizeFuncion {
    public static String capitalize(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        char primeraLetra = Character.toUpperCase(texto.charAt(0));
        String restoTexto = texto.substring(1).toLowerCase();
        return primeraLetra + restoTexto;
    }

    public static void main(String[] args) {
        String entrada = "java";
        String resultado = capitalize(entrada);
        System.out.println("Resultado: " + resultado); // Salida: Java
    }
}
```

### **Explicación del ejemplo**

En el ejemplo, la función `capitalize` primero verifica si el `String` está vacío o es nulo. Si el `String` no cumple ninguna de estas condiciones, toma la primera letra y la convierte a mayúscula, mientras que el resto del texto se convierte a minúsculas antes de ser concatenado. Esto asegura que solo la primera letra sea mayúscula.

Como alternativa, se puede utilizar una única línea para lograr lo mismo de forma más concisa:

```java
return (texto == null || texto.isEmpty()) ? texto : Character.toUpperCase(texto.charAt(0)) + texto.substring(1).toLowerCase();
```

**texto == null**: Verifica si el texto es `null`. Si `texto` no existe (es decir, nunca se le ha dado un valor), entonces `texto` será `null`.

**texto.isEmpty()**: Verifica si el texto está vacío, es decir, no tiene caracteres.

**(texto == null || texto.isEmpty())**: Aquí usamos `||` (que significa "o") para combinar las dos condiciones. Esto significa que si el texto es `null` **o** está vacío, la condición se cumple.

**? texto :** Este es un operador ternario. Es una forma corta de escribir una condición `if-else`. La parte antes de `?` es la condición (en este caso, si el texto es `null` o está vacío). Si la condición es verdadera, devolverá `texto`. Esto significa que si el texto es `null` o vacío, simplemente lo devuelve sin hacer nada más.

**Character.toUpperCase(texto.charAt(0))**: Si el texto **no** es nulo ni está vacío, esto toma el primer carácter (`texto.charAt(0)`) y lo convierte en mayúscula.

**texto.substring(1).toLowerCase()**: Luego toma el resto del texto a partir del segundo carácter (`texto.substring(1)`) y lo convierte todo a minúsculas.

**+**: Junta la letra mayúscula del principio con el resto del texto ya en minúsculas.

# ➕ **Código ASCII**

## ➕ **¿Qué es el Código ASCII?**

El **Código ASCII** (American Standard Code for Information Interchange) es un sistema de codificación que representa caracteres como letras, números y símbolos mediante valores numéricos. Fue creado en la década de 1960 y es ampliamente utilizado en la informática y la programación para manejar textos y caracteres.

### **¿Por qué se usa ASCII?**

- **Estándar universal**: ASCII se convirtió en un estándar que permitía la comunicación entre computadoras y dispositivos de diferentes fabricantes. Al ser un código ampliamente adoptado, permitió la compatibilidad y el intercambio de información de manera más eficiente.
- **Simplicidad**: ASCII se basa en valores numéricos de 7 bits, lo que permite representar 128 caracteres diferentes. Aunque con una extensión a 8 bits, se logra representar hasta 256 caracteres.

### **¿Para qué sirve?**

- **Representación de caracteres**: ASCII permite convertir caracteres como letras y números en valores numéricos que los ordenadores pueden procesar fácilmente.
- **Comunicación entre sistemas**: ASCII facilita el intercambio de información entre distintos sistemas y dispositivos.
- **Control de dispositivos**: Además de caracteres visibles, ASCII tiene códigos de control que permiten la comunicación y el manejo de dispositivos periféricos como impresoras.

## ➕ **Tabla de Códigos ASCII** 📋

El Código ASCII permite representar caracteres como letras, números y símbolos mediante valores numéricos y hexadecimales. A continuación, presentamos una tabla más completa que incluye el valor ASCII, el valor hexadecimal, y el carácter correspondiente, incluyendo tanto letras individuales como caracteres de uso común.

| Valor ASCII | Valor Hexadecimal | Carácter | Descripción                  |
|-------------|-------------------|----------|------------------------------|
| 0           | 0x00              | NUL      | Null (sin valor)             |
| 1           | 0x01              | SOH      | Start of Header              |
| 2           | 0x02              | STX      | Start of Text                |
| 3           | 0x03              | ETX      | End of Text                  |
| ...         | ...               | ...      | ...                          |
| 32          | 0x20              | (espacio)| Espacio en blanco            |
| 33          | 0x21              | !        | Signo de exclamación         |
| 34          | 0x22              | "        | Comillas dobles             |
| 35          | 0x23              | #        | Símbolo numeral (hashtag)    |
| 36          | 0x24              | $        | Signo de dólar               |
| 37          | 0x25              | %        | Signo de porcentaje          |
| 38          | 0x26              | &        | Signo de ampersand           |
| 39          | 0x27              | '        | Comilla simple              |
| 40          | 0x28              | (        | Paréntesis izquierdo         |
| 41          | 0x29              | )        | Paréntesis derecho           |
| 42          | 0x2A              | *        | Asterisco                    |
| 43          | 0x2B              | +        | Signo de más                 |
| 44          | 0x2C              | ,        | Coma                         |
| 45          | 0x2D              | -        | Signo de menos (guion)       |
| 46          | 0x2E              | .        | Punto                        |
| 47          | 0x2F              | /        | Barra inclinada              |
| 48          | 0x30              | 0        | Número cero                  |
| ...         | ...               | ...      | ...                          |
| 65          | 0x41              | A        | Letra A mayúscula            |
| 66          | 0x42              | B        | Letra B mayúscula            |
| 67          | 0x43              | C        | Letra C mayúscula            |
| ...         | ...               | ...      | ...                          |
| 88          | 0x58              | X        | Letra X mayúscula            |
| 89          | 0x59              | Y        | Letra Y mayúscula            |
| 90          | 0x5A              | Z        | Letra Z mayúscula            |
| 97          | 0x61              | a        | Letra a minúscula            |
| 98          | 0x62              | b        | Letra b minúscula            |
| 99          | 0x63              | c        | Letra c minúscula            |
| ...         | ...               | ...      | ...                          |
| 120         | 0x78              | x        | Letra x minúscula            |
| 121         | 0x79              | y        | Letra y minúscula            |
| 122         | 0x7A              | z        | Letra z minúscula            |
| 124         | 0x7C              | |        | Barra vertical               |
| 126         | 0x7E              | ~        | Tilde                        |
| 127         | 0x7F              | DEL      | Delete                       |
| ...         | ...               | ...      | ...                          |
| 255         | 0xFF              | ÿ        | Letra "ÿ"                    |

_(Nota: Esta es una muestra parcial de los 255 caracteres; para consultar todos los caracteres, se recomienda usar una referencia ASCII completa.)_

## ➕ **Ejemplos de uso del Código ASCII en Java**

### **Uso con caracteres (`char`)**

En Java, los valores ASCII pueden ser representados utilizando el tipo de datos `char`. Esto permite realizar operaciones y convertir caracteres a sus valores ASCII y viceversa.

**Ejemplo 1: Conversión de carácter a valor ASCII**

```java
public class AsciiExample {
    public static void main(String[] args) {
        char letra = 'A';
        int valorAscii = (int) letra;
        System.out.println("El valor ASCII de 'A' es: " + valorAscii); // Salida: El valor ASCII de 'A' es: 65
    }
}
```

**Ejemplo 2: Conversión de valor ASCII a carácter**

```java
public class AsciiToChar {
    public static void main(String[] args) {
        int valor = 66;
        char caracter = (char) valor;
        System.out.println("El carácter para el valor ASCII 66 es: " + caracter); // Salida: El carácter para el valor ASCII 66 es: B
    }
}
```

## ➕ **Uso con cadenas (`String`)**

Podemos también utilizar el Código ASCII en cadenas para convertir caracteres o manipularlos según su valor ASCII.

**Ejemplo 3: Obtener el valor ASCII de cada carácter en una cadena**

```java
public class AsciiStringExample {
    public static void main(String[] args) {
        String texto = "Hola";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int valorAscii = (int) c;
            System.out.println("El valor ASCII de '" + c + "' es: " + valorAscii);
        }
    }
}
```

_Salida:_

```
El valor ASCII de 'H' es: 72
El valor ASCII de 'o' es: 111
El valor ASCII de 'l' es: 108
El valor ASCII de 'a' es: 97
```

**Ejemplo 4: Construir una cadena a partir de valores ASCII**

```java
public class BuildStringFromAscii {
    public static void main(String[] args) {
        int[] valoresAscii = {72, 111, 108, 97};
        StringBuilder texto = new StringBuilder();
        for (int valor : valoresAscii) {
            texto.append((char) valor);
        }
        System.out.println("La cadena construida es: " + texto.toString()); // Salida: La cadena construida es: Hola
    }
}
```

## ➕ **Ejemplos de Aplicaciones del Código ASCII** 🚀

### **Encriptación Básica** 🔐

El Código ASCII se puede usar para realizar encriptaciones simples. A continuación, se presenta un ejemplo donde se incrementa el valor ASCII de cada carácter para obtener un texto "encriptado". Este ejemplo es más sencillo para que sea fácil de entender.

**Ejemplo: Encriptar una cadena incrementando el valor ASCII**

```java
public class SimpleEncryption {
    public static String encriptar(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            char caracterEncriptado = (char) (caracter + 1); // Incrementa el valor ASCII en 1
            resultado += caracterEncriptado;
        }
        return resultado;
    }

    public static void main(String[] args) {
        String textoOriginal = "Java";
        String textoEncriptado = encriptar(textoOriginal);
        System.out.println("Texto encriptado: " + textoEncriptado); // Salida: Texto encriptado: Kbwb
    }
}
```

_En este ejemplo, cada carácter se incrementa en 1 posición en el valor ASCII para "encriptar" el texto._

El Código ASCII se puede usar para realizar encriptaciones simples. A continuación, se presenta un ejemplo donde se incrementa el valor ASCII de cada carácter para obtener un texto "encriptado". Este ejemplo no utiliza bucles explícitos.

**Ejemplo: Encriptar una cadena incrementando el valor ASCII**

```java
public class SimpleEncryption {
    public static String encriptar(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        return texto.replaceAll(".", m -> String.valueOf((char) (m.group().charAt(0) + 3)));
    }

    public static void main(String[] args) {
        String textoOriginal = "Java";
        String textoEncriptado = encriptar(textoOriginal);
        System.out.println("Texto encriptado: " + textoEncriptado); // Salida: Texto encriptado: Mdyd
    }
}
```

_En este ejemplo, cada carácter se incrementa en 3 posiciones en el valor ASCII para "encriptar" el texto._

### **Comparación de Caracteres**

ASCII permite realizar comparaciones rápidas entre caracteres utilizando sus valores numéricos. Por ejemplo, comparar si un carácter es una letra mayúscula, minúscula o un número.

**Ejemplo: Verificar tipo de carácter**

```java
public class CharTypeCheck {
    public static void main(String[] args) {
        char c = 'A';
        if (c >= 65 && c <= 90) {
            System.out.println(c + " es una letra mayúscula.");
        } else if (c >= 97 && c <= 122) {
            System.out.println(c + " es una letra minúscula.");
        } else if (c >= 48 && c <= 57) {
            System.out.println(c + " es un número.");
        } else {
            System.out.println(c + " es otro tipo de carácter.");
        }
    }
}
```

_Salida:_

```
A es una letra mayúscula.
```

**Ejemplo: Verificar caracteres en una cadena**

Podemos verificar si los caracteres dentro de una cadena son mayúsculas, minúsculas o números utilizando el valor ASCII de cada uno:

```java
public class CharInStringCheck {
    public static void main(String[] args) {
        String texto = "Hola123";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 65 && c <= 90) {
                System.out.println(c + " es una letra mayúscula.");
            } else if (c >= 97 && c <= 122) {
                System.out.println(c + " es una letra minúscula.");
            } else if (c >= 48 && c <= 57) {
                System.out.println(c + " es un número.");
            } else {
                System.out.println(c + " es otro tipo de carácter.");
            }
        }
    }
}
```

_Salida:_

```
H es una letra mayúscula.
o es una letra minúscula.
l es una letra minúscula.
a es una letra minúscula.
1 es un número.
2 es un número.
3 es un número.
```

## ➕ Introducción a **`HashMap`** 🗺️

### **¿Qué es un `HashMap`?**

`HashMap` es una clase en Java que implementa la interfaz `Map`. Se utiliza para almacenar pares clave-valor. Es muy útil cuando necesitamos acceder a datos de manera rápida utilizando una clave única. La clave y el valor pueden ser de cualquier tipo de objeto, incluyendo `String`, `Integer`, etc.

### **¿Para qué es útil?**

- **Almacenamiento eficiente de datos**: Un `HashMap` proporciona acceso en tiempo constante promedio (`O(1)`) a los elementos, lo que lo hace muy eficiente para almacenar y buscar datos.
- **Facilidad para asociar datos**: Se puede utilizar para asociar claves únicas con valores, por ejemplo, un nombre con un número de teléfono.

### **¿Por qué es recomendable usarlo?**

- **Rápido acceso**: Los `HashMap` permiten acceder a los valores de manera muy rápida gracias a la estructura de dispersión (`hashing`).
- **Flexibilidad**: Puedes almacenar objetos complejos como valores, y las claves pueden ser cualquier objeto siempre y cuando sean únicas y tengan bien definido el método `hashCode()`.

### **Ejemplo de uso**

```java
import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<>();

        // Agregar elementos
        edades.put("Juan", 25);
        edades.put("Ana", 30);
        edades.put("Luis", 20);

        // Acceder a un valor
        int edadAna = edades.get("Ana");
        System.out.println("La edad de Ana es: " + edadAna); // Salida: La edad de Ana es: 30

        // Verificar si una clave existe
        boolean existeLuis = edades.containsKey("Luis");
        System.out.println("¿Existe Luis?: " + existeLuis); // Salida: ¿Existe Luis?: true

        // Eliminar un elemento
        edades.remove("Luis");
        System.out.println("Después de eliminar a Luis: " + edades);
    }
}
```

### **Ejercicio con `HashMap`**

Crea un programa que almacene el nombre y la calificación de los estudiantes. Luego, permite al usuario ingresar un nombre para ver la calificación correspondiente.

```java
import java.util.HashMap;
import java.util.Scanner;

public class CalificacionesEstudiantes {
    public static void main(String[] args) {
        HashMap<String, Integer> calificaciones = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Agregar calificaciones
        calificaciones.put("Maria", 85);
        calificaciones.put("Carlos", 92);
        calificaciones.put("Lucia", 78);

        // Consultar calificación
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        if (calificaciones.containsKey(nombre)) {
            int calificacion = calificaciones.get(nombre);
            System.out.println("La calificación de " + nombre + " es: " + calificacion);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
```
