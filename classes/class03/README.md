# 🚀 **Retos de Aprendizaje I**

En esta clase, nos enfrentaremos a desafíos prácticos que nos ayudarán a aplicar y fortalecer nuestros conocimientos en Java. A través de ejercicios dinámicos, fomentaremos nuestra creatividad y habilidades de resolución de problemas. 💡

## ➕ **Ejercicio 1: Calculadora Básica con Operaciones Aritméticas**

Crea un programa que permita al usuario ingresar dos números y una operación aritmética (+, -, *, /). El programa debe realizar la operación solicitada por el usuario y mostrar el resultado. Asegúrate de gestionar los posibles errores como la división por cero. 🚫➗

**Ejemplo de Entrada:**
```
Ingrese el primer número: 8
Ingrese el segundo número: 4
Ingrese la operación (+, -, *, /): *
```

**Ejemplo de Salida:**
```
El resultado es: 32
```

<details> <summary>Ver solución</summary>

```java
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número >> ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número >> ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese la operación (+, -, *, /): >> ");
        char op = scanner.next().charAt(0);

        double resultado = (op == '+') ? num1 + num2 :
                           (op == '-') ? num1 + num2 :
                           (op == '*') ? num1 * num2 :
                           (op == '/') ? (double) num1 / num2 : 0;

        System.out.println("El resultado es: " + resultado);

        scanner.close();
    }
}
```
</details>

---

## ➕ **Ejercicio 2: Promedio y Clasificación de Calificaciones**

Escribe un programa que solicite al usuario ingresar las calificaciones de 5 materias. El programa debe calcular el promedio y clasificar el resultado según las siguientes condiciones:
- Si el promedio es mayor o igual a 90, el resultado es "Excelente". 🌟
- Si el promedio está entre 70 y 89, el resultado es "Bueno". 👍
- Si el promedio está entre 50 y 69, el resultado es "Regular". ⚠️
- Si el promedio es menor de 50, el resultado es "Insuficiente". ❌

**Ejemplo de Entrada:**
```
Ingrese la calificación 1: 85
Ingrese la calificación 2: 90
Ingrese la calificación 3: 78
Ingrese la calificación 4: 88
Ingrese la calificación 5: 92
```

**Ejemplo de Salida:**
```
El promedio es: 86.6
Clasificación: Bueno
```

<details> <summary>Ver solución</summary>

```java
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación 1: ");
        double promedio = scanner.nextInt();
        System.out.print("Ingrese la calificación 2: ");
        promedio += scanner.nextInt();
        System.out.print("Ingrese la calificación 3: ");
        promedio += scanner.nextInt();
        System.out.print("Ingrese la calificación 4: ");
        promedio += scanner.nextInt();
        System.out.print("Ingrese la calificación 5: ");
        promedio += scanner.nextInt();

        promedio /= 5;
        System.out.println("El promedio es: " + promedio);

        String resultado =  (promedio >= 90) ? "Excelente" :
                            (promedio >= 70) ? "Bueno" :
                            (promedio >= 50) ? "Regular" : "Insuficiente";
        
        System.out.println("Clasificación: " + resultado);

        scanner.close();
    }
}
```
</details>

---

## ➕ **Ejercicio 3: Cálculo de Intereses Compuestos**

Crea un programa que calcule el monto final después de aplicar intereses compuestos. El usuario debe ingresar el monto inicial, la tasa de interés anual, y la cantidad de años. La fórmula para el cálculo de los intereses compuestos es:

A = P(1 + r/n)^(nt)

Donde:
- `A` es el monto final 💰
- `P` es el monto inicial
- `r` es la tasa de interés anual (en decimal, por ejemplo, 5% = 0.05)
- `n` es el número de veces que se aplican los intereses por año (usa 12 para mensual)
- `t` es el número de años

**Ejemplo de Entrada:**
```
Ingrese el monto inicial: 1000
Ingrese la tasa de interés anual (%): 5
Ingrese los años: 10
```

**Ejemplo de Salida:**
```
El monto final después de 10 años es: 1647.01
```

<details> <summary>Ver solución</summary>

```java
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto inicial: ");
        double P = scanner.nextDouble();
        System.out.print("Ingrese la tasa de interés anual (%): ");
        int r = scanner.nextInt();
        System.out.print("Ingrese los años: ");
        int t = scanner.nextInt();

        double A = P*Math.pow((1+((double)r/1200)), 12*t);

        System.out.println("El monto final después de 10 años es: " + A);

        scanner.close();
    }
}
```
</details>

