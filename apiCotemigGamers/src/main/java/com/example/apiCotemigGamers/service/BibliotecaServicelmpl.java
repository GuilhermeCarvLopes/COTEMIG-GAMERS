package com.example.apiCotemigGamers.service;

import com.example.apiCotemigGamers.model.Biblioteca;
import com.example.apiCotemigGamers.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("BibliotecaService")

public class BibliotecaServicelmpl implements BibliotecaService{

    @Autowired
    BibliotecaRepository bibliotecaRepository;

    @Override
    public Optional<Biblioteca> getBibliotecaById(Integer id) {
        return bibliotecaRepository.findById(id);
    }

    @Override
    public List<Biblioteca> getAllBibliotecas() {
        return bibliotecaRepository.findAll();
    }

    @Override
    public void deleteAllBibliotecas() {
        bibliotecaRepository.deleteAll();
    }

    @Override
    public void deleteBibliotecaById(Integer id) {
        bibliotecaRepository.deleteById(id);
    }

    @Override
    public void updateBibliotecaById(Integer id, Biblioteca biblioteca) {
        Optional<Biblioteca> getBiblioteca = getBibliotecaById(id);
        getBiblioteca.get().setIdUsuario(biblioteca.getIdUsuario());
        getBiblioteca.get().setIdProduto(biblioteca.getIdProduto());
        bibliotecaRepository.save(biblioteca);
    }

    @Override
    public void updateBiblioteca(Biblioteca biblioteca) {
        bibliotecaRepository.save(biblioteca);
    }

    @Override
    public void insertBibliote(Biblioteca biblioteca) {
        bibliotecaRepository.save(biblioteca);
    }
    
}
