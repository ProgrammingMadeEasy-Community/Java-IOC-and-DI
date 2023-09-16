package com.pme.dependencyinjection;

import com.pme.dependencyinjection.impls.Car;
import com.pme.dependencyinjection.impls.Honda;
import com.pme.dependencyinjection.impls.V6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}

	@Autowired
	private Car car;

	@Autowired
	private V6 v6;

	@Autowired
	private Honda honda;

	@Bean
	public CommandLineRunner commandLineRunner () {
		return args -> {
				car.setEngine(v6);
				car.setBrand(honda);
				car.invent();
		};
	}

}