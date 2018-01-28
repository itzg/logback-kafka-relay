FROM openjdk:8u151-jre

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-jar", "/opt/logback-kafka-relay.jar"]

ARG JAR_FILE
ADD target/${JAR_FILE} /opt/logback-kafka-relay.jar