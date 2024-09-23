package com.brandonDev.CvAPP.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {


    @RequestMapping("/error")
    public ModelAndView handleError() {
        // Retornar tu página de error personalizada
        return new ModelAndView("error"); // Cambia "error" por tu vista de error
    }



    // Agrega más manejadores de excepciones según sea necesario
}