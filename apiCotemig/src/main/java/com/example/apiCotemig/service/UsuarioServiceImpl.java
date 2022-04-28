package com.example.apiCotemig.service;

import com.example.apiCotemig.model.TipoTransacao;
import com.example.apiCotemig.model.Usuario;
import com.example.apiCotemig.repository.TipoTransacaoRepository;
import com.example.apiCotemig.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("UsuarioService")
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> getUsuarioById(Integer id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public void deleteAllUsuarios() {
        usuarioRepository.deleteAll();
    }

    @Override
    public void deleteUsuarioById(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public void updateUsuarioById(Integer id, Usuario usuario) {
        Optional<Usuario> getUsuario = getUsuarioById(id);
        getUsuario.get().setNome(usuario.getNome());
        getUsuario.get().setCPF(usuario.getCPF());
        getUsuario.get().setEmail(usuario.getEmail());
        getUsuario.get().setFoto(usuario.getFoto());
        getUsuario.get().setDataNascimento(usuario.getDataNascimento());
        getUsuario.get().setTelefone(usuario.getTelefone());
        getUsuario.get().setIdCarteira(usuario.getIdCarteira());
        usuarioRepository.save(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void insertUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

}
