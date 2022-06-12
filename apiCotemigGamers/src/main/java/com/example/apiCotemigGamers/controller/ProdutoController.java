package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.Produto;
import com.example.apiCotemigGamers.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @RequestMapping(value = "produto/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "Produto", new Produto());
    }

    @RequestMapping(value = "produto/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("Produto")Produto produto, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        produtoService.insertProduto(produto);
        return "redirect:";
    }



    @RequestMapping(value = "produto/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "Produto", produtoService.getProdutoById(id).get());
    }



    @RequestMapping(value = "produto/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("produto")Produto produto, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        produtoService.deleteProdutoById(produto.getIdProduto());
        return "redirect:";
    }



    @RequestMapping(value = "produto/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "produto", produtoService.getProdutoById(id).get());
    }



    @RequestMapping(value = "produto/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("produto")Produto produto, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        produtoService.updateProduto(produto);
        return "redirect:";
    }



    @RequestMapping(value = "produto/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("produtos", produtoService.getAllProdutos());
        return mav;
    }



    @RequestMapping(value = "produto", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("produto/index");
        mav.addObject("produtos", produtoService.getAllProdutos());
        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView indexPrincipal() {

        ModelAndView mav = new ModelAndView("index");

        mav.addObject("produtos", produtoService.getAllProdutos());

        return mav;

    }
    
}
