package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.Biblioteca;
import com.example.apiCotemigGamers.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BibliotecaRestController {

    @Autowired
    private BibliotecaService bibliotecaService;

    @RequestMapping(value = "/rest/biblioteca/getAll", method = RequestMethod.GET)
    public List<Biblioteca> getBibliotecas() {
        return bibliotecaService.getAllBibliotecas();
    }

    @RequestMapping(value = "/rest/biblioteca/get/{id}", method = RequestMethod.GET)
    public Optional<Biblioteca> getBiblioteca(@PathVariable("id") Integer id) {
        return bibliotecaService.getBibliotecaById(id);
    }

    @RequestMapping(value = "/rest/biblioteca/deleteAll", method = RequestMethod.DELETE)
    public void deleteBibliotecas() {
        bibliotecaService.deleteAllBibliotecas();
    }

    @RequestMapping(value = "/rest/biblioteca/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBiblioteca(@PathVariable("id") Integer id) {
        bibliotecaService.deleteBibliotecaById(id);
    }

    @RequestMapping(value = "/rest/biblioteca/update/{id}", method = RequestMethod.POST)
    public void updateBiblioteca(@RequestBody Biblioteca biblioteca, @PathVariable("id") Integer id) {
        bibliotecaService.updateBibliotecaById(id, biblioteca);
    }

    @RequestMapping(value = "/rest/biblioteca/insert", method = RequestMethod.POST)
    public void insertBiblioteca(@RequestBody Biblioteca biblioteca) {
        bibliotecaService.insertBibliote(biblioteca);
    }    
}
