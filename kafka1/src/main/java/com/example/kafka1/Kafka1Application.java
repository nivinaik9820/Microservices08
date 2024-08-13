package com.example.kafka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class Kafka1Application {

	public static void main(String[] args) {
		SpringApplication.run(Kafka1Application.class, args);
	}

}
