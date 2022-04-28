package com.example.apiCotemig.service;

import com.example.apiCotemig.model.TipoTransacao;
import com.example.apiCotemig.repository.TipoTransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("tipoTranscaoService")
public class TipoTranscaoServiceImpl implements TipoTransacaoService {

    @Autowired
    TipoTransacaoRepository tipoTransacaoRepository;

    @Override
    public Optional<TipoTransacao> getTipoTransacaoById(Integer id) {
        return tipoTransacaoRepository.findById(id);
    }

    @Override
    public List<TipoTransacao> getAllTiposTransacao() {
        return tipoTransacaoRepository.findAll();
    }

    @Override
    public void deleteAllTiposTransacao() {
        tipoTransacaoRepository.deleteAll();
    }

    @Override
    public void deleteTipoTransacaoById(Integer id) {
        tipoTransacaoRepository.deleteById(id);
    }

    @Override
    public void updateTipoTransacaoById(Integer id, TipoTransacao tipoTransacao) {
        Optional<TipoTransacao> getTipoTransacao = getTipoTransacaoById(id);
        getTipoTransacao.get().setNome(tipoTransacao.getNome());
        tipoTransacaoRepository.save(tipoTransacao);
    }

    @Override
    public void updateTipoTransacao(TipoTransacao tipoTransacao) {
        tipoTransacaoRepository.save(tipoTransacao);
    }

    @Override
    public void insertTipoTransacao(TipoTransacao tipoTransacao) {
        tipoTransacaoRepository.save(tipoTransacao);
    }

}
