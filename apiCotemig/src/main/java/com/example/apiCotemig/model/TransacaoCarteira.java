package com.example.apiCotemig.model;

import java.io.Serializable;

public class TransacaoCarteira implements Serializable {

    public int idTransacaoCarteira;

    public int getIdTransacaoCarteira() {
        return idTransacaoCarteira;
    }

    public void setIdTransacaoCarteira(int idTransacaoCarteira) {
        this.idTransacaoCarteira = idTransacaoCarteira;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCarteira() {
        return idCarteira;
    }

    public void setIdCarteira(int idCarteira) {
        this.idCarteira = idCarteira;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataPagaemnto() {
        return dataPagaemnto;
    }

    public void setDataPagaemnto(String dataPagaemnto) {
        this.dataPagaemnto = dataPagaemnto;
    }

    public int idUsuario;
    public int idCarteira;
    public double saldo;
    public String dataPagaemnto;

}
