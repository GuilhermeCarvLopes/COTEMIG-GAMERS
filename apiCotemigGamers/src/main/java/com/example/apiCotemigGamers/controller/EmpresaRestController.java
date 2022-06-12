package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.Empresa;
import com.example.apiCotemigGamers.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpresaRestController {

    @Autowired
    private EmpresaService empresaService;

    @RequestMapping(value = "/rest/empresa/getAll", method = RequestMethod.GET)
    public List<Empresa> getEmpresas() {
        return empresaService.getAllEmpresas();
    }

    @RequestMapping(value = "/rest/empresa/get/{id}", method = RequestMethod.GET)
    public Optional<Empresa> getEmpresa(@PathVariable("id") Integer id) {
        return empresaService.getEmpresaById(id);
    }

    @RequestMapping(value = "/rest/empresa/deleteAll", method = RequestMethod.DELETE)
    public void deleteEmpresas() {
        empresaService.deleteAllEmpresas();
    }

    @RequestMapping(value = "/rest/empresa/delete/{id}", method = RequestMethod.DELETE)
    public void deleteEmpresa(@PathVariable("id") Integer id) {
        empresaService.deleteEmpresaById(id);
    }

    @RequestMapping(value = "/rest/empresa/update/{id}", method = RequestMethod.POST)
    public void updateEmpresa(@RequestBody Empresa empresa, @PathVariable("id") Integer id) {
        empresaService.updateEmpresaById(id, empresa);
    }

    @RequestMapping(value = "/rest/empresa/insert", method = RequestMethod.POST)
    public void insertEmpresa(@RequestBody Empresa empresa) {
        empresaService.insertEmpresa(empresa);
    }

}