---

## ➕ **Ejercicio 4: Clasificación de Números como Pares o Impares**

Escribe un programa que solicite al usuario ingresar 5 números enteros y, utilizando operadores aritméticos y el operador ternario, determine si cada número es par o impar. Luego, muestra un resumen con los resultados. 🔄

**Ejemplo de Entrada:**
```
Ingrese el número 1: 8
Ingrese el número 2: 7
Ingrese el número 3: 5
Ingrese el número 4: 12
Ingrese el número 5: 15
```

**Ejemplo de Salida:**
```
8 es par
7 es impar
5 es impar
12 es par
15 es impar
```

<details> <summary>Ver solución</summary>

```java
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita el numero 1 >> ");
        int num1 = scanner.nextInt();
        System.out.print("Digita el numero 2 >> ");
        int num2 = scanner.nextInt();
        System.out.print("Digita el numero 3 >> ");
        int num3 = scanner.nextInt();
        System.out.print("Digita el numero 4 >> ");
        int num4 = scanner.nextInt();
        System.out.print("Digita el numero 5 >> ");
        int num5 = scanner.nextInt();

        String res1 = (num1 % 2 == 0) ? "par" : "impar";
        String res2 = (num2 % 2 == 0) ? "par" : "impar";
        String res3 = (num3 % 2 == 0) ? "par" : "impar";
        String res4 = (num4 % 2 == 0) ? "par" : "impar";
        String res5 = (num5 % 2 == 0) ? "par" : "impar";
        System.out.println("");
        System.out.println(num1 + " es " + res1);
        System.out.println(num2 + " es " + res2);
        System.out.println(num3 + " es " + res3);
        System.out.println(num4 + " es " + res4);
        System.out.println(num5 + " es " + res5);
        System.out.println("");

        scanner.close();
    }
}
```
</details>

---

## ➕ **Ejercicio 5: Verificación de Palíndromos**

Crea un programa que verifique si una palabra o frase ingresada por el usuario es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda, ignorando los espacios y signos de puntuación). 🔄

**Ejemplo de Entrada:**
```
Ingrese una palabra o frase: Anula la luna
```

**Ejemplo de Salida:**
```
Es un palíndromo.
```

<details>
  <summary>Ver solución</summary>

  ```java
  import java.util.Scanner;

  public class Ejercicio05 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Digita una frase o palabra: ");
          String frase = scanner.nextLine();
          frase = frase.replaceAll("\\s", "");
          frase = frase.toLowerCase();

          StringBuffer fraseNormal = new StringBuffer(frase);
          StringBuffer fraseInvertida = new StringBuffer(frase).reverse();

          String out = (fraseNormal.toString().equals(fraseInvertida.toString())) ? "Es un palíndromo." : "No es palíndromo.";

          System.out.println(frase);
          System.out.println(fraseInvertida.toString());
          System.out.println(out);

          scanner.close();
      }
  }
  ```
</details>

---

¡Buena suerte con estos ejercicios! 💪

## ➕ **Tips avanzados para mejorar tus búsquedas en Google sobre Java y programación**

<details> <summary>Tips avanzados para mejorar tus búsquedas en Google</summary>

Dominar la búsqueda en Google es clave para encontrar soluciones rápidas y precisas, especialmente en programación. Aquí tienes una guía con tips y ejemplos prácticos que te ayudarán a realizar búsquedas más efectivas. ¡Vamos a ello! 🔍

---

## 1. **Búsqueda exacta usando comillas (`" "`)**

**Descripción:** Si quieres encontrar una frase exacta, utiliza comillas. Esto le indicará a Google que solo te muestre resultados que contengan esa frase específica.

**Ejemplo en Java:**
```
"java.lang.NullPointerException"
```
Esto te mostrará solo resultados que contengan exactamente ese error, lo cual es útil cuando lidias con errores específicos.

---

## 2. **Filtra por sitio web usando `site:`**

**Descripción:** Si necesitas resultados de un sitio web en particular, usa el operador `site:` seguido del dominio del sitio.

**Ejemplo en Java:**
```
site:stackoverflow.com java Scanner class not working
```
Esto te dará resultados únicamente de Stack Overflow relacionados con la clase `Scanner` en Java.

