FROM maven:3.6.3-jdk-13

WORKDIR /src

# Copy the pom.xml into the image to install all dependencies
COPY pom.xml ./

# Run install task so all necessary dependencies are downloaded and cached in
# the Docker image. We're running through the whole process but disable
# testing and make sure the command doesn't fail.
RUN mvn install clean --fail-never -B -DfailIfNoTests=false

# Copy the whole repository into the image
COPY . ./


