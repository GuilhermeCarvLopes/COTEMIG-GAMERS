package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.Categoria;
import com.example.apiCotemigGamers.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoriaRestController {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(value = "/rest/categoria/getAll", method = RequestMethod.GET)
    public List<Categoria> getCategorias() {
        return categoriaService.getAllCategorias();
    }

    @RequestMapping(value = "/rest/categoria/get/{id}", method = RequestMethod.GET)
    public Optional<Categoria> getCategoria(@PathVariable("id") Integer id) {
        return categoriaService.getCategoriaById(id);
    }

    @RequestMapping(value = "/rest/categoria/deleteAll", method = RequestMethod.DELETE)
    public void deleteCategorias() {
        categoriaService.deleteAllCategorias();
    }

    @RequestMapping(value = "/rest/categoria/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCategoria(@PathVariable("id") Integer id) {
        categoriaService.deleteCategoriaById(id);
    }

    @RequestMapping(value = "/rest/categoria/update/{id}", method = RequestMethod.POST)
    public void updateCategoria(@RequestBody Categoria categoria, @PathVariable("id") Integer id) {
        categoriaService.updateCategoriaById(id, categoria);
    }

    @RequestMapping(value = "/rest/categoria/insert", method = RequestMethod.POST)
    public void insertCategoria(@RequestBody Categoria categoria) {
        categoriaService.insertCategoria(categoria);
    }    
}
