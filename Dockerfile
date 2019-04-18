FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY build/libs/*-all.jar redblue.jar
ENTRYPOINT ["java", "-jar", "redblue.jar"]