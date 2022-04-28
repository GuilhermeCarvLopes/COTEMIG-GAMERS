package com.example.apiCotemig.service;

import com.example.apiCotemig.model.TipoProduto;
import com.example.apiCotemig.repository.TipoProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("tipoProdutoService")
public class TipoProdutoServiceImpl implements TipoProdutoService {

    @Autowired
    TipoProdutoRepository tipoProdutoRepository;

    @Override
    public Optional<TipoProduto> getTipoProdutoById(Integer id) {
        return tipoProdutoRepository.findById(id);
    }

    @Override
    public List<TipoProduto> getAllTiposProdutos() {
        return tipoProdutoRepository.findAll();
    }

    @Override
    public void deleteAllTiposProdutos() {
        tipoProdutoRepository.deleteAll();
    }

    @Override
    public void deleteTipoProdutoById(Integer id) {
        tipoProdutoRepository.deleteById(id);
    }

    @Override
    public void updateTipoProdutoById(Integer id, TipoProduto tipoProduto) {
        Optional<TipoProduto> getTipoProduto = getTipoProdutoById(id);
        getTipoProduto.get().setNome(tipoProduto.getNome());
        tipoProdutoRepository.save(tipoProduto);
    }

    @Override
    public void updateTipoProduto(TipoProduto tipoProduto) {
        tipoProdutoRepository.save(tipoProduto);
    }

    @Override
    public void insertTipoProduto(TipoProduto tipoProduto) {
        tipoProdutoRepository.save(tipoProduto);
    }

}
