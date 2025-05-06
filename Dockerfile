FROM openjdk:21-jdk-oracle
COPY target/docker-spring-app.jar docker-spring-app.jar
ENTRYPOINT ["java","-jar","docker-spring-app.jar"]