package com.example.apiCotemigGamers.service;

import com.example.apiCotemigGamers.model.CategoriaProduto;

import java.util.List;
import java.util.Optional;

public interface CategoriaProdutoService {
    Optional<CategoriaProduto> getCategoriaProdutoById(Integer id);
    List<CategoriaProduto> getAllCategoriasProdutos();
    void deleteAllCategoriasProdutos();
    void deleteCategoriaProdutoById(Integer id);
    void updateCategoriaProdutoById(Integer id, CategoriaProduto categoriaProduto);
    void updateCategoriaProduto(CategoriaProduto categoriaProduto);
    void insertCategoriaProduto(CategoriaProduto categoriaProduto);    
}
