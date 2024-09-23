package com.brandonDev.CvAPP.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public ModelAndView handleError() {
        // Retornar tu página de error personalizada
        return new ModelAndView("error"); // Cambia "error" por el nombre de tu vista de error
    }


}