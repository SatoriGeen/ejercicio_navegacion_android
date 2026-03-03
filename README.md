Ejercicio 2 - Explorador del Sistema Solar
Nava Villar Eric
Pérez Olivares José Julio
Perez Hernandez Tony Saifi 
02/03/2026

En esta app se muestra el uso de navegacion utilizando multiples activities, donde avanzamos explorando diferentes pestañas (niveles)

El proyecto consta de 4 niveles de profundidad

MainActivity (Nivel 1 - Galaxia): punto de entrada y funciona como pantalla inicial
SistemaSolarActivity (Nivel 2 - Sistema Solar): segunda pantalla representa sistema solar
PlanetasActivity (Nivel 3 - Planetas): tercer nivel enfocado en los planetas
LunasActivity (Nivel 4 - Lunas): finalmente lunas el nivel mas profundo.

Transiciones
se manejo utilizando Intents explicitos al presionar los botones correspondientes, se instancia un objeto Intent
que recibe como parametros el contexto actual (this) y la clase de la Activity.
La transición se ejecuta mediante el método startActivity(intent)

Ciclo de Vida
Para observar y evidenciar el comportamiento del ciclo de vida en la navegación se usaron mensajes de rastreo en la consola (Logcat)

 - onCreate(): se ejecuta y se registra cuando la Activity se crea por primera vez en memoria.
 - onStart(): se registra en el momento en que la Activity se vuelve visible para el usuario en la pantalla.

Instrucciones de Ejecución
 - descargar este repositorio en formato .zip y extraerlo.
 - abrir Android Studio y seleccionar File > Open navegando hasta la carpeta raíz del proyecto extraído.
 - Esperar a que el sistema Gradle termine de sincronizar las dependencias.
 - Seleccionar un emulador virtual (AVD) configurado.
 - Presionar el botón de Run "app" en la barra superior.

Evidencias de Ejecución
(Nivel 1 - Galaxia)
![Galaxia](https://github.com/user-attachments/assets/211fb874-3848-4827-b83a-26f54ee46de8)
(Nivel 2 - Sistema Solar)
![Solar](https://github.com/user-attachments/assets/d878cef7-61c7-4023-8fef-50890049ab1a)
(Nivel 3 - Planetas)
![Planetas](https://github.com/user-attachments/assets/85bda009-67a7-4e03-8763-e3736144e76b)
(Nivel 4 - Lunas)
![Luna](https://github.com/user-attachments/assets/604a76be-811c-488c-9e58-9d417f671485)

