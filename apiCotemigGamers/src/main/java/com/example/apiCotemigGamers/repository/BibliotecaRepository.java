package com.example.apiCotemigGamers.repository;

import com.example.apiCotemigGamers.model.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("BibliotecaRepository")
public interface BibliotecaRepository extends JpaRepository<Biblioteca, Integer>{    
}
