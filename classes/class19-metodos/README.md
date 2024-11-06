# 🚀 **Métodos en Java**

## 🔍 **¿Qué son los métodos?**

Los métodos en Java (también conocidos como funciones en otros lenguajes de programación) son bloques de código reutilizables que realizan una tarea específica. Un método es una secuencia de instrucciones que se ejecuta cuando es llamado o invocado. Sirven para dividir un programa en partes más pequeñas y manejables, facilitando la organización y reutilización del código.

Por ejemplo, si necesitas realizar una operación varias veces en diferentes partes de tu programa, en lugar de escribir el mismo código varias veces, puedes encapsularlo dentro de un método y llamarlo cuando sea necesario. Esto permite mantener el código limpio, estructurado y más fácil de mantener.

```java
public class EjemploMetodo {
    public static void main(String[] args) {
        saludar(); // Llamada al método saludar
    }

    public static void saludar() {
        System.out.println("¡Hola, bienvenido!");
    }
}
```

En el ejemplo anterior, `saludar()` es un método que imprime un mensaje en la consola. En el `main()`, se invoca el método `saludar()` para ejecutar su contenido.

---

## 🧩 **¿Para qué sirven los métodos y por qué son importantes?**

Los métodos permiten simplificar el desarrollo y la comprensión del código, además de promover la reutilización. En programación, muchas veces se necesitan realizar las mismas tareas en diferentes lugares del programa. Escribir un método que encapsule esa funcionalidad permite evitar duplicar código, mejorando la legibilidad y disminuyendo las probabilidades de error.

Algunos de los beneficios de usar métodos son:

- **Reutilización**: Un método puede ser llamado muchas veces, evitando escribir el mismo código en distintos lugares.
- **Mantenimiento**: Modificar la lógica de una tarea es más fácil cuando esa lógica está encapsulada en un solo lugar.
- **Legibilidad**: Dividir un programa en métodos ayuda a que sea más legible, facilitando la comprensión de la lógica del programa.
- **Abstracción**: Ocultan los detalles de implementación y permiten centrarse en la funcionalidad principal.

---

## 💡 **Declaración de Métodos en Java**

### 📋 **Estructura Básica de un Método**

```java
public static int sumar(int a, int b) {
    return a + b;
}
```

Vamos a desglosar esta declaración:

- **Modificador de acceso (`public`)**: Define la visibilidad del método. Puede ser `public`, `private`, `protected` o sin especificar (conocido como _default_ o _package-private_).
- **Modificador de invocación (`static`)**: Indica si el método pertenece a la clase (`static`) o a una instancia de la clase. Los métodos `static` pueden ser llamados sin crear un objeto de la clase.
- **Tipo de retorno (`int`)**: Especifica el tipo de dato que devolverá el método. Si no devuelve nada, se usa `void`.
- **Nombre del método (`sumar`)**: Debe describir claramente la acción que realiza el método. Usar verbos para los nombres es una buena práctica, ya que los métodos generalmente representan acciones.
- **Parámetros (`int a, int b`)**: Datos que el método necesita para realizar su tarea. Los parámetros van dentro de paréntesis.
- **Cuerpo del método**: El código dentro de las llaves `{}` que define lo que hace el método.

---

## 🔓 **Modificadores de Acceso**

Los **modificadores de acceso** determinan quién puede acceder al método:

- **public**: Cualquier clase puede acceder al método.
- **private**: Solo la misma clase puede acceder al método.
- **protected**: Las clases del mismo paquete y las subclases pueden acceder al método.
- **default** (sin palabra clave): Solo las clases del mismo paquete pueden acceder al método.

Además de los modificadores de acceso, existen otros modificadores importantes:

- **static**: El método pertenece a la clase y no a instancias de la clase.
- **final**: El método no puede ser sobrescrito por subclases.
- **abstract**: El método no tiene implementación y debe ser implementado por las subclases.
- **synchronized**: Permite que solo un hilo a la vez pueda ejecutar el método, útil en programación concurrente.

