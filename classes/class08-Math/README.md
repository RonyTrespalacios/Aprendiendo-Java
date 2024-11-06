# 📊 **Clase `Math` en Java**

## ➕ **Introducción a la Clase `Math`**

La clase `Math` en Java es una clase fundamental que forma parte del paquete `java.lang`, por lo que se importa automáticamente en todos los programas Java. Esta clase proporciona métodos matemáticos estáticos que permiten realizar operaciones numéricas básicas y avanzadas, como cálculos aritméticos, trigonométricos, logarítmicos, y funciones para redondeo, entre otros. Debido a que todos los métodos de la clase `Math` son estáticos, se pueden utilizar sin necesidad de crear una instancia de la clase. Esto hace que sea muy conveniente y eficiente para resolver problemas matemáticos comunes en la programación. Además, la clase `Math` incluye constantes como `PI` y `E`, las cuales son muy útiles en cálculos matemáticos relacionados con la trigonometría y exponenciales. La clase está diseñada para ser rápida y precisa, proporcionando una base sólida para el desarrollo de aplicaciones científicas y de propósito general donde los cálculos matemáticos son esenciales. 🚀

## ➕ **Métodos más usados de la Clase `Math`**

### **1. `Math.abs()`**
Devuelve el valor absoluto de un número, es decir, siempre un valor positivo. 🔄

**Ejemplo:**
```java
int valor = -5;
int absoluto = Math.abs(valor);
System.out.println("Valor absoluto: " + absoluto); // Salida: Valor absoluto: 5
```

### **2. `Math.max()` y `Math.min()`**
- **`Math.max(a, b)`**: Devuelve el mayor de dos valores. 🆙
- **`Math.min(a, b)`**: Devuelve el menor de dos valores. 🆗

**Ejemplo:**
```java
int a = 10;
int b = 20;
System.out.println("Mayor: " + Math.max(a, b)); // Salida: Mayor: 20
System.out.println("Menor: " + Math.min(a, b)); // Salida: Menor: 10
```

### **3. `Math.pow()`**
Devuelve el valor de un número elevado a la potencia de otro. 🔋

**Ejemplo:**
```java
double base = 2;
double exponente = 3;
double resultado = Math.pow(base, exponente);
System.out.println("Resultado: " + resultado); // Salida: Resultado: 8.0
```

### **4. `Math.sqrt()`**
Calcula la raíz cuadrada de un número. ✨

**Ejemplo:**
```java
double numero = 16;
double raizCuadrada = Math.sqrt(numero);
System.out.println("Raíz cuadrada: " + raizCuadrada); // Salida: Raíz cuadrada: 4.0
```

### **5. `Math.round()`**
Redondea un número al entero más cercano. 🔄

**Ejemplo:**
```java
double numero = 5.6;
long redondeado = Math.round(numero);
System.out.println("Redondeado: " + redondeado); // Salida: Redondeado: 6
```

### **6. `Math.ceil()` y `Math.floor()`**
- **`Math.ceil()`**: Redondea un número hacia arriba al siguiente entero más alto. ⬆️
- **`Math.floor()`**: Redondea un número hacia abajo al siguiente entero más bajo. ⬇️

**Ejemplo:**
```java
double numero = 5.3;
System.out.println("Redondear hacia arriba: " + Math.ceil(numero)); // Salida: 6.0
System.out.println("Redondear hacia abajo: " + Math.floor(numero)); // Salida: 5.0
```

### **7. `Math.random()`**
Devuelve un valor aleatorio entre 0.0 y 1.0 (excluyendo 1.0). 🎲

**Ejemplo:**
```java
double aleatorio = Math.random();
System.out.println("Valor aleatorio: " + aleatorio); // Salida: Valor aleatorio: 0.6789 (varía en cada ejecución)
```

### **8. `Math.PI`**
Constante que representa el valor de pi. Se puede utilizar en cálculos geométricos. 🔵

**Ejemplo:**
```java
double radio = 5;
double area = Math.PI * Math.pow(radio, 2);
System.out.println("Área del círculo: " + area); // Salida: Área del círculo: 78.53981633974483
```

### **9. `Math.log()`**
Calcula el logaritmo natural de un número. 📉

