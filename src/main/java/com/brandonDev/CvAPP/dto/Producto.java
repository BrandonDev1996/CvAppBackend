package com.brandonDev.CvAPP.dto;

public class Producto {
    private String categoria;
    private String nombre;
    private double precio;
    private String imgCode;
    private int like;

    // Constructor
    public Producto(String categoria, String nombre, double precio, String imgCode, int like) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.imgCode = imgCode;
        this.like = like;
    }

    // Constructor sobrecargado con like por defecto a 0
    public Producto(String categoria, String nombre, double precio, String imgCode) {
        this(categoria, nombre, precio, imgCode, 0);
    }

    // Método para mostrar la información del producto
    @Override
    public String toString() {
        return String.format("Producto: %s, Categoría: %s, Precio: $%.2f, Likes: %d",
                nombre, categoria, precio, like);
    }

}
