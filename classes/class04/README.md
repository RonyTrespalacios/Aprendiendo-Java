# Condicional <u>**if**</u> en Java 🚦

En esta clase veremos cómo utilizar la estructura condicional `if` en Java. Es una de las estructuras de control de flujo más básicas y fundamentales en cualquier lenguaje de programación, incluyendo Java. Nos permite tomar decisiones en nuestro programa, ejecutando diferentes bloques de código dependiendo de si una condición ✨

## Teoría

La estructura condicional `if` nos permite evaluar una expresión lógica o booleana. Si dicha expresión resulta ser verdadera (`true`), se ejecutará el bloque de código asociado. En caso contrario, el bloque de código no se ejecutará.

La sintaxis básica de un `if` es la siguiente:

```java
if (condicion) {
    // Código a ejecutar si la condición es verdadera
}
```

💡 Las condiciones también pueden incluir operaciones complejas para evaluar múltiples situaciones. También pueden ser el resultado de operaciones de comparación, como `==`, `!=`, `<`, `>`, `<=`, `>=`, o combinaciones de operadores lógicos como `&&` (AND), `||` (OR) y `!` (NOT).

## Ejemplos básicos

```java
if (true) {
    System.out.println("Esta línea siempre se ejecuta.");
}

if (false) {
    System.out.println("Esta línea nunca se ejecuta.");
}

int a = 5;
int b = 10;

if (a < b) {
    System.out.println("a es menor que b.");
}

boolean condicion = (a + b) > 10;
if (condicion) {
    System.out.println("La suma de a y b es mayor que 10.");
}
```

## Uso del `if-else` 🔄
Además de `if`, podemos usar `else` para ejecutar otro bloque de código cuando la condición no sea verdadera.

```java
if (condicion) {
    // Código a ejecutar si la condición es verdadera
} else {
    // Código a ejecutar si la condición es falsa
}
```

Podemos extender el `if` utilizando `else if` para evaluar múltiples condiciones:

```java
if (condicion1) {
    // Código a ejecutar si la condicion1 es verdadera
} else if (condicion2) {
    // Código a ejecutar si la condicion2 es verdadera
} else {
    // Código a ejecutar si ninguna de las condiciones anteriores es verdadera
}
```

### Ejemplo simple

```java
int edad = 20;

if (edad >= 18) {
    System.out.println("Eres mayor de edad.");
} else {
    System.out.println("Eres menor de edad.");
}
```

<details>
<summary>Ver explicación del ejemplo</summary>
En este ejemplo, evaluamos si la variable `edad` es mayor o igual a 18. Si la condición es verdadera, imprime "Eres mayor de edad"; si no, imprime "Eres menor de edad".
</details>

## 🚫 **Condición no booleana**

```java
int numero = 5;
if (numero) {  // Error: la condición no devuelve un valor booleano
    System.out.println("Esto no compilará.");
}
```

✅ Lo correcto sería:

```java
if (numero != 0) {
    System.out.println("El número es distinto de cero.");
}
```

## 🔤 Comparación de Strings

En Java, las cadenas de texto (`String`) no deben ser comparadas utilizando el operador `==`, ya que este operador compara las referencias de los objetos en memoria, no el contenido de las cadenas.

Esto significa que, aunque dos cadenas tengan el mismo valor, `==` puede devolver `false` porque están ubicadas en diferentes lugares de la memoria.

Para comparar el contenido de dos cadenas, se debe utilizar el método `.equals()`, que verifica si los contenidos son iguales.

### ¿Qué es <u>*.equals*()</u> y por qué funciona?

El método `.equals()` es un método heredado de la clase `Object` que se ha sobrescrito en la clase `String` para realizar una comparación basada en el contenido. En otras palabras, `.equals()` compara cada carácter de ambas cadenas para verificar si son iguales. Esto asegura que el resultado de la comparación sea `true` si ambas cadenas tienen el mismo contenido, sin importar si son objetos diferentes en la memoria.

En Java, cada vez que se crea una nueva cadena con el mismo valor literal, el compilador puede almacenar esas cadenas en un "pool de strings" para optimizar el uso de la memoria. En algunos casos, las cadenas literales idénticas pueden compartir la misma referencia. Sin embargo, si se crean con el constructor `new String()`, apuntarán a diferentes ubicaciones en la memoria, aunque tengan el mismo valor. Esto es lo que hace que el operador `==` no sea confiable para comparar cadenas en Java, ya que solo compara si ambas referencias apuntan al mismo objeto.

