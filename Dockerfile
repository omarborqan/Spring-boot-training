FROM maven:3.6.3-jdk-13

WORKDIR /

COPY . ./
# Run install task so all necessary dependencies are downloaded and cached in
# the Docker image. We're running through the whole process but disable
# testing and make sure the command doesn't fail.
RUN ls && mvn clean install  --fail-never -B -DfailIfNoTests=false && ls target

# Copy the whole repository into the image





# https://documentation.codeship.com/pro/languages-frameworks/java/