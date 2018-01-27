package me.itzg.logbackkafkarelay;

import lombok.extern.slf4j.Slf4j;
import me.itzg.spring.propsource.EnableDockerSecretsPropertySource;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication @Slf4j
@EnableDockerSecretsPropertySource
public class LogbackKafkaRelayApplication implements ApplicationRunner {

    private final Environment env;

    @Autowired
    public LogbackKafkaRelayApplication(Environment env) {
        this.env = env;
    }

	public static void main(String[] args) {
		SpringApplication.run(LogbackKafkaRelayApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
        MDC.put("applicationName", env.getProperty("spring.application.name", "relay"));

		log.info("Running relay. Logback receiver listening={}:{}, Kafka bootstrap servers={}",
                 env.getProperty("logback.receiver.address"),
                 env.getProperty("logback.receiver.port"),
                 env.getProperty("spring.kafka.bootstrap-servers"));
		Thread.currentThread().join();
	}
}
