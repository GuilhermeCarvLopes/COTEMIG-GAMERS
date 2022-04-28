package com.example.apiCotemig.service;

import com.example.apiCotemig.model.Empresa;
import com.example.apiCotemig.model.Produto;
import com.example.apiCotemig.repository.EmpresaRepository;
import com.example.apiCotemig.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("ProdutoService")
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public Optional<Produto> getProdutoById(Integer id) {
        return produtoRepository.findById(id);
    }

    @Override
    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public void deleteAllProdutos() {
        produtoRepository.deleteAll();
    }

    @Override
    public void deleteProdutoById(Integer id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public void updateProdutoById(Integer id, Produto produto) {
        Optional<Produto> getProduto = getProdutoById(id);
        getProduto.get().setName(produto.getName());
        getProduto.get().setDescricao(produto.getDescricao());
        getProduto.get().setIdEmpresa(produto.getIdEmpresa());
        getProduto.get().setIdTipoProduto(produto.getIdTipoProduto());
        getProduto.get().setValor(produto.getValor());
        produtoRepository.save(produto);
    }

    @Override
    public void updateProduto(Produto produto) {
        produtoRepository.save(produto);
    }

    @Override
    public void insertProduto(Produto produto) {
        produtoRepository.save(produto);
    }

}
