// main.js: Lógica para cargar el contenido dinámicamente y manejar la navegación

/**
 * Función para manejar la apertura de un elemento "details" y cerrar otros abiertos
 * @param {HTMLElement} element - El elemento "details" que se desea abrir
 */
function toggleAccordion(element) {
  const details = document.querySelectorAll("details");
  details.forEach((detail) => {
    if (detail !== element) {
      detail.removeAttribute("open");
    }
  });
}

// Añade clases de animación a elementos "details" cuando se abren o cierran
const allDetails = document.querySelectorAll("details");

allDetails.forEach((details) => {
  details.addEventListener("toggle", () => {
    if (details.open) {
      details.classList.add("animating-open");
      details.classList.remove("animating-close");
    } else {
      details.classList.add("animating-close");
      details.classList.remove("animating-open");
    }
  });
});

// Lista de clases disponibles para navegación dinámica
const classes = [
  { id: "class01-intro", name: "Clase 01: Introducción a Java" },
  { id: "class02-scanner", name: "Clase 02: Scanner y Operadores Lógicos" },
  { id: "class03-reto1", name: "Clase 03: Retos de aprendizaje 1" },
  { id: "class04-if", name: "Clase 04: Condicional if" },
  { id: "class05-switch", name: "Clase 05: Switch" },
  { id: "class06-try", name: "Clase 06: Try Catch" },
  { id: "class07-String", name: "Clase 07: Clase String" },
  { id: "class08-Math", name: "Clase 08: Clase Math" },
  { id: "class09-reto2", name: "Clase 09: Retos de Aprendizaje 2" },
  { id: "class10-array", name: "Clase 10: Introducción a Arrays" },
  { id: "class11-for", name: "Clase 11: For - For each" },
  { id: "class12-while", name: "Clase 12: While - Do while" },
  { id: "class13-Arrays", name: "Clase 13: Clase Arrays" },
  { id: "class14-Wrappers", name: "Clase 14: Wrappers" },
  { id: "class15-reto3", name: "Clase 15: Retos de Aprendizaje 3" },
  { id: "class19-metodos", name: "Clase 16: Metodos" },
  { id: "class21-metodos2", name: "Clase 17: Metodos 2" },
];

/**
 * Carga la lista de clases en la barra lateral
 */
async function loadClassList() {
  const classList = document.getElementById("class-list");
  if (!classList) {
    console.error('No se encontró el elemento con id="class-list"');
    return;
  }

  // Crear enlaces para cada clase y añadirlos a la barra lateral
  classes.forEach((cls) => {
    const li = document.createElement("li");
    const a = document.createElement("a");
    a.href = `#${cls.id}`;
    a.textContent = cls.name;

    // Evento click para cargar el contenido de la clase sin recargar la página
    a.addEventListener("click", (event) => {
      event.preventDefault();
      loadClassContent(cls.id);
    });

    li.appendChild(a);
    classList.appendChild(li);
  });
}

/**
 * Genera botones de navegación para moverse entre clases
 * @param {string} classId - ID de la clase actual
 * @returns {HTMLElement} - Contenedor con los botones de navegación
 */
function generateNavigationButtons(classId) {
  const navigationContainer = document.createElement("div");
  navigationContainer.classList.add("navigation-buttons");

  const currentClassIndex = classes.findIndex((cls) => cls.id === classId);

  // Botón de clase anterior, si no es la primera
  if (currentClassIndex > 0) {
    const prevButton = document.createElement("a");
    prevButton.href = `./#/${classes[currentClassIndex - 1].id}`;
    prevButton.textContent = "← Clase Anterior";
    prevButton.classList.add("prev-button");
    navigationContainer.appendChild(prevButton);
  }

  // Botón de clase siguiente, si no es la última
  if (currentClassIndex < classes.length - 1) {
    const nextButton = document.createElement("a");
    nextButton.href = `./#/${classes[currentClassIndex + 1].id}`;
    nextButton.textContent = "Clase Siguiente →";
    nextButton.classList.add("next-button");
    navigationContainer.appendChild(nextButton);
  } else {
    // Botón deshabilitado para última clase
    const nextButton = document.createElement("a");
    nextButton.textContent = "Clase Siguiente →";
    nextButton.classList.add("next-button", "disabled");
    navigationContainer.appendChild(nextButton);
  }

  return navigationContainer;
}

/**
 * Carga el contenido del README.md de una clase específica en el contenedor principal
 * @param {string} classId - ID de la clase a cargar
 */
