# Estructuras de Control: <u>*switch*</u> en Java 🚦

En este documento vamos a explorar una de las estructuras de control más importantes de Java: el `switch`. Ahora, vamos a aprender cómo el `switch` puede ser una alternativa interesante y práctica para algunos tipos de decisiones en el flujo del programa. También incluiremos ejemplos de cómo **no** usar `switch` y veremos cómo utilizar `switch` con `enum`. 🤓

## Teoría del `switch`

La estructura `switch` se utiliza para seleccionar una de entre varias ramas de ejecución basándose en el valor de una variable. Este es un excelente sustituto de múltiples sentencias `if-else` cuando se comparan valores simples y predefinidos. Es especialmente útil cuando se tiene que evaluar una misma variable con varios posibles valores. 🎨

La sintaxis básica de `switch` en Java es la siguiente:

```java
switch (variable) {
    case valor1:
        // Bloque de código para valor1
        break;
    case valor2:
        // Bloque de código para valor2
        break;
    default:
        // Bloque de código si ningún caso coincide
}
```

- **`switch`**: Define la estructura de control.
- **`case`**: Cada caso define un valor específico para la variable.
- **`break`**: Sirve para detener la ejecución del bloque después de cumplir el caso.
- **`default`**: Se ejecuta cuando ninguno de los `case` coincide.

## Ejemplo básico de `switch` 🎨

Vamos a ver un ejemplo básico de un `switch` para identificar un color a partir de su inicial:

```java
import java.util.Scanner;

public class ColoresSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la inicial del color (R, G, B): ");
        char inicial = scanner.next().charAt(0);

        switch (inicial) {
            case 'R':
                System.out.println("Rojo");
                break;
            case 'G':
                System.out.println("Verde");
                break;
            case 'B':
                System.out.println("Azul");
                break;
            default:
                System.out.println("Inicial no reconocida");
        }
        scanner.close();
    }
}
```

<details>
<summary>Salida del código</summary>

```
Ingresa la inicial del color (R, G, B): G
Verde
```
</details>

## Comparación entre `switch` y `if` 📝

A continuación, veremos un ejemplo que muestra cómo resolver el mismo problema usando una estructura `if-else` y un `switch`.

### Ejemplo con `if-else` 📝

Queremos crear un programa que reciba el día de la semana como número (1-7) e imprima su nombre correspondiente:

```java
import java.util.Scanner;

public class DiasSemanaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número del 1 al 7: ");
        int dia = scanner.nextInt();

        if (dia == 1) {
            System.out.println("Lunes");
        } else if (dia == 2) {
            System.out.println("Martes");
        } else if (dia == 3) {
            System.out.println("Miércoles");
        } else if (dia == 4) {
            System.out.println("Jueves");
        } else if (dia == 5) {
            System.out.println("Viernes");
        } else if (dia == 6) {
            System.out.println("Sábado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Número no válido");
        }
        scanner.close();
    }
}
```

<details>
<summary>Salida del código</summary>

```
Ingresa un número del 1 al 7: 3
Miércoles
```
</details>

### Ejemplo con `switch` 💡

Ahora veamos la misma lógica usando `switch`:

```java
import java.util.Scanner;

public class DiasSemanaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número del 1 al 7: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido");
        }
        scanner.close();
    }
}
```

<details>
<summary>Salida del código</summary>

```
Ingresa un número del 1 al 7: 3
Miércoles
```
</details>

### Ventajas y desventajas ⚖️

**`if-else`**:
- **Ventaja**: Es más flexible, permite evaluar condiciones complejas (por ejemplo, combinaciones de operadores lógicos).
- **Desventaja**: Puede volverse difícil de leer y mantener cuando hay muchos casos.

**`switch`**:
- **Ventaja**: Más legible y fácil de seguir cuando se compara una misma variable con muchos valores.
- **Desventaja**: Solo funciona con ciertos tipos de valores (enteros, `char`, `String`, etc.) y no permite condiciones complejas.

## Ejemplos de cómo **NO** usar `switch` 🚫

1. **No usar `switch` sin `break` en los casos**:

```java
switch (opcion) {
    case 1:
        System.out.println("Opción 1");
    case 2:
        System.out.println("Opción 2");
    default:
        System.out.println("Opción no válida");
}
```

- **Error**: Si no utilizamos `break`, todos los casos posteriores al coincidente se ejecutarán. Esto se conoce como "fallthrough". 😵
- **Solución**: Asegúrate de utilizar `break` al final de cada `case` para evitar la ejecución no deseada de otros bloques.

