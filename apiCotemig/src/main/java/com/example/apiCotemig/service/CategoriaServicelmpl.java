package com.example.apiCotemig.service;

import com.example.apiCotemig.model.Categoria;
import com.example.apiCotemig.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("CategoriaService")

public class CategoriaServicelmpl implements CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public Optional<Categoria> getCategoriaById(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public void deleteAllCategorias() {
        categoriaRepository.deleteAll();
    }

    @Override
    public void deleteCategoriaById(Integer id) {
        categoriaRepository.deleteById(id);
    }

    @Override
    public void updateCategoriaById(Integer id, Categoria categoria) {
        Optional<Categoria> getCategoria = getCategoriaById(id);
        getCategoria.get().setNome(categoria.getNome());
        categoriaRepository.save(categoria);
    }

    @Override
    public void updateCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public void insertCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }    
}
