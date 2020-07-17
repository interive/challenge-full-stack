FROM alpine:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
RUN apk --update add openjdk8-jre
ENTRYPOINT ["java","-jar","/app.jar"]