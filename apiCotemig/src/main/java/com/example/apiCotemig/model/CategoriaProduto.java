package com.example.apiCotemig.model;

import java.io.Serializable;

public class CategoriaProduto implements Serializable {

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int idCategoria;
    public int idProduto;

}
