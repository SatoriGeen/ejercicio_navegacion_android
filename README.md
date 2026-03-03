Ejercicio 2 - Explorador del Sistema Solar
Nava Villar Eric
Pérez Olivares José Julio
02/03/2026

En esta app se muestra el uso de navegacion utilizando multiples activities, donde avanzamos explorando diferentes pestañas (niveles)

El proyecto consta de 4 niveles de profundidad

MainActivity (Nivel 1 - Galaxia): punto de entrada y funciona como pantalla inicial
SistemaSolarActivity (Nivel 2 - Sistema Solar): segunda pantalla representa sistema solar
PlanetasActivity (Nivel 3 - Planetas): tercer nivel enfocado en los planetas
LunasActivity (Nivel 4 - Lunas): finalmente lunas el nivel mas profundo con el boton que avisa de "ultimo nivel"

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
<img width="485" height="620" alt="nivel1" src="https://github.com/user-attachments/assets/850520e1-d583-436f-93b1-67c4edea1e2c" />
(Nivel 2 - Sistema Solar)
<img width="478" height="617" alt="nivel2" src="https://github.com/user-attachments/assets/66d6c09a-d863-46d5-a53d-c7ffeef43ad6" />
(Nivel 3 - Planetas)
<img width="475" height="617" alt="nivel3" src="https://github.com/user-attachments/assets/8eb5b29a-a3cf-4d3a-8814-37f862e1fcaf" />
(Nivel 4 - Lunas)
<img width="481" height="619" alt="nivel4" src="https://github.com/user-attachments/assets/3a262da1-2891-4af3-bd85-3f0a126189cb" />
