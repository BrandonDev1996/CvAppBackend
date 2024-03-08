FROM amazoncorretto:ll-alpine-jdk
MAINTAINER BrandonDev
COPY
ENTRYPOINT  ["java","-jar","/CvApp.jar"]