**Ejemplo:**
```java
double numero = 10;
double logaritmo = Math.log(numero);
System.out.println("Logaritmo natural: " + logaritmo); // Salida: Logaritmo natural: 2.302585092994046
```

### **10. `Math.sin()`, `Math.cos()`, `Math.tan()`**
Estos métodos devuelven el seno, coseno, y tangente de un ángulo especificado en radianes. 📐

**Ejemplo:**
```java
double angulo = Math.PI / 4; // 45 grados
double seno = Math.sin(angulo);
double coseno = Math.cos(angulo);
double tangente = Math.tan(angulo);
System.out.println("Seno: " + seno); // Salida: Seno: 0.7071067811865475
System.out.println("Coseno: " + coseno); // Salida: Coseno: 0.7071067811865475
System.out.println("Tangente: " + tangente); // Salida: Tangente: 1.0
```

## ➕ **Tabla de Otros Métodos de `Math`**

| Método                    | Descripción                                           | Ejemplo de Uso                                     |
|----------------------------|------------------------------------------------------|----------------------------------------------------|
| `Math.cbrt(x)`             | Devuelve la raíz cúbica de `x`.                      | `Math.cbrt(27); // 3.0`                            |
| `Math.exp(x)`              | Devuelve el valor de `e` elevado a la potencia `x`.   | `Math.exp(2); // 7.38905609893065`                 |
| `Math.hypot(x, y)`         | Calcula la hipotenusa de un triángulo con lados `x` e `y`. | `Math.hypot(3, 4); // 5.0`                          |
| `Math.toDegrees(radianes)` | Convierte radianes a grados.                          | `Math.toDegrees(Math.PI); // 180.0`                |
| `Math.toRadians(grados)`   | Convierte grados a radianes.                          | `Math.toRadians(180); // 3.141592653589793`        |
| `Math.signum(x)`           | Devuelve el signo de `x`: `1.0`, `-1.0` o `0.0`.      | `Math.signum(-10); // -1.0`                        |
| `Math.copySign(x, y)`      | Copia el signo de `y` a `x`.                          | `Math.copySign(10, -1); // -10.0`                  |
| `Math.nextUp(x)`           | Devuelve el valor flotante más pequeño mayor que `x`. | `Math.nextUp(1.5); // 1.5000000000000002`          |
| `Math.nextDown(x)`         | Devuelve el valor flotante más pequeño menor que `x`. | `Math.nextDown(1.5); // 1.4999999999999998`        |
| `Math.ulp(x)`              | Devuelve la unidad en el último lugar del valor `x`.  | `Math.ulp(1.0); // 2.220446049250313E-16`          |
| `Math.abs(x)`              | Devuelve el valor absoluto de `x`.                    | `Math.abs(-10); // 10`                             |
| `Math.ceil(x)`             | Redondea `x` hacia arriba al siguiente entero más alto. | `Math.ceil(5.3); // 6.0`                           |
| `Math.floor(x)`            | Redondea `x` hacia abajo al siguiente entero más bajo. | `Math.floor(5.7); // 5.0`                          |
| `Math.round(x)`            | Redondea `x` al entero más cercano.                   | `Math.round(5.5); // 6`                            |
| `Math.pow(x, y)`           | Devuelve `x` elevado a la potencia `y`.               | `Math.pow(2, 3); // 8.0`                           |
| `Math.sqrt(x)`             | Devuelve la raíz cuadrada de `x`.                     | `Math.sqrt(16); // 4.0`                            |
| `Math.random()`            | Devuelve un número aleatorio entre `0.0` y `1.0`.     | `Math.random(); // 0.6789 (varía en cada ejecución)` |
| `Math.log(x)`              | Devuelve el logaritmo natural de `x`.                 | `Math.log(10); // 2.302585092994046`               |
| `Math.sin(x)`              | Devuelve el seno de `x` (en radianes).                | `Math.sin(Math.PI / 2); // 1.0`                    |
| `Math.cos(x)`              | Devuelve el coseno de `x` (en radianes).              | `Math.cos(0); // 1.0`                               |
| `Math.tan(x)`              | Devuelve la tangente de `x` (en radianes).            | `Math.tan(Math.PI / 4); // 1.0`                    |
| `Math.acos(x)`             | Devuelve el arcocoseno de `x`.                        | `Math.acos(1.0); // 0.0`                           |
| `Math.asin(x)`             | Devuelve el arcoseno de `x`.                          | `Math.asin(0.0); // 0.0`                           |
| `Math.atan(x)`             | Devuelve el arcotangente de `x`.                      | `Math.atan(1.0); // 0.7853981633974483`            |
| `Math.atan2(y, x)`         | Devuelve el arcotangente de `y/x`, considerando los signos de ambos para determinar el cuadrante. | `Math.atan2(1.0, 1.0); // 0.7853981633974483` |
| `Math.log10(x)`            | Devuelve el logaritmo en base 10 de `x`.              | `Math.log10(100); // 2.0`                          |
| `Math.sinh(x)`             | Devuelve el seno hiperbólico de `x`.                  | `Math.sinh(1.0); // 1.1752011936438014`            |
| `Math.cosh(x)`             | Devuelve el coseno hiperbólico de `x`.                | `Math.cosh(1.0); // 1.5430806348152437`            |
| `Math.tanh(x)`             | Devuelve la tangente hiperbólica de `x`.              | `Math.tanh(1.0); // 0.7615941559557649`            |

