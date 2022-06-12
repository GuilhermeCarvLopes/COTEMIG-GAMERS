package com.example.apiCotemigGamers.controller;

import com.example.apiCotemigGamers.model.Categoria;
import com.example.apiCotemigGamers.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(value = "categoria/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "Categoria", new Categoria());
    }

    @RequestMapping(value = "categoria/insert", method = RequestMethod.POST)
    public String submitInsert(@ModelAttribute("Categoria")Categoria categoria, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        categoriaService.insertCategoria(categoria);
        return "redirect:";
    }



    @RequestMapping(value = "categoria/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
        return new ModelAndView("delete", "Categoria", categoriaService.getCategoriaById(id).get());
    }



    @RequestMapping(value = "categoria/delete", method = RequestMethod.POST)
    public String submitDelete(@ModelAttribute("categoria")Categoria categoria, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        categoriaService.deleteCategoriaById(categoria.getIdCategoria());
        return "redirect:";
    }



    @RequestMapping(value = "categoria/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
        return new ModelAndView("update", "categoria", categoriaService.getCategoriaById(id).get());
    }



    @RequestMapping(value = "categoria/update", method = RequestMethod.POST)
    public String submitUpdate(@ModelAttribute("categoria")Categoria categoria, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        categoriaService.updateCategoria(categoria);
        return "redirect:";
    }



    @RequestMapping(value = "categoria/read", method = RequestMethod.GET)
    public ModelAndView read() {
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("categorias", categoriaService.getAllCategorias());
        return mav;
    }



    @RequestMapping(value = "categoria", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("categoria/index");
        mav.addObject("categorias", categoriaService.getAllCategorias());
        return mav;
    }
    
}
