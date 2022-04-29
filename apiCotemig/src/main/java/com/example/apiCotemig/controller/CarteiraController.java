package com.example.apiCotemig.controller;

import com.example.apiCotemig.model.Carteira;
import com.example.apiCotemig.service.CarteiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarteiraController {

    @Autowired
    private CarteiraService carteiraService;

    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<Carteira> getCarteiras() {
        return carteiraService.getAllCarteiras();
    }

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<Carteira> getCarteira(@PathVariable("id") Integer id) {
        return carteiraService.getCarteiraById(id);
    }

    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteCarteiras() {
        carteiraService.deleteAllCarteiras();
    }

    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCarteira(@PathVariable("id") Integer id) {
        carteiraService.deleteCarteiraById(id);
    }

    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateCarteira(@RequestBody Carteira carteira, @PathVariable("id") Integer id) {
        carteiraService.updateCarteiraById(id, carteira);
    }

    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void insertCarteira(@RequestBody Carteira carteira) {
        carteiraService.insertCarteira(carteira);
    }
    
}
