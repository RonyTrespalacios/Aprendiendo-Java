// main.js: Lógica para cargar el contenido dinámicamente y manejar la navegación
console.log("main.js cargado correctamente");

function toggleAccordion(element) {
  const details = document.querySelectorAll("details");
  details.forEach((detail) => {
    if (detail !== element) {
      detail.removeAttribute("open");
    }
  });
}

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

// Definición de las clases disponibles
const classes = [
  { id: "class01", name: "Clase 01: Introducción a Java" },
  { id: "class02", name: "Clase 02: Scanner y Operadores Lógicos" },
  { id: "class03", name: "Clase 03: Retos de aprendizaje" },
  { id: "class04", name: "Clase 04: Condicional if" },
];

// Función para cargar el listado de clases en la barra lateral
async function loadClassList() {
  const classList = document.getElementById("class-list");
  if (!classList) {
    console.error('No se encontró el elemento con id="class-list"');
    return;
  }

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

// Función para generar los botones de navegación
function generateNavigationButtons(classId) {
  const navigationContainer = document.createElement("div");
  navigationContainer.classList.add("navigation-buttons");

  const currentClassIndex = classes.findIndex(cls => cls.id === classId);
  
  // Crear botón para la clase anterior, si no es la primera clase
  if (currentClassIndex > 0) {
    const prevButton = document.createElement("a");
    prevButton.href = `./#/${classes[currentClassIndex - 1].id}`;
    prevButton.textContent = "← Clase Anterior";
    prevButton.classList.add("prev-button");
    navigationContainer.appendChild(prevButton);
  }

  // Crear botón para la clase siguiente, si no es la última clase
  if (currentClassIndex < classes.length - 1) {
    const nextButton = document.createElement("a");
    nextButton.href = `./#/${classes[currentClassIndex + 1].id}`;
    nextButton.textContent = "Clase Siguiente →";
    nextButton.classList.add("next-button");
    navigationContainer.appendChild(nextButton);
  } else {
    // Si es la última clase, el botón de siguiente debe estar deshabilitado
    const nextButton = document.createElement("a");
    nextButton.textContent = "Clase Siguiente →";
    nextButton.classList.add("next-button", "disabled");
    navigationContainer.appendChild(nextButton);
  }

  return navigationContainer;
}

// Función para cargar el contenido del README.md de cada clase y gestionar #class-content
async function loadClassContent(classId) {
  const contentArea = document.getElementById("class-content"); // Contenedor para el contenido HTML de la clase

  if (!contentArea) {
    console.error('No se encontró el contenedor de contenido con id="class-content"');
    return;
  }

  try {
    const response = await fetch(`./classes/${classId}/README.md`);
    if (!response.ok) throw new Error("No se pudo cargar el contenido de la clase");

    const markdown = await response.text();

    // Renderizar el markdown a HTML usando la función de markdown.js
    const htmlContent = renderMarkdownToHtml(markdown);

    // Insertar el HTML en el contenedor #class-content
    contentArea.innerHTML = htmlContent;

    // Aplicar resaltado de sintaxis usando Prism.js para formatear código
    Prism.highlightAll();

    // Insertar los botones de navegación después del contenido
    const navigationButtons = generateNavigationButtons(classId);
    contentArea.appendChild(navigationButtons);

    // Desplazar el contenedor de scroll hacia arriba con animación suave
    const scrollContainer = document.getElementById("content"); // Contenedor de scroll
    if (scrollContainer && scrollContainer.scrollTop > 0) {
      scrollContainer.scrollTo({ top: 0, behavior: "smooth" });
    }

    // Actualizar la URL para reflejar la clase cargada sin recargar la página
    history.pushState({ classId }, null, `#/${classId}`);
  } catch (error) {
    console.error(`Error al cargar el contenido de la clase ${classId}:`, error);
    contentArea.innerHTML = `<p style="color:red;">Error: ${error.message}</p>`;
  }
}

// Función para cargar y mostrar el contenido del README.md de la raíz en #class-content
async function showWelcomeMessage() {
  const contentArea = document.getElementById("class-content"); // Contenedor para el contenido HTML de la raíz

  if (!contentArea) {
    console.error('No se encontró el contenedor de contenido con id="class-content"');
    return;
  }

  try {
    const response = await fetch("./README.md"); // Cargar el README.md de la raíz
    if (!response.ok) throw new Error("No se pudo cargar el contenido de la raíz");

    const markdown = await response.text();

    // Renderizar el markdown a HTML usando la función de markdown.js
    const htmlContent = renderMarkdownToHtml(markdown);

    // Insertar el HTML en el contenedor #class-content
    contentArea.innerHTML = htmlContent;

    // Aplicar resaltado de sintaxis usando Prism.js para formatear código
    Prism.highlightAll();

    // Aplicar clases CSS necesarias para el contenedor
    contentArea.classList.remove("class-content"); // Remover estilos de clase
    contentArea.classList.add("home-content"); // Asegurar que se apliquen estilos específicos de home

    // Desplazar el contenedor de scroll hacia arriba con animación suave
    const scrollContainer = document.getElementById("content"); // Contenedor de scroll
    if (scrollContainer) {
      scrollContainer.scrollTo({ top: 0, behavior: "smooth" });
    }
  } catch (error) {
    console.error(`Error al cargar el contenido de la raíz:`, error);
    contentArea.innerHTML = `<p style="color:red;">Error: ${error.message}</p>`;
  }
}

// Función para gestionar el scroll y la carga de contenido según la ruta actual
function handleScrollOnRouteChange() {
  const scrollContainer = document.getElementById("content"); // Contenedor para manejar el scroll

  // Verificar si estamos en la ruta raíz (home)
  if (window.location.hash === "" || window.location.hash === "#/") {
    showWelcomeMessage(); // Cargar el contenido de la raíz
  } else {
    const classId = window.location.hash.replace("#/", "");
    loadClassContent(classId); // Cargar el contenido de la clase

    // Desplazar el contenedor de scroll hacia arriba con animación suave
    if (scrollContainer && scrollContainer.scrollTop > 0) {
      scrollContainer.scrollTo({ top: 0, behavior: "smooth" });
    }
  }
}

// Interceptar clics en enlaces del sidebar para evitar el salto brusco de scroll
document.querySelectorAll("#sidebar a").forEach((link) => {
  link.addEventListener("click", (event) => {
    event.preventDefault(); // Evitar el comportamiento predeterminado de clic

    const href = link.getAttribute("href"); // Obtener la URL de destino
    const classId = href.replace("#/", ""); // Obtener la clase a cargar

    // Actualizar la URL sin recargar la página
    history.pushState({ classId }, null, href);

    // Llamar a la función para cargar el contenido de la clase
    if (classId) {
      loadClassContent(classId);
    } else {
      // Si no hay classId, significa que se está volviendo a home
      showWelcomeMessage(); // Mostrar mensaje de bienvenida
    }
  });
});

// Detectar cambios de hash (ruta con #) y aplicar el manejo de scroll y carga de contenido
window.addEventListener("hashchange", handleScrollOnRouteChange);

// Detectar cambios de historial (botón Atrás/Adelante del navegador)
window.addEventListener("popstate", handleScrollOnRouteChange);

// Cargar la vista inicial basada en la URL actual
window.addEventListener("DOMContentLoaded", () => {
  handleScrollOnRouteChange(); // Cargar el contenido correspondiente al iniciar
});

document.addEventListener("DOMContentLoaded", () => {
  const layout = document.getElementById("layout"); // Contenedor principal del layout
  const sidebar = document.getElementById("sidebar"); // El sidebar
  const sidebarLinks = document.querySelectorAll("#sidebar nav ul li a"); // Todos los enlaces dentro del sidebar

  // Función para cerrar el sidebar en dispositivos móviles
  function closeSidebar() {
    if (layout.classList.contains("show-sidebar")) {
      layout.classList.remove("show-sidebar"); // Cerrar el sidebar si está abierto
    }
  }

  // Añadir evento de click a cada enlace dentro del sidebar
  sidebarLinks.forEach((link) => {
    link.addEventListener("click", () => {
      closeSidebar(); // Cerrar sidebar al hacer clic en un enlace
    });
  });

  // Cerrar el sidebar al cambiar de hash (cambio de ruta)
  window.addEventListener("hashchange", closeSidebar);

  // Cerrar el sidebar al cambiar el historial (botones Atrás/Adelante)
  window.addEventListener("popstate", closeSidebar);

  // Asegurar que el sidebar se cierre incluso en navegaciones internas de la aplicación
  document.body.addEventListener("click", (event) => {
    if (event.target.closest("#sidebar nav ul li a")) {
      closeSidebar(); // Detecta cualquier click dentro del sidebar y lo cierra
    }
  });
});

// Función para cargar y mostrar el contenido del README.md de la raíz
async function showWelcomeMessage() {
  const contentArea = document.getElementById("class-content");
  if (!contentArea) return;

  try {
    const response = await fetch("./README.md");
    if (!response.ok) throw new Error("No se pudo cargar el README.md de la raíz");

    const markdown = await response.text();

    const htmlContent = renderMarkdownToHtml(markdown);
    console.log("Contenido del README.md de la raíz cargado y renderizado");

    contentArea.innerHTML = htmlContent;

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
function init() {
  console.log("Inicializando la aplicación");
  loadClassList(); // Cargar la lista de clases en la barra lateral
  setupResponsiveMenu(); // Configurar el menú lateral

  // Cargar el contenido inicial según el hash de la URL
  const classIdFromUrl = window.location.hash.substring(2); // Remover `#/`
  if (classIdFromUrl) {
    console.log(`Cargando contenido inicial de la clase desde URL: ${classIdFromUrl}`);
    loadClassContent(classIdFromUrl); // Cargar la clase correspondiente
  } else {
    showWelcomeMessage(); // Si no hay hash, mostrar el contenido del README.md de la raíz
  }
}

// Ejecutar la función inicial cuando la página esté completamente cargada
window.addEventListener("DOMContentLoaded", init);

// Manejar el evento popstate para sincronizar la URL con el contenido cargado
window.addEventListener("popstate", (event) => {
  console.log("Evento popstate detectado:", event);

  const classIdFromUrl = window.location.hash.substring(2);

  if (classIdFromUrl) {
    loadClassContent(classIdFromUrl);
  } else {
    showWelcomeMessage();
  }
});
