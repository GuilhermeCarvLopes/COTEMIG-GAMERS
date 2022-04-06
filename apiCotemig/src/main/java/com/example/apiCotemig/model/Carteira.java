package com.example.apiCotemig.model;

import java.io.Serializable;

public class Carteira implements Serializable {

    public int idCarteira;

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

    public double saldo;

}
