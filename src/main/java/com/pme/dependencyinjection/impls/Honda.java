package com.pme.dependencyinjection.impls;

import com.pme.dependencyinjection.interfaces.Brand;
import org.springframework.stereotype.Component;

@Component
public class Honda implements Brand {
    @Override
    public String getBrandName() {
        return "Honda";
    }
}
