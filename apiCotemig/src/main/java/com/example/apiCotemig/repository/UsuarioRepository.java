package com.example.apiCotemig.repository;

import com.example.apiCotemig.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("UsuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
