# 🚀 **Retos de Aprendizaje 3**

Bienvenidos a una nueva sesión de desafíos prácticos para afianzar nuestros conocimientos en Java. En esta ocasión, enfrentaremos retos que nos ayudarán a aplicar bucles, condiciones, arreglos y más, a situaciones reales. 💡

## ➕ **Ejercicio 1: Generador de Contraseñas Seguro**

Crea un programa en Java que genere una contraseña aleatoria que sea segura. La contraseña deberá tener una longitud determinada por el usuario y contener una combinación de letras mayúsculas, letras minúsculas, dígitos, y caracteres especiales (`@`, `#`, `$`, `&`, etc.). La contraseña deberá ser almacenada en un arreglo de caracteres y mostrar cada carácter generado. Además, asegúrate de cumplir con lo siguiente:

- Usa un bucle `for` para generar los caracteres de la contraseña.
- Utiliza al menos un `do-while` o `while` para asegurar que la contraseña generada contenga al menos un carácter de cada tipo (mayúscula, minúscula, dígito, especial).
- Al finalizar, convierte el arreglo de caracteres en un `String` e imprime la contraseña en la consola.

**Ejemplo de Entrada:**

```
Ingrese la longitud de la contraseña: 12
```

**Ejemplo de Salida:**

```
Contraseña generada: @Dg5f&nK8$h!
```

---

## ➕ **Ejercicio 2: Clasificación de Calificaciones Avanzada**

Desarrolla un programa que genere un arreglo de calificaciones de manera aleatoria entre 0.0 y 10.0. Las calificaciones se almacenarán en un arreglo de tipo `double`. El programa debe cumplir con los siguientes requisitos:

- El usuario podrá indicar cuántas calificaciones desea generar.
- Luego de generar las calificaciones, crear 3 arreglos adicionales para clasificar las calificaciones en: `Insuficiente` (< 4.0), `Aprobado` (>= 4.0 y < 7.0), y `Excelente` (>= 7.0).
- Calcular el promedio del arreglo original y de cada una de las clasificaciones.
- Imprimir los resultados en la consola.

**Ejemplo de Entrada:**

```
Ingrese la cantidad de calificaciones a generar: 10
```

**Ejemplo de Salida:**

```
Calificaciones originales: [2.5, 5.0, 9.8, 6.2, ...]
Promedio general: 5.6
Insuficiente: [2.5, 3.0, ...]
Promedio Insuficiente: 3.2
Aprobado: [5.0, 6.2, ...]
Promedio Aprobado: 5.4
Excelente: [9.8, 8.5, ...]
Promedio Excelente: 8.9
```

---

## ➕ **Ejercicio 3: Generador de la Serie de Fibonacci Mejorada**

Escribe un programa que genere la serie de Fibonacci hasta un límite determinado por el usuario. Además, el programa deberá calcular la suma de todos los números generados en la serie y mostrarla al final. La serie de Fibonacci comienza con los valores:

- Posición 0: 0
- Posición 1: 1

Cada número posterior es la suma de los dos anteriores. Utiliza un bucle `for` para generar la serie y un bucle `while` para calcular la suma de los números de la serie.

**Ejemplo de Entrada:**

```
Ingrese el número límite de la serie de Fibonacci: 100
```

**Ejemplo de Salida:**

```
Serie de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
Suma de la serie: 232
```

---

## ➕ **Ejercicio 4: Verificación de Números Primos**

Escribe un programa en Java que permita al usuario ingresar un número y verifique si es un número primo. Si el número no es primo, el programa deberá seguir solicitando un nuevo número hasta que el usuario ingrese un número primo o el valor 0 para salir. Utiliza un bucle `do-while` para esta tarea.

**Ejemplo de Entrada:**

```
Ingrese un número: 8
Ingrese un número: 9
Ingrese un número: 7
```

**Ejemplo de Salida:**

```
7 es un número primo.
```

---

## ➕ **Ejercicio 5: Factorial de un Número**

Desarrolla un programa en Java que solicite al usuario ingresar un número y luego calcule su factorial utilizando un bucle `do-while`. Asegúrate de manejar adecuadamente los casos en los que el usuario ingrese un valor negativo, indicando que no se puede calcular el factorial de un número negativo.

