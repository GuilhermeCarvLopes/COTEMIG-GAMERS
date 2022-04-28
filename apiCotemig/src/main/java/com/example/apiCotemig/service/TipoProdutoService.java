package com.example.apiCotemig.service;

import com.example.apiCotemig.model.TipoProduto;

import java.util.List;
import java.util.Optional;

public interface TipoProdutoService {
    Optional<TipoProduto> getTipoProdutoById(Integer id);
    List<TipoProduto> getAllTiposProdutos();
    void deleteAllTiposProdutos();
    void deleteTipoProdutoById(Integer id);
    void updateTipoProdutoById(Integer id, TipoProduto tipoProduto);
    void updateTipoProduto(TipoProduto tipoProduto);
    void insertTipoProduto(TipoProduto tipoProduto);
}
