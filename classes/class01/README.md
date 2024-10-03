# Introducción a Java y sus Tipos de Variables

## ¿Qué es Java?

Java es un lenguaje de programación de propósito general, concurrente, basado en clases y orientado a objetos. Fue desarrollado por Sun Microsystems en 1995 y su característica principal es que es independiente de la plataforma, permitiendo que los programas escritos en Java se ejecuten en cualquier sistema operativo que cuente con una Máquina Virtual de Java (JVM).

Se utiliza en una amplia gama de aplicaciones, desde desarrollo web y aplicaciones móviles (principalmente en Android) hasta aplicaciones de escritorio y sistemas empresariales complejos. Java es conocido por su robustez, seguridad y capacidad para manejar grandes volúmenes de datos, siendo una opción popular en el ámbito empresarial.

Una de las filosofías de Java es "Write Once, Run Anywhere" (WORA), que significa que el código Java puede ejecutarse en cualquier plataforma que tenga instalada la JVM sin necesidad de modificar el código fuente. Esto garantiza portabilidad y eficiencia en el desarrollo de aplicaciones multiplataforma.

**Ejemplo básico: "Hello World"**

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");  // Muestra "Hello, World!" en la consola
    }
}
```

## Tipos de Datos en Java

Los tipos de datos en Java definen el tipo de valor que pueden almacenar las variables y determinan las operaciones que se pueden realizar con ellas. A continuación, se presentan los tipos de datos básicos en Java, sus características y cuándo utilizarlos.

### 1. Tipo Booleano

El tipo `boolean` almacena solo dos valores posibles: `true` o `false`. Es útil para controlar el flujo de ejecución de un programa, condiciones de decisión y expresiones lógicas.

```java
boolean esJavaInteresante = true;  // Representa si se considera Java interesante
```

**¿Cuándo usar?**
Utiliza variables booleanas cuando necesites manejar estados, condiciones o expresiones lógicas, como en estructuras de control (`if-else`) o ciclos (`while`, `for`).

### 2. Tipo de Carácter

El tipo `char` almacena un solo carácter y se representa con comillas simples. Es útil para representar letras, números individuales o símbolos.

```java
char inicial = 'A';  // Almacena una sola letra
```

**¿Cuándo usar?**
Utiliza variables de tipo `char` cuando necesites manipular caracteres individuales, como letras iniciales, dígitos individuales o símbolos específicos.

### 3. Tipo String

El tipo `String` se utiliza para almacenar secuencias de caracteres, como palabras y frases. A diferencia de `char`, un `String` puede contener múltiples caracteres y se representa con comillas dobles.

```java
String saludo = "Hola, Java!";  // Almacena una cadena de texto
```

**¿Cuándo usar?**
Utiliza variables `String` para almacenar texto, como nombres, direcciones o cualquier secuencia de caracteres que necesites manipular o mostrar en pantalla.

### 4. Tipos Enteros

Los tipos enteros en Java almacenan números sin decimales y se dividen en diferentes categorías según el tamaño y el rango que pueden abarcar. Se utilizan en operaciones matemáticas básicas, contadores y cuando no se necesita precisión decimal.

| Tipo    | Tamaño  | Rango            | Ejemplo de Declaración           |
| ------- | ------- | ---------------- | -------------------------------- |
| `byte`  | 8 bits  | -128 a 127       | `byte edad = 25;`                |
| `short` | 16 bits | -32,768 a 32,767 | `short altura = 170;`            |
| `int`   | 32 bits | -2^31 a 2^31 - 1 | `int poblacion = 1000000;`       |
| `long`  | 64 bits | -2^63 a 2^63 - 1 | `long distancia = 15000000000L;` |

**¿Cuándo usar?**

- `byte`: Ideal para ahorrar memoria en sistemas con recursos limitados o al manipular datos pequeños, como edades o cantidades pequeñas.
- `short`: Recomendado para almacenar valores numéricos en aplicaciones de bajo nivel o cuando se optimiza memoria, como en gráficos y aplicaciones embebidas.
- `int`: El tipo entero más utilizado para operaciones generales, contadores y cálculos matemáticos.
- `long`: Útil cuando se manejan números grandes, como distancias astronómicas o cálculos financieros.

### 5. Tipos Decimales

Los tipos decimales en Java permiten almacenar números con decimales. Se utilizan cuando se requiere manejar datos numéricos con precisión, como cálculos financieros y científicos.

| Tipo     | Tamaño  | Rango                | Ejemplo de Declaración     |
| -------- | ------- | -------------------- | -------------------------- |
| `float`  | 32 bits | ±1.4E-45 a ±3.4E38   | `float pi = 3.14f;`        |
| `double` | 64 bits | ±4.9E-324 a ±1.7E308 | `double e = 2.7182818284;` |

**¿Cuándo usar?**

- `float`: Útil para gráficos y cuando no se requiere alta precisión. Se usa generalmente en sistemas embebidos o cuando el rendimiento es más importante que la precisión.
- `double`: Recomendado para cálculos científicos y financieros donde la precisión es esencial. Es el tipo decimal más utilizado en aplicaciones que requieren cálculos detallados.

## Ejercicio Práctico

Desarrolla una aplicación simple que almacene y muestre información básica de un empleado. El código debe incluir los siguientes datos: nombre, edad, salario, estado de empleado activo/inactivo y un identificador único.

```java
public class Empresa {
    public static void main(String[] args) {
        String nombreEmpleado = "Carlos Pérez";
        int edadEmpleado = 35;
        double salarioEmpleado = 8500.75;
        boolean esActivo = true;
        long codigoEmpleado = 123456789L;

        System.out.println("Información del Empleado:");
        System.out.println("Nombre: " + nombreEmpleado);
        System.out.println("Edad: " + edadEmpleado);
        System.out.println("Salario: $" + salarioEmpleado);
        System.out.println("Activo: " + esActivo);
        System.out.println("Código: " + codigoEmpleado);
    }
}
```
