FROM eclipse-temurin:17-jdk-focal
COPY ./backend/target/versioncontrol-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8181
ENTRYPOINT ["java","-jar","/app.jar"]