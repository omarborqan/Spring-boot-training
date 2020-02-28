FROM openjdk:13-jdk-alpine
ADD ./target/spring-boot-mysql-0.0.1-SNAPSHOT.jar hotel.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","./hotel.jar"]
