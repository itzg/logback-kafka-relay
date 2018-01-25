# logback-kafka-relay

This little Spring Boot application leverages the existing [logback receiver concept](https://logback.qos.ch/manual/receivers.html),
relays the logs via [Daniel Wegener's kafka appender](https://github.com/danielwegener/logback-kafka-appender), 
and formats the log content into JSON using [logstash's logback library](https://github.com/logstash/logstash-logback-encoder).
