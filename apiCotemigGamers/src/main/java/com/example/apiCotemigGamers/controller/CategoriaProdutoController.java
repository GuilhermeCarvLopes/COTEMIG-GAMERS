package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.CategoriaProduto;
import com.example.apiCotemigGamers.service.CategoriaProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoriaProdutoController {

    @Autowired
    private CategoriaProdutoService categoriaProdutoService;

    @RequestMapping(value = "categoriaProduto/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "CategoriaProduto", new CategoriaProduto());
    }

    @RequestMapping(value = "categoriaProduto/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("CategoriaProduto")CategoriaProduto categoriaProduto, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        categoriaProdutoService.insertCategoriaProduto(categoriaProduto);
        return "redirect:";
    }



    @RequestMapping(value = "categoriaProduto/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "CategoriaProduto", categoriaProdutoService.getCategoriaProdutoById(id).get());
    }



    @RequestMapping(value = "categoriaProduto/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("categoriaProduto")CategoriaProduto categoriaProduto, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        categoriaProdutoService.deleteCategoriaProdutoById(categoriaProduto.getIdCategoria());
        return "redirect:";
    }



    @RequestMapping(value = "categoriaProduto/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "categoriaProduto", categoriaProdutoService.getCategoriaProdutoById(id).get());
    }



    @RequestMapping(value = "categoriaProduto/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("categoriaProduto")CategoriaProduto categoriaProduto, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        categoriaProdutoService.updateCategoriaProduto(categoriaProduto);
        return "redirect:";
    }



    @RequestMapping(value = "categoriaProduto/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("categoriasProdutos", categoriaProdutoService.getAllCategoriasProdutos());
        return mav;
    }



    @RequestMapping(value = "categoriaProduto", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("categoriaProduto/index");
        mav.addObject("categoriasProdutos", categoriaProdutoService.getAllCategoriasProdutos());
        return mav;
    }
    
}
