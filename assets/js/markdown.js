// markdown.js: Configuración y lógica para renderizar Markdown a HTML
console.log("markdown.js cargado correctamente");

// Configurar showdown.js con opciones adicionales
const converter = new showdown.Converter({
  tables: true, // Habilita la conversión de tablas
  ghCodeBlocks: true, // Permite bloques de código estilo GitHub
  parseImgDimensions: true, // Permite dimensiones de imágenes
  simpleLineBreaks: true, // Habilita saltos de línea simples
  strikethrough: true, // Permite tachado con ~~
  tasklists: true, // Habilita listas de tareas [ ] o [x]
});

// Convierte el markdown a HTML y ajusta bloques de código para resaltado de sintaxis
function renderMarkdownToHtml(markdown) {
  const rawHtml = converter.makeHtml(markdown);

  // Asegura que los bloques de código tengan la clase `language-java` para Prism.js
  const htmlContent = rawHtml.replace(
    /<pre><code class="(.*?)">/g,
    '<pre><code class="language-java $1">'
  );

  return htmlContent;
}
