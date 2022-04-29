package com.example.apiCotemig.repository;

import com.example.apiCotemig.model.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("BibliotecaRepository")
public interface BibliotecaRepository extends JpaRepository<Biblioteca, Integer>{    
}
