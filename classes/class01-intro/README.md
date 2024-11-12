# ☕ **Introducción a Java y sus Tipos de Variables**

## 🌍 **Ejemplo Básico: "Hello World"**

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");  // Muestra "Hello, World!" en la consola
    }
}
```

<details> <summary>👀 Ver salida</summary>

La salida de este código es:

```plaintext
Hello, World!
```

</details>

## 📚 **Conceptos Básicos de Java**

### 🏛️ **`public class`**

Una clase en Java es una plantilla que define las propiedades y comportamientos de un objeto. Al declarar `public class`, estamos creando una clase que puede ser accesible desde cualquier otra parte del programa.

**Ejemplo:**

```java
public class MiPrimeraClase {
    // Código de la clase
}
```

**📝 ¿Cuándo usarlo?**

- Se usa para definir el comportamiento de un objeto.
- Agrupa variables y métodos para dar una funcionalidad específica.

### 🚀 **`public static void main`**

Este es el punto de entrada principal de cualquier aplicación Java. Es el método que la máquina virtual de Java (JVM) busca para iniciar la ejecución del programa.

**🔍 Desglose:**

- **`public`**: Accesible desde cualquier parte del código.
- **`static`**: Pertenece a la clase en lugar de a una instancia de la clase.
- **`void`**: No devuelve ningún valor.
- **`main`**: Es el nombre del método principal que se ejecuta.

**Ejemplo:**

```java
public static void main(String[] args) {
    // Código que se ejecuta al iniciar el programa
}
```

### 🗂️ **`String[] args`**

`String[] args` es el parámetro que recibe el método `main`. Representa una lista (o array) de cadenas de texto que se pueden pasar como argumentos al ejecutar el programa desde la línea de comandos.

**Ejemplo de uso:**

```java
public static void main(String[] args) {
    System.out.println("Número de argumentos: " + args.length);
}
```

## 💻 **Ejercicio Práctico**

Crea una clase llamada `Saludo` que muestre en pantalla el mensaje: "¡Bienvenido al mundo de Java!". Usa el método `main` como punto de entrada.

<details> <summary>👨‍💻 Ver solución</summary>

```java
public class Saludo {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido al mundo de Java!");
    }
}
```

</details>

## 🔢 **Tipos de Datos en Java**

Los tipos de datos en Java definen el tipo de valor que pueden almacenar las variables y determinan las operaciones que se pueden realizar con ellas. A continuación, se presentan los tipos de datos básicos en Java, sus características y cuándo utilizarlos.

### 🔄 **1. Tipo Booleano**

El tipo `boolean` almacena solo dos valores posibles: `true` o `false`. Es útil para controlar el flujo de ejecución de un programa, condiciones de decisión y expresiones lógicas.

```java
boolean esJavaInteresante = true;  // Representa si se considera Java interesante
```

**🤔 ¿Cuándo usar?**
Utiliza variables booleanas cuando necesites manejar estados, condiciones o expresiones lógicas, como en estructuras de control (`if-else`) o ciclos (`while`, `for`).

### 🔤 **2. Tipo de Carácter**

El tipo `char` almacena un solo carácter y se representa con comillas simples. Es útil para representar letras, números individuales o símbolos.

```java
char inicial = 'A';  // Almacena una sola letra
```

**✍️ ¿Cuándo usar?**
Utiliza variables de tipo `char` cuando necesites manipular caracteres individuales, como letras iniciales, dígitos individuales o símbolos específicos.

### 📝 **3. Tipo String**

El tipo `String` se utiliza para almacenar secuencias de caracteres, como palabras y frases. A diferencia de `char`, un `String` puede contener múltiples caracteres y se representa con comillas dobles.

```java
String saludo = "Hola, Java!";  // Almacena una cadena de texto
```

**💡 ¿Cuándo usar?**
Utiliza variables `String` para almacenar texto, como nombres, direcciones o cualquier secuencia de caracteres que necesites manipular o mostrar en pantalla.

### 🔢 **4. Tipos Enteros**

Los tipos enteros en Java almacenan números sin decimales y se dividen en diferentes categorías según el tamaño y el rango que pueden abarcar. Se utilizan en operaciones matemáticas básicas, contadores y cuando no se necesita precisión decimal.

| Tipo    | Tamaño  | Rango            | Ejemplo de Declaración           |
| ------- | ------- | ---------------- | -------------------------------- |
| `byte`  | 8 bits  | -128 a 127       | `byte edad = 25;`                |
| `short` | 16 bits | -32,768 a 32,767 | `short altura = 170;`            |
| `int`   | 32 bits | -2^31 a 2^31 - 1 | `int poblacion = 1000000;`       |
| `long`  | 64 bits | -2^63 a 2^63 - 1 | `long distancia = 15000000000L;` |

**📝 ¿Cuándo usar?**

- **`byte`**: Ideal para ahorrar memoria en sistemas con recursos limitados o al manipular datos pequeños, como edades o cantidades pequeñas.
- **`short`**: Recomendado para almacenar valores numéricos en aplicaciones de bajo nivel o cuando se optimiza memoria, como en gráficos y aplicaciones embebidas.
- **`int`**: El tipo entero más utilizado para operaciones generales, contadores y cálculos matemáticos.
- **`long`**: Útil cuando se manejan números grandes, como distancias astronómicas o cálculos financieros.

### 💰 **5. Tipos Decimales**

Los tipos decimales en Java permiten almacenar números con decimales. Se utilizan cuando se requiere manejar datos numéricos con precisión, como cálculos financieros y científicos.

| Tipo     | Tamaño  | Rango                | Ejemplo de Declaración     |
| -------- | ------- | -------------------- | -------------------------- |
| `float`  | 32 bits | ±1.4E-45 a ±3.4E38   | `float pi = 3.14f;`        |
| `double` | 64 bits | ±4.9E-324 a ±1.7E308 | `double e = 2.7182818284;` |

**📝 ¿Cuándo usar?**

- **`float`**: Útil para gráficos y cuando no se requiere alta precisión. Se usa generalmente en sistemas embebidos o cuando el rendimiento es más importante que la precisión.
- **`double`**: Recomendado para cálculos científicos y financieros donde la precisión es esencial. Es el tipo decimal más utilizado en aplicaciones que requieren cálculos detallados.

## 🤖 **Ejercicio Práctico**

Desarrolla una aplicación simple que almacene y muestre información básica de un empleado. El código debe incluir los siguientes datos: nombre, edad, salario, estado de empleado activo/inactivo y un identificador único.

<details>
  <summary>👨‍💻 Ver solución</summary>

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

</details>

<details>
    <summary>👀 Ver salida</summary>

La salida de este código es:

```
Información del Empleado:
Nombre: Carlos Pérez
Edad: 35
Salario: $8500.75
Activo: true
Código: 123456789
```

</details>

# 🖥️ **Tips para Programar en Java con VS Code**

<details onclick="toggleAccordion(this)">
<summary><strong>💡 1. Atajos de Teclado Básicos</strong></summary>

- **`psvm` + `Tab`**: Crea la función `public static void main(String[] args)`.
- **`sout` + `Tab`**: Crea una línea de impresión `System.out.println()`.
- **`Ctrl` + `Shift` + `B`**: Compila el proyecto actual.

</details>

<details onclick="toggleAccordion(this)">
<summary><strong>✏️ 2. Atajos de Edición</strong></summary>

- **`Shift` + `Alt` + `Down Arrow`**: Duplica la línea o selección actual hacia abajo.
- **`Shift` + `Alt` + `Up Arrow`**: Duplica la línea o selección actual hacia arriba.
- **`Alt` + `Up Arrow` o `Down Arrow`**: Mueve la línea o selección actual hacia arriba o abajo.
- **`Ctrl` + `D`**: Selecciona la siguiente instancia de la palabra seleccionada.

</details>

<details onclick="toggleAccordion(this)">
<summary><strong>🐞 3. Depuración y Ejecución</strong></summary>

- **`F5`**: Inicia el modo de depuración.
- **`Ctrl` + `F5`**: Ejecuta el código sin depuración.
- **`F12`**: Ve a la definición de la función, clase o variable.
- **`Ctrl` + `Shift` + `M`**: Abre el panel de problemas (muestra errores y advertencias).

</details>

<details onclick="toggleAccordion(this)">
<summary><strong>🛠️ 4. Organización y Formato</strong></summary>

- **`Ctrl` + `Shift` + `O`**: Organiza e importa las librerías necesarias para el archivo actual.
- **`Ctrl` + `Shift` + `F`**: Formatea todo el archivo de código.
- **`Ctrl` + `K` + `F`**: Formatea la selección.

</details>

<details onclick="toggleAccordion(this)">
<summary><strong>🚀 5. Navegación Rápida</strong></summary>

- **`Ctrl` + `Shift` + `P`**: Abre la paleta de comandos para ejecutar cualquier comando de VS Code.
- **`F12`**: Ve a la definición de la función, clase o variable.
- **`Ctrl` + `Shift` + `R`**: Renombra la variable, función o clase seleccionada.
- **`Ctrl` + `Z`**: Deshace la última acción.
- **`Ctrl` + `Y`**: Rehace la última acción.

</details>