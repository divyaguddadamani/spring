package com.java.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.java.spring")
@EnableWebMvc

public class ScholarshipConfig {

    public ScholarshipConfig()
    {
        System.out.println("config created");
    }
}
