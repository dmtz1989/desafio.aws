FROM openjdk:21-jdk

EXPOSE 8080

COPY desafio.aws-0.0.1-SNAPSHOT.jar /app/app.jar

CMD ["java","-jar","/app/app.jar"]
