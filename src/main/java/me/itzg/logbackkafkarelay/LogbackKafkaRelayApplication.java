package me.itzg.logbackkafkarelay;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication @Slf4j
public class LogbackKafkaRelayApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(LogbackKafkaRelayApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		log.info("Running relay");
		Thread.currentThread().join();
	}
}
