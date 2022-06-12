package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.Biblioteca;
import com.example.apiCotemigGamers.service.BibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BibliotecaController {

    @Autowired
    private BibliotecaService bibliotecaService;

    @RequestMapping(value = "biblioteca/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "Biblioteca", new Biblioteca());
    }

    @RequestMapping(value = "biblioteca/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("Biblioteca")Biblioteca biblioteca, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        bibliotecaService.insertBibliote(biblioteca);
        return "redirect:";
    }



    @RequestMapping(value = "biblioteca/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "Biblioteca", bibliotecaService.getBibliotecaById(id).get());
    }



    @RequestMapping(value = "biblioteca/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("biblioteca")Biblioteca biblioteca, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        bibliotecaService.deleteBibliotecaById(biblioteca.getIdUsuario());
        return "redirect:";
    }



    @RequestMapping(value = "biblioteca/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "biblioteca", bibliotecaService.getBibliotecaById(id).get());
    }



    @RequestMapping(value = "biblioteca/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("biblioteca")Biblioteca biblioteca, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        bibliotecaService.updateBiblioteca(biblioteca);
        return "redirect:";
    }



    @RequestMapping(value = "biblioteca/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("bibliotecas", bibliotecaService.getAllBibliotecas());
        return mav;
    }



    @RequestMapping(value = "biblioteca", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("biblioteca/index");
        mav.addObject("bibliotecas", bibliotecaService.getAllBibliotecas());
        return mav;
    }
    
}
