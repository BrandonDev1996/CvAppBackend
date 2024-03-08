package com.brandonDev.CvAPP.persistencia.repository;

import com.brandonDev.CvAPP.persistencia.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
