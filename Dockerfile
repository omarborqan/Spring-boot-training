FROM openjdk:13-jdk-alpine

RUN mkdir /tmp/build

WORKDIR /tmp/build
#RUN mvn install clean --fail-never -B -DfailIfNoTests=false
COPY . ./
CMD ["printenv"]

#FROM ubuntu:zesty
#
#RUN mkdir /usr/src/app
#WORKDIR /usr/src/app
#
#COPY . .
#
#CMD ["printenv"]


## We're using the official Maven 3 image from the Docker Hub (https://hub.docker.com/_/maven/).
## Take a look at the available versions so you can specify the Java version you want to use.
#FROM maven:3
#
## INSTALL any further tools you need here so they are cached in the docker build
#
#WORKDIR /app
#
## Copy the pom.xml into the image to install all dependencies
#COPY pom.xml ./
#
## Run install task so all necessary dependencies are downloaded and cached in
## the Docker image. We're running through the whole process but disable
## testing and make sure the command doesn't fail.
#RUN mvn install clean --fail-never -B -DfailIfNoTests=false
#
## Copy the whole repository into the image
#COPY . ./
