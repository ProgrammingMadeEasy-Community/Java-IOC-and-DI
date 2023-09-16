package com.pme.dependencyinjection.impls;

import com.pme.dependencyinjection.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component
public class V8 implements Engine {
    @Override
    public String getEngineType () {
        return "V8";
    }
}
