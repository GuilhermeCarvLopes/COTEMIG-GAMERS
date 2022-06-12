package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.Produto;
import com.example.apiCotemigGamers.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoRestController {

    @Autowired
    private ProdutoService produtoService;

    @RequestMapping(value = "/rest/produto/getAll", method = RequestMethod.GET)
    public List<Produto> getProdutos() {
        return produtoService.getAllProdutos();
    }

    @RequestMapping(value = "/rest/produto/get/{id}", method = RequestMethod.GET)
    public Optional<Produto> getProduto(@PathVariable("id") Integer id) {
        return produtoService.getProdutoById(id);
    }

    @RequestMapping(value = "/rest/produto/deleteAll", method = RequestMethod.DELETE)
    public void deleteProdutos() {
        produtoService.deleteAllProdutos();
    }

    @RequestMapping(value = "/rest/produto/delete/{id}", method = RequestMethod.DELETE)
    public void deleteProduto(@PathVariable("id") Integer id) {
        produtoService.deleteProdutoById(id);
    }

    @RequestMapping(value = "/rest/produto/update/{id}", method = RequestMethod.POST)
    public void updateProduto(@RequestBody Produto produto, @PathVariable("id") Integer id) {
        produtoService.updateProdutoById(id, produto);
    }

    @RequestMapping(value = "/rest/produto/insert", method = RequestMethod.POST)
    public void insertProduto(@RequestBody Produto produto) {
        produtoService.insertProduto(produto);
    }

}
