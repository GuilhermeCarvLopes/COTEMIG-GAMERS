package com.example.apiCotemig.controller;

import com.example.apiCotemig.model.TipoProduto;
import com.example.apiCotemig.service.TipoProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TipoProdutoController {

    @Autowired
    private TipoProdutoService tipoProdService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<TipoProduto> getTiposProdutos() {
        return tipoProdService.getAllTiposProdutos();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<TipoProduto> getTipoProduto(@PathVariable("id") Integer id) {
        return tipoProdService.getTipoProdutoById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteTiposProdutos() {
        tipoProdService.deleteAllTiposProdutos();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTipoProduto(@PathVariable("id") Integer id) {
        tipoProdService.deleteTipoProdutoById(id);
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateTipoProdutos(@RequestBody TipoProduto tipoProduto, @PathVariable("id") Integer id) {
        tipoProdService.updateTipoProdutoById(id, tipoProduto);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void insertTipoProduto(@RequestBody TipoProduto tipoProduto) {
        tipoProdService.insertTipoProduto(tipoProduto);
    }

}
