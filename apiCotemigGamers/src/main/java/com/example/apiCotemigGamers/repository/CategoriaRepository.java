package com.example.apiCotemigGamers.repository;

import com.example.apiCotemigGamers.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CategoriaRepository")
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{    
}
