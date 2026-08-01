package com.docker.example.dockerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerAppApplication.class, args);
	}
	
	@GetMapping("/message")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/message2")
	public String helloWorld2() {
		return "Hello Divya!";
	}
}