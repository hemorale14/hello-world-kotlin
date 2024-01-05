# Service web-api-1.0.0.jar
# ./gradlew clean build
# Build image with:  docker build -t web-api .
# Run image with: docker run -dp 9000:9000 web-api

### Imagen linux
FROM amazoncorretto:17.0.8
LABEL key="hemorale14"

ADD build/libs /opt/spring-boot
ADD src/main/resources  /opt/config

### Set Environment
ENV SERVER_HOME /opt/spring-boot

WORKDIR /opt/spring-boot

### Open Ports
EXPOSE 9000
 
### Start instance
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "-Dfile.encoding=UTF-8", "/opt/spring-boot/web-api-1.0.0.jar"]