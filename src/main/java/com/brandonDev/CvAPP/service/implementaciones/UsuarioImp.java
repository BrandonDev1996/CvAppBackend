package com.brandonDev.CvAPP.service.implementaciones;

import com.brandonDev.CvAPP.dto.UsuarioRequestDTO;
import com.brandonDev.CvAPP.persistencia.entities.UsuarioEntity;
import com.brandonDev.CvAPP.persistencia.repository.UsuarioRepository;
import com.brandonDev.CvAPP.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioImp implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void saveRegistro(UsuarioRequestDTO usuarioRequestDTO){
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setDireccionIP(usuarioRequestDTO.getIp());
        usuarioRepository.save(usuarioEntity);
    }

    @Override
    public Long getRegistrosTotales(){
        Long registrosTotales;
        registrosTotales = usuarioRepository.count();
        return registrosTotales;
    }
}
