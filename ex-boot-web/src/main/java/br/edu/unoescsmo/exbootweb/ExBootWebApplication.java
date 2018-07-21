package br.edu.unoescsmo.exbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExBootWebApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ExBootWebApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ExBootWebApplication.class);
	}
}
