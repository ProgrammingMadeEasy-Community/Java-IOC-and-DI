package com.pme.dependencyinjection.app;

import com.pme.dependencyinjection.impls.Car;
import org.springframework.boot.CommandLineRunner;

//@Component
public class Automobile implements CommandLineRunner {

//    @Autowired  //Field Injection
    private Car car;

    @Override
    public void run(String... args) {
        car.invent();
    }
}