---

## 🔄 **Tipos de Retorno**

### **Métodos con Retorno**

Devuelven un valor que puede ser utilizado en el lugar donde el método es llamado. El tipo de retorno puede ser cualquier tipo de dato, como `int`, `String`, etc.

```java
public static int multiplicar(int x, int y) {
    return x * y;
}
```

### **Métodos sin Retorno (`void`)**

No devuelven ningún valor.

```java
public static void imprimirMensaje() {
    System.out.println("Este es un mensaje.");
}
```

### **Ejemplo Completo**

```java
public class Operaciones {
    public static void main(String[] args) {
        int resultadoSuma = sumar(5, 7); // Llamada al método sumar
        imprimirResultado(resultadoSuma); // Llamada al método imprimirResultado
    }

    // Método que realiza una suma
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método que imprime un resultado
    public static void imprimirResultado(int resultado) {
        System.out.println("El resultado es: " + resultado);
    }
}
```

En este ejemplo, el método `sumar()` devuelve un valor que luego es pasado como argumento al método `imprimirResultado()`. Esto muestra cómo los métodos pueden trabajar juntos para realizar una tarea más compleja.

---

## ✏️ **Nombres de Métodos y Buenas Prácticas**

- Los nombres de los métodos deben ser **verbos** que describan claramente la acción que realizan, como `sumar()`, `calcularPromedio()`, `mostrarResultado()`, etc.
- Utiliza **camelCase**, es decir, la primera palabra en minúsculas y cada palabra adicional con la primera letra en mayúsculas, por ejemplo: `calcularAreaRectangulo()`.
- Los nombres deben ser **significativos** para mejorar la legibilidad del código.

---

## 🔄 **Parámetros de los Métodos**

Los **parámetros** son los valores que se pasan a un método cuando se llama. Los valores que se envían al método se llaman **argumentos**. En el siguiente ejemplo, `a` y `b` son parámetros y `5, 10` son argumentos.

```java
public static int sumar(int a, int b) {
    return a + b;
}

public static void main(String[] args) {
    int resultado = sumar(5, 10); // 5 y 10 son argumentos
    System.out.println("Resultado: " + resultado);
}
```

### **Tabla Comparativa: Parámetros vs Argumentos**

| Concepto       | Parámetro                                                                        | Argumento                                                                 |
| -------------- | -------------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| **Definición** | Es la variable que se define en la firma del método para recibir un valor.       | Es el valor que se pasa al método cuando se llama.                        |
| **Lugar**      | Se encuentran en la definición del método.                                       | Se encuentran en la llamada al método.                                    |
| **Ejemplo**    | `public static int sumar(int a, int b)` - `a` y `b` son parámetros.              | `sumar(5, 10)` - `5` y `10` son argumentos.                               |
| **Función**    | Actúan como receptores de los valores de entrada para que el método los utilice. | Son los valores reales que se envían al método para que realice su tarea. |

---

## ➕ **Sobrecarga de Métodos**

### **¿Qué es la Sobrecarga de Métodos?**

La **sobrecarga de métodos** permite definir múltiples métodos con el mismo nombre pero con diferentes parámetros (tipo o cantidad). Esto es útil para manejar diferentes escenarios sin cambiar el nombre del método.

