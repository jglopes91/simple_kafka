FROM azul/zulu-openjdk-alpine:17-latest

WORKDIR /app

COPY target/producer-0.0.1-SNAPSHOT.jar app.war

CMD ["java", "-jar", "app.war"]