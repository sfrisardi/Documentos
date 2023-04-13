Frisardi Sebastián

s_frisardi@yahoo.com.ar

Para generar el proyecto se utilizó: https://start.spring.io/,
para lo cual especifique en la misma que sea un proyecto maven, java 1.8 y Spring boot

Luego agregue las dependecias para h2 (pom.xml y application.properties)

Luego a través del marketplace de eclipse instale el Spring tools 4

Luego de terminar el desarrollo para compilar y levantar el tomcat embebido use lo siguiente:
maven clean, mvn install, maven build(compile) y run as Spring boot App

Las pruebas se realizaron a través de Postman:

Get http://localhost:8080/accu

Get http://localhost:8080/costumer

Post http://localhost:8080/costumer
{"id":1, "firstName":"juan", "lastName":"perez", "location":"Castelar"}

Get http://localhost:8080/task

Post  http://localhost:8080/task
{"id":1, "firstName":"john", "lastName":"doe", "location":"Arizona"}

Comentarios del desarrollo:

Me costó usar la apis públicas de accuweather por falta de experiencia con las mismas, 
pero logré generar una cuenta, sacar mi API KEY y hacer un GetMapping de un servicio probando la conexión.

Para demostrar conocimientos h2 genere una Entidad Task con su dao, interface y service
En el Controller agregue get y post para cargar la base y listarla con json

Así mismo genere un get y post de un Customer que se guarda en memoria utilizando un HashMap 

Saludos Sebastián!







