package com.example.apiCotemigGamers.service;

import com.example.apiCotemigGamers.model.Transacao;

import java.util.List;
import java.util.Optional;

public interface TransacaoService {
    Optional<Transacao> getTransacaoById(Integer id);
    List<Transacao> getAllTransacao();
    void deleteAllTransacao();
    void deleteTransacaoById(Integer id);
    void updateTransacaoById(Integer id, Transacao transacao);
    void updateTransacao(Transacao transacao);
    void insertTransacao(Transacao transacao);
}
