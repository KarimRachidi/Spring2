package com.eoi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //haz tu magia, spring
@RestController //y además preparate para recibir peticiones http
public class MySpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(MySpringBootApplication.class, args);
	}
@RequestMapping("/")
	String hellow()
{
	return "Hello World";
}
	@RequestMapping("/hola")
	String hola()
	{
		return "Hola mundo";
	}
	@RequestMapping("/mimedicacion")

	String mimedicacion()
	{
		return "Tomate las pastillas";
	}
}
