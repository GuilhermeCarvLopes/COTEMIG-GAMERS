package com.example.apiCotemig.controller;

import com.example.apiCotemig.model.TipoTransacao;
import com.example.apiCotemig.service.TipoTransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TipoTransacaoController {

    @Autowired
    private TipoTransacaoService tipoTranService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<TipoTransacao> getTiposTransacao() {
        return tipoTranService.getAllTiposTransacao();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<TipoTransacao> getTipoTransacao(@PathVariable("id") Integer id) {
        return tipoTranService.getTipoTransacaoById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteTiposTransacao() {
        tipoTranService.deleteAllTiposTransacao();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTipoTransacao(@PathVariable("id") Integer id) {
        tipoTranService.deleteTipoTransacaoById(id);
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateTipoTransacao(@RequestBody TipoTransacao tipoTransacao, @PathVariable("id") Integer id) {
        tipoTranService.updateTipoTransacaoById(id, tipoTransacao);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void insertTipoTransacao(@RequestBody TipoTransacao tipoTransacao) {
        tipoTranService.insertTipoTransacao(tipoTransacao);
    }

}
