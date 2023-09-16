package com.pme.dependencyinjection.impls;

import com.pme.dependencyinjection.interfaces.Brand;
import com.pme.dependencyinjection.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
//    @Autowired

    private Brand brand;


    //Constructor injection
    public Car (@Qualifier(value = "toyota") Brand brand) {
        this.brand = brand;
    }

    @Autowired
    @Qualifier(value = "v8")
    private Engine engine;


    //Setter injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //Setter injection
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void invent () {
        String brandName = brand.getBrandName();
        String engineType = engine.getEngineType();

        System.out.println("\nSuccessfully invented a new car: \nBrand -> "+brandName+" \nEngine -> "+engineType);
    }
}
