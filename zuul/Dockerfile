FROM openjdk:8-jre-alpine

WORKDIR /java-app

COPY target/app.jar app.jar

ENV EUREKA_CLIENT_SERVICE-URL_DEFAULT_ZONE http://pc-space1.ddns.net:8082/eureka

ENTRYPOINT ["java","-jar","/java-app/app.jar"]