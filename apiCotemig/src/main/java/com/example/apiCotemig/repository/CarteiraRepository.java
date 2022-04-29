package com.example.apiCotemig.repository;

import com.example.apiCotemig.model.Carteira;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CarteiraRepository")
public interface CarteiraRepository extends JpaRepository<Carteira, Integer> {
}