## ➕ **Ejercicios de Integración**

### Ejercicio 1: Calculadora de Figuras Geométricas
Crea un programa en Java que permita al usuario calcular el área de un círculo y el área de un rectángulo. El programa debe pedir los datos necesarios al usuario y usar la clase `Math` para realizar los cálculos.

- Si el usuario ingresa un valor negativo, muestra un mensaje de error utilizando `Math.abs()` para convertir el valor a positivo.
- Calcula el área del círculo utilizando `Math.PI` y `Math.pow()`.
- Calcula el área del rectángulo utilizando `Math.max()` y `Math.min()` para determinar el largo y el ancho.

**Ejemplo de entrada/salida:**

- Entrada: `Radio del círculo = -7`, `Base del rectángulo = 5`, `Altura del rectángulo = 8`
- Salida:
  - Área del círculo: 153.93804002589985
  - Área del rectángulo: 40

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class CalculadoraFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Área del círculo
            System.out.print("Ingrese el radio del círculo: ");
            double radio = Math.abs(Double.parseDouble(scanner.nextLine()));
            double areaCirculo = Math.PI * Math.pow(radio, 2);
            System.out.println("Área del círculo: " + areaCirculo);

            // Área del rectángulo
            System.out.print("Ingrese la base del rectángulo: ");
            double base = Math.abs(Double.parseDouble(scanner.nextLine()));
            System.out.print("Ingrese la altura del rectángulo: ");
            double altura = Math.abs(Double.parseDouble(scanner.nextLine()));
            double areaRectangulo = Math.max(base, altura) * Math.min(base, altura);
            System.out.println("Área del rectángulo: " + areaRectangulo);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor ingrese un número.");
        } finally {
            scanner.close();
            System.out.println("Recurso 'scanner' cerrado.");
        }
    }
}
```
</details>

### Ejercicio 2: Calculadora de Potencias y Raíces
Crea un programa que permita al usuario calcular una potencia y una raíz cuadrada. El programa debe solicitar al usuario una base y un exponente para la potencia, y un número para la raíz cuadrada.

- Utiliza `Math.pow()` para calcular la potencia.
- Utiliza `Math.sqrt()` para calcular la raíz cuadrada.
- Si el usuario ingresa un valor negativo para la raíz cuadrada, muestra un mensaje de error.

**Ejemplo de entrada/salida:**

- Entrada: `Base = 4`, `Exponente = 3`, `Número para raíz = -9`
- Salida:
  - Potencia: 64.0
  - Error: No se puede calcular la raíz cuadrada de un número negativo.

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class CalculadoraPotenciasRaices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Potencia
            System.out.print("Ingrese la base: ");
            double base = Double.parseDouble(scanner.nextLine());
            System.out.print("Ingrese el exponente: ");
            double exponente = Double.parseDouble(scanner.nextLine());
            double resultadoPotencia = Math.pow(base, exponente);
            System.out.println("Potencia: " + resultadoPotencia);

            // Raíz cuadrada
            System.out.print("Ingrese un número para calcular la raíz cuadrada: ");
            double numero = Double.parseDouble(scanner.nextLine());
            if (numero < 0) {
                System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            } else {
                double resultadoRaiz = Math.sqrt(numero);
                System.out.println("Raíz cuadrada: " + resultadoRaiz);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor ingrese un número.");
        } finally {
            scanner.close();
            System.out.println("Recurso 'scanner' cerrado.");
        }
    }
}
```
</details>

