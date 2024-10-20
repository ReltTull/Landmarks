#FROM openjdk:11-jre-slim
#WORKDIR /app
#COPY target/Landmarks-1.0-SNAPSHOT.jar /app.jar
#ENTRYPOINT ["java", "-jar", "/app.jar"]

#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#FROM openjdk:17-jdk-slim
#WORKDIR /app
#COPY target/Landmarks-1.0-SNAPSHOT.jar /app.jar
#ENV JAVA_OPTS=""
#CMD ["sh", "-c", "java $JAVA_OPTS -jar /app.jar"]

FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]