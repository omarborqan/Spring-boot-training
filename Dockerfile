FROM openjdk:13-jdk-alpine
ADD ./target/spring-boot-mysql-0.0.1-SNAPSHOT.jar hotel.jar
ENTRYPOINT ["java","-jar","./hotel.jar"]

