package com.example.apiCotemigGamers.service;

import com.example.apiCotemigGamers.model.BibliotecaProduto;
import com.example.apiCotemigGamers.repository.BibliotecaProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("BibliotecaProdutoService")
public class BibliotecaProdutoServiceImpl implements BibliotecaProdutoService{

    @Autowired
    BibliotecaProdutoRepository bibliotecaProdutoRepository;

    @Override
    public Optional<BibliotecaProduto> getBibliotecaProdutoById(Integer id) {
        return bibliotecaProdutoRepository.findById(id);
    }

    @Override
    public List<BibliotecaProduto> getAllBibliotecasProdutos() {
        return bibliotecaProdutoRepository.findAll();
    }

    @Override
    public void deleteAllBibliotecasProdutos() {
        bibliotecaProdutoRepository.deleteAll();
    }

    @Override
    public void deleteBibliotecaProdutoById(Integer id) {
        bibliotecaProdutoRepository.deleteById(id);
    }

    @Override
    public void updateBibliotecaProdutoById(Integer id, BibliotecaProduto bibliotecaProduto) {
        Optional<BibliotecaProduto> getBiblioteca = getBibliotecaProdutoById(id);
        getBiblioteca.get().setIdBiblioteca(bibliotecaProduto.getIdBiblioteca());
        getBiblioteca.get().setIdProduto(bibliotecaProduto.getIdProduto());
        bibliotecaProdutoRepository.save(bibliotecaProduto);
    }

    @Override
    public void updateBibliotecaProduto(BibliotecaProduto bibliotecaProduto) {
        bibliotecaProdutoRepository.save(bibliotecaProduto);
    }

    @Override
    public void insertBiblioteProduto(BibliotecaProduto bibliotecaProduto) {
        bibliotecaProdutoRepository.save(bibliotecaProduto);
    }
    
}
