package com.example.apiCotemig.controller;

import com.example.apiCotemig.model.Empresa;
import com.example.apiCotemig.model.Produto;
import com.example.apiCotemig.service.EmpresaService;
import com.example.apiCotemig.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<Produto> getProdutos() {
        return produtoService.getAllProdutos();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<Produto> getProduto(@PathVariable("id") Integer id) {
        return produtoService.getProdutoById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteProdutos() {
        produtoService.deleteAllProdutos();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteProduto(@PathVariable("id") Integer id) {
        produtoService.deleteProdutoById(id);
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateProduto(@RequestBody Produto produto, @PathVariable("id") Integer id) {
        produtoService.updateProdutoById(id, produto);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void insertProduto(@RequestBody Produto produto) {
        produtoService.insertProduto(produto);
    }

}
