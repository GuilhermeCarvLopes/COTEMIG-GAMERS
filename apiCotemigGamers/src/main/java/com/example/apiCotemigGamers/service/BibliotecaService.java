package com.example.apiCotemigGamers.service;

import com.example.apiCotemigGamers.model.Biblioteca;

import java.util.List;
import java.util.Optional;

public interface BibliotecaService {
    Optional<Biblioteca> getBibliotecaById(Integer id);
    List<Biblioteca> getAllBibliotecas();
    void deleteAllBibliotecas();
    void deleteBibliotecaById(Integer id);
    void updateBibliotecaById(Integer id, Biblioteca biblioteca);
    void updateBiblioteca(Biblioteca biblioteca);
    void insertBibliote(Biblioteca biblioteca);
}
