# Clase Scanner

## Métodos de Entrada de Datos con la Clase `Scanner`

### 1. Introducción a `Scanner`

La clase `Scanner` es una herramienta en Java que nos permite capturar datos ingresados por el usuario a través de la consola. Se utiliza principalmente para leer diferentes tipos de datos como texto, números enteros y números decimales.

### 2. Importación de `Scanner`

Para utilizar la clase `Scanner` en nuestro programa, primero debemos importarla. Esto se logra con la siguiente línea de código al inicio del archivo:

```java
import java.util.Scanner;
```

La importación es necesaria porque `Scanner` pertenece a la librería `java.util` y no está disponible por defecto.

### 3. Creación de un Objeto `Scanner`

Después de importar `Scanner`, debemos crear un objeto de esta clase para poder leer la entrada del usuario. Utilizamos `System.in` para indicar que los datos provendrán de la consola:

```java
Scanner input = new Scanner(System.in);
```

Con esta línea, `input` se convierte en un objeto que nos permitirá leer datos que el usuario ingrese desde el teclado.

### 4. Métodos Básicos de Captura de Datos

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

### Ejemplo

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

**Conclusión**: Siempre utiliza `input.close()` para cerrar el `Scanner` y evitar el uso innecesario de recursos.

Al finalizar el uso de `Scanner`, es recomendable cerrarlo para liberar recursos del sistema. Se hace llamando al método `input.close()`:

```java
input.close();
```

Además, evita utilizar varios objetos `Scanner` para leer diferentes tipos de datos, ya que podría causar errores. Utiliza el mismo objeto para todas las entradas en un programa sencillo.

### ¿Por qué es importante usar `close()` en `Scanner`?

El método `close()` se utiliza para liberar los recursos del sistema que ha ocupado el objeto `Scanner`. Cuando usamos `Scanner` para leer datos desde la consola o un archivo, se abren flujos de entrada que consumen memoria y recursos. Si no cerramos estos flujos al finalizar, pueden ocurrir fugas de memoria y errores en el programa.

### 5. Ejercicio Práctico

Implementa un programa que capture el nombre, edad y estatura del usuario. Luego, muestra esta información en la consola con un formato amigable.

<details> <summary>Ver solución</summary>

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

Proximamente en esta seccion:

```
operadores logicos
operadores aritmeticos simples y de +=
operadores comparativos
operadores con binarios, poner de ejemplo el algoritmo de aproximaciones sucesivas
operador if one line
introduccion a constantes, ejemplo y por que son importantes
ejercicios practicos resueltos
```
