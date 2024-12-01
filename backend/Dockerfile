FROM openjdk:22-oracle
ARG JAR_BACKEND=target/backendHackaton-0.0.1.jar
WORKDIR /opt/app
COPY /weight weight/
COPY ${JAR_BACKEND} app.jar
ENTRYPOINT ["java","-jar","app.jar"]