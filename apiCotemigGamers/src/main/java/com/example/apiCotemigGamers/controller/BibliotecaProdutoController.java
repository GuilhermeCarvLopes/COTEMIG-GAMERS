package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.BibliotecaProduto;
import com.example.apiCotemigGamers.service.BibliotecaProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BibliotecaProdutoController {

    @Autowired
    private BibliotecaProdutoService bibliotecaProdutoService;

    @RequestMapping(value = "bibliotecaProduto/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "BibliotecaProduto", new BibliotecaProduto());
    }

    @RequestMapping(value = "bibliotecaProduto/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("BibliotecaProduto")BibliotecaProduto bibliotecaProduto, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        bibliotecaProdutoService.insertBiblioteProduto(bibliotecaProduto);
        return "redirect:";
    }



    @RequestMapping(value = "bibliotecaProduto/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "BibliotecaProduto", bibliotecaProdutoService.getBibliotecaProdutoById(id).get());
    }



    @RequestMapping(value = "bibliotecaProduto/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("bibliotecaProduto")BibliotecaProduto bibliotecaProduto, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        bibliotecaProdutoService.deleteBibliotecaProdutoById(bibliotecaProduto.getIdBiblioteca());
        return "redirect:";
    }



    @RequestMapping(value = "bibliotecaProduto/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "bibliotecaProduto", bibliotecaProdutoService.getBibliotecaProdutoById(id).get());
    }



    @RequestMapping(value = "bibliotecaProduto/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("bibliotecaProduto")BibliotecaProduto bibliotecaProduto, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        bibliotecaProdutoService.updateBibliotecaProduto(bibliotecaProduto);
        return "redirect:";
    }



    @RequestMapping(value = "bibliotecaProduto/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("bibliotecasProdutos", bibliotecaProdutoService.getAllBibliotecasProdutos());
        return mav;
    }



    @RequestMapping(value = "bibliotecaProduto", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("bibliotecaProduto/index");
        mav.addObject("bibliotecasProdutos", bibliotecaProdutoService.getAllBibliotecasProdutos());
        return mav;
    }
    
}
