package com.example.apiCotemigGamers.repository;

import com.example.apiCotemigGamers.model.CategoriaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CategoriaProdutoRepository")
public interface CategoriaProdutoRepository extends JpaRepository<CategoriaProduto, Integer>{
    
}
