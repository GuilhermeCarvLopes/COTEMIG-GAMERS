package com.example.apiCotemig.repository;

import com.example.apiCotemig.model.TipoTransacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tipoTranRepository")
public interface TipoTransacaoRepository  extends JpaRepository<TipoTransacao, Integer> {
}
