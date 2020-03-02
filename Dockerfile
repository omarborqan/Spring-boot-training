FROM 3.6.3-amazoncorretto-11

WORKDIR /

COPY . ./

RUN ls && mvn clean install  --fail-never -B -DfailIfNoTests=false && ls target