Por eso, siempre debemos usar `.equals()` cuando queremos verificar si dos cadenas tienen el mismo valor.



### Ejemplo de comparación de `String`

```java
String saludo1 = "Hola";
String saludo2 = "Hola";

if (saludo1 == saludo2) {
    System.out.println("Los saludos son iguales (usando ==)");
} else {
    System.out.println("Los saludos NO son iguales (usando ==)");
}

if (saludo1.equals(saludo2)) {
    System.out.println("Los saludos son iguales (usando .equals())");
} else {
    System.out.println("Los saludos NO son iguales (usando .equals())");
}
```

### ¿Qué hace este código?
- Definimos dos cadenas de texto (`String saludo1` y `String saludo2`) con el valor "Hola".
- Luego, intentamos comparar las dos cadenas utilizando `==` y `.equals()`.

### ¿Cómo funciona?
- La comparación `saludo1 == saludo2` verifica si ambas referencias apuntan al mismo objeto en la memoria. Aunque los valores de ambas cadenas sean "Hola", en algunos casos `==` puede devolver `false` porque las referencias no son las mismas.
- La comparación `saludo1.equals(saludo2)` verifica si el contenido de ambas cadenas es el mismo. En este caso, devolverá `true` porque el contenido de ambas cadenas es igual.

### ¿Qué debería pasar en la ejecución?
- **Salida esperada:**
- "Los saludos son iguales (usando ==)" o "Los saludos NO son iguales (usando ==)" dependiendo de la implementación del compilador y cómo se almacenen las cadenas.
- "Los saludos son iguales (usando .equals())" siempre, porque el contenido de ambas cadenas es el mismo.


<details>
<summary>Ver explicación del ejemplo</summary>
En el ejemplo anterior, la comparación `saludo1 == saludo2` puede devolver `false` aunque ambos textos sean "Hola", porque `==` compara las referencias en memoria. Por otro lado, `saludo1.equals(saludo2)` devolverá `true` porque compara el contenido de las cadenas.
</details>

<details>
<summary>Posible salida</summary>
    Prueba a ejecutar el codigo anterior tu mismo! 💡

    ```
    Los saludos NO son iguales (usando ==)
    Los saludos son iguales (usando .equals())
    ```
</details>

## Ejercicios 📝

### Ejercicio 1:
✨ Escribe un programa que pida al usuario un número entero y determine si es positivo, negativo o cero. 🔢 ➕ ➖ 0️⃣.

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        scanner.close();
    }
}
```
</details>

### Ejercicio 2:
🎂 Crea un programa que le pida al usuario su edad y verifique si tiene la edad suficiente para votar (18 años o más). 🗳️ 👤

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class VerificarVoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Usted puede votar.");
        } else {
            System.out.println("Usted no tiene la edad suficiente para votar.");
        }
        scanner.close();
    }
}
```
</details>

### Ejercicio 3:
🏧 Escribe un programa que simule un cajero automático simplificado. El usuario debe ingresar un PIN de 4 dígitos. 🔐 Si el PIN es correcto (por ejemplo, 1234), se mostrará un mensaje de bienvenida. 🎉 Si el PIN es incorrecto, debe mostrar un mensaje de error. ❌

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pinCorrecto = 1234;

        System.out.print("Ingrese su PIN de 4 dígitos: ");
        int pinIngresado = scanner.nextInt();

        if (pinIngresado == pinCorrecto) {
            System.out.println("PIN correcto. Bienvenido al cajero automático.");
        } else {
            System.out.println("PIN incorrecto. Por favor, inténtelo de nuevo.");
        }
        scanner.close();
    }
}
```
</details>

### Ejercicio 4:
📊 Desarrolla un programa que lea tres números ingresados por el usuario y determine cuál es el mayor y cuál es el menor de los tres. 🔍 🔼 🔽

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class MayorMenorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = num1;
        int menor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        scanner.close();
    }
}
```
</details>

---

Estos conceptos y ejercicios te ayudarán a comprender mejor cómo funciona la estructura condicional `if` en Java, permitiéndote tomar decisiones en tu código de forma efectiva.

¡Practica estos ejemplos y sigue explorando más casos donde puedas usar `if` y `else` para dominar la lógica condicional en Java! 🚀