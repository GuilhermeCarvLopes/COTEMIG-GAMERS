package com.example.apiCotemigGamers.service;

import com.example.apiCotemigGamers.model.Empresa;
import com.example.apiCotemigGamers.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("EmpresaService")
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    @Override
    public Optional<Empresa> getEmpresaById(Integer id) {
        return empresaRepository.findById(id);
    }

    @Override
    public List<Empresa> getAllEmpresas() {
        return empresaRepository.findAll();
    }

    @Override
    public void deleteAllEmpresas() {
        empresaRepository.deleteAll();
    }

    @Override
    public void deleteEmpresaById(Integer id) {
        empresaRepository.deleteById(id);
    }

    @Override
    public void updateEmpresaById(Integer id, Empresa empresa) {
        Optional<Empresa> getEmpresa = getEmpresaById(id);
        getEmpresa.get().setNomeFantasia(empresa.getNomeFantasia());
        getEmpresa.get().setCnpj(empresa.getCnpj());
        getEmpresa.get().setEmail(empresa.getEmail());
        getEmpresa.get().setRazaoSocial(empresa.getRazaoSocial());
        getEmpresa.get().setTelefone(empresa.getTelefone());
        empresaRepository.save(empresa);
    }

    @Override
    public void updateEmpresa(Empresa empresa) {
        empresaRepository.save(empresa);
    }

    @Override
    public void insertEmpresa(Empresa empresa) {
        empresaRepository.save(empresa);
    }

}
