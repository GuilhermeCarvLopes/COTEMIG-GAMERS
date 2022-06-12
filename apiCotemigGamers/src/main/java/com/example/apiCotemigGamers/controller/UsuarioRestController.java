package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.Usuario;
import com.example.apiCotemigGamers.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class UsuarioRestController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/rest/usuario/getAll", method = RequestMethod.GET)
    public List<Usuario> getusuarios() {
        return usuarioService.getAllUsuarios();
    }

    @RequestMapping(value = "/rest/usuario/get/{id}", method = RequestMethod.GET)
    public Optional<Usuario> getusuario(@PathVariable("id") Integer id) {
        return usuarioService.getUsuarioById(id);
    }

    @RequestMapping(value = "/rest/usuario/deleteAll", method = RequestMethod.DELETE)
    public void deleteusuarios() {
        usuarioService.deleteAllUsuarios();
    }

    @RequestMapping(value = "/rest/usuario/delete/{id}", method = RequestMethod.DELETE)
    public void deleteusuario(@PathVariable("id") Integer id) {
        usuarioService.deleteUsuarioById(id);
    }

    @RequestMapping(value = "/rest/usuario/update/{id}", method = RequestMethod.POST)
    public void updateUsuario(@RequestBody Usuario usuario, @PathVariable("id") Integer id) {
        usuarioService.updateUsuarioById(id, usuario);
    }

    @RequestMapping(value = "/rest/usuario/insert", method = RequestMethod.POST)
    public void insertUsuario(@RequestBody Usuario usuario) {
        usuarioService.insertUsuario(usuario);
    }    
    
}
