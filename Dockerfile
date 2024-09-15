FROM ubuntu:latest as build

RUN apt-get update
RUN apt-get install openjdk:21-jdk
COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:21-jdk

EXPOSE 8080

COPY --from=build target/desafio.aws-0.0.1-SNAPSHOT.jar /app/app.jar

CMD ["java","-jar","/app/app.jar"]
