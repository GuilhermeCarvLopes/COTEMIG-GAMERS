package com.example.apiCotemig.service;

import com.example.apiCotemig.model.TipoTransacao;

import java.util.List;
import java.util.Optional;

public interface TipoTransacaoService {
    Optional<TipoTransacao> getTipoTransacaoById(Integer id);
    List<TipoTransacao> getAllTiposTransacao();
    void deleteAllTiposTransacao();
    void deleteTipoTransacaoById(Integer id);
    void updateTipoTransacaoById(Integer id, TipoTransacao tipoTransacao);
    void updateTipoTransacao(TipoTransacao tipoTransacao);
    void insertTipoTransacao(TipoTransacao tipoTransacao);
}
