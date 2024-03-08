FROM amazoncorretto:11-alpine-jdk
MAINTAINER BrandonDev
COPY target/CvAPP-0.0.1-SNAPSHOT.jar CvAPP.jar
ENTRYPOINT  ["java","-jar","/CvAPP.jar"]

