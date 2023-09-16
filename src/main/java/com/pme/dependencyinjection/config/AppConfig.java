package com.pme.dependencyinjection.config;

import com.pme.dependencyinjection.impls.V8;
import com.pme.dependencyinjection.interfaces.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Engine engine () {
        return new V8();
    }

}
