# Web Api using Kotlin
# Compilar la aplicación
#./gradlew clean build
# Construir imagen y cargar la aplicación
#docker build -t hemorale14/kotlin-web-api:1.0.0 .
# Enviar la imagen a un repositorio público de Docker Hub
#docker push hemorale14/kotlin-web-api:1.0.0
# Levantar la aplicación y hacer port-forwarding para visualizar la API en local sobre el puerto 9001
#docker run --name my-kotlin-web-api -dp 9001:9000 hemorale14/kotlin-web-api:1.0.0


### Imagen linux
FROM amazoncorretto:17.0.8
#LABEL key="hemorale14"
LABEL \
  maintainer="Hector Rocha Morales <contacto.hectorrm@gmail.com>" \
  org.opencontainers.image.title="kotlin-web-api" \
  org.opencontainers.image.description="Demo docker web api using kotlin language"

ADD build/libs /opt/spring-boot
ADD src/main/resources  /opt/config

### Set Environment
ENV SERVER_HOME /opt/spring-boot

WORKDIR /opt/spring-boot

### Open Ports
EXPOSE 9000
 
### Start instance
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "-Dfile.encoding=UTF-8", "/opt/spring-boot/web-api-1.0.0.jar"]