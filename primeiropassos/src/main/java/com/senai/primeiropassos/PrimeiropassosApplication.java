package com.senai.primeiropassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@SpringBootApplication
public class PrimeiropassosApplication {

	@RequestMapping("/")
	String home() {
		return "Olá Mundo";
	}

	@RequestMapping("use")
	public String use(){
		
	}
		return new String();
	}
	

	public static void main(String[] args) {
		SpringApplication.run(PrimeiropassosApplication.class, args);
	}

}
