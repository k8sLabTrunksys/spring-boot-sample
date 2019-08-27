FROM openjdk:8-jdk-slim
COPY target/spring-boot-sample-data-rest-0.1.0.jar /app/
EXPOSE 8000
WORKDIR /app
CMD ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-jar", "spring-boot-sample-data-rest-0.1.0.jar"]