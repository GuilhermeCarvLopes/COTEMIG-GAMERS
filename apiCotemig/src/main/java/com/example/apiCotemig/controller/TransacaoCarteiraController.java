package com.example.apiCotemig.controller;

import com.example.apiCotemig.model.Empresa;
import com.example.apiCotemig.model.TransacaoCarteira;
import com.example.apiCotemig.service.EmpresaService;
import com.example.apiCotemig.service.TransacaoCarteiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

public class TransacaoCarteiraController {

    @Autowired
    private TransacaoCarteiraService transacaoCarteiraService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<TransacaoCarteira> getAllTransacaoCarteira() {
        return transacaoCarteiraService.getAllTransacaoCarteira();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<TransacaoCarteira> getTransacaoCarteira(@PathVariable("id") Integer id) {
        return transacaoCarteiraService.getTransacaoCarteiraById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteTransacaoCarteiras() {
        transacaoCarteiraService.deleteAllTransacaoCarteira();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTransacaoCarteira(@PathVariable("id") Integer id) {
        transacaoCarteiraService.deleteTransacaoCarteiraById(id);
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateTransacaoCarteira(@RequestBody TransacaoCarteira transacaoCarteira, @PathVariable("id") Integer id) {
        transacaoCarteiraService.updateTransacaoCarteiraById(id, transacaoCarteira);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void insertTransacaoCarteira(@RequestBody TransacaoCarteira transacaoCarteira) {
        transacaoCarteiraService.insertTransacaoCarteira(transacaoCarteira);
    }

}
