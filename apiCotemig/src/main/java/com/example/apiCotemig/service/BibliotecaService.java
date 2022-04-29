package com.example.apiCotemig.service;

import com.example.apiCotemig.model.Biblioteca;

import java.util.List;
import java.util.Optional;

public interface BibliotecaService {
    Optional<Biblioteca> getBibliotecaById(Integer id);
    List<Biblioteca> getAllBibliotecas();
    void deleteAllBibliotecas();
    void deleteBibliotecaById(Integer id);
    void updateBibliotecaById(Integer id, Biblioteca biblioteca);
    void updateBibliote(Biblioteca biblioteca);
    void insertBibliote(Biblioteca biblioteca);
}
