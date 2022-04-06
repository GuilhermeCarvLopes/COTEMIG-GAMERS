package com.example.apiCotemig.model;

import java.io.Serializable;

public class TipoTransacao implements Serializable {

    public int idTipoTransacao;

    public int getIdTipoTransacao() {
        return idTipoTransacao;
    }

    public void setIdTipoTransacao(int idTipoTransacao) {
        this.idTipoTransacao = idTipoTransacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String nome;

}
