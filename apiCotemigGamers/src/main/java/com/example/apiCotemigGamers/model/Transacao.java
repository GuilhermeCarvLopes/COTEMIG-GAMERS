package com.example.apiCotemigGamers.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Entity;
@Entity
public class Transacao implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int idTransacao;
    public int idUsuario;
    public int idProduto;
    public double valor;
    public String dataPagamento;


    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getvalor() {
        return valor;
    }

    public void setvalor(double valor) {
        this.valor = valor;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

}
