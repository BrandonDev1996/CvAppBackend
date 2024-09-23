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
    public ResponseEntity<List<Producto>> getProductos() {
        List<Producto> productos = productoService.getProductos();

        if (productos.isEmpty()) {
            return ResponseEntity.noContent().build(); // 204 No Content si no hay productos
        }

        return ResponseEntity.ok(productos); // 200 OK con la lista de productos
    }


}
