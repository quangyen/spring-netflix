FROM openjdk:8-jre-alpine

WORKDIR /java-app

COPY target/app.jar app.jar

ENV SPRING_CLOUD_CONFIG_URI http://pc-space1.ddns.net:8081

ENTRYPOINT ["java","-jar","/java-app/app.jar"]