package com.example.apiCotemigGamers.service;

import com.example.apiCotemigGamers.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    Optional<Categoria> getCategoriaById(Integer id);
    List<Categoria> getAllCategorias();
    void deleteAllCategorias();
    void deleteCategoriaById(Integer id);
    void updateCategoriaById(Integer id, Categoria categoria);
    void updateCategoria(Categoria categoria);
    void insertCategoria(Categoria categoria);    
}
