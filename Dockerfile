FROM openjdk:14-slim
RUN apt-get update && apt-get install -y curl

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]