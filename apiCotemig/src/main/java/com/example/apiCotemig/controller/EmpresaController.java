package com.example.apiCotemig.controller;

import com.example.apiCotemig.model.Empresa;
import com.example.apiCotemig.model.TipoProduto;
import com.example.apiCotemig.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<Empresa> getEmpresas() {
        return empresaService.getAllEmpresas();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<Empresa> getEmpresa(@PathVariable("id") Integer id) {
        return empresaService.getEmpresaById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteEmpresas() {
        empresaService.deleteAllEmpresas();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteEmpresa(@PathVariable("id") Integer id) {
        empresaService.deleteEmpresaById(id);
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateEmpresa(@RequestBody Empresa empresa, @PathVariable("id") Integer id) {
        empresaService.updateEmpresaById(id, empresa);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void insertEmpresa(@RequestBody Empresa empresa) {
        empresaService.insertEmpresa(empresa);
    }

}
