console.log("markdown.js cargado correctamente");

// Configurar showdown.js con opciones adicionales
const converter = new showdown.Converter({
  tables: true, 
  ghCodeBlocks: true, 
  parseImgDimensions: true, 
  simpleLineBreaks: true,
  strikethrough: true, 
  tasklists: true,
});

// Convierte el markdown a HTML y ajusta bloques de código para resaltado de sintaxis
function renderMarkdownToHtml(markdown) {
  const rawHtml = converter.makeHtml(markdown);
  const htmlContent = rawHtml.replace(
    /<pre><code class="(.*?)">/g,
    '<pre><code class="language-java $1">'
  );
  return htmlContent;
}

// Función para agregar el botón de copiar a cada bloque de código
function addCopyButtons() {
  const codeBlocks = document.querySelectorAll("pre");

  codeBlocks.forEach((block) => {
    const button = document.createElement("button");
    button.className = "copy-button";
    button.innerHTML = "Copiar"; 

    button.addEventListener("click", async () => {
      try {
        const code = block.querySelector("code").innerText;
        await navigator.clipboard.writeText(code);

        // Cambiar el contenido del botón y el color temporalmente para mostrar el estado de "Copiado"
        button.innerHTML = "";
        button.classList.add("copied"); // Agrega la clase para el color verde

        // Después de 2 segundos, restaurar el texto y el color a "Copiar"
        setTimeout(() => {
          button.innerHTML = "Copiar";
          button.classList.remove("copied"); // Remueve la clase verde
        }, 2000);
      } catch (error) {
        console.error("Error al copiar el código:", error);
      }
    });

    // Agregar el botón al bloque de código
    block.style.position = "relative";
    block.appendChild(button);
  });
}


// Función para renderizar el Markdown, añadir el botón de copiar, y colocar el HTML en `#class-content`
function renderMarkdownToHtmlWithCopy(markdown) {
  const htmlContent = renderMarkdownToHtml(markdown);
  const contentArea = document.getElementById("class-content");

  if (contentArea) {
    contentArea.innerHTML = htmlContent;
    Prism.highlightAll();
    addCopyButtons();
  } else {
    console.error("No se encontró el contenedor con id='class-content'");
  }
}
