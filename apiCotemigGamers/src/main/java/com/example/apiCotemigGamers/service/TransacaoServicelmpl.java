package com.example.apiCotemigGamers.service;


import com.example.apiCotemigGamers.model.Transacao;
import com.example.apiCotemigGamers.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("transacaoService")
public class TransacaoServicelmpl implements TransacaoService{

    @Autowired
    TransacaoRepository transacaoRepository;

    @Override
    public Optional<Transacao> getTransacaoById(Integer id) {
        return transacaoRepository.findById(id);
    }

    @Override
    public List<Transacao> getAllTransacao() {
        return transacaoRepository.findAll();
    }

    @Override
    public void deleteAllTransacao() {
        transacaoRepository.deleteAll();
    }

    @Override
    public void deleteTransacaoById(Integer id) {
        transacaoRepository.deleteById(id);
    }

    @Override
    public void updateTransacaoById(Integer id, Transacao transacao) {
        Optional<Transacao> getTransacao = getTransacaoById(id);
        getTransacao.get().setvalor(transacao.getvalor());
        getTransacao.get().setDataPagamento(transacao.getDataPagamento());
        transacaoRepository.save(transacao);
    }

    @Override
    public void updateTransacao(Transacao transacao) {
        transacaoRepository.save(transacao);
    }

    @Override
    public void insertTransacao(Transacao transacao) {
        transacaoRepository.save(transacao);
    }

}
