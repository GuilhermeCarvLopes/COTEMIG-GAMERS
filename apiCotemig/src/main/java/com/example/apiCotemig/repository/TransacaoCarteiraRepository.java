package com.example.apiCotemig.repository;

import com.example.apiCotemig.model.TransacaoCarteira;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("transacaoCartRepository")
public interface TransacaoCarteiraRepository extends JpaRepository<TransacaoCarteira, Integer> {
}
