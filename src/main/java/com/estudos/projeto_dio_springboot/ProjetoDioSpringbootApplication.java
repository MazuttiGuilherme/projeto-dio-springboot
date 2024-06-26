package com.estudos.projeto_dio_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 */
@EnableFeignClients
@SpringBootApplication
public class ProjetoDioSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDioSpringbootApplication.class, args);
	}

}
