package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.CategoriaProduto;
import com.example.apiCotemigGamers.service.CategoriaProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoriaProdutoRestController {

    @Autowired
    private CategoriaProdutoService categoriaProdutoService;

    @RequestMapping(value = "/rest/categoriaProduto/getAll", method = RequestMethod.GET)
    public List<CategoriaProduto> getCategorias() {
        return categoriaProdutoService.getAllCategoriasProdutos();
    }

    @RequestMapping(value = "/rest/categoriaProduto/get/{id}", method = RequestMethod.GET)
    public Optional<CategoriaProduto> getCategoria(@PathVariable("id") Integer id) {
        return categoriaProdutoService.getCategoriaProdutoById(id);
    }

    @RequestMapping(value = "/rest/categoriaProduto/deleteAll", method = RequestMethod.DELETE)
    public void deleteCategorias() {
        categoriaProdutoService.deleteAllCategoriasProdutos();
    }

    @RequestMapping(value = "/rest/categoriaProduto/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCategoria(@PathVariable("id") Integer id) {
        categoriaProdutoService.deleteCategoriaProdutoById(id);
    }

    @RequestMapping(value = "/rest/categoriaProduto/update/{id}", method = RequestMethod.POST)
    public void updateCategoria(@RequestBody CategoriaProduto categoriaProduto, @PathVariable("id") Integer id) {
        categoriaProdutoService.updateCategoriaProdutoById(id, categoriaProduto);
    }

    @RequestMapping(value = "/rest/categoriaProduto/insert", method = RequestMethod.POST)
    public void insertCategoria(@RequestBody CategoriaProduto categoriaProduto) {
        categoriaProdutoService.insertCategoriaProduto(categoriaProduto);
    }    
    
}
