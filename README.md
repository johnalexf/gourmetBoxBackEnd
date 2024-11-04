# GourmetBoxBackEnd
GourmetBoxBackend: Un Proyecto Backend de E-commerce
Proyecto basado en Spring Boot, Java y MySQL

Este proyecto constituye la parte del servidor (backend) de la tienda en línea Gourmet Box.
Se encarga de gestionar la información de usuarios y productos.

Alcance Actual:

Por el momento, el proyecto se enfoca en las siguientes funcionalidades:

Consulta: Permite buscar información sobre usuarios y productos.
Edición: Facilita la modificación de datos de usuarios y productos.
Creación: Permite agregar nuevos usuarios y productos al sistema.
Próximos Pasos:

Se planea expandir el proyecto para incluir la funcionalidad de carrito de compras,
permitiendo a los usuarios guardar los productos que desean adquirir.

Guía de Inicio Rápido:

1. Crea una Base de Datos:
Utiliza phpMyAdmin para crear una base de datos vacía llamada gbox.

2. Configura la Conexión a la Base de Datos:
Abre el archivo application.properties y verifica la URL de conexión a tu base de datos. 
Asegúrate de que coincida con la configuración de tu servidor MySQL.
Ejemplo:
spring.datasource.url=jdbc:mysql://localhost:3306/gbox?useSSL=false&serverTimeZone=UTC

3. Crea las Tablas:
Ejecuta los scripts SQL ubicados en la carpeta tarea11/script para crear las tablas necesarias en tu base de datos.

4. Inicia la Aplicación:
Ejecuta la clase GourmetBoxBackendApplication.

5. Prueba la Aplicación:
Utiliza el programa POSTMAN para realizar solicitudes HTTP y verificar el funcionamiento de las API. 
Los ejemplos de solicitudes se encuentran en la carpeta /tarea12y13.