**Recomendación:** Usa este operador para sitios confiables como:
- [Stack Overflow](https://stackoverflow.com/)
- [GeeksforGeeks](https://geeksforgeeks.org/)
- [w3schools](https://w3schools.com/)

---

## 3. **Busca entre opciones con `OR`**

**Descripción:** Si estás buscando varios temas o alternativas, utiliza `OR` para encontrar páginas que mencionen uno u otro término.

**Ejemplo en Java:**
```
Java Exceptions OR Errors
```
Te mostrará resultados que hablen tanto de "Exceptions" como de "Errors".

---

## 4. **Asegura que ambos términos estén presentes con `AND`**

**Descripción:** Si quieres que tus resultados incluyan dos términos específicos, usa `AND` entre ellos.

**Ejemplo en Java:**
```
Java AND ArrayIndexOutOfBoundsException
```
Esto garantiza que los resultados incluyan tanto "Java" como "ArrayIndexOutOfBoundsException", útil para investigar errores concretos.

---

## 5. **Excluye términos no deseados usando el signo menos `-`**

**Descripción:** Cuando quieres evitar ciertos términos en tu búsqueda, utiliza el operador `-` para excluir resultados no relevantes.

**Ejemplo en Java:**
```
Java development -framework
```
Esto excluirá los resultados relacionados con "frameworks", útil cuando solo te interesa el desarrollo puro en Java.

---

## 6. **Encuentra archivos específicos con `filetype:`**

**Descripción:** Si buscas documentos en un formato específico, como PDFs, usa el operador `filetype:` seguido del tipo de archivo.

**Ejemplo en Java:**
```
filetype:pdf Java tutorial
```
Te mostrará tutoriales de Java que estén en formato PDF, perfecto si prefieres tener la información descargada.

---

## 7. **Completa frases con el comodín `*`**

**Descripción:** Cuando no recuerdas una parte de una frase, usa el símbolo `*` para que Google lo complete.

**Ejemplo en Java:**
```
how to use * in java arrays
```
Esto te ayudará a encontrar documentación o ejemplos completos si no recuerdas detalles clave.

---

## 8. **Encuentra sitios relacionados con `related:`**

**Descripción:** Si te gusta el contenido de un sitio pero quieres ver más fuentes similares, usa `related:`.

**Ejemplo en Java:**
```
related:geeksforgeeks.org
```
Te mostrará sitios similares a GeeksforGeeks, donde podrás encontrar más tutoriales y explicaciones de Java.

---

## 9. **Realiza búsquedas en inglés para obtener más resultados**

**Descripción:** La comunidad de programación en inglés es más amplia, por lo que buscar en inglés te proporcionará muchas más opciones.

**Ejemplo en Java:**
```
"how to fix java.lang.NullPointerException"
```
Aunque no domines completamente el inglés, puedes traducir páginas automáticamente con herramientas del navegador, como Google Translate.

---

## 10. **Refinar tus búsquedas: ¿Qué buscas realmente?**

Saber lo que buscas es fundamental. Si tienes un error en Java, intenta copiar y pegar el mensaje de error tal cual en el buscador. Esto te llevará a foros donde otros ya hayan lidiado con problemas similares.

**Ejemplo práctico:**
```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5 & Java
```
Esto te mostrará resultados específicos de usuarios que hayan tenido el mismo problema, brindándote soluciones detalladas.

**Consejo adicional:** Si no encuentras la solución, ajusta tu búsqueda añadiendo más detalles. Por ejemplo, si el error ocurre en un IDE específico como Eclipse o IntelliJ, agrega eso a tu búsqueda:
```
ArrayIndexOutOfBoundsException Eclipse Java
```

---

## 11. **Aprende a filtrar información útil**

Con el tiempo, adquirirás la habilidad de identificar qué fuentes son confiables y relevantes. Algunas páginas serán tus aliadas, y cada vez que encuentres un error, sabrás a qué sitios acudir primero.

**Páginas recomendadas:**
- [Java Documentation](https://docs.oracle.com/en/java/)
- [Stack Overflow](https://stackoverflow.com)
- [Baeldung](https://baeldung.com)

---

## 12. **Agota las búsquedas probando nuevas combinaciones**

Si no encuentras lo que buscas a la primera, cambia las palabras clave o la estructura de tu búsqueda. A veces un término diferente puede hacer la diferencia.

**Ejemplo en Java:**
```
Java "Stream API" tutorial
```
Si esto no funciona, podrías intentar:
```
Java Stream examples OR Java Stream guide
```
El ajuste de términos puede desbloquear más información relevante.

---

---

¡Domina el arte de Googlear! 🕵️‍♂️

Cuanto más practiques y utilices estos tips, más rápido y eficiente serás buscando soluciones a tus problemas de programación.
</details>