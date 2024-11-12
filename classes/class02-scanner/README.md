# 🖥️ **Clase Scanner**

## ✨ **Métodos de Entrada de Datos con la Clase `Scanner`**

### 1. 📌 **Introducción a `Scanner`**

La clase `Scanner` es una herramienta en Java que nos permite capturar datos ingresados por el usuario a través de la consola. 🧑‍💻 Se utiliza principalmente para leer diferentes tipos de datos como texto, números enteros y números decimales. ¡Es súper útil para hacer nuestros programas interactivos! 🚀

### 2. 📦 **Importación de `Scanner`**

Para utilizar la clase `Scanner` en nuestro programa, primero debemos importarla. Esto se logra con la siguiente línea de código al inicio del archivo:

```java
import java.util.Scanner;
```

La importación es necesaria porque `Scanner` pertenece a la librería `java.util` y no está disponible por defecto. 🛠️

### 3. ⚙️ **Creación de un Objeto `Scanner`**

Después de importar `Scanner`, debemos crear un objeto de esta clase para poder leer la entrada del usuario. Utilizamos `System.in` para indicar que los datos provendrán de la consola:

```java
Scanner input = new Scanner(System.in);
```

Con esta línea, `input` se convierte en un objeto que nos permitirá leer datos que el usuario ingrese desde el teclado. ⌨️

### 4. 📋 **Métodos Básicos de Captura de Datos**

La clase `Scanner` nos proporciona varios métodos para capturar distintos tipos de datos ingresados por el usuario. A continuación, una tabla con los métodos más usados:

| Método          | Tipo de Dato   | Descripción                                         |
| --------------- | -------------- | --------------------------------------------------- |
| `nextLine()`    | Texto (String) | Captura una línea completa de texto ingresado.      |
| `nextInt()`     | Número Entero  | Captura un número entero ingresado por el usuario.  |
| `nextDouble()`  | Número Decimal | Captura un número decimal ingresado por el usuario. |
| `nextBoolean()` | Booleano       | Captura un valor `true` o `false` ingresado.        |

**Ejemplo de Uso:**

```java
System.out.print("Ingresa tu nombre: ");
String nombre = input.nextLine(); // Captura una línea de texto
```

### 5. 📝 **Ejemplo Completo**

El siguiente programa muestra cómo utilizar `Scanner` para capturar la entrada del usuario y cerrarlo al finalizar:

```java
import java.util.Scanner;

public class EjemploCloseScanner {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);

        // Capturar el nombre del usuario
        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine();

        // Mostrar el nombre capturado
        System.out.println("Hola, " + nombre + "!");

        // Cerrar el objeto Scanner
        input.close();
    }
}
```

🔒 **Conclusión**: Siempre utiliza `input.close()` para cerrar el `Scanner` y evitar el uso innecesario de recursos.

Al finalizar el uso de `Scanner`, es recomendable cerrarlo para liberar recursos del sistema. Se hace llamando al método `input.close()`:

```java
input.close();
```

Además, evita utilizar varios objetos `Scanner` para leer diferentes tipos de datos, ya que podría causar errores. Es mejor utilizar el mismo objeto para todas las entradas en un programa sencillo. ✅

### 6. ❓ **¿Por qué es importante usar `close()` en `Scanner`?**

El método `close()` se utiliza para liberar los recursos del sistema que ha ocupado el objeto `Scanner`. Cuando usamos `Scanner` para leer datos desde la consola o un archivo, se abren flujos de entrada que consumen memoria y recursos. 💡 Si no cerramos estos flujos al finalizar, pueden ocurrir fugas de memoria y errores en el programa.

### 7. 🎯 **Ejercicio Práctico**

Implementa un programa que capture el nombre, edad y estatura del usuario. Luego, muestra esta información en la consola con un formato amigable. 🤗

<details> <summary>🔍 Ver solución</summary>

```java
import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = input.nextInt();

        System.out.print("Ingresa tu estatura en metros (ej: 1.75): ");
        double estatura = input.nextDouble();

        System.out.println("Información del usuario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + " metros");

        input.close();
    }
}
```

</details>

# ➕ **Operadores**

## 1. 🧮 **Operadores Aritméticos Simples**

Los operadores aritméticos se utilizan para realizar operaciones matemáticas básicas. En Java, los operadores aritméticos más comunes son:

| Operador | Descripción    | Ejemplo | Resultado             |
| -------- | -------------- | ------- | --------------------- |
| `+`      | Suma           | `5 + 2` | `7`                   |
| `-`      | Resta          | `5 - 2` | `3`                   |
| `*`      | Multiplicación | `5 * 2` | `10`                  |
| `/`      | División       | `5 / 2` | `2` (división entera) |
| `%`      | Módulo (resto) | `5 % 2` | `1`                   |

## 2. 📥 **Operadores de Asignación**

