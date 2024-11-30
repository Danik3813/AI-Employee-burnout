FROM openjdk:22-oracle
ARG JAR_BACKEND=target/backendHackaton-0.0.1-SNAPSHOT.jar
ARG NEURO_JAR=original-sparkle-1.0.0.jar
WORKDIR /opt/app
COPY ${JAR_BACKEND} app.jar
COPY ${NEURO_JAR} orignal-sparkle-1.0.0.jar
ENTRYPOINT ["java","-jar","app.jar"]