2. **No usar `switch` con tipos de datos no soportados**:

```java
switch (3.5) {
    // Código aquí
}
```

- **Error**: `switch` no soporta tipos `double` o `float`. ⚠️
- **Solución**: Utiliza `switch` solo con `int`, `char`, `String` o `enum`.

## Ejemplo con `enum` y `switch` 🌟

Veamos cómo podemos usar `switch` con un `enum`. Los `enum` son tipos especiales que representan un conjunto de constantes.
Para más información sobre `enum`, al final de esta sección proporcionamos teoría y ejemplos adicionales.

```java
public class DiasSemanaEnum {
    enum Dia {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        Dia dia = Dia.MIERCOLES;

        switch (dia) {
            case LUNES:
                System.out.println("Es lunes, comienza la semana.");
                break;
            case MARTES:
                System.out.println("Es martes, sigue adelante.");
                break;
            case MIERCOLES:
                System.out.println("Es miércoles, mitad de semana.");
                break;
            case JUEVES:
                System.out.println("Es jueves, casi terminamos.");
                break;
            case VIERNES:
                System.out.println("Es viernes, fin de semana cerca.");
                break;
            case SABADO:
                System.out.println("Es sábado, disfruta tu día.");
                break;
            case DOMINGO:
                System.out.println("Es domingo, descansa.");
                break;
            default:
                System.out.println("Día no válido.");
        }
    }
}
```

<details>
<summary>Salida del código</summary>

```
Es miércoles, mitad de semana.
```
</details>

## Teoría sobre `switch` con múltiples casos 🤓

En Java, la estructura `switch` permite agrupar varios casos para que todos compartan el mismo bloque de instrucciones. Esta característica puede ser muy útil cuando se tiene el mismo resultado para diferentes valores, lo cual ayuda a simplificar y hacer el código más limpio y legible. 🎨

La sintaxis básica para agrupar múltiples `case` en un `switch` es la siguiente:

```java
switch (variable) {
    case valor1:
    case valor2:
    case valor3:
        // Bloque de código para valor1, valor2, y valor3
        break;
    default:
        // Bloque de código si ningún caso coincide
}
```

Veamos un ejemplo donde agrupamos varios casos:

<details>
<summary>Ejemplo con múltiples `case`</summary>

```java
import java.util.Scanner;

public class DiasLaborales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un día de la semana (Lunes a Domingo): ");
        String dia = scanner.next().toLowerCase();

        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un día laboral.");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un día de descanso.");
                break;
            default:
                System.out.println("Día no reconocido. Por favor, ingresa un día válido.");
        }
        scanner.close();
    }
}
```

<details>
<summary>Salida del código</summary>

```
Ingresa un día de la semana (Lunes a Domingo): Martes
Es un día laboral.
```
</details>
</details>

### Ventajas de usar múltiples `case` en un `switch`

- **Código más limpio**: Agrupar varios casos que comparten la misma acción reduce la duplicación de código y mejora la legibilidad.
- **Fácil mantenimiento**: Si se necesita cambiar la acción para un grupo de valores, solo se hace en un lugar, lo cual hace que el mantenimiento sea más sencillo.

---

## Ejercicios de `switch` con Casos Simples

### 1. Clasificación de Número Par o Impar 🔢
Crea un programa que reciba un número entero y determine si es par o impar. Utiliza un `switch` para decidir la clasificación del número.

**Ejemplo de entrada:** `4`

**Salida esperada:** `El número 4 es par.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        switch (numero % 2) {
            case 0:
                System.out.println("El número " + numero + " es par.");
                break;
            case 1:
                System.out.println("El número " + numero + " es impar.");
                break;
            default:
                System.out.println("Número no válido.");
        }
        scanner.close();
    }
}
```
</details>

### 2. Máquina de Estado de Semáforo 🚦
Crea un programa que simule el funcionamiento de un semáforo. Debe recibir un estado actual (`rojo`, `amarillo`, `verde`) y mostrar el siguiente estado del semáforo. Utiliza un `switch` para definir las transiciones entre los estados.

☑️ Cada estado tiene un color siguiente definido de la siguiente manera:
  - `rojo` -> `verde`
  - `verde` -> `amarillo`
  - `amarillo` -> `rojo`

**Ejemplo de entrada:** `rojo`

