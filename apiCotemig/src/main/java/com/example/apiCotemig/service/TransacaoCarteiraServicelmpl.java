package com.example.apiCotemig.service;


import com.example.apiCotemig.model.TransacaoCarteira;
import com.example.apiCotemig.repository.TransacaoCarteiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("transacaoCarteiraService")
public class TransacaoCarteiraServicelmpl implements TransacaoCarteiraService{

    @Autowired
    TransacaoCarteiraRepository transacaoCarteiraRepository;

    @Override
    public Optional<TransacaoCarteira> getTransacaoCarteiraById(Integer id) {
        return transacaoCarteiraRepository.findById(id);
    }

    @Override
    public List<TransacaoCarteira> getAllTransacaoCarteira() {
        return transacaoCarteiraRepository.findAll();
    }

    @Override
    public void deleteAllTransacaoCarteira() {
        transacaoCarteiraRepository.deleteAll();
    }

    @Override
    public void deleteTransacaoCarteiraById(Integer id) {
        transacaoCarteiraRepository.deleteById(id);
    }

    @Override
    public void updateTransacaoCarteiraById(Integer id, TransacaoCarteira transacaoCarteira) {
        Optional<TransacaoCarteira> getTransacaoCarteira = getTransacaoCarteiraById(id);
        getTransacaoCarteira.get().setSaldo(transacaoCarteira.getSaldo());
        getTransacaoCarteira.get().setDataPagaemnto(transacaoCarteira.getDataPagaemnto());
        transacaoCarteiraRepository.save(transacaoCarteira);
    }

    @Override
    public void updateTransacaoCarteira(TransacaoCarteira transacaoCarteira) {
        transacaoCarteiraRepository.save(transacaoCarteira);
    }

    @Override
    public void insertTransacaoCarteira(TransacaoCarteira transacaoCarteira) {
        transacaoCarteiraRepository.save(transacaoCarteira);
    }

}
