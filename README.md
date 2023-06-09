Tienda Saludable
El proyecto 'Tienda Saludable' es una aplicación para gestionar la venta de productos saludables y la asignación de dietas a los clientes.

Requisitos previos
Para ejecutar el proyecto necesitarás tener instalado:

Java 11 o superior
Maven
MySQL (o cualquier otro sistema de gestión de bases de datos)
Configuración de la base de datos
Primero, debes crear una base de datos con el nombre 'TiendaSaludable' en tu sistema de gestión de bases de datos. Luego, ejecuta el archivo SQL proporcionado en la carpeta 'sql' para crear las tablas y llenarlas con datos.

Clonar el repositorio
Para obtener una copia local del proyecto, usa el siguiente comando:


git clone https://github.com/D4h3r/TiendaSaludable.git
Configuración del proyecto
Una vez que hayas clonado el repositorio, abre el archivo 'application.properties' en la carpeta 'resources'. Aquí, debes actualizar los detalles de la conexión a la base de datos (nombre de usuario y contraseña) según tu configuración local.

Compilar y ejecutar el proyecto
Desde la carpeta raíz del proyecto, puedes compilar y ejecutar el proyecto con Maven usando los siguientes comandos:

Para compilar el proyecto:

mvn compile
Para ejecutar el proyecto:

mvn exec:java
Ahora, deberías poder acceder a la aplicación a través de tu navegador en 'localhost:8080'.