**Ejemplo de Entrada:**

```
Ingrese un número: 5
```

**Ejemplo de Salida:**

```
El factorial de 5 es: 120
```

---

## ➕ **Ejercicio 6: Cálculo del Promedio de Números Ingresados**

Crea un programa en Java que permita al usuario ingresar números hasta que decida detenerse (por ejemplo, ingresando el valor -1). El programa deberá calcular el promedio de todos los números ingresados (sin contar el valor -1). Utiliza un bucle `while` para leer los números.

**Ejemplo de Entrada:**

```
Ingrese un número (o -1 para terminar): 10
Ingrese un número (o -1 para terminar): 20
Ingrese un número (o -1 para terminar): 30
Ingrese un número (o -1 para terminar): -1
```

**Ejemplo de Salida:**

```
El promedio de los números ingresados es: 20.0
```

---

## ➕ **Ejercicio 7: Generador de Cuadrado con Asteriscos**

Escribe un programa en Java que solicite al usuario ingresar un número `N` y luego dibuje un cuadrado de `N x N` usando el carácter `*`. Utiliza un bucle `for` para generar las líneas del cuadrado.

**Ejemplo de Entrada:**

```
Ingrese el tamaño del cuadrado: 4
```

**Ejemplo de Salida:**

```
****
*  *
*  *
****
```

---

## ➕ **Ejercicio 8: Representación de Gráfico de Barras**

Escribe un programa que solicite al usuario ingresar 5 números entre 1 y 20. Luego, imprime una representación visual de estos números en forma de gráfico de barras utilizando asteriscos. Cada número ingresado corresponderá a la longitud de una barra en el gráfico.

**Ejemplo de Entrada:**

```
Ingrese un número (entre 1 y 20): 5
Ingrese un número (entre 1 y 20): 3
Ingrese un número (entre 1 y 20): 7
Ingrese un número (entre 1 y 20): 2
Ingrese un número (entre 1 y 20): 10
```

**Ejemplo de Salida:**

```
*****
***
*******
**
**********
```

---

## ➕ **Ejercicio 9: Conversión de Unidades con Menú Interactivo**

Crea un programa en Java que permita al usuario convertir entre diferentes unidades de medida. El programa debe mostrar un menú que incluya las siguientes opciones:

- Convertir kilómetros a millas.
- Convertir libras a kilogramos.
- Convertir grados Celsius a Fahrenheit.
- Salir.

El usuario debe poder elegir una opción del menú y luego ingresar el valor a convertir. Utiliza un `switch` para manejar las opciones del menú y `do-while` para permitir al usuario realizar múltiples conversiones hasta que elija salir.

**Ejemplo de Entrada:**

```
Seleccione una opción:
1. Convertir kilómetros a millas
2. Convertir libras a kilogramos
3. Convertir grados Celsius a Fahrenheit
4. Salir
Ingrese su opción: 1
Ingrese la cantidad en kilómetros: 5
```

**Ejemplo de Salida:**

```
5 kilómetros son 3.107 millas.
```

---

## ➕ **Ejercicio 10: Cálculo de Potencia con Clase Math**

Escribe un programa en Java que solicite al usuario ingresar dos números: una base y un exponente. Utiliza la clase `Math` para calcular la potencia de la base elevada al exponente. Asegúrate de manejar los casos donde el exponente sea negativo.

**Ejemplo de Entrada:**

```
Ingrese la base: 2
Ingrese el exponente: 3
```

**Ejemplo de Salida:**

```
El resultado de 2 elevado a la 3 es: 8.0
```

---

## ➕ **Ejercicio 11: Juego Adivina el Número**

Desarrolla un programa que genere un número aleatorio entre 1 y 100. Luego, permite al usuario intentar adivinar el número generado. El programa deberá indicar si el número ingresado por el usuario es mayor o menor que el número generado, y continuar hasta que el usuario adivine correctamente o ingrese 0 para salir. Utiliza `while` para gestionar los intentos del usuario.

**Ejemplo de Entrada:**

```
Adivina el número (entre 1 y 100, o 0 para salir): 50
El número es mayor.
Adivina el número (entre 1 y 100, o 0 para salir): 75
El número es menor.
Adivina el número (entre 1 y 100, o 0 para salir): 63
¡Felicidades! Adivinaste el número.
```

