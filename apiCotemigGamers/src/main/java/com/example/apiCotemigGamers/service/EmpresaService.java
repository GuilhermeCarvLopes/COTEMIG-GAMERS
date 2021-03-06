package com.example.apiCotemigGamers.service;

import com.example.apiCotemigGamers.model.Empresa;

import java.util.List;
import java.util.Optional;

public interface EmpresaService {
    Optional<Empresa> getEmpresaById(Integer id);
    List<Empresa> getAllEmpresas();
    void deleteAllEmpresas();
    void deleteEmpresaById(Integer id);
    void updateEmpresaById(Integer id, Empresa empresa);
    void updateEmpresa(Empresa empresa);
    void insertEmpresa(Empresa empresa);
}
