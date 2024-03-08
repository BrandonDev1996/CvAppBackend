package com.brandonDev.CvAPP.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/usuario/**")
                        .allowedOrigins("http://localhost:4200") // Reemplaza con el origen correcto de tu aplicación Angular
                        .allowedMethods("GET", "POST", "PUT", "DELETE");
            }
        };
    }
}
