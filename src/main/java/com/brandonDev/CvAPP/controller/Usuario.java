package com.brandonDev.CvAPP.controller;

import com.brandonDev.CvAPP.dto.UsuarioRequestDTO;
import com.brandonDev.CvAPP.service.UsuarioService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario/")
public class Usuario {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("count")
    public Long get(){
        return usuarioService.getRegistrosTotales();
    }

    @PostMapping("post")
    public Long post(@RequestBody UsuarioRequestDTO request, HttpServletRequest httpServletRequest) {
        String clientIpAddress = httpServletRequest.getHeader("X-FORWARDED-FOR");
        if (clientIpAddress == null) {
            clientIpAddress = httpServletRequest.getRemoteAddr();
            request.setIp(clientIpAddress);
            usuarioService.saveRegistro(request);
        }
        return usuarioService.getRegistrosTotales();
    }
}