**Salida esperada:** `El siguiente estado es verde.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class MaquinaEstadoSemaforo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el estado actual del semáforo (rojo, amarillo, verde): ");
        String estadoActual = scanner.next().toLowerCase();

        switch (estadoActual) {
            case "rojo":
                System.out.println("El siguiente estado es verde.");
                break;
            case "amarillo":
                System.out.println("El siguiente estado es rojo.");
                break;
            case "verde":
                System.out.println("El siguiente estado es amarillo.");
                break;
            default:
                System.out.println("Estado no válido. Por favor, ingresa rojo, amarillo o verde.");
        }
        scanner.close();
    }
}
```
</details>

### 3. Simulación de Movimiento en Videojuego 🎮
Crea un programa que simule el movimiento de un personaje en un videojuego. El usuario debe ingresar una tecla (`w`, `a`, `s`, `d`) para mover al personaje hacia adelante, izquierda, atrás o derecha respectivamente. Utiliza un `switch` para decidir la dirección del movimiento y mostrarla en la consola.

**Ejemplo de entrada:** `w`

**Salida esperada:** `El personaje se mueve hacia adelante.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class MovimientoVideojuego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una tecla para mover al personaje (w, a, s, d): ");
        char movimiento = scanner.next().toLowerCase().charAt(0);

        switch (movimiento) {
            case 'w':
                System.out.println("El personaje se mueve hacia adelante.");
                break;
            case 'a':
                System.out.println("El personaje se mueve hacia la izquierda.");
                break;
            case 's':
                System.out.println("El personaje se mueve hacia atrás.");
                break;
            case 'd':
                System.out.println("El personaje se mueve hacia la derecha.");
                break;
            default:
                System.out.println("Movimiento no válido. Por favor, ingresa w, a, s o d.");
        }
        scanner.close();
    }
}
```
</details>

## Ejercicios adicionales

### 1. Determinar Categoría de Producto 🛍️
Escribe un programa que reciba el nombre de un producto y lo clasifique en una de las siguientes categorías: alimentación, electrónica, ropa, hogar, otros. Utiliza un `switch` para decidir la categoría a la cual pertenece el producto. Asegúrate de que el programa pueda manejar nombres en minúsculas y mayúsculas sin problemas.

☑️ Los productos posibles son:
  - Alimentación: "manzana", "pan", "leche".
  - Electrónica: "televisor", "computadora", "celular".
  - Ropa: "camisa", "pantalon", "chaqueta".
  - Hogar: "silla", "mesa", "lampara".
  - Otros: cualquier otro producto.

**Ejemplo de entrada:** `Televisor`

**Salida esperada:** `El producto Televisor pertenece a la categoría de electrónica.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class CategoriaProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre del producto: ");
        String producto = scanner.next().toLowerCase();

        switch (producto) {
            case "manzana":
            case "pan":
            case "leche":
                System.out.println("El producto " + producto + " pertenece a la categoría de alimentación.");
                break;
            case "televisor":
            case "computadora":
            case "celular":
                System.out.println("El producto " + producto + " pertenece a la categoría de electrónica.");
                break;
            case "camisa":
            case "pantalon":
            case "chaqueta":
                System.out.println("El producto " + producto + " pertenece a la categoría de ropa.");
                break;
            case "silla":
            case "mesa":
            case "lampara":
                System.out.println("El producto " + producto + " pertenece a la categoría de hogar.");
                break;
            default:
                System.out.println("El producto " + producto + " pertenece a la categoría de otros.");
        }
        scanner.close();
    }
}
```
</details>

### 2. Asignación de Grados Académicos 🎓
Crea un programa que reciba una calificación numérica del 1 al 10 e indique el grado académico del estudiante según su rendimiento. Utiliza `switch` para asignar el grado y asegúrate de manejar los diferentes rangos correctamente.

☑️ Los grados se asignan de la siguiente forma:
  - Insuficiente: calificaciones de 1 a 3.
  - Suficiente: calificaciones de 4 y 5.
  - Bien: calificaciones de 6 y 7.
  - Notable: calificaciones de 8 y 9.
  - Sobresaliente: calificación de 10.

**Ejemplo de entrada:** `Calificación: 8`

**Salida esperada:** `Tu rendimiento es notable.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class GradosAcademicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la calificación (1-10): ");
        int calificacion = scanner.nextInt();

        switch (calificacion) {
            case 1:
            case 2:
            case 3:
                System.out.println("Tu rendimiento es insuficiente.");
                break;
            case 4:
            case 5:
                System.out.println("Tu rendimiento es suficiente.");
                break;
            case 6:
            case 7:
                System.out.println("Tu rendimiento es bien.");
                break;
            case 8:
            case 9:
                System.out.println("Tu rendimiento es notable.");
                break;
            case 10:
                System.out.println("Tu rendimiento es sobresaliente.");
                break;
            default:
                System.out.println("Calificación no válida. Debe ser del 1 al 10.");
        }
        scanner.close();
    }
}
```
</details>

