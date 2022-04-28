package com.example.apiCotemig.service;

import com.example.apiCotemig.model.TransacaoCarteira;
import com.example.apiCotemig.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface TransacaoCarteiraService {
    Optional<TransacaoCarteira> getTransacaoCarteiraById(Integer id);
    List<TransacaoCarteira> getAllTransacaoCarteira();
    void deleteAllTransacaoCarteira();
    void deleteTransacaoCarteiraById(Integer id);
    void updateTransacaoCarteiraById(Integer id, TransacaoCarteira transacaoCarteira);
    void updateTransacaoCarteira(TransacaoCarteira transacaoCarteira);
    void insertTransacaoCarteira(TransacaoCarteira transacaoCarteira);
}
