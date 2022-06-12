package com.example.apiCotemigGamers.service;

import com.example.apiCotemigGamers.model.CategoriaProduto;
import com.example.apiCotemigGamers.repository.CategoriaProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("CategoriaProdutoService")
public class CategoriaProdutoServiceImpl implements CategoriaProdutoService{

    @Autowired
    CategoriaProdutoRepository categoriaProdutoRepository;

    @Override
    public Optional<CategoriaProduto> getCategoriaProdutoById(Integer id) {
        return categoriaProdutoRepository.findById(id);
    }

    @Override
    public List<CategoriaProduto> getAllCategoriasProdutos() {
        return categoriaProdutoRepository.findAll();
    }

    @Override
    public void deleteAllCategoriasProdutos() {
        categoriaProdutoRepository.deleteAll();
    }

    @Override
    public void deleteCategoriaProdutoById(Integer id) {
        categoriaProdutoRepository.deleteById(id);
    }

    @Override
    public void updateCategoriaProdutoById(Integer id, CategoriaProduto categoriaProduto) {
        Optional<CategoriaProduto> getCategoria = getCategoriaProdutoById(id);
        getCategoria.get().setIdCategoria(categoriaProduto.getIdCategoria());
        getCategoria.get().setIdProduto(categoriaProduto.getIdProduto());
        categoriaProdutoRepository.save(categoriaProduto);
    }

    @Override
    public void updateCategoriaProduto(CategoriaProduto categoriaProduto) {
        categoriaProdutoRepository.save(categoriaProduto);
    }

    @Override
    public void insertCategoriaProduto(CategoriaProduto categoriaProduto) {
        categoriaProdutoRepository.save(categoriaProduto);
    }    
    
}