### 3. Selección de Transporte según Distancia 🚗✈️
Desarrolla un programa que reciba la distancia que el usuario desea viajar y sugiera el medio de transporte adecuado. Utiliza un `switch` para determinar el transporte según los rangos de distancia.

☑️ Las recomendaciones de transporte se basan en las siguientes distancias:
  - 0-5 km: a pie.
  - 6-20 km: bicicleta.
  - 21-100 km: auto.
  - Más de 100 km: avión.

**Ejemplo de entrada:** `Distancia: 15`

**Salida esperada:** `Para una distancia de 15 km, se recomienda viajar en bicicleta.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class TransporteSugerido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la distancia en kilómetros: ");
        int distancia = scanner.nextInt();

        switch (distancia / 10) {
            case 0:
                System.out.println("Para una distancia de " + distancia + " km, se recomienda viajar a pie.");
                break;
            case 1:
            case 2:
                System.out.println("Para una distancia de " + distancia + " km, se recomienda viajar en bicicleta.");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Para una distancia de " + distancia + " km, se recomienda viajar en auto.");
                break;
            default:
                System.out.println("Para una distancia de " + distancia + " km, se recomienda viajar en avión.");
        }
        scanner.close();
    }
}
```
</details>

### 4. Menú de Comida Saludable 🍎🥗
Escribe un programa que presente un menú de opciones saludables según el tipo de comida que el usuario desea (desayuno, almuerzo, cena, snack). Dependiendo de la selección, muestra una sugerencia de comida específica. Utiliza `switch` para manejar cada opción.

☑️ Los tipos de comida y sus respectivas sugerencias son:
  - Desayuno: batido de frutas con avena.
  - Almuerzo: ensalada de quinoa con vegetales y pollo.
  - Cena: sopa de verduras con tofu.
  - Snack: porción de frutos secos.

**Ejemplo de entrada:** `Tipo de comida: desayuno`

**Salida esperada:** `Sugerencia: Para el desayuno, te recomendamos un batido de frutas con avena.`

<details>
<summary>Ver solución</summary>

```java
import java.util.Scanner;

public class MenuComidaSaludable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el tipo de comida (desayuno, almuerzo, cena, snack): ");
        String tipoComida = scanner.next().toLowerCase();

        switch (tipoComida) {
            case "desayuno":
                System.out.println("Sugerencia: Para el desayuno, te recomendamos un batido de frutas con avena.");
                break;
            case "almuerzo":
                System.out.println("Sugerencia: Para el almuerzo, te recomendamos una ensalada de quinoa con vegetales y pollo.");
                break;
            case "cena":
                System.out.println("Sugerencia: Para la cena, te recomendamos una sopa de verduras con tofu.");
                break;
            case "snack":
                System.out.println("Sugerencia: Para un snack, te recomendamos una porción de frutos secos.");
                break;
            default:
                System.out.println("Tipo de comida no reconocido. Por favor, ingresa una opción válida.");
        }
        scanner.close();
    }
}
```
</details>

Estos ejercicios están diseñados para reforzar todo lo aprendido hasta ahora de una forma práctica y divertida. ¡Tómate el tiempo necesario para analizar y resolver cada uno de ellos, ya que te ayudarán a afianzar tus conocimientos! 😊

# Teoría sobre `enum` en Java 🤓

Un `enum` en Java es un tipo especial de clase que se utiliza para definir un conjunto de constantes. Es muy útil cuando queremos representar un grupo fijo de valores conocidos, como los días de la semana, los colores, estados de un proceso, entre otros. 

El uso de `enum` hace que el código sea más legible y menos propenso a errores, ya que no tenemos que recordar constantes numéricas o cadenas específicas, sino que podemos utilizar los nombres definidos. 🎨

### Ejemplo básico de `enum`

Vamos a ver cómo se define y se utiliza un `enum` en Java:

<details>
<summary>Ver ejemplo</summary>

```java
public class EjemploEnum {
    enum Dia {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        Dia hoy = Dia.MIERCOLES;

        System.out.println("Hoy es: " + hoy);

        // Usando enum en un condicional
        if (hoy == Dia.MIERCOLES) {
            System.out.println("¡Mitad de semana!");
        }
    }
}
```

