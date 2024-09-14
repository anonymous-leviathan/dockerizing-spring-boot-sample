package com.mgunawardhana.spring.boot.docker.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
@RestController
public class SpringBootDockerApplication {

	@GetMapping("/message")
	public String getMessage(){
		log.info("Request received! Test docker image is working fine!");
		return "Welcome to the world of Docker!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
