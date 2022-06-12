package com.example.apiCotemigGamers.service;

import com.example.apiCotemigGamers.model.BibliotecaProduto;

import java.util.List;
import java.util.Optional;

public interface BibliotecaProdutoService {
    Optional<BibliotecaProduto> getBibliotecaProdutoById(Integer id);
    List<BibliotecaProduto> getAllBibliotecasProdutos();
    void deleteAllBibliotecasProdutos();
    void deleteBibliotecaProdutoById(Integer id);
    void updateBibliotecaProdutoById(Integer id, BibliotecaProduto bibliotecaProduto);
    void updateBibliotecaProduto(BibliotecaProduto bibliotecaProduto);
    void insertBiblioteProduto(BibliotecaProduto bibliotecaProduto);
}
