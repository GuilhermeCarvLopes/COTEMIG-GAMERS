package com.example.apiCotemig.service;

import com.example.apiCotemig.model.Carteira;
import com.example.apiCotemig.repository.CarteiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("CarteiraService")
public class CarteiraServicelmpl implements CarteiraService{

    @Autowired
    CarteiraRepository carteiraRepository;

    @Override
    public Optional<Carteira> getCarteiraById(Integer id) {
        return carteiraRepository.findById(id);
    }

    @Override
    public List<Carteira> getAllCarteiras() {
        return carteiraRepository.findAll();
    }

    @Override
    public void deleteAllCarteiras() {
        carteiraRepository.deleteAll();
    }

    @Override
    public void deleteCarteiraById(Integer id) {
        carteiraRepository.deleteById(id);
    }

    @Override
    public void updateCarteiraById(Integer id, Carteira carteira) {
        Optional<Carteira> getCarteira = getCarteiraById(id);
        getCarteira.get().setSaldo(carteira.getSaldo());
        carteiraRepository.save(carteira);
    }

    @Override
    public void updateCarteira(Carteira carteira) {
        carteiraRepository.save(carteira);
    }

    @Override
    public void insertCarteira(Carteira carteira) {
        carteiraRepository.save(carteira);
    }    
}
