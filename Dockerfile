FROM maven:3.6.3-amazoncorretto-11

WORKDIR /

COPY . ./

RUN mvn clean install --fail-never -B -DfailIfNoTests=false && ls

COPY ./target /data








