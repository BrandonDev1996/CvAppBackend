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
                // Configuración de CORS para /producto/**
                registry.addMapping("/producto/**")
                        .allowedOrigins("http://localhost:4200", "https://by-impresiones-3d.netlify.app/")
                        .allowedMethods("GET", "POST", "PUT", "DELETE");

                // Configuración de CORS para /imagenes/**
                registry.addMapping("/imagenes/**")
                        .allowedOrigins("http://localhost:4200", "https://by-impresiones-3d.netlify.app/")
                        .allowedMethods("GET");
            }
        };
    }
}