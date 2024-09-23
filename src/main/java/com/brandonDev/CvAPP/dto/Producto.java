package com.brandonDev.CvAPP.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private String categoria;
    private String nombre;
    private double precio;
    private String imagen;
    private int like;

}
