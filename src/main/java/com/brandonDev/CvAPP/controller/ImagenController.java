package com.brandonDev.CvAPP.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("imagenes")
public class ImagenController {

    // Ruta a la carpeta de imágenes dentro de resources
    private final String imageDirectory = "src/main/resources/imagenes/app/";

    @GetMapping("/{nombreImagen}")
    public ResponseEntity<Resource> obtenerImagen(@PathVariable String nombreImagen) {
        try {
            // Limpia el nombre de la imagen para evitar ataques de path traversal
            String cleanedFileName = StringUtils.cleanPath(nombreImagen);

            // Construye el path de la imagen
            Path imagePath = Paths.get(imageDirectory + cleanedFileName).toAbsolutePath().normalize();
            Resource imagen = new UrlResource(imagePath.toUri());

            // Verifica si la imagen existe y es legible
            if (!imagen.exists() || !imagen.isReadable()) {
                return ResponseEntity.notFound().build();
            }

            // Devuelve la imagen con los encabezados HTTP apropiados
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + imagen.getFilename() + "\"")
                    .body(imagen);
        } catch (MalformedURLException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}