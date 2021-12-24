## title: Reto Tecnico Sofka - juego de Preguntas
## author: Angela Monsalve
## date: [2021-12-24]

Este proyecto se presenta como solución a los requerimientos del reto tecnico de Sofka. Es una aplicación de escritorio 
de un juego de preguntas, con 5 rondas en las que se avanza, si se responde correctamente cada pregunta. En caso de no hacerlo, 
se termina el juego. 
Las tecnologías revisadas y que se usaron para este proyecto son:

- IDE  - NETBEANS
- lenguaje de Programación  -Java
- Motor de base de datos - MySQL


## Vistas de la aplicación

** vista Principal

## ![image](https://user-images.githubusercontent.com/54193886/147368839-1cc9e482-a011-424f-abab-9083677f11df.png)


** vista guardar jugador

## ![image](https://user-images.githubusercontent.com/54193886/147368595-35ffc3c7-8273-4b0b-9acb-ed476be39464.png)

## ![image](https://user-images.githubusercontent.com/54193886/147368720-0fd246c5-d6b1-4b90-9eb7-f30cf312e86a.png)



** vista Registrar Pregunta

## ![image](https://user-images.githubusercontent.com/54193886/147368762-0684bff8-a083-483f-9f55-894090083cbc.png)

## ![image](https://user-images.githubusercontent.com/54193886/147368378-59a56542-ebd8-4247-b35d-29a159dc6a9a.png)


** vista Registrar Respuestas

## ![image](https://user-images.githubusercontent.com/54193886/147368545-ac0e9fae-6dab-47ae-9dc6-aa8b4b94e4d2.png)

## ![image](https://user-images.githubusercontent.com/54193886/147368568-0f42a3ff-a323-4940-a910-2b7464f7b116.png)

## ![image](https://user-images.githubusercontent.com/54193886/147368801-0187c9f7-b7c5-4b46-912a-86aa10b076ac.png)

** vista Jugar

## ![image](https://user-images.githubusercontent.com/54193886/147368875-c9e68592-014d-4953-8801-73f012bb6af6.png)


** vista Validar Respuesta

## ![image](https://user-images.githubusercontent.com/54193886/147368965-e9412f55-58b4-4920-a13e-63e2348b9c23.png)


## Preparando la base de datos

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


## Ejecutando el proyecto

Es necesario descargar e instalar en la computadora JRE (Java Runtime Environment), antiguamente conocida como Java Virtual Machine (JVM).
puedes descargarlo en la siguiente ruta:

#+link para descarga de Java Runtime Environment
https://www.java.com/es/download/ie_manual.jsp
#+end_src

Para ejecutar el proyecto, buscas en la carpeta dist dentro del proyecto, en la siguiente ruta y ejecutas el archivo "juegoPreguntas,jar":

#+begin_src sh
.....\juegoPreguntas\juegoPreguntas\dist\juegoPreguntas.jar
#+end_src