<details>
<summary>Salida del código</summary>

```
Hoy es: MIERCOLES
¡Mitad de semana!
```
</details>
</details>

### Ventajas del uso de `enum` 🌟

- **Legibilidad**: Al usar `enum`, el código se vuelve más fácil de leer y entender.
- **Seguridad**: Evita valores inválidos, ya que solo se permiten los definidos en el `enum`.
- **Mantenimiento**: Es más fácil actualizar los valores posibles simplemente cambiando la definición del `enum` en un solo lugar.

### Características adicionales

- **Métodos en `enum`**: Podemos agregar métodos a los `enum` para realizar acciones específicas.
- **Uso en `switch`**: Los `enum` se pueden usar en estructuras `switch`, lo cual veremos en los ejemplos posteriores.

### Ejemplos prácticos de `enum`

#### 1. Estados de un Pedido 🛒

Veamos un ejemplo donde utilizamos `enum` para representar los diferentes estados de un pedido en un sistema de compras:

<details>
<summary>Ver ejemplo</summary>

```java
public class EstadoPedidoEnum {
    enum EstadoPedido {
        PENDIENTE, PROCESANDO, ENVIADO, ENTREGADO, CANCELADO
    }

    public static void main(String[] args) {
        EstadoPedido estadoActual = EstadoPedido.PROCESANDO;

        switch (estadoActual) {
            case PENDIENTE:
                System.out.println("El pedido está pendiente de ser procesado.");
                break;
            case PROCESANDO:
                System.out.println("El pedido está siendo procesado.");
                break;
            case ENVIADO:
                System.out.println("El pedido ha sido enviado.");
                break;
            case ENTREGADO:
                System.out.println("El pedido ha sido entregado.");
                break;
            case CANCELADO:
                System.out.println("El pedido ha sido cancelado.");
                break;
            default:
                System.out.println("Estado desconocido.");
        }
    }
}
```

<details>
<summary>Salida del código</summary>

```
El pedido está siendo procesado.
```
</details>
</details>

#### 2. Niveles de Prioridad 🔔

Podemos usar un `enum` para representar los diferentes niveles de prioridad de una tarea en un sistema de gestión:

<details>
<summary>Ver ejemplo</summary>

```java
public class PrioridadEnum {
    enum Prioridad {
        BAJA, MEDIA, ALTA, URGENTE
    }

    public static void main(String[] args) {
        Prioridad prioridadTarea = Prioridad.ALTA;

        System.out.println("La prioridad de la tarea es: " + prioridadTarea);

        if (prioridadTarea == Prioridad.URGENTE) {
            System.out.println("¡Esta tarea requiere atención inmediata!");
        } else {
            System.out.println("La tarea puede ser realizada según la prioridad asignada.");
        }
    }
}
```

<details>
<summary>Salida del código</summary>

```
La prioridad de la tarea es: ALTA
La tarea puede ser realizada según la prioridad asignada.
```
</details>
</details>

#### 3. Tipos de Usuario en una Aplicación 👥

En este ejemplo utilizaremos un `enum` para representar diferentes tipos de usuarios en una aplicación:

<details>
<summary>Ver ejemplo</summary>

```java
public class TipoUsuarioEnum {
    enum TipoUsuario {
        ADMIN, MODERADOR, USUARIO_REGULAR, INVITADO
    }

    public static void main(String[] args) {
        TipoUsuario tipo = TipoUsuario.ADMIN;

        switch (tipo) {
            case ADMIN:
                System.out.println("Bienvenido, Administrador. Tienes acceso total.");
                break;
            case MODERADOR:
                System.out.println("Bienvenido, Moderador. Puedes gestionar ciertos contenidos.");
                break;
            case USUARIO_REGULAR:
                System.out.println("Bienvenido, Usuario. Puedes acceder a los recursos básicos.");
                break;
            case INVITADO:
                System.out.println("Bienvenido, Invitado. Tienes acceso limitado.");
                break;
            default:
                System.out.println("Tipo de usuario no reconocido.");
        }
    }
}
```

<details>
<summary>Salida del código</summary>

```
Bienvenido, Administrador. Tienes acceso total.
```
</details>
</details>

Estos ejemplos demuestran cómo `enum` puede ser utilizado para mejorar la organización del código, garantizar la validez de los valores y facilitar el manejo de múltiples opciones en diferentes contextos. 🌟