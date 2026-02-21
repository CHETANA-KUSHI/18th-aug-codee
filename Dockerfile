FROM eclipse-temurin:17-jdk
WORKDIR /app 
COPY target/order-service-1-0.0.1-SNAPSHOT.jar
EXPOSE 8761 
ENTRYPOINT ["java","-jar","app.jar"]