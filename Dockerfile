FROM maven:3
RUN mkdir -p /tmp/build
ADD /src /tmp/build/
WORKDIR /tmp/build
RUN mvn install clean --fail-never -B -DfailIfNoTests=false
COPY . ./
