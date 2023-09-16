package com.pme.dependencyinjection.impls;

import com.pme.dependencyinjection.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class V6 implements Engine {
    @Override
    public String getEngineType() {
        return "V6";
    }
}
