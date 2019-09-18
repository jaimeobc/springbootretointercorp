# springbootretointercorp
Microservicio del Reto Intercorp

Es necesario instalar una BD MYSQL, con nombre:db_springboot_backend.

Por defecto, la tabla clientes se carga de datos usando el archivo: import.sql.

Se asume que cada cliente tiene un tiempo de vida aproximada de 75 años.

Al crear un cliente, la fecha de muerte se le asigna automáticamente en base a su fecha de nacimiento; por ello se le añade 75 años.

El endpoint de todos los clientes incluyendo la fecha probable de muerte es:

http://springbootintercorp-env.uvbwmc7v85.us-east-2.elasticbeanstalk.com:8090/api/clientes

El endpoint para determinar la edad promedio de los clientes es: 
http://springbootintercorp-env.uvbwmc7v85.us-east-2.elasticbeanstalk.com:8090/api/kpiaverage

El endpoint para determinar la desviación estandard de los clientes es: 
http://springbootintercorp-env.uvbwmc7v85.us-east-2.elasticbeanstalk.com:8090/api/kpistd

El endpoint para crear nuevos clientes:
http://springbootintercorp-env.uvbwmc7v85.us-east-2.elasticbeanstalk.com:8090/api/clientes

Ejemplo en el body:

{
"nombre": "Juan",
"apellido": "Perez",
"edad": 39,
"fechaNa": "1980-01-21"
}


Swagger:
http://springbootintercorp-env.uvbwmc7v85.us-east-2.elasticbeanstalk.com:8090/swagger-ui.html
