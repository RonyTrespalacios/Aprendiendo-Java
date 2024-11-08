// markdown.js: Configuración y lógica para renderizar Markdown a HTML con opciones avanzadas y funciones de copia

// Instancia de showdown.js para convertir Markdown a HTML, configurada con opciones avanzadas
const converter = new showdown.Converter({
  tables: true,               // Permite el uso de tablas en Markdown
  ghCodeBlocks: true,          // Activa bloques de código al estilo GitHub
  parseImgDimensions: true,    // Permite establecer dimensiones de imagen en Markdown
  simpleLineBreaks: true,      // Habilita saltos de línea simples sin necesidad de dos espacios
  strikethrough: true,         // Permite tachado usando `~~`
  tasklists: true,             // Activa listas de tareas `[ ]` o `[x]`
});

/**
 * Convierte Markdown a HTML y ajusta bloques de código para el resaltado de sintaxis.
 * @param {string} markdown - El contenido en formato Markdown que se desea convertir.
 * @returns {string} - El HTML convertido del Markdown con ajustes específicos.
 */
function renderMarkdownToHtml(markdown) {
  // Convierte el contenido Markdown a HTML usando showdown.js
  const rawHtml = converter.makeHtml(markdown);

  // Ajusta los bloques de código para que usen clases de resaltado específicas de Prism.js
  const htmlContent = rawHtml.replace(
    /<pre><code class="(.*?)">/g,
    '<pre><code class="language-java $1">'
  );

  return htmlContent; // Devuelve el HTML procesado
}

/**
 * Agrega un botón de "Copiar" en la esquina superior derecha de cada bloque de código en Java.
 * Permite al usuario copiar el contenido del bloque de código al portapapeles.
 */
function addCopyButtons() {
  // Selecciona solo los bloques de código con la clase `language-java`
  const javaCodeBlocks = document.querySelectorAll("pre code.language-java");

  // Itera sobre cada bloque de código Java y agrega el botón de "Copiar"
  javaCodeBlocks.forEach((codeBlock) => {
    // Obtener el elemento `pre` padre del `code`
    const preBlock = codeBlock.parentNode;

    // Crear un contenedor para envolver el bloque de código y el botón
    const container = document.createElement("div");
    container.className = "code-container";
    container.style.position = "relative";

    // Mueve el bloque `pre` dentro del contenedor
    preBlock.parentNode.insertBefore(container, preBlock);
    container.appendChild(preBlock);

    // Crea el botón de "Copiar"
    const button = document.createElement("button");
    button.className = "copy-button";
    button.innerHTML = "🔗 Copy"; // Texto inicial del botón

    // Evento de clic para copiar el contenido del código al portapapeles
    button.addEventListener("click", async () => {
      try {
        // Selecciona y copia el contenido del bloque de código
        const code = codeBlock.innerText;
        await navigator.clipboard.writeText(code);

        // Cambia el texto y color del botón para indicar que se ha copiado exitosamente
        button.innerHTML = "✔ Copiado";
        button.classList.add("copied");

        // Restaura el texto y color del botón después de 2 segundos
        setTimeout(() => {
          button.innerHTML = "🔗 Copy";
          button.classList.remove("copied");
        }, 2000);
      } catch (error) {
        console.error("Error al copiar el código:", error);
      }
    });

    // Agrega el botón al contenedor
    container.appendChild(button);
  });
}

/**
 * Renderiza el contenido Markdown a HTML, aplica el resaltado de sintaxis, 
 * añade botones de "Copiar" y coloca el contenido resultante en el contenedor `#class-content`.
 * @param {string} markdown - El contenido en formato Markdown que se desea renderizar.
 */
function renderMarkdownToHtmlWithCopy(markdown) {
  // Convierte el Markdown a HTML y ajusta los bloques de código
  const htmlContent = renderMarkdownToHtml(markdown);

  // Selecciona el contenedor donde se mostrará el HTML generado
  const contentArea = document.getElementById("class-content");

  // Si el contenedor existe, inserta el HTML y configura resaltado y botones de "Copiar"
  if (contentArea) {
    contentArea.innerHTML = htmlContent;  // Coloca el contenido HTML en el contenedor
    Prism.highlightAll();                 // Aplica resaltado de sintaxis con Prism.js
    addCopyButtons();                     // Añade botones de "Copiar" a cada bloque de código
  } else {
    // Informa en la consola si no se encuentra el contenedor
    console.error("No se encontró el contenedor con id='class-content'");
  }
}