---

## ➕ **Ejercicio 12: Sistema de Gestión de Inventario**

Crea un programa en Java que simule un sistema de gestión de inventario para una pequeña tienda. Este programa permitirá al usuario agregar, modificar, eliminar y buscar productos en el inventario, así como ver una lista completa de los productos almacenados. El objetivo de este ejercicio es aplicar conceptos como el uso de menús, bucles, condicionales, y el manejo de arreglos para almacenar los productos.

El programa deberá mostrar un menú con las siguientes opciones para que el usuario pueda interactuar:

### 🔹 **Menú de Opciones del Inventario**

1. **Agregar un producto al inventario**: Permite al usuario agregar un nuevo producto ingresando su nombre, cantidad y precio. Utiliza un arreglo de objetos para almacenar los productos. Asegúrate de que el usuario no pueda ingresar un nombre vacío y que la cantidad y el precio sean valores positivos. Si el producto ya existe, actualiza la cantidad con la nueva ingresada.

2. **Eliminar un producto del inventario**: Solicita al usuario el nombre del producto que desea eliminar. Si el producto existe, elimínalo del arreglo; si no, muestra un mensaje indicando que el producto no se encontró.

3. **Modificar información de un producto**: Solicita al usuario el nombre del producto que desea modificar. Si el producto existe, permite cambiar su cantidad y/o precio. Asegúrate de que los valores ingresados sean válidos (cantidad y precio positivos).

4. **Mostrar todos los productos**: Muestra una lista de todos los productos en el inventario, incluyendo su nombre, cantidad y precio. Asegúrate de que la información se muestre de forma clara y ordenada, con un formato amigable para el usuario.

5. **Buscar un producto por nombre**: Permite al usuario buscar un producto en el inventario ingresando su nombre. Si el producto existe, muestra la información del producto; si no, muestra un mensaje indicando que no se encontró.

6. **Mostrar el valor total del inventario**: Calcula el valor total del inventario multiplicando la cantidad de cada producto por su precio y mostrando la suma total. Esto ayudará a tener una idea del valor monetario del inventario actual.

7. **Salir**: Finaliza el programa.

### 📝 **Requerimientos Específicos**

- El menú debe ser mostrado repetidamente hasta que el usuario elija la opción de salir.
- Utiliza un `switch` para manejar las diferentes opciones del menú.
- Utiliza un arreglo de un tamaño fijo para almacenar los productos del inventario. Cada producto debe tener atributos como nombre, cantidad y precio. Define un límite máximo de productos que se pueden almacenar (por ejemplo, 100).
- Maneja adecuadamente las excepciones que puedan ocurrir, como entradas inválidas. Usa `try-catch` para asegurar que el programa no se cierre inesperadamente.
- Asegúrate de que los nombres de los productos sean únicos. Si el usuario intenta agregar un producto que ya existe, muestra un mensaje indicando que el producto ya está en el inventario y ofrece la opción de actualizar la cantidad.

### ✨ **Ejemplo de Ejecución**

**Menú:**

```
1. Agregar un producto al inventario
2. Eliminar un producto del inventario
3. Modificar información de un producto
4. Mostrar todos los productos
5. Buscar un producto por nombre
6. Mostrar el valor total del inventario
7. Salir
Ingrese una opción:
```

**Ejemplo de Interacción:**

```
Ingrese una opción: 1
Ingrese el nombre del producto: Manzanas
Ingrese la cantidad: 50
Ingrese el precio: 0.5
Producto agregado exitosamente.

Ingrese una opción: 4
Productos en el inventario:
1. Nombre: Manzanas, Cantidad: 50, Precio: 0.5

Ingrese una opción: 6
El valor total del inventario es: $25.0

Ingrese una opción: 7
Saliendo del sistema de gestión de inventario. ¡Gracias!
```

Este ejercicio promoverá el razonamiento crítico y el pensamiento lateral, ya que los estudiantes deberán considerar cómo manejar las entradas del usuario, validar la información y gestionar un arreglo de productos de manera eficiente y organizada. Además, se espera que desarrollen habilidades para manejar errores y excepciones, así como para trabajar con estructuras de datos básicas como arreglos de objetos. ✨
