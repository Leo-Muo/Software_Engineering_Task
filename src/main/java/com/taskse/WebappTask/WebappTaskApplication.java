package com.taskse.WebappTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebappTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappTaskApplication.class, args);
	}
}
