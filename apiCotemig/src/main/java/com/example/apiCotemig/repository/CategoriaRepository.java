package com.example.apiCotemig.repository;

import com.example.apiCotemig.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CategoriaRepository")
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{    
}
