package com.example.apiCotemig.repository;

import com.example.apiCotemig.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("TransacaoRepository")
public interface TransacaoRepository extends JpaRepository <Transacao, Integer> {
    
}
