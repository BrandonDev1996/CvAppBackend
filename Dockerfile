FROM amazoncorretto:ll-alpine-jdk                                 //de que imagen partimos
MAINTAINER BrandonDev                                             //quien es el dueño
COPY                                                              //va copiar de nuestro proyecto el empaquetado y lo sube
ENTRYPOINT  ["java","-jar","/CvApp.jar"]                          //es la instruccion que se va a ejecutar primero

