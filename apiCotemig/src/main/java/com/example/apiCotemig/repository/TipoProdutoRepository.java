package com.example.apiCotemig.repository;

import com.example.apiCotemig.model.TipoProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tipoProdRepository")
public interface TipoProdutoRepository extends JpaRepository<TipoProduto, Integer> {
}
