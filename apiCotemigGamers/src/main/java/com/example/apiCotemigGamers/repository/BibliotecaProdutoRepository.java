package com.example.apiCotemigGamers.repository;

import com.example.apiCotemigGamers.model.BibliotecaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("BibliotecaProdutoRepository")
public interface BibliotecaProdutoRepository  extends JpaRepository<BibliotecaProduto, Integer>{
    
}
