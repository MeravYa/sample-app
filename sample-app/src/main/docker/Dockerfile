FROM openjdk:17-alpine

WORKDIR /opt/sample

COPY sample-service.0.0.1.jar app.jar

ENTRYPOINT ["java","-Dspring.profiles.active=dev", "-jar","app.jar"]