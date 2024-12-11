package com.java.product.configure;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.java.product")
@EnableWebMvc

public class ProductConfigure {

    public ProductConfigure()
    {
        System.out.println("config created");
    }
}
