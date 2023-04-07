# microservicioSpring
Demo básica de creación de microservicio en Spring Boot y swagger para documentar la API<br>
http://localhost:8080/md5/swagger-ui/index.html<br>
http://localhost:8080/md5/mostrar/<br>
http://localhost:8080/md5/mostrar/ABC<br><br>

Crear JAR: maven package (el JAR estará en target, este destino debera ser la que luego se usa en el Dockerfile - modificar Dockerfile si procede)<br><br>
Estando en la carpeta que contiene DOCKERFILE, crear contenedor Docker: docker build -t microservicio:v1.0 .<br><br>
Ejecutar imagen:<br>
   Usar el ID de la imagen cread.<br>
   Puertos 80:8080 indica que se pueda acceder al contenedor usando el puerto 80 ( http://localhost/md5/swagger-ui/index.html )<br>
   y este pase la petición al servicio contenido al puerto 8080 - este puerto viene definido por la aplicacion al crearse<br>
docker run -d -p 80:8080 <id><br>

Comprobar contenedores activos: docker ps<br>
Detener contenedor: docker stop <id>