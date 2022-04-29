package com.example.apiCotemig.controller;

import com.example.apiCotemig.model.Biblioteca;
import com.example.apiCotemig.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BibliotecaController {

    @Autowired
    private BibliotecaService bibliotecaService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<Biblioteca> getBibliotecas() {
        return bibliotecaService.getAllBibliotecas();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<Biblioteca> getBiblioteca(@PathVariable("id") Integer id) {
        return bibliotecaService.getBibliotecaById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteBibliotecas() {
        bibliotecaService.deleteAllBibliotecas();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBiblioteca(@PathVariable("id") Integer id) {
        bibliotecaService.deleteBibliotecaById(id);
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateBiblioteca(@RequestBody Biblioteca biblioteca, @PathVariable("id") Integer id) {
        bibliotecaService.updateBibliotecaById(id, biblioteca);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void insertBiblioteca(@RequestBody Biblioteca biblioteca) {
        bibliotecaService.insertBibliote(biblioteca);
    }    
}
