FROM amazoncorretto:21-alpine
LABEL authors="henryosei"
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]