FROM amazoncorretto:17-alpine-jdk

COPY target/ism-0.0.1-SNAPSHOT.jar ism-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/ism-0.0.1-SNAPSHOT.jar"]