async function loadClassContent(classId) {
  const contentArea = document.getElementById("class-content");

  if (!contentArea) {
    console.error('No se encontró el contenedor de contenido con id="class-content"');
    return;
  }

  try {
    const response = await fetch(`./classes/${classId}/README.md`);
    if (!response.ok) throw new Error("No se pudo cargar el contenido de la clase");

    const markdown = await response.text();
    renderMarkdownToHtmlWithCopy(markdown); // Convierte y muestra el Markdown

    // Añade botones de navegación después del contenido
    const navigationButtons = generateNavigationButtons(classId);
    contentArea.appendChild(navigationButtons);

    // Desplaza el contenido hacia arriba suavemente
    const scrollContainer = document.getElementById("content");
    if (scrollContainer && scrollContainer.scrollTop > 0) {
      scrollContainer.scrollTo({ top: 0, behavior: "smooth" });
    }

    // Actualiza la URL para reflejar la clase cargada
    history.pushState({ classId }, null, `#/${classId}`);
  } catch (error) {
    console.error(`Error al cargar el contenido de la clase ${classId}:`, error);
    contentArea.innerHTML = `<p style="color:red;">Error: ${error.message}</p>`;
  }
  closeSidebar();
}

/**
 * Maneja el cambio de contenido en función de la ruta actual
 */
function handleScrollOnRouteChange() {
  const scrollContainer = document.getElementById("content");

  if (window.location.hash === "" || window.location.hash === "#/") {
    showWelcomeMessage();
  } else {
    const classId = window.location.hash.replace("#/", "");
    loadClassContent(classId);

    if (scrollContainer && scrollContainer.scrollTop > 0) {
      scrollContainer.scrollTo({ top: 0, behavior: "smooth" });
    }
  }
}

// Detectar y manejar clics en enlaces del sidebar
document.querySelectorAll("#sidebar a").forEach((link) => {
  link.addEventListener("click", (event) => {
    event.preventDefault();
    const href = link.getAttribute("href");
    const classId = href.replace("#/", "");
    history.pushState({ classId }, null, href);
    classId ? loadClassContent(classId) : showWelcomeMessage();
  });
});

document.querySelectorAll("#sidebar a").forEach((link) => {
  link.addEventListener("click", () => {
    closeSidebar(); // Cierra el menú al hacer clic en cualquier enlace del menú
  });
});

// Configurar eventos para cambios de hash y de historial
window.addEventListener("hashchange", () => {
  handleScrollOnRouteChange(); // Llama a la función que gestiona el cambio de ruta
  closeSidebar(); // Cierra el menú cuando cambia la URL de hash
});
window.addEventListener("popstate", () => {
  handleScrollOnRouteChange(); // Llama a la función que gestiona el cambio de ruta
  closeSidebar(); // Cierra el menú cuando se navega en el historial
});

/**
 * Muestra el contenido del README.md de la raíz en el contenedor principal
 */
async function showWelcomeMessage() {
  const contentArea = document.getElementById("class-content");

  if (!contentArea) {
    console.error('No se encontró el contenedor de contenido con id="class-content"');
    return;
  }

  try {
    const response = await fetch("./README.md");
    if (!response.ok) throw new Error("No se pudo cargar el contenido de la raíz");

    const markdown = await response.text();
    const htmlContent = renderMarkdownToHtml(markdown);
    contentArea.innerHTML = htmlContent;
    Prism.highlightAll();

    contentArea.classList.remove("class-content");
    contentArea.classList.add("home-content");

    const scrollContainer = document.getElementById("content");
    if (scrollContainer) {
      scrollContainer.scrollTo({ top: 0, behavior: "smooth" });
    }
  } catch (error) {
    console.error(`Error al cargar el contenido de la raíz:`, error);
    contentArea.innerHTML = `<p style="color:red;">Error: ${error.message}</p>`;
  }
  closeSidebar();
}

/**
 * Configura el menú responsive para dispositivos móviles
 */
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

/**
 * Función para cerrar el menú lateral en dispositivos móviles.
 */
function closeSidebar() {
  const layout = document.getElementById("layout"); // Contenedor principal del layout
  if (layout.classList.contains("show-sidebar")) {
    layout.classList.remove("show-sidebar"); // Remueve la clase para cerrar el menú
  }
}

/**
 * Inicializa la página cargando la lista de clases y el menú responsive
 */
function init() {
  loadClassList();
  setupResponsiveMenu();

  const classIdFromUrl = window.location.hash.substring(2);
  classIdFromUrl ? loadClassContent(classIdFromUrl) : showWelcomeMessage();
}

window.addEventListener("DOMContentLoaded", init);
window.addEventListener("popstate", handleScrollOnRouteChange);