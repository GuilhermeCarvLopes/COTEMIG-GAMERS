package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.BibliotecaProduto;
import com.example.apiCotemigGamers.service.BibliotecaProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BibliotecaProdutoRestController {

    @Autowired
    private BibliotecaProdutoService bibliotecaProdutoService;

    @RequestMapping(value = "/rest/bibliotecaProduto/getAll", method = RequestMethod.GET)
    public List<BibliotecaProduto> getBibliotecasProdutos() {
        return bibliotecaProdutoService.getAllBibliotecasProdutos();
    }

    @RequestMapping(value = "/rest/bibliotecaProduto/get/{id}", method = RequestMethod.GET)
    public Optional<BibliotecaProduto> getBibliotecaProduto(@PathVariable("id") Integer id) {
        return bibliotecaProdutoService.getBibliotecaProdutoById(id);
    }

    @RequestMapping(value = "/rest/bibliotecaProduto/deleteAll", method = RequestMethod.DELETE)
    public void deleteBibliotecasProdutos() {
        bibliotecaProdutoService.deleteAllBibliotecasProdutos();
    }

    @RequestMapping(value = "/rest/bibliotecaProduto/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBibliotecaProduto(@PathVariable("id") Integer id) {
        bibliotecaProdutoService.deleteBibliotecaProdutoById(id);
    }

    @RequestMapping(value = "/rest/bibliotecaProduto/update/{id}", method = RequestMethod.POST)
    public void updateBibliotecaProduto(@RequestBody BibliotecaProduto bibliotecaProduto, @PathVariable("id") Integer id) {
        bibliotecaProdutoService.updateBibliotecaProdutoById(id, bibliotecaProduto);
    }

    @RequestMapping(value = "/rest/bibliotecaProduto/insert", method = RequestMethod.POST)
    public void insertBibliotecaProduto(@RequestBody BibliotecaProduto bibliotecaProduto) {
        bibliotecaProdutoService.insertBiblioteProduto(bibliotecaProduto);
    }   
    
}
