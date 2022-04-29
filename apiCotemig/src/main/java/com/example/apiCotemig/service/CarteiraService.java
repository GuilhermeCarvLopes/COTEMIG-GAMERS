package com.example.apiCotemig.service;

import com.example.apiCotemig.model.Carteira;

import java.util.List;
import java.util.Optional;

public interface CarteiraService {
    Optional<Carteira> getCarteiraById(Integer id);
    List<Carteira> getAllCarteiras();
    void deleteAllCarteiras();
    void deleteCarteiraById(Integer id);
    void updateCarteiraById(Integer id, Carteira carteira);
    void updateCarteira(Carteira carteira);
    void insertCarteira(Carteira carteira);
}