### Ejercicio 3: Generador de Números Aleatorios y Redondeo
Crea un programa que genere un número aleatorio y luego permita al usuario redondearlo hacia arriba o hacia abajo.

- Utiliza `Math.random()` para generar el número aleatorio.
- Utiliza `Math.ceil()` y `Math.floor()` para redondear el número según la elección del usuario.
- Muestra un mensaje de error si el usuario ingresa una opción no válida.

**Ejemplo de entrada/salida:**

- Entrada: `Opción de redondeo = arriba`
- Salida:
  - Número generado: 3.4567
  - Redondeado hacia arriba: 4.0

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class GeneradorAleatorioRedondeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Generar número aleatorio
            double numeroAleatorio = Math.random() * 10; // Número entre 0 y 10
            System.out.println("Número generado: " + numeroAleatorio);

            // Redondeo
            System.out.print("Ingrese 'arriba' para redondear hacia arriba o 'abajo' para redondear hacia abajo: ");
            String opcion = scanner.nextLine().toLowerCase();

            switch (opcion) {
                case "arriba":
                    System.out.println("Redondeado hacia arriba: " + Math.ceil(numeroAleatorio));
                    break;
                case "abajo":
                    System.out.println("Redondeado hacia abajo: " + Math.floor(numeroAleatorio));
                    break;
                default:
                    System.out.println("Error: Opción no válida. Ingrese 'arriba' o 'abajo'.");
            }
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida.");
        } finally {
            scanner.close();
            System.out.println("Recurso 'scanner' cerrado.");
        }
    }
}
```
</details>

## ➕ **Ejercicio 4: Generador de Números Aleatorios en un Rango**

Crea un programa que permita al usuario generar un número aleatorio entre un límite inferior y un límite superior ingresados por el usuario. El programa debe realizar las siguientes acciones:

- Solicitar al usuario el límite inferior y el límite superior del rango.
- Validar que el límite superior sea mayor que el límite inferior.
- Generar y mostrar un número aleatorio dentro del rango proporcionado.
- Utilizar `try-catch-finally` para manejar entradas no válidas y asegurarse de cerrar los recursos apropiadamente.

**Ejemplo de entrada/salida:**

- Entrada: `Límite inferior = 5`, `Límite superior = 15`
- Salida: `Número aleatorio generado: 9`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class GenerarNumerosEnRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario los límites superior e inferior
            System.out.print("Ingrese el límite inferior: ");
            int limiteInferior = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el límite superior: ");
            int limiteSuperior = Integer.parseInt(scanner.nextLine());

            // Validar que el límite superior sea mayor que el límite inferior
            if (limiteSuperior <= limiteInferior) {
                System.out.println("Error: El límite superior debe ser mayor que el límite inferior.");
            } else {
                // Generar un número aleatorio dentro del rango especificado
                int numeroAleatorio = limiteInferior + (int) (Math.random() * ((limiteSuperior - limiteInferior) + 1));
                System.out.println("Número aleatorio generado: " + numeroAleatorio);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Por favor ingrese un número entero.");
        } finally {
            scanner.close();
            System.out.println("Recurso 'scanner' cerrado.");
        }
    }
}
```
</details>

## ➕ **Conclusión**
La clase `Math` en Java nos ofrece una gran variedad de métodos útiles para realizar operaciones matemáticas de forma rápida y sencilla. Hemos visto los métodos más utilizados, cómo emplearlos, y cómo integrarlos en un programa más grande. Practica y usa estos métodos para optimizar tus códigos y hacerlos más eficientes. 💡

¡Ahora es tu turno de crear más programas usando `Math`! 😊