```java
public static int sumar(int a, int b) {
    return a + b;
}

public static double sumar(double a, double b) {
    return a + b;
}
````

En este ejemplo, existen dos métodos `sumar()`, pero uno trabaja con `int` y el otro con `double`. El compilador decide cuál método llamar dependiendo de los tipos de argumentos pasados.

### **Ejemplo de Sobrecarga**

```java
public class Calculadora {
    // Sumar dos enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Sumar tres enteros
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sumar dos números de punto flotante
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Suma de 2 y 3: " + sumar(2, 3));
        System.out.println("Suma de 1, 2 y 3: " + sumar(1, 2, 3));
        System.out.println("Suma de 2.5 y 3.5: " + sumar(2.5, 3.5));
    }
}
```

En este ejemplo, la clase `Calculadora` tiene tres métodos `sumar()` sobrecargados con diferentes firmas. Esto permite al programador realizar sumas de dos enteros, tres enteros, o dos números de punto flotante, utilizando siempre el mismo nombre de método.

### **Importancia de la Sobrecarga**

- Permite flexibilidad al programador para utilizar el mismo método con diferentes tipos de datos o cantidades de argumentos.
- Hace el código más limpio y fácil de entender, ya que no necesitas crear métodos con nombres diferentes para realizar operaciones similares.
- Facilita la **abstracción**, permitiendo al usuario del método ignorar los detalles de implementación.

---

# 📚 **Ejercicios Prácticos sobre Métodos en Java**

Estos ejercicios te ayudarán a reforzar tus conocimientos sobre los métodos en Java, incluyendo la declaración, uso de parámetros y argumentos, sobrecarga de métodos y buenas prácticas. Asegúrate de intentar resolver cada uno de estos problemas para adquirir un dominio profundo del tema.

## 🚀 **Ejercicio 1: Calculadora Básica**

Crea una clase llamada `CalculadoraBasica` que contenga varios métodos para realizar las operaciones básicas de una calculadora: suma, resta, multiplicación y división.

- **Requisitos**:
  - El método de **suma** debe aceptar dos parámetros enteros y devolver el resultado de su suma.
  - El método de **resta** debe aceptar dos parámetros enteros y devolver el resultado de la resta.
  - El método de **multiplicación** debe aceptar dos parámetros de tipo `double` y devolver el resultado de la multiplicación.
  - El método de **división** debe aceptar dos parámetros de tipo `double` y devolver el cociente.
  - Si se intenta dividir entre cero, el método debe devolver un mensaje de error.

**Puntos a evaluar**:
- Implementar métodos con distintos tipos de retorno y parámetros.
- Manejo de errores en la operación de división.

<details> <summary>Ver Solución</summary>

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraBasica {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static String dividir(double a, double b) {
        if (b == 0) {
            return "Error: No se puede dividir entre cero.";
        }
        return String.valueOf(a / b);
    }

    public static void mostrarMenu() {
        System.out.println("\n---- Calculadora Básica ----");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static int pedirNumeroEntero(Scanner scanner, String mensaje) {
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número entero.");
                scanner.next(); // limpiar entrada inválida
            }
        }
        return numero;
    }

    public static double pedirNumeroDecimal(Scanner scanner, String mensaje) {
        double numero = 0.0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número decimal.");
                scanner.next(); // limpiar entrada inválida
            }
        }
        return numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {
                        int num1 = pedirNumeroEntero(scanner, "Ingrese el primer número entero: ");
                        int num2 = pedirNumeroEntero(scanner, "Ingrese el segundo número entero: ");
                        System.out.println("Resultado de la suma: " + sumar(num1, num2));
                    }
                    case 2 -> {
                        int num1 = pedirNumeroEntero(scanner, "Ingrese el primer número entero: ");
                        int num2 = pedirNumeroEntero(scanner, "Ingrese el segundo número entero: ");
                        System.out.println("Resultado de la resta: " + restar(num1, num2));
                    }
                    case 3 -> {
                        double num1 = pedirNumeroDecimal(scanner, "Ingrese el primer número (decimal permitido): ");
                        double num2 = pedirNumeroDecimal(scanner, "Ingrese el segundo número (decimal permitido): ");
                        System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
                    }
                    case 4 -> {
                        double num1 = pedirNumeroDecimal(scanner, "Ingrese el primer número (decimal permitido): ");
                        double num2 = pedirNumeroDecimal(scanner, "Ingrese el segundo número (decimal permitido): ");
                        System.out.println("Resultado de la división: " + dividir(num1, num2));
                    }
                    case 5 -> {
                        System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                        continuar = false;
                    }
                    default -> System.out.println("Opción no válida, por favor intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número.");
                scanner.next(); // limpiar entrada inválida
            }
        }
        scanner.close();
    }
}
```

