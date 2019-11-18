package br.com.microservices.ff4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@EnableAutoConfiguration
public class Ff4JConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ff4JConsulApplication.class, args);
	}

}
