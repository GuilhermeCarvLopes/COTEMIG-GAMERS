package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.Transacao;
import com.example.apiCotemigGamers.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TransacaoRestController {

    @Autowired
    private TransacaoService transacaoService;

    @RequestMapping(value = "/rest/transacao/getAll", method = RequestMethod.GET)
    public List<Transacao> getAllTransacao() {
        return transacaoService.getAllTransacao();
    }

    @RequestMapping(value = "/rest/transacao/get/{id}", method = RequestMethod.GET)
    public Optional<Transacao> getTransacao(@PathVariable("id") Integer id) {
        return transacaoService.getTransacaoById(id);
    }

    @RequestMapping(value = "/rest/transacao/deleteAll", method = RequestMethod.DELETE)
    public void deleteTransacaos() {
        transacaoService.deleteAllTransacao();
    }

    @RequestMapping(value = "/rest/transacao/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTransacao(@PathVariable("id") Integer id) {
        transacaoService.deleteTransacaoById(id);
    }

    @RequestMapping(value = "/rest/transacao/update/{id}", method = RequestMethod.POST)
    public void updateTransacao(@RequestBody Transacao transacao, @PathVariable("id") Integer id) {
        transacaoService.updateTransacaoById(id, transacao);
    }

    @RequestMapping(value = "/rest/transacao/insert", method = RequestMethod.POST)
    public void insertTransacao(@RequestBody Transacao transacao) {
        transacaoService.insertTransacao(transacao);
    }

}
