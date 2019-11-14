package br.com.microservices.ff4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;

@SpringBootApplication(exclude = ThymeleafAutoConfiguration.class)
public class Ff4JConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ff4JConsulApplication.class, args);
	}

}
