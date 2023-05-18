FROM amazoncorretto:17

COPY target/ism-0.0.1-SNAPSHOT.jar ism-app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/ism-app.jar"]
