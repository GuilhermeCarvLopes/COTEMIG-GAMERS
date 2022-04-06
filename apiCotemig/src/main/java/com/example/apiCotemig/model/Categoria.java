package com.example.apiCotemig.model;

import java.io.Serializable;

public class Categoria implements Serializable {

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int idCategoria;
    public String nome;

}
