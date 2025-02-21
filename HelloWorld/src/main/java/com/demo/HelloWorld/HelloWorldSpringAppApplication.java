package com.demo.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringAppApplication.class, args);
	}
}
	@RestController
	class HelloWorld {
	@RequestMapping("/")
	      public String helloWorld() {
			return "Hello, World!";
		}
	@RequestMapping("/message")
		public String message() {
		return "How are you ?";
	}


}


