package com.example.apiCotemigGamers.repository;

import com.example.apiCotemigGamers.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("TransacaoRepository")
public interface TransacaoRepository extends JpaRepository <Transacao, Integer> {
    
}
