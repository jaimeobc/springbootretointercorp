# springbootretointercorp
Microservicio del Reto Intercorp

Es necesario instalar una BD MYSQL, con nombre:db_springboot_backend.

Por defecto, la tabla clientes se carga de datos usando el archivo: import.sql.

Se asume que cada cliente tiene un tiempo de vida aproximada de 75 años.

Al crear un cliente, la fecha de muerte se le asigna automáticamente en base a su fecha de nacimiento; por ello se le añade 75 años.

El endpoint de todos los clientes incluyendo la fecha probable de muerte es:
http://localhost:8080/clientes

El endpoint para determinar la edad promedio de los clientes es: 
http://localhost:8080/clientes/kpiaverage

El endpoint para determinar la desviación estandard de los clientes es: 
http://localhost:8080/clientes/kpistd
