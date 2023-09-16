package com.pme.dependencyinjection.impls;

import com.pme.dependencyinjection.interfaces.Brand;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Toyota implements Brand{

    @Override
    public String getBrandName() {
        return "Toyota";
    }
}
