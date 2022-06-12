package com.example.apiCotemigGamers.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Entity;
@Entity
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int idCategoria;
    public String nome;

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

}
