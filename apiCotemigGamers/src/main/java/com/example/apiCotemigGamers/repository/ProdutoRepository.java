package com.example.apiCotemigGamers.repository;

import com.example.apiCotemigGamers.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProdutoRepository")
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
