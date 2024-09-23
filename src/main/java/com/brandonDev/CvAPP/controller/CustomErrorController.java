package com.brandonDev.CvAPP.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public ModelAndView handleError() {
        // Retornar tu página de error personalizada
        return new ModelAndView("error"); // Cambia "error" por el nombre de tu vista de error
    }


}