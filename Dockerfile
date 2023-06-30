FROM amazoncorretto:17-alpine

COPY target/ism-0.0.1-SNAPSHOT.jar ism-app.jar

ENTRYPOINT ["java","-jar","/ism-app.jar"]

EXPOSE 8080
