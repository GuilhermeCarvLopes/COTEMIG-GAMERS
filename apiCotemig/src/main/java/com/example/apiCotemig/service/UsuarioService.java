package com.example.apiCotemig.service;

import com.example.apiCotemig.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> getUsuarioById(Integer id);
    List<Usuario> getAllUsuarios();
    void deleteAllUsuarios();
    void deleteUsuarioById(Integer id);
    void updateUsuarioById(Integer id, Usuario usuario);
    void updateUsuario(Usuario usuario);
    void insertUsuario(Usuario usuario);
}