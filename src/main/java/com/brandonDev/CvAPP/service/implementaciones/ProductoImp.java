package com.brandonDev.CvAPP.service.implementaciones;
import com.brandonDev.CvAPP.dto.Producto;
import com.brandonDev.CvAPP.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoImp implements ProductoService {

    private final ResourceLoader resourceLoader;

    @Autowired
    public ProductoImp(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public List<Producto> getProductos() {
        List<Producto> productos = crearProductos();
        return productos;
    }

    private List<Producto> crearProductos() {
        List<Producto> productos = new ArrayList<>();
        String rutaImagen = "classpath:imagenes/app/"; // Ruta de la imagen en resources

        // Obtener la imagen como Resource
        Resource imagenResource = resourceLoader.getResource(rutaImagen);

        // Construir la URL del entorno
        String baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();
        String imageUrl = baseUrl + "/imagenes/" + imagenResource.getFilename(); // URL accesible en el frontend

        // Agregar el producto usando la URL completa
        productos.add(new Producto("Funko Pop", "Chucky", 10000, imageUrl + "chucky.jpg", 0));
        productos.add(new Producto("Llavero", "egresado", 2500, imageUrl + "egresado.jpg", 0));
        productos.add(new Producto("Funko Pop", "Harry Potter", 10000, imageUrl + "harrypotter.jpg", 0));
        productos.add(new Producto("Soporte Celular", "Hulk", 8000, imageUrl + "hulk.jpg", 0));
        productos.add(new Producto("Llavero", "A-Z", 8000, imageUrl + "letras.jpg", 0));
        productos.add(new Producto("Pacman-fantasmas", "A-Z", 8000, imageUrl + "pacman.jpg", 0));
        productos.add(new Producto("Souvenirs", "Stich", 8000, imageUrl + "stich.jpg", 0));
        productos.add(new Producto("Llavero", "varios", 8000, imageUrl + "varios.jpg", 0));
        productos.add(new Producto("Llavero", "Martu", 2500, imageUrl + "martu.jpg", 0));

        return productos;
    }


}