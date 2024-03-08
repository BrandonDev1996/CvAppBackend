package com.brandonDev.CvAPP.service;

import com.brandonDev.CvAPP.dto.UsuarioRequestDTO;
import org.springframework.stereotype.Service;

public interface UsuarioService {
   void saveRegistro(UsuarioRequestDTO usuarioRequestDTO);

   Long getRegistrosTotales();
}
