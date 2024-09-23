package com.brandonDev.CvAPP.controller;

import com.brandonDev.CvAPP.dto.Producto;
import com.brandonDev.CvAPP.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public ResponseEntity getProductos(){
        List<Producto> producto = productoService.getProductos();
        return null;
    }

}
