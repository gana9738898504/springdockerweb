FROM openjdk:8-jdk-alpine
ADD build/libs/dockerspringweb-0.0.1-SNAPSHOT.jar dockerspringweb-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh","-c","java -jar /dockerspringweb-0.0.1-SNAPSHOT.jar "]