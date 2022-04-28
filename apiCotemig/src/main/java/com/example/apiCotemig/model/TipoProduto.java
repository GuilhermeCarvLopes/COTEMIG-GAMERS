package com.example.apiCotemig.model;

import java.io.Serializable;

public class TipoProduto implements Serializable {

    public Integer idProduto;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String nome;

}
