// main.js: Lógica para cargar el contenido dinámicamente y manejar la navegación
console.log("main.js cargado correctamente");

// Función para cargar el listado de clases en la barra lateral
async function loadClassList() {
  const classList = document.getElementById("class-list");
  if (!classList) {
    console.error('No se encontró el elemento con id="class-list"');
    return;
  }

  // Definición de las clases disponibles
  const classes = [
    { id: "class01", name: "Clase 01: Introducción a Java" },
    { id: "class02", name: "Clase 02: Proximamente" },
  ];

  // Imprimir la lista de clases en consola para depurar
  console.log("Cargando lista de clases:", classes);

  // Crear los enlaces para cada clase y añadirlos a la barra lateral
  classes.forEach((cls) => {
    const li = document.createElement("li");
    const a = document.createElement("a");
    a.href = `#${cls.id}`;
    a.textContent = cls.name;

    // Evento click para cargar el contenido de la clase
    a.addEventListener("click", (event) => {
      event.preventDefault(); // Evitar la recarga de la página
      console.log(`Cargando contenido de ${cls.id}`);
      loadClassContent(cls.id);
    });

    li.appendChild(a);
    classList.appendChild(li);
  });
}

// Función para cargar el contenido del README.md de cada clase
async function loadClassContent(classId) {
  console.log(`Intentando cargar el contenido de la clase: ${classId}`);
  const contentArea = document.getElementById("class-content");

  if (!contentArea) {
    console.error(
      'No se encontró el contenedor de contenido de la clase con id="class-content"'
    );
    return;
  }

  try {
    const response = await fetch(`./classes/${classId}/README.md`);
    if (!response.ok)
      throw new Error("No se pudo cargar el contenido de la clase");

    const markdown = await response.text();
    console.log(`Markdown de ${classId} cargado correctamente:`, markdown);

    // Renderizar el markdown a HTML usando la función de markdown.js
    const htmlContent = renderMarkdownToHtml(markdown);
    console.log(`HTML convertido para ${classId}:`, htmlContent);

    // Insertar el HTML en el contenedor principal
    contentArea.innerHTML = htmlContent;

    // Actualizar la URL sin recargar la página
    history.pushState({ classId }, null, `#/${classId}`);

    // Aplicar resaltado de sintaxis usando Prism.js
    Prism.highlightAll();
  } catch (error) {
    console.error(
      `Error al cargar el contenido de la clase ${classId}:`,
      error
    );
    contentArea.innerHTML = `<p style="color:red;">Error: ${error.message}</p>`;
  }
  // Insertar el HTML en el contenedor principal
  contentArea.innerHTML = htmlContent;

  // Asegurar que el `layout` ocupe toda la altura al agregar contenido dinámico
  //document.getElementById("layout").style.minHeight = "100vh";
}

// Función para cargar y mostrar el contenido del README.md de la raíz
async function showWelcomeMessage() {
  const contentArea = document.getElementById("class-content");
  if (!contentArea) return;

  try {
    // Intentar cargar el README.md de la raíz
    const response = await fetch("./README.md");
    if (!response.ok)
      throw new Error("No se pudo cargar el README.md de la raíz");

    const markdown = await response.text();

    // Renderizar el markdown a HTML usando la función de markdown.js
    const htmlContent = renderMarkdownToHtml(markdown);
    console.log("Contenido del README.md de la raíz cargado y renderizado");

    // Insertar el HTML en el contenedor principal
    contentArea.innerHTML = htmlContent;

    // Aplicar resaltado de sintaxis si hay bloques de código en el README.md
    Prism.highlightAll();
  } catch (error) {
    console.error("Error al cargar el README.md de la raíz:", error);
    contentArea.innerHTML = `<p style="color:red;">Error: ${error.message}</p>`;
  }
}

// Función para manejar el menú responsive
function setupResponsiveMenu() {
  const sidebar = document.getElementById("sidebar");
  const toggleButton = document.createElement("button");
  toggleButton.id = "menu-toggle";
  toggleButton.textContent = "☰";
  document.body.appendChild(toggleButton);

  toggleButton.addEventListener("click", () => {
    document.getElementById("layout").classList.toggle("show-sidebar");
  });
}

// Inicializar la página cargando el listado de clases y configurando el menú
// Inicializar la página cargando el listado de clases y configurando el menú
function init() {
  console.log("Inicializando la aplicación");
  loadClassList(); // Cargar la lista de clases en la barra lateral
  setupResponsiveMenu(); // Configurar el menú lateral

  // Cargar el contenido inicial según el hash de la URL
  const classIdFromUrl = window.location.hash.substring(2); // Remover `#/`
  if (classIdFromUrl) {
    console.log(
      `Cargando contenido inicial de la clase desde URL: ${classIdFromUrl}`
    );
    loadClassContent(classIdFromUrl); // Cargar la clase correspondiente
  } else {
    // Si no hay hash, mostrar el contenido del README.md de la raíz
    showWelcomeMessage();
  }
}

// Ejecutar la función inicial cuando la página esté completamente cargada
window.addEventListener("DOMContentLoaded", init);

// Manejar el evento popstate para sincronizar la URL con el contenido cargado
window.addEventListener("popstate", (event) => {
  console.log("Evento popstate detectado:", event);

  // Obtener el ID de la clase desde la URL (por ejemplo, #/class01)
  const classIdFromUrl = window.location.hash.substring(2); // Remueve `#` y `/`

  if (classIdFromUrl) {
    console.log(
      `Cargando contenido de la clase desde popstate: ${classIdFromUrl}`
    );
    loadClassContent(classIdFromUrl); // Cargar la clase según el ID en la URL
  } else {
    // Si no hay hash en la URL, mostrar el contenido del README.md de la raíz
    showWelcomeMessage();
  }
});
