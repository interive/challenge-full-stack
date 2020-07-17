FROM alpine:latest
ADD target/classes/HelloWorld.class HelloWorld.class
RUN apk --update add openjdk8-jre
ENTRYPOINT ["java", "HelloWorld"]