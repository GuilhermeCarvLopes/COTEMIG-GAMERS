package com.example.apiCotemigGamers.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class CategoriaProduto implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int idCategoria;
    public int idProduto;

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

}