</details>

---

## 📈 **Ejercicio 2: Cálculo del Área y Perímetro de Figuras Geométricas**

Crea una clase llamada `Geometria` que contenga métodos para calcular el área y el perímetro de diferentes figuras geométricas (cuadrado, rectángulo, círculo).

- **Requisitos**:
  - Crea un método para calcular el **área de un cuadrado** que acepte un parámetro `lado` de tipo `double`.
  - Crea un método para calcular el **perímetro de un rectángulo** que acepte dos parámetros: `base` y `altura` de tipo `double`.
  - Crea un método para calcular el **área de un círculo** que acepte un parámetro `radio` de tipo `double` y use la constante `Math.PI`.

**Puntos a evaluar**:
- Uso de parámetros para proporcionar valores a los métodos.
- Aplicar correctamente fórmulas geométricas.

<details> <summary>Ver Solución</summary>

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Geometria {

    // Método para calcular el área de un cuadrado
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    // Método para calcular el perímetro de un rectángulo
    public static double perimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    // Método para calcular el área de un círculo
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Método para mostrar el menú de opciones
    public static void mostrarMenu() {
        System.out.println("\n---- Cálculo de Área y Perímetro ----");
        System.out.println("1. Calcular área de un cuadrado");
        System.out.println("2. Calcular perímetro de un rectángulo");
        System.out.println("3. Calcular área de un círculo");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Método para solicitar un número al usuario con validación
    public static double pedirNumero(Scanner scanner, String mensaje) {
        double numero = 0.0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número.");
                scanner.next(); // limpiar entrada inválida
            }
        }
        return numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {
                        double lado = pedirNumero(scanner, "Ingrese el valor del lado del cuadrado: ");
                        System.out.println("Área del cuadrado: " + areaCuadrado(lado));
                    }
                    case 2 -> {
                        double base = pedirNumero(scanner, "Ingrese el valor de la base del rectángulo: ");
                        double altura = pedirNumero(scanner, "Ingrese el valor de la altura del rectángulo: ");
                        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo(base, altura));
                    }
                    case 3 -> {
                        double radio = pedirNumero(scanner, "Ingrese el valor del radio del círculo: ");
                        System.out.println("Área del círculo: " + areaCirculo(radio));
                    }
                    case 4 -> {
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        continuar = false;
                    }
                    default -> System.out.println("Opción no válida, por favor intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número.");
                scanner.next(); // limpiar entrada inválida
            }
        }
        scanner.close();
    }
}
```

</details>

---

## 🔄 **Ejercicio 3: Sobrecarga de Métodos - Operaciones Matemáticas**

Crea una clase llamada `OperacionesAvanzadas` que contenga varios métodos `sumar()`, `restar()` y `multiplicar()`, pero utilizando la sobrecarga de métodos.

- **Requisitos**:
  - Implementa un método `sumar()` que acepte dos parámetros enteros.
  - Sobrecarga el método `sumar()` para que también acepte tres parámetros enteros.
  - Implementa un método `restar()` que acepte dos parámetros de tipo `double`.
  - Sobrecarga el método `restar()` para aceptar dos parámetros enteros.
  - Implementa un método `multiplicar()` que acepte dos parámetros `float` y otro que acepte tres parámetros `float`.

**Puntos a evaluar**:
- Uso adecuado de la sobrecarga de métodos.
- Flexibilidad en los tipos y cantidades de argumentos.

<details> <summary>Ver Solución</summary>

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacionesAvanzadas {

    // Método sumar que acepta dos parámetros enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga del método sumar que acepta tres parámetros enteros
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método restar que acepta dos parámetros de tipo double
    public static double restar(double a, double b) {
        return a - b;
    }

    // Sobrecarga del método restar que acepta dos parámetros enteros
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método multiplicar que acepta dos parámetros float
    public static float multiplicar(float a, float b) {
        return a * b;
    }

    // Sobrecarga del método multiplicar que acepta tres parámetros float
    public static float multiplicar(float a, float b, float c) {
        return a * b * c;
    }

    // Método para mostrar el menú de opciones
    public static void mostrarMenu() {
        System.out.println("\n---- Operaciones Avanzadas ----");
        System.out.println("1. Sumar dos números enteros");
        System.out.println("2. Sumar tres números enteros");
        System.out.println("3. Restar dos números de tipo double");
        System.out.println("4. Restar dos números enteros");
        System.out.println("5. Multiplicar dos números de tipo float");
        System.out.println("6. Multiplicar tres números de tipo float");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Método para solicitar un número al usuario con validación
    public static int pedirEntero(Scanner scanner, String mensaje) {
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número entero.");
                scanner.next(); // limpiar entrada inválida
            }
        }
        return numero;
    }

    public static double pedirDouble(Scanner scanner, String mensaje) {
        double numero = 0.0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número de tipo double.");
                scanner.next(); // limpiar entrada inválida
            }
        }
        return numero;
    }

    public static float pedirFloat(Scanner scanner, String mensaje) {
        float numero = 0.0f;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextFloat();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número de tipo float.");
                scanner.next(); // limpiar entrada inválida
            }
        }
        return numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> {
                        int num1 = pedirEntero(scanner, "Ingrese el primer número entero: ");
                        int num2 = pedirEntero(scanner, "Ingrese el segundo número entero: ");
                        System.out.println("Resultado de la suma: " + sumar(num1, num2));
                    }
                    case 2 -> {
                        int num1 = pedirEntero(scanner, "Ingrese el primer número entero: ");
                        int num2 = pedirEntero(scanner, "Ingrese el segundo número entero: ");
                        int num3 = pedirEntero(scanner, "Ingrese el tercer número entero: ");
                        System.out.println("Resultado de la suma: " + sumar(num1, num2, num3));
                    }
                    case 3 -> {
                        double num1 = pedirDouble(scanner, "Ingrese el primer número de tipo double: ");
                        double num2 = pedirDouble(scanner, "Ingrese el segundo número de tipo double: ");
                        System.out.println("Resultado de la resta: " + restar(num1, num2));
                    }
                    case 4 -> {
                        int num1 = pedirEntero(scanner, "Ingrese el primer número entero: ");
                        int num2 = pedirEntero(scanner, "Ingrese el segundo número entero: ");
                        System.out.println("Resultado de la resta: " + restar(num1, num2));
                    }
                    case 5 -> {
                        float num1 = pedirFloat(scanner, "Ingrese el primer número de tipo float: ");
                        float num2 = pedirFloat(scanner, "Ingrese el segundo número de tipo float: ");
                        System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
                    }
                    case 6 -> {
                        float num1 = pedirFloat(scanner, "Ingrese el primer número de tipo float: ");
                        float num2 = pedirFloat(scanner, "Ingrese el segundo número de tipo float: ");
                        float num3 = pedirFloat(scanner, "Ingrese el tercer número de tipo float: ");
                        System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2, num3));
                    }
                    case 7 -> {
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        continuar = false;
                    }
                    default -> System.out.println("Opción no válida, por favor intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor ingrese un número.");
                scanner.next(); // limpiar entrada inválida
            }
        }
        scanner.close();
    }
}

```

</details>

---

Estos ejercicios abarcan conceptos fundamentales de métodos en Java y te desafían a poner en práctica lo aprendido, promoviendo un aprendizaje significativo y profundo. ¡Asegúrate de intentar cada uno de estos retos para fortalecer tus habilidades de programación! 💪✨