Los operadores de asignación se utilizan para asignar valores a las variables. El operador más común es `=`. Sin embargo, existen otros que combinan operaciones aritméticas con asignación:

| Operador | Descripción                    | Ejemplo                           | Resultado                        |
| -------- | ------------------------------ | --------------------------------- | -------------------------------- |
| `=`      | Asigna un valor a una variable | `x = 5`                           | `x` ahora vale `5`               |
| `+=`     | Suma y asigna                  | `x += 3` (equivale a `x = x + 3`) | Si `x` es `5`, ahora `x` es `8`  |
| `-=`     | Resta y asigna                 | `x -= 2` (equivale a `x = x - 2`) | Si `x` es `8`, ahora `x` es `6`  |
| `*=`     | Multiplica y asigna            | `x *= 2` (equivale a `x = x * 2`) | Si `x` es `6`, ahora `x` es `12` |
| `/=`     | Divide y asigna                | `x /= 4` (equivale a `x = x / 4`) | Si `x` es `12`, ahora `x` es `3` |
| `%=`     | Calcula el módulo y asigna     | `x %= 2` (equivale a `x = x % 2`) | Si `x` es `3`, ahora `x` es `1`  |

## 3. ⚙️ **Operadores Binarios**

Los operadores binarios permiten manipular los bits individuales de un número. Aunque su uso es más avanzado, es importante conocerlos. Usaremos el formato `0b` para representar números binarios:

| Operador | Descripción                     | Ejemplo                | Resultado                                   |
| -------- | ------------------------------- | ---------------------- | ------------------------------------------- |
| `&`      | AND Binario (bit a bit)         | `0b0101 & 0b0011`      | `0b0001` (AND bit a bit)                    |
| `|`      | OR Binario (bit a bit)          | `0b0101 | 0b0011`      | `0b0101` (OR bit a bit)                     |
| `^`      | XOR Binario (bit a bit)         | `0b0101 ^ 0b0011`      | `0b0110` (XOR bit a bit)                    |
| `~`      | NOT Binario (inversión de bits) | `~0b0101`              | `0b1010` (inversión de bits)                |
| `<<`     | Desplazamiento a la izquierda   | `0b0101 << 1`          | `0b1010` (desplaza los bits a la izquierda) |
| `>>`     | Desplazamiento a la derecha     | `0b0101 >> 1`          | `0b0010` (desplaza los bits a la derecha)   |

## 4. 🖥️ **Ejemplo Completo de Uso de Operadores**

Crea un programa que muestre el uso de cada uno de los operadores anteriores en ejemplos básicos. Los resultados deben imprimirse en la consola para verificar el comportamiento de cada operador. 😊

<details> <summary>🔍 Ver código del ejemplo</summary>

```java
public class OperadoresJava {
    public static void main(String[] args) {
        // Operadores aritméticos
        int suma = 5 + 2;
        int resta = 5 - 2;
        int multiplicacion = 5 * 2;
        int division = 5 / 2;
        int modulo = 5 % 2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        // Operadores de asignación
        int x = 5;
        x += 3;
        System.out.println("x += 3: " + x);
        x -= 2;
        System.out.println("x -= 2: " + x);
        x *= 2;
        System.out.println("x *= 2: " + x);
        x /= 4;
        System.out.println("x /= 4: " + x);
        x %= 2;
        System.out.println("x %= 2: " + x);

        // Operadores binarios
        int a = 0b0101;
        int b = 0b0011;
        System.out.println("a & b: " + Integer.toBinaryString(a & b));
        System.out.println("a | b: " + Integer.toBinaryString(a | b));
        System.out.println("a ^ b: " + Integer.toBinaryString(a ^ b));
        System.out.println("~a: " + Integer.toBinaryString(~a));
        System.out.println("a << 1: " + Integer.toBinaryString(a << 1));
        System.out.println("a >> 1: " + Integer.toBinaryString(a >> 1));
    }
}
```

</details>

## 🎯 **Ejercicios de Uso Práctico con Operadores**

### 1. 📊 **Ejercicio: Cálculo de Promedio de Notas (Básico)**

Crea un programa que calcule el promedio de tres notas ingresadas por el usuario. Usa los operadores de suma y división. El programa debe pedir las tres notas, sumar estos valores y luego calcular el promedio (suma de las tres notas dividido entre 3). Muestra el promedio en la consola con un mensaje que indique si el estudiante aprobó o reprobó, considerando que el promedio para aprobar es 60. 🎓

**Ejemplo de entrada/salida esperado:**

```
Ingresa la primera nota: 70
Ingresa la segunda nota: 80
Ingresa la tercera nota: 50
El promedio de las notas es: 66.6
Resultado: Aprobado
```

<details> <summary>🔍 Ver solución</summary>

