#+title: Reto Tecnico - juego de Preguntas
#+author: Angela Monsalve
#+date: [2021-12-24]

Este proyecto se presenta como solución a los requerimientos del reto tecnico de Sofka. Es una aplicación de escritorio 
de un juego de preguntas, con 5 rondas en las que se avanza, si se responde correctamente cada pregunta. En caso de no hacerlo, 
se termina el juego. 
Las tecnologías revisadas y que están dentro de este repositorio son:

- IDE  - NETBEANS
- lenguaje de Programación  -Java
- Motor de base de datos - MySQL


* Compilando y usando el proyecto

** Preparando la base de datos

Para poder realizar registros en la aplicación, es recomendable ejecutar el programa XAMPP, activar el servidor apache, 
y el servidor de mySQL, puerto 3306. Se debe crear una base de datos llamada *juego_preguntas_db* en =MySQL=, esto se hace de la siguiente forma:

#+Ingresar a PHPMyadmin
se escribe en el navegador la ip de localhost: 127.0.0.1 
#+end_src

Luego, seleccionan la opción PHPMYADMIN para ver todas las bases de datos, aqui se da clic en nueva base de datos y luego va el menú importar,
para cargar la base de datos lista para importar que esta en la siguiente ruta:

#+Ruta de la base de datos que se debe importar en PHPMyadmin
....\juegoPreguntas\base de datos para importar\juego_preguntas_db
#+end_src

Cuando hayas cargado la base de datos, le das clic en continuar, asi se crean las tablas en la base de datos creada.
Ya se puede usar la aplicación y realizar registros.


** Ejecutando el proyecto

Es necesario descargar e instalar en la computadora JRE (Java Runtime Environment), antiguamente conocida como Java Virtual Machine (JVM).
puedes descargarlo en la siguiente ruta:

#+link para descarga de Java Runtime Environment
....\juegoPreguntas\base de datos para importar\juego_preguntas_db
#+end_src

Para ejecutar el proyecto, buscas en la carpeta dist dentro del proyecto, en la siguiente ruta y ejecutas el archivo "juegoPreguntas,jar":

#+begin_src sh
.....\juegoPreguntas\juegoPreguntas\dist\juegoPreguntas.jar
#+end_src