```java
import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la primera nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Ingresa la segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Ingresa la tercera nota: ");
        double nota3 = input.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio de las notas es: " + promedio);

        if (promedio >= 60) {
            System.out.println("Resultado: Aprobado");
        } else {
            System.out.println("Resultado: Reprobado");
        }

        input.close();
    }
}
```

</details>

### 2. 💵 **Ejercicio: Cálculo de Salario Neto con Deducciones**

Crea un programa que calcule el salario neto de un empleado después de aplicar deducciones de impuestos. El programa debe solicitar el salario base y los porcentajes de deducción de impuestos (por ejemplo, impuesto federal y seguro social). Luego, calcula el salario neto utilizando una sola línea de código que combine las operaciones de resta y asignación. 💰

**Ejemplo de entrada/salida esperado:**

```
Ingresa el salario base del empleado: 2000
Ingresa el porcentaje de deducción por impuesto federal: 15
Ingresa el porcentaje de deducción por seguro social: 5
El salario neto después de deducciones es: 1600.0
```

<details> <summary>🔍 Ver solución</summary>

```java
import java.util.Scanner;

public class SalarioNeto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el salario base del empleado: ");
        double salarioBase = input.nextDouble();

        System.out.print("Ingresa el porcentaje de deducción por impuesto federal: ");
        double deduccionFederal = input.nextDouble();

        System.out.print("Ingresa el porcentaje de deducción por seguro social: ");
        double deduccionSeguroSocial = input.nextDouble();

        double salarioNeto = salarioBase - (salarioBase * deduccionFederal / 100) - (salarioBase * deduccionSeguroSocial / 100);

        System.out.println("El salario neto después de deducciones es: " + salarioNeto);

        input.close();
    }
}
```

</details>

# 🔄 **Casteo de Variables en Java**

El casteo de variables en Java es el proceso de convertir un tipo de dato a otro. Esto es útil cuando se necesitan realizar operaciones entre tipos de datos diferentes o se desea convertir el resultado de una operación a un tipo específico. Existen dos tipos principales de casteo:

### 1. 🪄 **Casteo Implícito**

Se realiza automáticamente cuando el valor se convierte de un tipo menor a uno mayor (por ejemplo, de `int` a `double`).

```java
int numeroEntero = 100;
double numeroDecimal = numeroEntero; // Casteo implícito de int a double
System.out.println("Valor convertido a double: " + numeroDecimal); // Salida: 100.0
```

### 2. ✋ **Casteo Explícito**

Se realiza de forma manual cuando se desea convertir de un tipo mayor a uno menor o entre tipos no compatibles (por ejemplo, de `double` a `int`). Para esto, se coloca el tipo deseado entre paréntesis antes de la variable o el valor.

```java
double numeroDecimal = 100.99;
int numeroEntero = (int) numeroDecimal; // Casteo explícito de double a int
System.out.println("Valor convertido a entero: " + numeroEntero); // Salida: 100
```

### 🔄 **Ejemplo: División de Enteros con Casteo a `double`**

Si se realiza una división entre dos enteros en Java, el resultado será también un entero. Para obtener un resultado con decimales, se debe realizar un casteo a `double`:

```java
int a = 5;
int b = 2;
double resultado = (double) a / b; // Casteo de 'a' a double
System.out.println("El resultado de 5/2 es: " + resultado); // Salida: 2.5
```

<details> <summary>🔍 Ver ejemplo completo</summary>

```java
public class CasteoEjemplo {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double resultado = (double) a / b; // Casteo de 'a' a double
        System.out.println("El resultado de 5/2 es: " + resultado); // Salida: 2.5

        // Ejemplo de casteo explícito
        double decimal = 100.99;
        int entero = (int) decimal;
        System.out.println("Casteo explícito de double a int: " + entero); // Salida: 100
    }
}
```
</details>

## 🎯 **Ejercicio Práctico**

Crea un programa que convierta una cantidad de kilómetros a millas. El programa debe solicitar la cantidad de kilómetros al usuario, realizar la conversión usando la fórmula `1 kilómetro = 0.621371 millas` y mostrar el resultado en la consola. Utiliza un casteo de la variable `kilometros` a `double` para obtener un resultado con decimales. 🚗💨

**Ejemplo de entrada/salida esperado:**
```
Ingresa la cantidad de kilómetros: 10
La cantidad de millas es: 6.21371
```

<details> <summary>🔍 Ver solución</summary>

```java
import java.util.Scanner;

public class ConversionKilometrosMillas {
    public static void main(String[] args) {
        final double FACTOR_CONVERSION = 0.621371;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de kilómetros: ");
        int kilometros = input.nextInt();

        double millas = (double) kilometros * FACTOR_CONVERSION; // Casteo de kilómetros a double
        System.out.println("La cantidad de millas es: " + millas);

        input.close();
    }
}
```
</details>